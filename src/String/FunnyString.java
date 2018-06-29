package String;

import java.util.Scanner;

public class FunnyString {
    public static boolean isfunnyString(String s)
    {
        String r = new StringBuilder(s).reverse().toString();
        boolean flag = false;
        int j = 1;
        while(Math.abs(s.charAt(j)- s.charAt(j-1)) == Math.abs(r.charAt(j)- r.charAt(j-1)) && j< s.length()) {
            j++;
            if (j == s.length()) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for( int a = 0; a<n; a++)
        {
            String s = in.next();

            if(isfunnyString(s) == true)
                System.out.println("Funny");
            else
                System.out.println("Not Funny");
        }
    }
}
