package InterviewPreparationkit;

import java.util.*;

public class Fidessa_AirportProblem {

    static class flight{
        int time;
        boolean type;
    }

    public static int findMinGates(List<Integer> arrivals, List<Integer> departures, int flights){

        /*TreeMap<Integer,Boolean> mymap = new TreeMap<>();
        for(Integer i: arrivals)
            mymap.put(i, false);

        for(Integer i: departures)
            mymap.put(i,true);

        int count = 0;
        int max = 0;

       for(Map.Entry<Integer,Boolean> entry:mymap.entrySet()){
           if(entry.getValue() == false)
               count++;
           else
               count--;
           max = Math.max(max,count);
       }
        System.out.println(max);
        System.out.println(mymap);

       return max;*/


        List<flight> mylist = new ArrayList<>();
        for(int i=0;i<arrivals.size();i++){
            flight ob = new flight();
            ob.time = arrivals.get(i);
            ob.type = false;
            mylist.add(ob);
        }

        for(int i=0;i<departures.size();i++){
            flight ob = new flight();
            ob.time = departures.get(i);
            ob.type = true;
            mylist.add(ob);
        }

        Collections.sort(mylist, Comparator.comparingInt((flight ob2) -> ob2.time).thenComparingInt((flight ob1) -> ob1.time));
        // System.out.println(mylist);

        int count = 0, maxcount = 0;

        for(int i=0;i<mylist.size();i++){
            flight ob = mylist.get(i);
            if(!ob.type)
                count++;
            else
                count--;
            maxcount = Math.max(count,maxcount);
        }

         System.out.println(maxcount);
        return maxcount;
    }

    public static void main(String[] args) {
        Integer[] arr = {900,902, 904, 906, 908,910};
        Integer[] dept = {902,904,906,908,910,912};
        int flights = 6;
        findMinGates(Arrays.asList(arr), Arrays.asList(dept), flights);


    }
}



