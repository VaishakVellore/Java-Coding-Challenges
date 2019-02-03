package InterviewPreparationkit;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


/*
import com.google.gson.*;


public class SAP_fullstackdev {
    private static List<String> titlesList = new ArrayList<>();
    static Gson gson = new Gson();

    public static StringBuffer getJsonRes(String url) throws Exception{
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while((inputLine = in.readLine())!= null){
            response.append(inputLine);
            Gson gson = new Gson();
            Map map = gson.fromJson(inputLine, Map.class);
            System.out.println(map.keySet());
            System.out.println(map.get("data"));


//            ArrayList<Object> dataTwo = new ArrayList<>();
//            dataTwo = map.get("data");

//            for(Object key : map.keySet()){
//                System.out.println(key);
//            }
//            for(Object value : map.values()) {
//                System.out.println(value);
//            }
            response.append(inputLine);
            //System.out.println(inputLine);

        }

        in.close();
       // System.out.println(response);

       */
/* GsonBuilder builder = new GsonBuilder();
        gson = builder.create();
        System.out.println(response);

       // JSONObject myResponse  = new JSONObject(response.toString());
        System.out.println(gson.toJson(response));*//*


        return response;

    }
    public static String[] movieTitle(String str) throws Exception{

        String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title="+str;
        StringBuffer new1 = getJsonRes(url);

        */
/*
        System.out.println(numPages);

        for(int i = 1; i<=numPages; i++)
        {
            getRes(i,str);
        }*//*

        return titlesList.stream().toArray(String[]:: new);
    }

    public static void getRes(int num_current, String str) throws Exception
    {
        String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title="+str+"&page="+num_current;
        */
/*JSONObject myResponse = getJsonRes(url);
        JSONArray title = myResponse.getJSONArray("data");
        System.out.println(title);

        for(int i = 0; i<title.length(); i++){
            String output = title.getJSONObject(i).getString("Title");
            titlesList.add(output);
        }*//*

    }

    static String[] getMovieTitles(String substr) {
        String[] output = new String[titlesList.size()];
        try {

            output = movieTitle(substr);
            Arrays.sort(output);
        }
        catch (Exception e){
            e.printStackTrace();
        }
//
        return output;
    }

    public static void main(String[] args) {
        String movie = "spiderman";
        String result[] = getMovieTitles(movie);
        //System.out.println(result.toString());
        for(String i:result)
            System.out.println(i);
    }
}
*/
