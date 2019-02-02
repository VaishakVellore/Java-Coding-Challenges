package AlgorithmsonArrays;

public class PeakElement {
    static int findPeakUtil(int[] arr, int low, int high, int n)
    {
        int mid = low + (high-low)/2;
        if((mid == 0 || arr[mid] >= arr[mid -1]) && (mid == n-1 || arr[mid] >= arr[mid+1]))
            return mid;
        else if (mid > 0 && arr[mid-1] > arr[mid])
            return findPeakUtil(arr, 0,mid-1, n);
        else
            return findPeakUtil(arr,mid+1, high, n);
    }

    static int findPeak(int[] arr, int n)
    {
        return findPeakUtil(arr, 0, n-1,n);
    }

    public static void main(String[] args) {
        int[] arr = {1, 20,3, 4, 1, 0};
        int n = arr.length;
        System.out.println("Index of a peak point is " + findPeak(arr, n));

    }
}
