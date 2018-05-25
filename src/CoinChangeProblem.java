import java.util.Scanner;

public class CoinChangeProblem {
	
	static long getWays(long n, long[] c) 
	{
		

    }

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String[] nm = s.nextLine().split(" ");
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		
		long[] c = new long[m];

        String[] cItems = s.nextLine().split(" ");
        s.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) 
        {
            long cItem = Long.parseLong(cItems[i]);
            c[i] = cItem;
        }
        
        long ways = getWays(n, c);
        System.out.println(ways);
	}
}
