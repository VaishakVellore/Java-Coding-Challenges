package InterviewPreparationkit;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NewYearChaos{

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }
            boolean chaotic = false;
            int bribe = 0;
            for( int i = 0; i < n ; i++)
            {
                if(q[i] - (i+1) > 2)
                {
                    chaotic = true;
                    break;
                }
                for( int j = Math.max(0, q[i]-1-1); j < i; j++)
                {
                    if( q[j] > q[i])
                        bribe++;
                }

            }
            if(chaotic)
                System.out.println("Too chaotic");
            else
                System.out.println(bribe);
        }

        scanner.close();
    }
}

