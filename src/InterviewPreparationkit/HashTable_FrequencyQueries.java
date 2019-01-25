package InterviewPreparationkit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.util.Arrays.asList;

public class HashTable_FrequencyQueries {

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(int[][] queries) {
        List<Integer> retList = new ArrayList<>();
        HashMap<Integer, Integer> value = new HashMap<>();
        HashMap<Integer, Integer> count = new HashMap<>();

        for(int i = 0; i<queries.length; i++)
        {
            int op = queries[i][0];
            int num = queries[i][1];

            if(op == 1)
            {
                if(value.containsKey(num))
                {
                    value.put(num,value.get(num)+1);
                }
                else
                    value.put(num,1);
            }

            else if(op == 2)
            {
                if(value.containsKey(num))
                {
                    if(value.get(num) <=1)
                        value.remove(num);
                    else
                        value.put(num,value.get(num) -1);
                }
            }

            else if(op == 3)
            {
                if(value.containsValue(num))
                    retList.add(1);
                else
                    retList.add(0);
            }
        }

        return retList;

    }

    public static void main(String[] args) {
        int[][] queries = {{1 ,5}, {1, 6}, {3, 2},{1 ,10}, {1 ,10}, {1 ,6}, {2 ,5},{3 ,2}};
        List<Integer> result = freqQuery(queries);
        System.out.println(result);

    }
}
