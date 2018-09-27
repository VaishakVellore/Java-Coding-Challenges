package InterviewPreparationkit;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class HashTable_RansomNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        Hashtable<String, Integer> map = new Hashtable<>();
        String result = "Yes";
        for(String s : magazine){
            if(map.containsKey(s)){
                map.put(s, map.get(s) + 1);
            }else{
                map.put(s, 1);
            }
        }

        int counter = 0;
        for(String s : note){
            if(!map.containsKey(s)){
                result = "No";
            }

            counter = map.get(s) - 1;

            if(counter == 0){
                map.remove(s);
            }else{
                map.put(s, counter);
            }
        }

        System.out.print(result);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
