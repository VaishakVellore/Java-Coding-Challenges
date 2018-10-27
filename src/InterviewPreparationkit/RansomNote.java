package InterviewPreparationkit;

import java.util.HashMap;

public class RansomNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        String result = "Yes";
        HashMap<String, Integer> map = new HashMap<>();
        for(String s: magazine){
            if(map.get(s) != null){
                map.put(s, map.get(s) + 1);
            }else{
                map.put(s, 1);
            }
        }
        for(String n: note){
            if(!map.containsKey(n)) {
                result = "No";
                break;
            }
            else if(map.containsKey(n))
            {
                result = "Yes";
                map.remove(n);
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        String[] magzine = {"two","times", "three", "is", "not", "four"};
        String[] note = {"two", "times", "two", "is", "four"};

        checkMagazine(magzine,note);

    }
}


