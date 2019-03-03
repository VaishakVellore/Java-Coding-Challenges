package FacebookInterviewkit;

import java.util.HashSet;
import java.util.Set;

public class TripletsZeroSum {

    static int findTriplets(int[] arr, int n)
    {
        Set<Integer> set = new HashSet<>();
        for(int i: arr)
            set.add(i);
        int sum;
        for(int i = 0; i<n; i++)
        {
            for(int j = i+1; j<n; j++) {
                sum = arr[i] + arr[j];
                if(sum > 0)
                {
                    if(set.contains(-sum))
                        return 1;
                }
               else
                   if(set.contains(sum))
                       return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {6,56, 93, -12, 26 ,78, 79, 58, 53, 52, 51, 55, 77, -2, 61, -26, 91, 16, 100, -8 ,72};
        int n = arr.length;
        int result = findTriplets(arr,n);
        if(result == 1)
            System.out.println("Triplets found which give zero sum");
        else
            System.out.println("Triplets not found");
    }
}
