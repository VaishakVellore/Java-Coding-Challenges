package InterviewPreparationkit;

import java.util.HashMap;
import java.util.Map;

public class Goldman_skills {

    public static int skills(String str) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('p', 0);
        map.put('b', 0);
        map.put('c', 0);
        map.put('m', 0);
        map.put('z', 0);
        for (char c :
                str.toCharArray()) {
            if (map.containsKey(new Character(c))) {
                map.put(new Character(c), (map.get(new Character(c)) + 1));
            } else {
                map.put(new Character(c), 1);
            }
        }
        boolean first = true;
        int ret = 0;
        for (Integer i : map.values()
                ) {
            if (first) {
                ret = i;
                first = false;
            } else if (i < ret) {
                ret = i;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        String str= " ";
        int result = skills(str);
        System.out.println(result);
    }
}
