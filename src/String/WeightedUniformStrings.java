package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WeightedUniformStrings {

	public static void main(String[] args)
    {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		Map<Integer, Integer>hash = new HashMap<>();
		for(int i = 0; i<str.length(); i++)
		{
			char temp = str.charAt(i);
			int counter = 1;
            hash.put((temp-96) * counter, 0);
            while(i+1 < str.length() && temp == str.charAt(i+1)){
                i++;
                counter++;
                hash.put((temp-96) * counter,0);
            }
		}
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++) {
            int x = in.nextInt();
            if (hash.containsKey(x))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
	}
}
