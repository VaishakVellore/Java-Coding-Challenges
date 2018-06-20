package WarmupProblems;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BonAppetit {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	int k = scan.nextInt();
    	int sum = 0;
    	
    	for(int i=0; i<n; i++)
    	{
    		int price = scan.nextInt();
    		if (i != k)
    			sum = sum + price;
    	}
    	
    	int charged = scan.nextInt();
    	System.out.println(sum/2 == charged? "Bon Appetit": charged -(sum/2));
    }
}