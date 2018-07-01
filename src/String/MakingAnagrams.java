package String;

import java.util.Scanner;

public class MakingAnagrams {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        int count = 0;

        char[] array1 = new char[26];
        char[] array2 = new char[26];
        for(int i = 0; i< str1.length(); i++) array1[str1.charAt(i) - 97]++;
        for(int i = 0; i< str2.length(); i++) array2[str2.charAt(i) - 97]++;
        for(int i = 0; i <26; i++)
        {
            count = count + Math.abs(array1[i] - array2[i]);
        }
        System.out.println(count);
    }
}
