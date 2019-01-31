package InterviewPreparationkit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Greedy_LuckBalance {

    // Complete the luckBalance function below.
    static int luckBalance(int k, int[][] contests) {
        List<Integer> list = new ArrayList<>();
        int total = 0;
        for(int i = 0; i<contests.length; i++)
        {
            if(contests[i][1] == 1)
                list.add(contests[i][0]);
            else
                total = total + contests[i][0];

        }
        Collections.sort(list);
        for(int i = 0; i<list.size(); i++)
        {
            if(i < list.size() - k)
                total -= list.get(i);
            else
                total += list.get(i);
        }
        return total;
    }

    public static void main(String[] args) {
        int[][] contests = {{5, 1}, {2, 1}, {1, 1}, {8, 1}, {10, 0}, {5, 0}};
        int k = 3;

        int output = luckBalance(k,contests);
        System.out.println(output);
    }
}
