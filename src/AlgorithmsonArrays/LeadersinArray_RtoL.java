package AlgorithmsonArrays;

public class LeadersinArray_RtoL {

    static void leadersArray(int[] arr){
        int n = arr.length;
        int max_right = arr[n-1];
        System.out.println(max_right + " ");

        for(int i = n -2; i>=0; i--)
        {
            if(max_right < arr[i])
            {
                max_right = arr[i];
                System.out.println(max_right + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {16,17,3,4,5,2};
        leadersArray(arr);
    }
}
