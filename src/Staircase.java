
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Staircase {

    /*
     * Complete the staircase function below.
     */
    static void staircase(int n) {
        /*
         * Write your code here.
         */
    	String var="#";
      /* for (int i=0;i<n;i++)
            { 
            System.out.printf("%"+n+"s%n",var);
            var=var+"#";
        }
        */
    	for(int i=0 ; i<n ;i++){
            for(int j = 0; j <= n-i-2; j++){
                System.out.print(" ");
            }
            for(int j = n-i-1 ; j< n; j++){
                System.out.print("#");
            }
            System.out.println();
        }

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        staircase(n);
    }
}