package InterviewPreparationkit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Google_Garden {
    private static List<List<Integer>> mylist = new ArrayList<>();

    public static void main(String[] args) {
        // int[] arr={1,2,1,3,4,3,5,1,2};
        int[] arr={ };

        List<Integer> temp = new ArrayList<>();

        int i=0;
        int fruit1 = -1, fruit2= -1;

        int maxValue = 0;

        while(i<arr.length){

            // fruit 1 element.
            if(temp.size()==0){
                fruit1 = arr[i];
            }

            // fruit 2
            if(temp.size()!=0 && arr[i]!=fruit1 && fruit2==-1){
                fruit2 = arr[i];
            }

            // add all elements which matches fruit1
            if(arr[i]==fruit1 || arr[i]==fruit2){
                temp.add(arr[i]);
            }

            if(arr[i]!=fruit1 && arr[i]!=fruit2){
                if(temp.size() > maxValue)
                    maxValue = temp.size();

                System.out.println(temp);
                mylist.add(temp);
                temp.clear();
                fruit1=arr[i];
                fruit2=-1;
                temp.add(arr[i]);

            }

            if(temp.size() > maxValue)
                maxValue = temp.size();

            i++;
        }

        // System.out.println(mylist);
        System.out.println(maxValue);


    }
}
