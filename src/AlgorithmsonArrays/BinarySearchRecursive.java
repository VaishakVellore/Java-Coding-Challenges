package AlgorithmsonArrays;

public class BinarySearchRecursive {

    static int binarySearch(int[] arr, int l, int r, int x)
    {
        if(l<=r)
        {
            int mid = l+(r-l)/2;
            if(arr[mid] == x)
                return mid;
            else if( x < arr[mid])
                return binarySearch(arr,l,mid-1,x);
            else
                return binarySearch(arr,mid+1,r,x);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,8,11,15,17};
        int x = 15;
        int n = arr.length;
        int result = binarySearch(arr,0,n-1,x);
        if(result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: "+result);
    }
}
