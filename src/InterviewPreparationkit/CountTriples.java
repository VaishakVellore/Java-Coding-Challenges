package InterviewPreparationkit;

import java.util.*;

public class CountTriples {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
        Map<Long,Long> v2 = new HashMap<>();
        Map<Long,Long> v3 = new HashMap<>();
        Long count = 0L;
        for (Long k:arr) {
            count+=v3.get(k)==null?0:v3.get(k);
            if (v2.get(k)!=null) v3.compute(k*r,(key,value)->value!=null?value+v2.get(k):v2.get(k));
            v2.compute(k*r,(key,value)->value==null?1:value+1);
        }
        return count;
    }

    public static void main(String[] args) {
        long r = 2;
        List<Long> arr = new ArrayList<Long>(Arrays.asList(1L,2L,2L,4L));

        Long result = countTriplets(arr,r);
        System.out.println(result);
    }
}
