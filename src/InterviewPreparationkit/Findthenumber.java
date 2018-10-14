package InterviewPreparationkit;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Findthenumber {

    // Complete the findNumber function below.
    static String findNumber(List<Integer> arr, int k) {
        String result = "";
        if(arr.contains(k))
            result = "YES";
        else
            result = "NO";
        return result;

    }

    public static void main(String[] args) throws IOException {
       List<Integer> arr = new ArrayList<Integer>();
       arr.add(5);
       arr.add(4);
       arr.add(3);
       arr.add(2);
       arr.add(1);

       int k = 10;
        String res = findNumber(arr, k);

        System.out.println(res);
    }
}


