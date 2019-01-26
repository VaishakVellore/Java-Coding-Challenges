package InterviewPreparationkit;

import java.util.Arrays;

public class Sorting_MarkToys {

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int sum = 0;
        int count = 0;

        for(int i = 0; i < prices.length - 1; i++)
        {
            if(sum <= k && sum+prices[i] <= k)
            {
                sum = sum + prices[i];
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] prices = {1 ,12 ,5 ,111, 200, 1000 ,10};
        int money = 50;

        int output = maximumToys(prices,money);
        System.out.println(output);
    }
}
