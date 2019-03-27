package Walmart_Interviewkit;

public class FindKeyinInfinteArray {

    static int binarySearch(int[] arr, int l, int r, int k)
    {
        while(l <= r)
        {
            int mid = l +(r-l)/2;

            if(arr[mid] == k)
                return mid;
            else if (arr[mid] < k)
                l = mid+1;
            else
                r = mid - 1;
        }

        return -1;
    }

    static int findPos(int[] arr, int k)
    {
        int l = 0, h = 1;
        int val = arr[0];

        while(val < k)
        {
            l = h;

            if(2*h < arr.length-1)
                h = 2*h;
            else
                h = arr.length - 1;

            val = arr[h];
        }

        return binarySearch(arr, l, h, k);
    }

    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int ans = findPos(arr,10);

        if(ans == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " +ans);
    }
}
