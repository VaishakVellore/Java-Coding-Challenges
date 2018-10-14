package InterviewPreparationkit;

import java.util.ArrayList;
import java.util.List;

public class Findthewinner_Visa {
    public static String winner(List<Integer> andrea, List<Integer> maria, String s) {
        // Write your code here

        int andreaCum = 0;
        int mariaCum =0;
        int andLength =andrea.size();
        int marLength = maria.size();
        int length = andLength<=marLength?andLength:marLength;
        for(int i=0;i<length;i++)
        {
            if(s.equals("Even"))
            {
            }
            else
            {
                i++;
            }
            int andVal=andrea.get(i);
            int mariaVal= maria.get(i);
            andreaCum += (andVal-mariaVal);
            mariaCum += (mariaVal-andVal);
            i++;
        }
        if(andreaCum>mariaCum)
            return"Andrea";
        if(mariaCum>andreaCum)
            return "Maria";
        if(mariaCum==andreaCum)
            return "Tie";
        return "";
    }

    public static void main(String[] args) {
        List<Integer> andrea = new ArrayList<Integer>();
        List<Integer> maria = new ArrayList<Integer>();

        andrea.add(0,1);
        andrea.add(1,2);
        andrea.add(2,3);
        maria.add(0,2);
        maria.add(1,1);
        maria.add(2,3);

        String result = winner(andrea,maria,"Even");
        System.out.println(result);

    }
}
