package String;

import java.util.Scanner;

public class AlternatingCharacters {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++)
        {
            String str = in.next();
            int counter = 0;
            int index = 0;
            for( int j = 1; j<str.length(); j++)
            {
                if(str.charAt(j) == str.charAt(index)) {
                    counter++;
                }
                else
                    index = j;
            }
            System.out.println(counter);
        }
    }
}
