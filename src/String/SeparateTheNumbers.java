package String;

import java.util.Scanner;

public class SeparateTheNumbers {

    public static boolean find(String str, String first)
    {
        if(str == null)
            return true;
        if(str.length()==0)
            return true;
        String next = Long.toString(Long.parseLong(first)+1);
        if(str.startsWith(next))
            return find(str.substring(next.length()), next);
        return false;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for( int j = 0; j < n; j++)
        {
            String str = in.next();
            boolean flag = false;

            for( int i =1; i <= str.length()/2; i++)
            {
                String first = str.substring(0,i);
                if(find(str.substring(i), first))
                {
                    flag = true;
                    System.out.println("YES " + first);
                    break;
                }
            }
            if(!flag)
                System.out.println("NO");
        }
    }
}
