package InterviewPreparationkit;

import javax.print.attribute.IntegerSyntax;
import java.util.*;

public class Primesubtree_rough{

    public static List<Integer> getIndex(List<Integer> list, Integer num){
        List<Integer> indexlist = new ArrayList<>();
        for(Integer i=0;i<list.size();i++){
            if(list.get(i)==num)
                indexlist.add(i);
        }
        return indexlist;
    }


    public static List<Integer> primeQuery(int n, List<Integer> first, List<Integer> second, List<Integer> values, List<Integer> queries) {
        // Write your code here
        HashMap<Integer,List<Integer>> map1 = new HashMap<>();
        //HashMap<Integer,List<Integer>> map2 = new HashMap<>();
        List<Integer> visited = new ArrayList<>();

        visited.add(1);
        for(Integer i=0;i<first.size();i++){
            Integer one1 = first.get(1);
            if(/*first.contains(1)*/ one1 != null){

                List<Integer> indexlist = getIndex(first,1);
                List<Integer> valuelist = new ArrayList<>();
                for(Integer j:indexlist){
                    valuelist.add(second.get(j));
                    if(!visited.contains(second.get(j)))
                        visited.add(second.get(j));
                }
                indexlist.clear();
                if (first.contains(1) && !(second.contains(1)))
                    map1.put(1,valuelist);
            }
            Integer one2 = second.get(1);
            if(/*second.contains(1)*/ one2 != null){
                visited.add(1);

                List<Integer> indexlist = getIndex(second,1);
                List<Integer> valuelist = new ArrayList<>();
                for(Integer j:indexlist){
                    valuelist.add(first.get(j));
                    if(!visited.contains(first.get(j)))
                        visited.add(first.get(j));
                }
                map1.put(1,valuelist);
                //map2.put(1,valuelist);
            }

            // populate all the values for maps using visited values.
            Integer k = 1;

            while(k< visited.size()){
                Integer t = visited.get(k);
                List<Integer> indexlist = getIndex(first,t);
                List<Integer> valuelist = new ArrayList<>();
                Integer temp1 = first.get(t);
                if(/*first.contains(t)*/ temp1 != null){

                    //List<Integer> indexlist = getIndex(first,t);
                    //List<Integer> valuelist = new ArrayList<>();
                    for(Integer j:indexlist){
                        Integer toaddValue = second.get(j);

                        if(visited.indexOf(t)<visited.indexOf(toaddValue))
                            valuelist.add(toaddValue);
                        if(!visited.contains(toaddValue))
                            visited.add(toaddValue);
                    }
                    if(temp1 == null)
                    {

                    }

                    //if(valuelist.size()>=1)
                    //map1.put(t,valuelist);
                    indexlist.clear();
                    if(valuelist.size()>=1) {
                        if (first.contains(t) && !(second.contains(t)))
                            map1.put(t, valuelist);
                    }

                }
                Integer temp2 = second.get(t);
                if(/*second.contains(t)*/ temp2 != null){

                    //List<Integer> indexlist = getIndex(second,t);
                    //List<Integer> valuelist1 = new ArrayList<>();
                    indexlist = getIndex(second,t);
                    for(Integer j:indexlist){
                        Integer toaddValue = first.get(j);
                        if(visited.indexOf(t) < visited.indexOf(toaddValue))
                            valuelist.add(toaddValue);

                        if(!visited.contains(toaddValue))
                            visited.add(toaddValue);
                    }

                    if(valuelist.size()>=1)
                        map1.put(t, valuelist);
                    //map2.put(t, valuelist);
                }

                k++;
            }

        }


        System.out.println("map1 is" +map1);
        //System.out.println(map2);
        System.out.println("visited set" +visited);


        // combining two maps.
       /* HashMap<Integer,List<Integer>> map3 = new HashMap<>();
        map3.putAll(map1);

        // add map2 to map3.
        for(Integer i: map2.keySet()){
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
          */
        List<Integer>result = new ArrayList<>();
        for(Integer i:queries){
            result.add(getResult(map1, i,values ));
        }

        System.out.println("Result is :"+result);


        return result;
    }

    public static Integer getResult (HashMap<Integer, List<Integer>> map1, Integer i,List<Integer> values){
        Integer count = 0;
        Integer k = 0;
        List<Integer> queue = new ArrayList<>();
        queue.add(i);

        while(k<queue.size()){
            List<Integer> nodeNums = map1.get(queue.get(k));
            if(nodeNums!=null){
                for(Integer j: map1.get(queue.get(k)))
                    queue.add(j);

                /*if(isPrime(values.get(queue.get(k)-1)))
                    count++;*/
            }

            if(isPrime(values.get(queue.get(k)-1)))
                count++;

            k++;
        }
        return count;
    }

    public static boolean isPrime(Integer num){

        if(num%2==0 || num<3){
            if(num==2)
                return true;
            return false;
        }

        for(Integer i=3;i<=Math.sqrt(num);i++)
        {
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
        List<Integer> queries = new ArrayList<>(Arrays.asList(1,8,9,6,4,3));
        primeQuery(n,firstnode,secondnode,values,queries);
    }
}
