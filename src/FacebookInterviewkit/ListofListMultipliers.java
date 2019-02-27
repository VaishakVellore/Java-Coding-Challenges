package FacebookInterviewkit;

import java.util.ArrayList;
import java.util.List;

public class ListofListMultipliers {

    public static int calculate(List<Object> a, int multiplier)
    {
        int sum =0;
        for(int i =0; i<a.size(); i++)
        {
            if(a.get(i)instanceof ArrayList)
            {
                List l = (ArrayList) a.get(i);
                if(l.size() >= 1)
                {
                    multiplier++;
                    sum = sum + multiplier * (calculate(l,multiplier));
                }
            }
            else
                sum = sum + (int)a.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Object> arr = new ArrayList<>();
        arr.add(8);
        arr.add(3);
        arr.add(2);
        List<Object> inner1 = new ArrayList<>();
        inner1.add(5);
        inner1.add(6);
        List<Object> inner2 = new ArrayList<>();
        inner2.add(9);
        inner1.add(inner2);
        arr.add(inner1);
        arr.add(6);

        System.out.println(calculate(arr,1));

    }
}
