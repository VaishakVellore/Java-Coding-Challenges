import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

/**
 * Java Class that reads the input file and sums the delivered insulin between the given Dates
 */
public class ReadInsuinAdministered {

    public static void main(String args[]) throws Exception {
        //Start and the End Dates

        String startDateString = "11/26/2017";
        String endDateString = "11/27/2017";
        String csvFile = "C:\\Users\\Vaishak\\Desktop\\Insulin Pump Data.csv";


        BufferedReader br = null;
        String line;
        String cvsSplitBy = ",";
        DateFormat format = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        int deliveredColumnIndex = -1;
        int dateColumn = -1;
        //Final Collector Variable
        List<DataList> dataLists = new ArrayList<>();

        //Convert String to actual Date to perform the comparision
        Date startDate = format.parse(startDateString);
        Date endDate = format.parse(endDateString);

        //Start Processing the file
        try {
            int initialIndex = 0;
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                String[] columns = line.split(cvsSplitBy);

                //First Row Corresponds to the column names
                if (initialIndex == 0) {

                    // use comma as separator
                    for (int i = 0; i < columns.length; i++) {
                        //Get the Bolus Volume Delivered Column Index
                        if ("Bolus Volume Delivered (U)".equals(columns[i])) {
                            deliveredColumnIndex = i;
                        }
                        //Get the administered Date Column
                        if ("Date".equals(columns[i])) {
                            dateColumn = i;

                        }
                    }
                }
                //Subsequent Rows correspond to the data
                else {
                    if (columns.length > 12) {
                        //Get the Date Value
                        String dateValue = columns[dateColumn];
                        //Get the delivered amount
                        String deliveredInsulin = columns[deliveredColumnIndex];
                        //Add to a list
                        dataLists.add(new DataList(dateValue, deliveredInsulin != null && !"".equals(deliveredInsulin.trim()) ? Float.parseFloat(deliveredInsulin) : 0F, initialIndex));
                    }
                }

                initialIndex++;
            }
            //End Processing of File

            //Filter the file for the start and the end dates only
            DoubleStream totalDeliveredInsulin = dataLists.stream().filter(x -> {
                try {
                    //This step applies the filter
                    return x.getDate().getTime() >= startDate.getTime() && x.getDate().getTime() <= endDate.getTime();
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }


            }).collect(Collectors.toList()).stream().mapToDouble(DataList::getDeliveredInsulin);
            //Sum all the filtered values
            double value = totalDeliveredInsulin.sum();
            System.out.println("Total Delivered Insulin " + value);

        } catch (FileNotFoundException e) {
            throw new Exception("File Not Found");
        } catch (IOException e) {
            throw new Exception("Unable to read the file");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

/**
 * Class to hold the values of the file
 */
class DataList {
    private String dateValue;
    private int initialIndex;
    private double deliveredInsulin;
    DateFormat format = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);

    DataList(String dateValue, float deliveredInsulin, int initialIndex) {
        this.dateValue = dateValue;
        this.deliveredInsulin = deliveredInsulin;
        this.initialIndex = initialIndex;
    }

    public double getDeliveredInsulin() {
        return deliveredInsulin;
    }

    public Date getDate() throws ParseException {
        return format.parse(dateValue);
    }
}