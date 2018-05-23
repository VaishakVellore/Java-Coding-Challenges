import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SockMerchant_Hashmap {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] pairs = new int[n];
		int count = 0;
		
		for(int i=0; i<n; i++)
		{
			int socks = s.nextInt();
			pairs[i] = socks;
		}
		Set<Integer> colors = new HashSet<>();
		for(int i = 0; i<n; i++)
		{
			if(!colors.contains(pairs[i]))
				colors.add(pairs[i]);
			else
			{
				count++;
				colors.remove(pairs[i]);
			}
		}
		System.out.println(count);
	}

}
