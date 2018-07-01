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
            int count = 0, left = 0, right = str.length()-1;
            while(left < right)
            {
                char l = str.charAt(left);
                char r = str.charAt(right);
                if((int)l != (int)r )
                    count = count + Math.abs((int)l - (int)r);
                left++;
                right--;
            }
            System.out.println(count);
        }
    }
}
