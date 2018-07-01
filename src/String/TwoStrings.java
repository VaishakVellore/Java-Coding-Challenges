package String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoStrings {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i<n ; i++)
        {
            String str1 = in.next();
            String str2 = in.next();
            boolean flag = false;
            HashSet<Character> set1 = new HashSet<>();
            for(char c: str1.toCharArray()) set1.add(c);
            for(char c: str2.toCharArray())
            {
                if(set1.contains(c))
                    flag = true;
            }
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
