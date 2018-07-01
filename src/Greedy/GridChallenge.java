package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class GridChallenge{

    public static String gridChallenge(String[] grid, Integer n)
    {
        int flag = 1;
        char[][] ch = new char[n][];
        for(int i = 0; i < n; i++)
        {
            ch[i]=grid[i].toCharArray();
            Arrays.sort(ch[i]);
        }

        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n-1; j++)
            {
                if(ch[i][j] > ch[i][j+1])
                {
                    flag = 0;
                    break;
                }
                if(ch[j][i] > ch[j+1][i])
                {
                    flag = 0;
                    break;
                }
            }
        }
        if(flag == 1)
            return "YES";
        else
            return "NO";
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while( t --> 0)
        {
            int n = in.nextInt();
            in.nextLine();
            String[] grid = new String[n];
            for(int i = 0; i < n; i++) {
                grid[i] = in.nextLine();
            }
            String result = gridChallenge(grid, n);
            System.out.println(result);
        }
    }
}