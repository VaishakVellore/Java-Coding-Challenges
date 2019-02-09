package AlgorithmsonArrays;

import java.util.Arrays;

public class CoinChange_DP {
    static int countChangeDP(int[] arr, int m, int n)
    {
        int table[] = new int[n+1];
        table[0] = 1;

        for(int i = 0; i<m; i++)
            for(int j = arr[i]; j <=n; j++)
                table[j] = table[j] + table[j-arr[i]];

        return table[n];
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int m = arr.length;
        System.out.println( countChangeDP(arr, m, 4));
    }
}
