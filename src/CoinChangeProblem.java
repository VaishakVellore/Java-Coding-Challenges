import java.util.HashMap;
import java.util.Scanner;

public class CoinChangeProblem {
	
	static long getWays(int n, long[] c)
	{
		return getWays(n, c, 0, new HashMap<String, Long>());
	}
	
	static long getWays(int n, long[] c, int index, HashMap<String, Long> memo) 
	{
		if( n < 0)
			return 0;
		if(n == 0)
			return 1;
		if( index >= c.length)
			return 0;
		
		String key = n + "-" + index;
		if(memo.containsKey(key))
			return memo.get(key);
		
		int amountWithCoin = 0;
		long count = 0;
		while(amountWithCoin <= n)
		{
			int remaining = n - amountWithCoin;
			count += getWays(remaining,c, index +1, memo);
			amountWithCoin += c[index];
		}
		memo.put(key, count);
		return count;
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
