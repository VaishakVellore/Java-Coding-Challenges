package String;

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		str = str.toLowerCase();
		String compare = "abcdefghijklmnopqrstuvwxyz";
		char letters[] = compare.toCharArray();
		Boolean isPangram = true;
		for(int i = 0; i<compare.length(); i++)
		{
			if(str.contains(String.valueOf(letters[i]))== false)
			{
				isPangram= false;
				break;
			}
		}
		if(isPangram)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
	}
}
