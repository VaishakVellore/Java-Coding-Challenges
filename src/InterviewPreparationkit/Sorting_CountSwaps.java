package InterviewPreparationkit;

public class Sorting_CountSwaps {

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        int n = a.length;
        int count = 0;
        for( int i = 0; i< n-1;i++)
            for( int j =0;j< n-i-1;j++)
                if(a[j]>a[j+1]) {
                    count++;
                    int temp = a[j];
                    a[j]= a[j+1];
                    a[j+1]= temp;
                }
        System.out.println("Array is sorted in "+count+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[a.length -1]);
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1};
        countSwaps(arr);
    }
}
