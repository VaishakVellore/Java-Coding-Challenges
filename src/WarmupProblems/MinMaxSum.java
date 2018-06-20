package WarmupProblems;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class MinMaxSum {

    /*
     * Complete the miniMaxSum function below.
     */
    static void miniMaxSum(int[] arr) {
        /*
         * Write your code here.
         */
    	long max, min, sum;
    	sum = min = max = arr[0];
    	for ( int i = 1; i<arr.length; i++)
    	{
    		if(arr[i] > max) max = arr[i];
    		if(arr[i] < min) min = arr[i];
    		sum = sum + arr[i];
    	}
    	System.out.println((sum - max) + " " +(sum-min));
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < 5; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        miniMaxSum(arr);
    }
}
