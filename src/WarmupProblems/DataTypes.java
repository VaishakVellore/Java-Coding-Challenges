package WarmupProblems;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DataTypes {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int A= scan.nextInt();
        double B = scan.nextDouble();
        String C = scan.nextLine();
        C = scan.nextLine();
        System.out.println(i+A);
        System.out.println(d+B);
        System.out.println(s+C);
        
        scan.close();
        
    }
}