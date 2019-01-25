package InterviewPreparationkit;

import java.util.HashMap;

public class String_MakeAnagram {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        HashMap<Character,Integer> hash = new HashMap<>();
        int match = 0;
        int counter = 0;
        for(char c : a.toCharArray())
        {
            if(hash.containsKey(c))
                hash.put(c,hash.get(c)+1);
            else
                hash.put(c,1);
        }

        for(char j : b.toCharArray())
        {
            if(hash.containsKey(j))
            {
                match++;
                if(hash.get(j) <= 1)
                    hash.remove(j);
                else
                    hash.put(j,hash.get(j) - 1);
            }
            else
                counter++;
        }

        int result = a.length()+counter - match;

        return result;

    }


    public static void main(String[] args) {
        String a = "aaab";
        String b = "bccc";

        int output = makeAnagram(a,b);
        System.out.println(output);
    }
}
