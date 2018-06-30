package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Gemstones {
    public static void main(String[] args)
    {
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        int [] arrayChars = new int[26];
        Set<Character> charSet = new HashSet<Character>();

        for(int i = 0; i< n; i++) {
            String str = scan.next();


            for (char c : str.toCharArray()) {
                charSet.add(c);
            }

            for (char s : charSet) {
                int x = (int)s-97;
                arrayChars[x]++;

                if(arrayChars[x] >= n){
                    count++;
                }
            }

            charSet.clear();
        }

        System.out.println(count);

    }
}
