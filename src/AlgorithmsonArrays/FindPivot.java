package AlgorithmsonArrays;

public class FindPivot {

    static int findPivot(int[] arr){
        if(arr == null || arr.length == 0)
            return -1;
        if(arr.length == 1 || arr[0] < arr[arr.length -1])
            return 0;

        int left = 0, right = arr.length-1;
        while(left <= right)
        {
            int mid = left +(right-left)/2;

            if(mid < arr.length -1 && arr[mid] > arr[mid +1])
                return (mid+1);
            else if (arr[left] <= arr[mid])
                left = mid+1;
            else
                right = mid -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {5,6,7,8,1,2,3,4};
        int index = findPivot(arr);
        System.out.println("Pivot " + (index >= 0 ? (" found at index "  + index) : " not found!" ));
    }
}
