package String;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String str = in.next();
            int len = str.length();
            int count = 0;
            if(len%2 !=0)
            {
                System.out.println(-1);
                continue;
            }

            String s1 = str.substring(0,len/2);
            String s2 = str.substring(len/2, len);
            char[] array = s1.toCharArray();
            for(char c: array)
            {
                int index = s2.indexOf(c);
                if(index == -1)
                    count++;
                else
                    s2 = s2.substring(0,index)+s2.substring(index+1);
            }
            System.out.println(count);
        }
    }
}
