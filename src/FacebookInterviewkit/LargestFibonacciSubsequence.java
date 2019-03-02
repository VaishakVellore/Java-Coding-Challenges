package FacebookInterviewkit;

import java.util.HashSet;
import java.util.Set;

public class LargestFibonacciSubsequence {

    static Set<Integer> a = new HashSet<>();

    static void findSubsequence(int[] input)
    {
        for(int i = 0; i<input.length; i++)
        {
            if(a.contains(input[i]))
                System.out.println(input[i]+ " ");
        }
    }

    static void fibonacciSeq(int n){
        int[] seq = new int[n];

        seq[0] = 0;
        a.add(seq[0]);
        seq[1] = 1;
        a.add(seq[1]);

        for(int i = 2; i<n; i++)
        {
            seq[i] = seq[i-1] + seq[i-2];
            a.add(seq[i]);
        }
    }

    public static void main(String[] args) {
        int n = 100;
        int input[] = {0,2,1,4,3,9,10,13,7,21,34,5};

        fibonacciSeq(n);
        findSubsequence(input);
    }
}
