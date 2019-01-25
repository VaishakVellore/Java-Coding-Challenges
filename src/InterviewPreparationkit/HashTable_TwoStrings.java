package InterviewPreparationkit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class HashTable_TwoStrings {

    // Complete the twoStrings function below.


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        for(int i = 0; i<n; i++) {
            String s1 = in.next();
            String s2 = in.next();
            boolean output = false;

            HashSet<Character> str = new HashSet<>();

            for(char c : s1.toCharArray()) str.add(c);
            for(char j : s2.toCharArray())
            {
                if(str.contains(j))
                    output = true;
            }
            if(output)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
