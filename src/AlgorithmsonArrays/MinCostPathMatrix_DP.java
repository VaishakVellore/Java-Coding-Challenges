package AlgorithmsonArrays;

public class MinCostPathMatrix_DP {

    static int min(int x, int y, int z)
    {
        if(x < y)
            return (x < z)? x: z;
        else
            return (y < z)? y: z;
    }

    static int minCostDP(int cost[][], int m, int n)
    {
        int i, j;
        int[][] newMatrix = new int[m+1][n+1];

        newMatrix[0][0] = cost[0][0];

        for(i = 1; i<=m; i++)
            newMatrix[i][0] = newMatrix[i-1][0] + cost[i][0];

        for(j = 1; j<=n; j++)
            newMatrix[0][j] = newMatrix[0][j-1] + cost[0][j];

        for( i =1; i<=m; i++)
            for( j = 1; j <=n; j++)
                newMatrix[i][j] = min(newMatrix[i-1][j-1],
                                      newMatrix[i-1][j],
                                      newMatrix[i][j-1]) + cost[i][j];
        return newMatrix[m][n];
    }

    public static void main(String[] args) {
        int cost[][] = { {1, 2, 3},
                {4, 8, 2},
                {1, 5, 3} };

        System.out.print(minCostDP(cost, 2, 2));
    }
}
