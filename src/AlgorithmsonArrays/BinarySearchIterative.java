package AlgorithmsonArrays;

public class BinarySearchIterative {

    static int binarySearch(int[] arr,int x)
    {
        int l = 0, r = arr.length-1;
        while(l<=r)
        {
            int mid = l+(r-l)/2;
            if(arr[mid] == x)
                return mid;
            else if( x > arr[mid])
                l = mid+1;
            else
                r = mid -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,8,11,15,17};
        int x = 15;
        int result = binarySearch(arr,x);
        if(result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: "+result);
    }
}
