package InterviewPreparationkit;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Coursera_CalculateScore {

    public static String calculateScore(String text, String prefixString, String suffixString) {
        // Write your code here
        int n = text.length();
        int suffix_len = suffixString.length();
        int prefix_len = prefixString.length();


        Map<String, Integer> map = new HashMap<>();

        for(int i =0; i<n; i++) {
            for(int j = i+1; j<=n; j++) {

                String substr = text.substring(i,j);

                int prefix_score = 0, suffix_score = 0, substr_len = substr.length();

                for(int k =0; k < substr_len; k++) {
                    if(substr_len - k <= suffix_len) {
                        if(substr.substring(k).equals(suffixString.substring(0,substr_len-k))) {
                            prefix_score = Math.max(substr_len-k, prefix_score);
                        }
                    }
                }

                for(int k =0; k < substr_len; k++) {
                    if(k < prefix_len) {
                        if(substr.substring(0,k+1).equals(prefixString.substring(prefix_len-k-1, prefix_len))) {
                            suffix_score = Math.max(k+1,suffix_score);
                        }
                    }
                }

                if(map.get(substr)==null) {
                    map.put(substr, prefix_score+suffix_score);
                } else {
                    map.put(substr, Math.max(map.get(substr), prefix_score+suffix_score));
                }
            }
        }
        int m = -1;
        Set<String> keys = map.keySet();

        String[] arr = keys.toArray(new String[keys.size()]);

        Arrays.sort(arr);
        String result = null;
        for(int i = 0; i<arr.length; i++) {
            if(m < map.get(arr[i])) {
                result = arr[i];
                m = map.get(arr[i]);
            }
        }

        return result;

    }
    public static void main(String[] args) {
        String text = "nothing";
        String prefixString = "bruno";
        String suffixString = "ingenious";
        System.out.println(calculateScore(text,prefixString,suffixString));

    }
}
