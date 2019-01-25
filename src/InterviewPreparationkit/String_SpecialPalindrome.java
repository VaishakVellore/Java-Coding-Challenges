package InterviewPreparationkit;

import java.util.ArrayList;
import java.util.List;

public class String_SpecialPalindrome {

    static class Point{ char text; long counter;
        Point(char t, long c){
            text = t;
            counter = c;
        }
    }
    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        long palindromeCount = 0L;
        long equalCounter = 1L;
        List<Point> countList = new ArrayList<Point>();

        for(int i=1; i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                equalCounter++;
            }
            else{
                countList.add(new Point(s.charAt(i-1),equalCounter));
                equalCounter = 1L;
            }
        }
        countList.add(new Point(s.charAt(s.length()-1), equalCounter));

        for(int i=0; i<countList.size(); i++){
            palindromeCount += (countList.get(i).counter+1)*countList.get(i).counter/2;
        }
        for (int i = 1; i < countList.size()-1; i++) {
            if(countList.get(i).counter == 1
                    && countList.get(i-1).text == countList.get(i+1).text){
                palindromeCount += Math.min(countList.get(i-1).counter,countList.get(i+1).counter);
            }
        }

        return palindromeCount;
    }

    public static void main(String[] args) {
        String str = "abcbaba";
        int n = str.length();

        long result = substrCount(n,str);
        System.out.println(result);
    }

}
