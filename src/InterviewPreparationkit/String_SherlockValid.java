package InterviewPreparationkit;

import java.security.Key;
import java.util.*;

public class String_SherlockValid {

    static Map<Character, Integer> list= new HashMap<>();
    static Map<Integer, Integer> freq = new HashMap<>();


    public static void fillList(String s)
    {
        for(char c : s.toCharArray())
        {
            if(list.containsKey(c))
                list.put(c,list.get(c)+1);
            else
                list.put(c,1);
        }
    }

    public static void getFreq()
    {
        for(int i: list.values())
        {
            if(freq.get(i) == null)
                freq.put(i,1);
            else
                freq.put(i,freq.get(i)+1);
        }
    }

    // Complete the isValid function below.
    static String isValid(String s) {
        s = s.trim();
        fillList(s);
        getFreq();;

        if(freq.keySet().size() > 2)
            return "NO";

        if(freq.keySet().size() == 1)
            return "YES";

        int maxfreq = 0, minfreq = 0;
        Set freqSet = freq.keySet();
        List<Integer> freqency = new ArrayList<>(freqSet);
        if(freq.get(freqency.get(0)) > freq.get(freqency.get(1)))
        {
            maxfreq = freqency.get(0);
            minfreq = freqency.get(1);
        }
        else{
            maxfreq = freqency.get(1);
            minfreq = freqency.get(0);
        }

        if(minfreq == 1 && freq.get(minfreq) == 1)
            return "YES";

        if(Math.abs(maxfreq - minfreq) > 1)
            return "NO";

        if(freq.get(maxfreq) == freq.get(minfreq))
        {
            if(freq.get(maxfreq) >=2)
                return "NO";

        }

        if(freq.get(minfreq) >1)
            return "NO";

        return "YES";
    }


    public static void main(String[] args) {
        String str = "aabcd";
        String output = isValid(str);
        System.out.println(output);
    }
}

