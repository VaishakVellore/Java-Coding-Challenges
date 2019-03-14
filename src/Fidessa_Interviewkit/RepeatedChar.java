package Fidessa_Interviewkit;

import java.util.HashSet;
import java.util.Set;

public class RepeatedChar {

    static void checkRepeatedChar(String str)
    {
        Set<Character> map = new HashSet<>();
        char result = 0;
        for(char c : str.toCharArray())
        {
            if(!map.contains(c))
                map.add(c);
            else
            {
                result = c;
                break;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String str = "GeksforGeeks";
        checkRepeatedChar(str);
    }
}
