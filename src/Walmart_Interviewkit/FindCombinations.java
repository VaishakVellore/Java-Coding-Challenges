package Walmart_Interviewkit;

public class FindCombinations {

    static void findCombinationsUtil(int[] arr, int index, int num, int reduceNum)
    {
        if(reduceNum < 0)
            return;

        if(reduceNum == 0)
        {
            for (int i = 0; i < index; i++)
                System.out.print (arr[i] + " ");
            System.out.println();
            return;
        }

        int prev = (index == 0)? 1: arr[index-1];

        for(int k = prev; k <=num; k++)
        {
            arr[index] = k;
            findCombinationsUtil(arr, index + 1, num, reduceNum- k);
        }
    }

    static void findCombinations(int n)
    {
        int[] arr = new int[n];
        findCombinationsUtil(arr,0,n,n);
    }

    public static void main(String[] args) {
        int n = 5;
        findCombinations(n);
    }
}
