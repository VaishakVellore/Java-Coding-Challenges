package AlgorithmsonArrays;

import java.util.Arrays;

public class FindNextGreatElement {

    static void swap(char ar[], int i, int j)
    {
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    static void findNext(char[] digit, int n)
    {
        int i;
        for(i = n-1; i>0; i--)
        {
            if(digit[i-1] < digit[i])
                break;
        }

        if(i == 0)
            System.out.println("Not Possible");
        else {
            int smallest = i, x = digit[i - 1];
            for (int j = i + 1; j < n; j++) {
                if (digit[j] < digit[smallest] && digit[j] > x)
                    smallest = j;
            }
            swap(digit, i - 1, smallest);

            Arrays.sort(digit, i, n);
            System.out.print("Next number with same set of digits is ");
            for (i = 0; i < n; i++)
                System.out.print(digit[i]);
        }
    }

    public static void main(String[] args) {
        char[] digit = { '5','4','3','2','1'};
        int n = digit.length;
        findNext(digit, n);
    }
}
