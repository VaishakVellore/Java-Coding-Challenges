package InterviewPreparationkit;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Goldman_Probability {

    public static String setProbab(int[] inputArray) {
        Map<Integer, Integer> result = new HashMap<>();
        int totalCombinations = 0;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {

                int sum = inputArray[i] + inputArray[j];
                if (result.containsKey(sum)) {
                    result.put(sum, (result.get(sum) + 1));
                } else {
                    result.put(sum, 1);
                }
                totalCombinations++;

            }
        }

        Integer max = Collections.max(result.keySet());
        int possibleCombinations = result.get(max);
        BigDecimal probab = new BigDecimal((double) possibleCombinations / totalCombinations);
        return String.format("%.2f", probab);
    }

    public static void main(String[] args) {
        int n = 8;
        int[] inputArray = new int[n];
        setProbab(inputArray);
    }
}
