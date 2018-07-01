package String;

import java.util.HashSet;
import java.util.Scanner;

public class StringConstruction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++)
        {
            String str1 = in.next();
            HashSet<Character> set1 = new HashSet<>();
            for( char c: str1.toCharArray())
                set1.add(c);
            System.out.println(set1.size());
        }
    }
}
