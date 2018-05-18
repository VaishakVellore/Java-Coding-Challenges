import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BreakingRecords {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] score) {
    	int maxscore = score[0], maxcount = 0;
    	int lowscore = score[0], lowcount = 0;
    	
    	for( int i =0; i< score.length - 1; i++)
    	{
    		if(score[i+1] > maxscore)
    		{
    			maxscore = score[i+1];
    			maxcount++;
    		}
    		
    		if(score[i+1] < lowscore)
    		{
    			lowscore = score[i+1];
    			lowcount++;
    		}
    	}
    	int [] array = {maxcount, lowcount};
		return array;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] score = new int[n];

        String[] scoreItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoreItem = Integer.parseInt(scoreItems[i]);
            score[i] = scoreItem;
        }

        int[] result = breakingRecords(score);

        for (int i = 0; i < result.length; i++) {
            System.out.printf(String.valueOf(result[i]));

            if (i != result.length - 1) {
            	System.out.printf(" ");
            }
        }
        scanner.close();
    }
}
