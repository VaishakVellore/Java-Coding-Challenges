package InterviewPreparationkit;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinimumSwaps2  {

    // Complete the minimumSwaps function below

    private static int minimumSwaps(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; /*i++*/) {
            if (arr[i] == (i + 1) || arr[i] >= arr.length) {
                i++;
                continue;
            }

            int tmp = arr[i];
            arr[i] = arr[tmp - 1];
            arr[tmp - 1] = tmp;

            count++;
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        System.out.println(res);

        scanner.close();
    }
}

