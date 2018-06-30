package String;

import java.util.Scanner;

public class BeautifulBinaryString {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        String result = str.replaceAll("010", "");
        System.out.println((str.length()-result.length())/3);
    }
}
