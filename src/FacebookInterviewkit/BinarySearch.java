package FacebookInterviewkit;

public class BinarySearch {

    public static int binarySearch(int[] arr, int key)
    {
        if(arr.length == 0)
            return -1;
        int left = 0, right = arr.length-1;

        while(left <= right)
        {
            int mid = left + (right-left)/2;

            if(key == arr[mid])
                return mid;
            else if(key < arr[mid])
                right = mid -1;
            else
                left = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        int key = 5;
        int result = binarySearch(arr,key);
        if(result == -1)
            System.out.println("Key not found");
        else
            System.out.println("Key found at location: " +result);
    }
}
