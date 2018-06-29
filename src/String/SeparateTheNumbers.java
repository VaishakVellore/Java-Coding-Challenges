package String;

import java.util.Scanner;

public class SeparateTheNumbers {

    private static void separateNumbers(String str) {
        
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for( int i = 0; i < n; i++)
        {
            String str = in.nextLine();
            separateNumbers(str);
        }
        in.close();
    }

}
