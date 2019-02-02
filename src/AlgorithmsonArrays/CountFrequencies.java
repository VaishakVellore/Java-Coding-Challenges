package AlgorithmsonArrays;

public class CountFrequencies {

    static void countFrequencies(int[] arr) {
        int i = 0;
        int n = arr.length;
        while(i<n) {
            if(arr[i] <= 0)
            {
                i++;
                continue;
            }
            int elementIndex = arr[i] - 1;
            if(arr[elementIndex] > 0)
            {
                arr[i] = arr[elementIndex];
                arr[elementIndex] = -1;
            }
            else
            {
                arr[elementIndex]--;
                arr[i] = 0;
                i++;
            }
        }
        System.out.println("Below are counts of all elements");
        for (int j = 0; j < n; j++)
            System.out.println(j+1 + "->" + Math.abs(arr[j]));
    }

    public static void main(String[] args) {
        int[] arr = {2,3,3,2,5};
        countFrequencies(arr);
    }
}
