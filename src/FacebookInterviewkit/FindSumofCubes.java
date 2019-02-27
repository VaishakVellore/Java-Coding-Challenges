package FacebookInterviewkit;

import java.util.ArrayList;
import java.util.Scanner;

public class FindSumofCubes {

    private static int findSOC(int i) {
        if (i == 0)
            return 0;
        return findSOC(i / 10) + cube(i % 10);
    }

    private static int cube(int i) {
        return i * i * i;
    }

    public static void main(String[] args) {
        System.out.print("Enter the limit : ");
        int n = (new Scanner(System.in)).nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i == findSOC(i)) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
