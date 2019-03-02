package FacebookInterviewkit;

import java.util.HashMap;

public class FindSubstring {

    static HashMap<String, Integer> set = new HashMap<>();

    static void findallSubstrings(String s)
    {
        for(int i = 0; i<s.length(); i++)
        {
            for(int j = i+1; j<=s.length(); j++)
                set.put(s.substring(i,j),i);
        }
    }

    static void findString(String b){
        if(set.get(b) != null)
            System.out.println(set.get(b));
        else
            System.out.println(-1);
    }

    public static void main(String[] args) {
        String a = "abbbbabc";
        String b = "abc";

        findallSubstrings(a);
        findString(b);
    }
}
