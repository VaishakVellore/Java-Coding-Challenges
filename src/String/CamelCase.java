package String;

import java.util.Scanner;

public class CamelCase {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int count = 1;
		for(char c: str.toCharArray())
		{
			if(Character.isUpperCase(c))
				count++;
		}
		System.out.println(count);
	}
}
