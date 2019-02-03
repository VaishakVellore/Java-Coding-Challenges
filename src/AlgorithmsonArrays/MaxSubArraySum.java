package AlgorithmsonArrays;


public class MaxSubArraySum {

    static int max(int a, int b) {
        return (a > b)? a : b;
    }

    static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    static int maxCrossingSum(int[] arr,int left, int mid, int right)
    {
        int sum = 0;
        int left_sum = Integer.MIN_VALUE;
        for(int i =mid; i>=left; i--)
        {
            sum = sum+arr[i];
            if(sum > left_sum)
                left_sum = sum;
        }

        sum = 0;
        int right_sum = Integer.MIN_VALUE;
        for(int i = mid+1; i<=right; i++)
        {
            sum = sum+ arr[i];
            if(sum > right_sum)
                right_sum = sum;
        }
        return right_sum + left_sum;
    }

    static int maxSubarraySum(int[] arr, int left, int right)
    {
        if(left == right)
            return arr[left];

        int mid = left +(right-left)/2;

        return max(maxSubarraySum(arr,left,mid),
                maxSubarraySum(arr,mid+1,right),
                maxCrossingSum(arr,left,mid,right));
    }

    public static void main(String[] args) {
        int[] arr = {-2, -5, 6, -2, -3, 1, 5, -6};
        int n = arr.length;
        int sum = maxSubarraySum(arr, 0,n-1);
        System.out.println("Maximum Subarray Sum is: " +sum);
    }
}
