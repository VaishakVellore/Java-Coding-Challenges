package AlgorithmsonArrays;

public class CoinChange_Recursive {

    static int countChange(int[] arr, int m, int n)
    {
        if(n == 0)
            return 1;
        if(n < 0)
            return 0;
        if(m <=0 && n>=1)
            return 0;
        return countChange(arr,m-1,n)+ countChange(arr,m,n-arr[m-1]);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int m = arr.length;
        System.out.println( countChange(arr, m, 4));
    }
}
