package InterviewPreparationkit;

import java.util.HashMap;

public class Searching_IcecreamParlour {

    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i = 0; i< cost.length; i++)
        {
            int target = money - cost[i];
            if(cost[i] < money)
            {
                if(hash.containsKey(target)) {
                    System.out.println(hash.get(target) + " " + (i + 1));
                    break;
                }
                else
                    hash.put(cost[i],i+1);
            }
        }
    }

    public static void main(String[] args) {
        int[] cost = {1 ,4 ,5 ,3, 2};
        int money = 4;
        whatFlavors(cost,money);
    }
}
