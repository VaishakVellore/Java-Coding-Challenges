package WarmupProblems;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class PlusMinus {

    /*
     * Complete the plusMinus function below.
     */
    static void plusMinus(int[] arr) {
        /*
         * Write your code here.
         */
    	int len = arr.length;
    	double positive = 0;
    	double negative = 0;
    	double zero = 0;
    	for (int i = 0; i<len; i++)
    	{
    		if(arr[i] > 0)
    			positive++;
    		else if(arr[i] < 0)
    			negative++;
    		else if(arr[i] == 0)
    			zero++;
    	}
    	System.out.println(positive/len);
    	System.out.println(negative/len);
    	System.out.println(zero/len);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        plusMinus(arr);
    }
}