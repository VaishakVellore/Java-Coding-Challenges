package AlgorithmsonArrays;

import java.util.HashSet;

public class FindDuplicates {

    static void duplicates(int[] arr){
        HashSet<Integer> map = new HashSet();

        for(int i: arr)
        {
            if(map.add(i) == false)
                System.out.println("Duplicates: " +i);
            else
                map.add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,3,4};
        duplicates(arr);
    }
}
