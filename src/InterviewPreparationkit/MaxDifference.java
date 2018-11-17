package InterviewPreparationkit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MaxDifference {

    static int maxDifference(int[] a) {
        int smallest = a[0];
        int maxDiff =Integer.MIN_VALUE;
        for(int i=1;i<a.length;i++){

            if(a[i]-smallest >= maxDiff)
                maxDiff = a[i]-smallest;

            if(a[i]<=smallest){
                smallest = a[i];
            }
        }

        return maxDiff;

    }



    public static void main(String[] args) {
        int[] a = {10,8,7,6,5};
        System.out.println(maxDifference(a));
    }
}
