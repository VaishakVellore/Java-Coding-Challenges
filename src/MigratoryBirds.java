import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class MigratoryBirds {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(int n, int[] ar) {
    	int type[] = new int[n];
    	int max = 0,index=0;
    	
        for(int i = 0; i < n ; i++ )
        type[ar[i]]++; 
        
        for(int i = 0 ; i < n ; i++)
            {
            if(type[i] > max)
                {
                max = type[i];
                index = i;
            }
        }
        return index;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr]);
            ar[arItr] = arItem;
        }
        int n = ar.length;
        int result = migratoryBirds(n, ar);

        System.out.println(String.valueOf(result));        
        scanner.close();
    }
}
