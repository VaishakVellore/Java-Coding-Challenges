package WarmupProblems;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DayoftheProgrammer {

    // Complete the solve function below.
    	public static String solve(int year) {

    		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    		// for all cases after 1918 as I am starting from 1st day of year
    		int daysToAdjust = 255;

    		if (year == 1918) {
    			// this is the year they turned to gregorian calendar
    			daysToAdjust = daysToAdjust + 13;
    		}

    		else if (year < 1918) {
    			// jullian calendar only divide by 4 for leap year, where as gregorian excludes divide by 100 case
    			if (year % 4 == 0 && year % 100 == 0) {
    				daysToAdjust = daysToAdjust - 1;
    			}
    		}

    		LocalDate date = LocalDate.of(year, 1, 1);
    		LocalDate dayOfProgrammer = date.plusDays(daysToAdjust);
    		return dayOfProgrammer.format(formatter);
    	}

    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = solve(year);

        System.out.println(result);
        scanner.close();
    }
}
