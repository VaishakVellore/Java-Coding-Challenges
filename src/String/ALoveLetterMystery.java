package String;

import java.util.Scanner;

public class ALoveLetterMystery {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++)
        {
            String str = in.next();
            char[]c = str.toCharArray();
            int index = 0, count = 0;
            for( int j = str.length()-1; j>= (str.length()+1)/2; j--)
            {
                if(c[j] != c[index])
                {
                    c[j]--;
                    count++;
                }
                index++;
            }
            System.out.println(count);
        }
    }
}
