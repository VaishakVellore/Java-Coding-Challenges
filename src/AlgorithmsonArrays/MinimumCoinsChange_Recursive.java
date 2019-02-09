package AlgorithmsonArrays;

public class MinimumCoinsChange_Recursive {

    static int minCoins(int[] coins, int m, int V)
    {
        if( V == 0)
            return 0;
        int result = Integer.MAX_VALUE;

        for(int i = 0; i<m ; i++)
        {
            if(coins[i] <= V)
            {
                int sub_result = minCoins(coins, m,V-coins[i]);

                if(sub_result != Integer.MAX_VALUE && sub_result+1 < result)
                    result = sub_result+1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int coins[] =  {9, 6, 5, 1};
        int m = coins.length;
        int V = 11;
        System.out.println("Minimum coins required is "+ minCoins(coins, m, V) );
    }
}
