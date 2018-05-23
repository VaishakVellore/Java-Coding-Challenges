import java.util.Arrays;
import java.util.Scanner;

public class SockMerchant {
	
	public static void main( String[] args)
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
		Arrays.sort(pairs);
		for( int i=0; i<n-1; i++)
		{
			if(pairs[i] == pairs[i+1])
			{
				count++;
				i++;
			}
		}
		System.out.println(count);
		
	}

}
