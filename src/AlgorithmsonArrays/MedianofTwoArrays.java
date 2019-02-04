package AlgorithmsonArrays;

public class MedianofTwoArrays {

    static int getMedian(int[] arr1, int[] arr2, int n)
    {
        if(n <= 0)
            return -1;
        if(n == 1)
            return (arr1[0]+arr1[0])/2;
        if(n == 2)
            return (Math.max(arr1[0],arr2[0]) + Math.min(arr1[1],arr2[1]));

        int m1 = median(arr1,n);
        int m2 = median(arr2,n);

        if(m1 == m2)
            return m1;

        if(m1 < m2)
        {
            if(n%2 == 0)
                return getMedian(arr1 , arr2, n - n / 2 + 1);
            return getMedian(arr1 , arr2, n - n / 2);
        }
        if (n % 2 == 0)
            return getMedian(arr2 , arr1, n - n / 2 + 1);
        return getMedian(arr2 , arr1, n - n / 2);
    }

    static int median(int[] arr, int n)
    {
        if(n%2 == 0)
            return (arr[n / 2] + arr[n / 2 - 1]) / 2;
        else
            return arr[n / 2];
    }

    public static void main(String[] args) {
        int ar1[] = {1, 2, 3, 6};
        int ar2[] = {4, 6, 8, 10};
        int n1 = ar1.length;
        int n2 = ar2.length;
        if(n1 == n2)
            System.out.println("The Median of the two arrays is "+getMedian(ar1,ar2,n1));
        else
            System.out.println("Doesn't work if length is not same");
    }
}
