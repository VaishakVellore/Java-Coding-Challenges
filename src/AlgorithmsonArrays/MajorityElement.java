package AlgorithmsonArrays;

public class MajorityElement {

    static void printMajority(int[] arr){
        int element = findMajority(arr);

        if(isMajority(arr,element))
            System.out.println("The majority element is "+element);
        else
            System.out.println("Majority element not found");
    }

    static int findMajority(int[] arr){
        int length = arr.length;
        int count = 1, max_index = 0;
        for(int i =1; i<length; i++){
            if(arr[max_index] == arr[i])
                count++;
            else
                count--;
            if(count == 0)
            {
                max_index = i;
                count = 1;
            }
        }
        return arr[max_index];
    }

    static boolean isMajority(int[] arr, int element)
    {
        int count = 0, size = arr.length;
        for(int i =0; i<arr.length; i++)
        {
            if(element == arr[i])
                count++;
        }
        if(count > size/2 )
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 3, 1, 2};
        printMajority(arr);
    }
}
