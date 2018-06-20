package WarmupProblems;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BirthdayChocolate {

    // Complete the solve function below.
    static int solve(int n, int[] s, int d, int m) {
        int sum,result = 0;
        int index = 0, j;
    	for( int i = 0;i<= n-m ; i++)
    	{
            sum = 0;
            index = i;
            j = 1;
            while(j <=m) 
            {
                sum = sum + s[index];
                index++;
                j++;
    		}
    		if(sum == d)
    			result++;
    	}
    	return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] s = new int[n];

        String[] sItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int sItem = Integer.parseInt(sItems[i]);
            s[i] = sItem;
        }

        String[] dm = scanner.nextLine().split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = solve(n, s, d, m);

        System.out.println(String.valueOf(result));

        scanner.close();
    }
}
