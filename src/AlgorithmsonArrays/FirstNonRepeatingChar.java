package AlgorithmsonArrays;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    static Character firstNonRepeatingChar(String str)
    {
        Map<Character, Integer> map = new HashMap<>();
        for( char c: str.toCharArray())
        {
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        char result = 0;
        for(char c: str.toCharArray())
        {
            if(map.get(c) == 1) {
                result = c;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "GeeksforGeeks";
        char output = firstNonRepeatingChar(str);
        System.out.println("The first non-repeating character is "+output);
    }
}
