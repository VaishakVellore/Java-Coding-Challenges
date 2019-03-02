package FacebookInterviewkit;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RearrangeString {

    static void rearrangeStr(String str){
        StringBuilder s = new StringBuilder();
        int sum = 0;
        for(int i = 0; i<str.length(); i++)
        {
            if(Character.isDigit(str.charAt(i)))
                sum = sum + Character.getNumericValue(str.charAt(i));

            else
                s.append(str.charAt(i));
        }
        String sorted = Stream.of(s.toString().split(""))
                        .sorted()
                        .collect(Collectors.joining());
        s = new StringBuilder();
        s = s.append(sorted);
        s = s.append(sum);
        System.out.println("The rearranged string is: " +s.toString());
    }

    public static void main(String[] args) {
        String str = "ACCBA10D2EW30";
        rearrangeStr(str);
    }
}
