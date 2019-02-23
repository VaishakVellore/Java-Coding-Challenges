package InterviewPreparationkit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MathWorks_GenerateAllSubstrings {

    static void generateSubstring(String str)
    {
        List<String> list = new ArrayList<>();
        for(int i = 0; i<str.length(); i++)
        {
            //list.add(str.substring(i));
            for(int j = i; j<str.length(); j++)
            {
                String s = str.substring(i, j + 1);
                list.add(s);
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }

    public static void main(String[] args) {
        generateSubstring("aaa");
    }
}
