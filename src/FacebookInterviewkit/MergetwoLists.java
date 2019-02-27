package FacebookInterviewkit;

import java.util.Arrays;

public class MergetwoLists {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {1,1,2,3,4,4,5,6,7};
        int[] c = new int [a.length + b.length];

        int i =0, j =0, k = 0;
        while (i < a.length && j < b.length)
            c[k++] = a[i] <= b[j] ? a[i++] : b[j++];
        while (i < a.length)
            c[k++] = a[i++];
        while (j < b.length)
            c[k++] = b[j++];

        System.out.println(Arrays.toString(c));

    }
}
