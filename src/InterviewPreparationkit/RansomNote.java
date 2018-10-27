package InterviewPreparationkit;

import java.util.HashMap;
import java.util.Hashtable;

public class RansomNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazineWords, String[] note) {
        Hashtable<String, Integer> magazine = new Hashtable<>();
        String result = "Yes";
        for (String s : magazineWords) {
            if (magazine.get(s) != null) {
                magazine.put(s, magazine.get(s) + 1);
            } else {
                magazine.put(s, 1);
            }
        }

        for (String s : note) {
            if (!magazine.containsKey(s)) {
                result = "No";
                break;
            }

            int counter = magazine.get(s) - 1;

            if (counter == 0) {
                magazine.remove(s);
            } else {
                magazine.put(s, counter);
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


