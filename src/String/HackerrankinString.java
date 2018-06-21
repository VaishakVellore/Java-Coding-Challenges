package String;

import java.util.Scanner;

public class HackerrankinString {
	
	public static String hackerrankinString(String str)
	{
		String find = "hackerrank";
		StringBuilder sb = new StringBuilder(str);
		for( int j = 0; j<str.length(); j++)
		{
			if(sb.charAt(j) != find.charAt(j))
				sb.deleteCharAt(j);
		}
		if(sb.toString() == find)
			return "YES";
		else
			return "NO";
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0; i<n; i++)
		{
			String str = in.nextLine();
			String result = hackerrankinString(str);
			System.out.println(result);
		}
	}

}
