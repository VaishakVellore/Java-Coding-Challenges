import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Cakewalk {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }
        // your code goes here
        long miles=0;
        Arrays.sort(calories);
        for(int i =n-1;i>=0;i--) {
        	miles = (long)(miles + Math.pow(2, n-(i+1))*calories[i]);
        }
        in.close();
        System.out.println(miles+"");
    }
}