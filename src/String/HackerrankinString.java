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

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException
    {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++)
        {
            String s = scanner.nextLine();

            String result = hackerrankInString(s);

            System.out.println(result);
        }
    }
}
