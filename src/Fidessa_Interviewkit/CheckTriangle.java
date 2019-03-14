package Fidessa_Interviewkit;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CheckTriangle {

    static void checkTriangle(int[] arr)
    {
        Arrays.sort(arr);
        if(arr[0] + arr[1] < arr[2])
            System.out.println("NOT A TRIANGLE");
        Map<Integer,Integer> map = new HashMap<>();
        for(int i: arr)
        {
            if(!map.containsKey(i))
                map.put(i,1);
            else
                map.put(i,map.get(i)+1);
        }
        int size = map.size();
        System.out.println(size == 3 ? "Scalene" : (size == 2 ? "Isocoles" : "Equilateral"));
    }

    public static void main(String[] args) {
        int[] arr = {3,3,3};
        checkTriangle(arr);
    }
}
