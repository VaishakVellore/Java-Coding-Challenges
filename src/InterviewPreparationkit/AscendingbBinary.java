package InterviewPreparationkit;

import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class AscendingbBinary {

    public static List<Integer> rearrange(List<Integer> elements) {
        List<BigInteger> binaryList = new ArrayList<>();
        TreeMap<Integer, List<BigInteger>> valueMap = new TreeMap<>();
        for (Integer i : elements
                ) {
            String binaryString = Integer.toBinaryString(i);
            Integer count = binaryString.length() - binaryString.replace("1", "").length();
            if (valueMap.containsKey(count)) {
                valueMap.get(count).add(new BigInteger(binaryString));
            } else {
                List<BigInteger> test = new ArrayList();
                test.add(new BigInteger(binaryString));
                valueMap.put(count, test);
            }
        }

        for (List<BigInteger> insideList : valueMap.values()
                ) {

            binaryList.addAll(insideList.stream().sorted().collect(Collectors.toList()));
        }
        List<Integer>retList= new ArrayList<>();
        for (BigInteger s:binaryList
                ) {
            Integer intValue= Integer.parseInt(""+s, 2);
            retList.add(intValue);
        }

        return retList;

        }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(1,2,3));

        System.out.println(rearrange(a));

    }
}
