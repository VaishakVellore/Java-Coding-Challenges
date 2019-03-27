package Walmart_Interviewkit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeUnsortedLists {

    static void merge(int[] list1, int[] list2)
    {
        int length = list1.length + list2.length;
        int[] result = new int[length];

        int i = 0;
        int j = 0;

        for(int k = 0; k <length; k++)
        {
            if(i >= list1.length)
            {
                result[k] = list2[j];
                j++;
            }

            else if(j >= list2.length)
            {
                result[k] = list1[i];
                i++;
            }

            else
            {
                if(list1[i] < list2[j]) {
                    result[k] = list1[i];
                    i++;
                }
                else {
                    result[k] = list2[j];
                    j++;
                }
            }
        }

        Arrays.sort(result);

        Set<Integer> set = new HashSet<>();

        for(int num:result)
        {
            if(set.contains(num))
                continue;
            else
                set.add(num);
        }

        System.out.println(set);

    }

    public static void main(String[] args) {
        int[] list1 = {1,4,3,2};
        int[] list2 = {2,6,4,3,8};

        merge(list1, list2);
    }
}
