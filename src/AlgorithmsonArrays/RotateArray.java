package AlgorithmsonArrays;

public class RotateArray {
    static void leftRotate(int[] arr, int n)
    {
        for(int i = 0; i<n; i++)
        {
            leftRotateOne(arr);
        }

        for(int i = 0; i< arr.length; i++)
            System.out.println(arr[i]+ " ");
    }

    static void leftRotateOne(int[] arr)
    {
        int temp = arr[0];
        int i;
        for(i = 0; i< arr.length-1; i++)
            arr[i] = arr[i+1];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int rotate = 2;
        leftRotate(arr, rotate);

    }
}
