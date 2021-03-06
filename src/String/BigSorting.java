package String;

import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BigSorting {

    // Complete the bigSorting function below.
    static String[] bigSorting(String[] unsorted)
    {
    	Arrays.sort(unsorted, new Comparator<String>()
    	{
			@Override
			public int compare(String a, String b) 
			{
				// TODO Auto-generated method stub
				if(a.length() == b.length())
					return a.compareTo(b);
				return a.length() - b.length();
			}
    	});
    	return unsorted;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] unsorted = new String[n];

        for (int i = 0; i < n; i++) {
            String unsortedItem = scanner.nextLine();
            unsorted[i] = unsortedItem;
        }

        String[] result = bigSorting(unsorted);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

            //if (i != result.length - 1) {
                //System.out.println("\n");
            //}
        }
        scanner.close();
    }
}
