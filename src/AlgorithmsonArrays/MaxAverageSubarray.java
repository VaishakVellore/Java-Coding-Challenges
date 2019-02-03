package AlgorithmsonArrays;

public class MaxAverageSubarray {
    static void findMaxAvg(int[] arr, int n, int k)
    {
        if(k > n)
            System.out.println("Error");

        int sum = arr[0];
        for(int i = 1; i<k; i++)
            sum = sum + arr[i];

        int max_sum = sum, max_end = k-1;
        for(int i = k; i<n ; i++)
        {
            sum = sum + arr[i] - arr[i-k];

            if(sum > max_sum)
            {
                max_sum = sum;
                max_end = i;
            }
        }
        System.out.println("The maximum average subarray is "+ max_sum);
        System.out.println("The starting index is " +(max_end-k+1));
    }

    public static void main(String[] args) {
        int arr[] = {1, 12, -5, 40, -6, 3};
        int k = 4;
        int n = arr.length;
        findMaxAvg(arr, n, k);
    }
}
