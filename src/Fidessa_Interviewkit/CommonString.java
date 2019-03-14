package Fidessa_Interviewkit;

import java.util.HashSet;
import java.util.Set;

public class CommonString {

    static void commonString(String[] s1, String[] s2)
    {
        Set<String> result= new HashSet<>();

        for(String str: s1)
        {
            if(!result.contains(str))
                result.add(str);
        }

        for(String str: s2)
        {
            if(result.contains(str))
                System.out.println(str);
        }
    }

    public static void main(String[] args) {
        String[] s1 = {"mary","had","a"};
        String[] s2 = {"a", "little", "lamb"};

        commonString(s1,s2);
    }
}
