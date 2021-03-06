package InterviewPreparationkit;

import javax.print.attribute.IntegerSyntax;
import java.math.BigInteger;
import java.util.*;

public class PrimesinSubtree {

/*
    static class valueclass{
       public Integer value;
       public List<Integer> childrenList = new ArrayList<>();
    }

    public static List<Integer> primeQuery(int n, List<Integer> first, List<Integer> second, List<Integer> values, List<Integer> queries) {
        // Write your code here
        HashMap<Integer,List<Integer>> map1 = new HashMap<>();
        HashMap<Integer,List<Integer>> map2 = new HashMap<>();

        HashMap<Integer,valueclass> finalMap = new HashMap<>();
        List<Integer> visited = new ArrayList<>();
        for(Integer i = 0; i < first.size(); i++){
            Integer firstvalue = first.get(i);
            Integer secondValue = second.get(i);
            if(finalMap.containsKey(firstvalue))
            {
                finalMap.get(firstvalue).childrenList.add(secondValue);

            }
            else {
                valueclass valueclass1 = new valueclass();
                valueclass1.childrenList.add(secondValue);
                Integer nodeValue = values.get(firstvalue -1);
                valueclass1.value = nodeValue;
                finalMap.put(firstvalue, valueclass1);
            }


            if(finalMap.containsKey(secondValue))
            {
                finalMap.get(secondValue).childrenList.add(firstvalue);

            }
            else {
                valueclass valueclass1 = new valueclass();
                valueclass1.childrenList.add(firstvalue);
                Integer nodeValue = values.get(secondValue -1);
                valueclass1.value = nodeValue;
                finalMap.put(secondValue, valueclass1);
            }

        }



        System.out.println(finalMap);
        System.out.println(map2);
        System.out.println(visited);


        // combining two maps.
       HashMap<Integer,List<Integer>> map3 = new HashMap<>();
       map3.putAll(map1);

       // add map2 to map3.
        for(int i: map2.keySet()){
            if(map3.keySet().contains(i)){
                List<Integer> tlist = map3.get(i);
                List<Integer> toadd = map2.get(i);

                    tlist.addAll(toadd);
                //HashSet<Integer> combined = new HashSet<>(tlist);
                //combined.addAll(toadd);
                //map3.put(i,new ArrayList<>(combined));
                map3.put(i,tlist);
            }
            else{
                map3.put(i,map2.get(i));
            }
        }

        List<Integer>result = new ArrayList<>();
        for(int i:queries){
            result.add(getResult(map3, i,values ));
        }

        //System.out.println(result);


        return result;
    }
    */

    public static List<Integer> getIndex(List<Integer> list, int num){
        List<Integer> indexlist = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i)==num)
                indexlist.add(i);
        }
        return indexlist;
    }

    public static List<Integer> primeQuery(int n, List<Integer> first, List<Integer> second, List<Integer> values, List<Integer> queries) {
        // Write your code here
        HashMap<Integer,List<Integer>> map1 = new HashMap<>();
        HashMap<Integer,List<Integer>> map2 = new HashMap<>();
        List<Integer> set = new ArrayList<>();

        set.add(1);
        for(int i=0;i<first.size();i++){
            if(first.contains(1)){

                List<Integer> indexlist = getIndex(first,1);
                List<Integer> valuelist = new ArrayList<>();
                for(int j:indexlist){
                    valuelist.add(second.get(j));
                    if(!set.contains(second.get(j)))
                        set.add(second.get(j));
                }

                map1.put(1,valuelist);

            }

            if(second.contains(1)){
                set.add(1);

                List<Integer> indexlist = getIndex(second,1);
                List<Integer> valuelist = new ArrayList<>();
                for(int j:indexlist){
                    valuelist.add(first.get(j));
                    if(!set.contains(first.get(j)))
                        set.add(first.get(j));
                }

                map2.put(1,valuelist);
            }

            // populate all the values for maps using set values.
            int k = 1;
            while(k< set.size()){
                int t = set.get(k);
                if(first.contains(t)){

                    List<Integer> indexlist = getIndex(first,t);
                    List<Integer> valuelist = new ArrayList<>();
                    for(int j:indexlist){
                        int toaddValue = second.get(j);

                        if(set.indexOf(t)<set.indexOf(toaddValue))
                            valuelist.add(toaddValue);
                        if(!set.contains(toaddValue))
                            set.add(toaddValue);
                    }

                    if(valuelist.size()>=1)
                        map1.put(t,valuelist);

                }

                if(second.contains(t)){

                    List<Integer> indexlist = getIndex(second,t);
                    List<Integer> valuelist = new ArrayList<>();
                    for(int j:indexlist){
                        int toaddValue = first.get(j);
                        if(set.indexOf(t) < set.indexOf(toaddValue))
                            valuelist.add(toaddValue);

                        if(!set.contains(toaddValue))
                            set.add(toaddValue);
                    }

                    if(valuelist.size()>=1)
                        map2.put(t,valuelist);
                }

                k++;
            }

        }


        //System.out.println(map1);
        //System.out.println(map2);
        //System.out.println(set);


        // combining two maps.
        HashMap<Integer,List<Integer>> map3 = new HashMap<>();
        map3.putAll(map1);

        // add map2 to map3.
        for(int i: map2.keySet()){
            if(map3.keySet().contains(i)){
                List<Integer> tlist = map3.get(i);
                List<Integer> toadd = map2.get(i);

                HashSet<Integer> combined = new HashSet<>(tlist);
                combined.addAll(toadd);
                map3.put(i,new ArrayList<>(combined));
            }
            else{
                map3.put(i,map2.get(i));
            }
        }

        List<Integer>result = new ArrayList<>();
        for(int i:queries){
            result.add(getResult(map3, i,values ));
        }

        //System.out.println(result);


        return result;
    }

    public static int getResult (HashMap<Integer, List<Integer>> map3, int i,List<Integer> values){
        int count = 0;
        int k = 0;
        List<Integer> queue = new ArrayList<>();
        queue.add(i);

        while(k<queue.size()){
            List<Integer> nodeNums = map3.get(queue.get(k));
            if(nodeNums!=null){
                for(int j: map3.get(queue.get(k)))
                    queue.add(j);

                /*if(isPrime(values.get(queue.get(k)-1)))
                    count++;*/
            }

            if(isPrime(values.get(queue.get(k)-1)))
                count++;

            k++;
        }
        //System.out.println(count);
        return count;
    }

    public static boolean isPrime(int num){

        if(num%2==0 || num<3){
            if(num==2)
                return true;
            return false;
        }

        for(int i=3;i<=Math.sqrt(num);i++){
            if(num%i==0)
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        int n = 10;
        List<Integer> firstnode = new ArrayList<>(Arrays.asList(6, 8, 3, 6, 4, 1, 8, 5, 1));
        List<Integer> secondnode = new ArrayList<>(Arrays.asList(9, 9, 5, 7, 8, 8, 10, 8, 2));
        List<Integer> values = new ArrayList<>(Arrays.asList(17, 29, 3, 20, 11, 8, 3, 23, 5, 15));
        List<Integer> queries = new ArrayList<>(Arrays.asList(1,2));
        primeQuery(n,firstnode,secondnode,values,queries);
    }
}
