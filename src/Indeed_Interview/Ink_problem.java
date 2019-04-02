package Indeed_Interview;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Ink_problem {
    private static  Scanner scanner = new Scanner(System.in);

    static class Dots{
        int drow,dcol,dval;
    }

    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */

        int N = scanner.nextInt();
        while(N>0){
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            // System.out.println(row+" "+col);

            int dots = scanner.nextInt();
            List<Dots> dotsList = new ArrayList<>();
            //System.out.println("number of dots = "+dots);
            while(dots>0){
                Dots t = new Dots();
                t.drow = scanner.nextInt();
                t.dcol = scanner.nextInt();
                t.dval = scanner.nextInt();
                dotsList.add(t);
                //System.out.println(t.drow+" "+t.dval+" "+t.dcol);
                dots--;
            }
            System.out.println(calculateValue(dotsList,row,col));
            N--;
        }
    }


    public static long calculateValue (List<Dots> dotsList,int row,int col){
        int[][] matrix = new int[row][col];
        for(int dot=0;dot<dotsList.size();dot++){
            int dot_darkness = dotsList.get(dot).dval;
            int dot_row = dotsList.get(dot).drow;
            int dot_col = dotsList.get(dot).dcol;
            matrix[dotsList.get(dot).drow][dotsList.get(dot).dcol] = Math.max(dotsList.get(dot).dval,matrix[dotsList.get(dot).drow][dotsList.get(dot).dcol]);
            for(int r = 0;r<row;r++){
                for(int c=0;c<col;c++){
                    int t = dot_darkness - Math.abs(dot_row-r)-Math.abs(dot_col-c);
                    matrix[r][c] = Math.max(matrix[r][c],t);
                }
            }
        }

        long sum = 0;

        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                sum +=matrix[r][c];
            }
        }
        return sum;

    }
}