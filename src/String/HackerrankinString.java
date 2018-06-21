package String;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerrankinString {

    // Complete the hackerrankInString function below.
    static String hackerrankInString(String s) 
    {
    	String str = "hackerrank";
    	int j = 0;
    	if(s.length() < str.length())
    		return "NO";
    	for(int i = 0; i<s.length(); i++)
    	{
    		if( j<str.length() && s.charAt(i) == str.charAt(j))
    			j++;
    	}
    	return (j == str.length()? "YES" : "NO");

    }

    public static void main(String[] args)
    {
    	Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < q; i++)
        {
            String s = scanner.nextLine();

            String result = hackerrankInString(s);

            System.out.println(result);
        }
    }
}
