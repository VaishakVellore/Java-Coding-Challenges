package FacebookInterviewkit;

import java.util.HashSet;
import java.util.Set;

public class CombinationsSum {

    public static void printSums(int c1, int c2, int c3)
    {
        Set<Integer> sums = new HashSet<>();
        sums.add(0);

        for(int i = 1; i<=1000; i++)
        {
            if(sums.contains(i-c1) || sums.contains(i-c2) || sums.contains(i-c3)) {
                System.out.println(i);
                sums.add(i);
            }

        }

    }

    public static void main(String[] args) {
        int c1 = 10, c2 = 15, c3 = 55;
        printSums(c1,c2,c3);
    }
}
