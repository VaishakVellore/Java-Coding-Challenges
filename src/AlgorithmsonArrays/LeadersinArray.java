package AlgorithmsonArrays;

public class LeadersinArray {

    static void leadersArray(int[] arr)
    {
        for( int i = 0; i<arr.length; i++)
        {
            int j;
            for(j = i+1; j<arr.length; j++)
            {
                if(arr[i] <= arr[j])
                    break;
            }
            if(j == arr.length)
                System.out.println(arr[i] +" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {16,17,3,4,5,2};
        leadersArray(arr);
    }
}
