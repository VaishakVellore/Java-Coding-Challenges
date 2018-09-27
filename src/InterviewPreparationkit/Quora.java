
package InterviewPreparationkit;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Quora {
    private static List<List<Integer>> skills = new ArrayList<>();

    static void combinationUtil(int arr[], int data[], int start,
                                int end, int index, int r)
    {
        List<Integer> temp = new ArrayList<>();
        if (index == r)
        {
            for (int j=0; j<r; j++) {
                //System.out.print(data[j] + " ");
                temp.add(data[j]);
            }
            System.out.println("");
            skills.add(temp);
            return;
        }

        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r);
        }
    }

    static void printCombination(int arr[], int n, int r)
    {
        int data[]=new int[r];
        combinationUtil(arr, data, 0, n-1, 0, r);
    }


    static int sumlist(List<Integer> list){
        int sum=0;
        for(int i:list)
            sum +=i;
        return sum;
    }

    public static void main(String args[] ){
        int combinations = 0;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        int[] arr = new int[n];
        //int[] arr = {1,2,3,4,5};

       String[] arrItems = s.nextLine().split(" ");

        //System.out.print(arrItems);
        for (int i = 0; i < arrItems.length; i++) {
            int arri = Integer.parseInt(arrItems[i]);
            arr[i] = arri;

        }
        int k = s.nextInt();
        s.nextLine();
        printCombination(arr, n, 3);

        for(List<Integer> i:skills){
            if(sumlist(i)==k)
                combinations++;
        }

        System.out.println(combinations);
    }
}

