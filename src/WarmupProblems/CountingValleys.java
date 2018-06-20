package WarmupProblems;

import java.util.Scanner;

public class CountingValleys {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String steps = s.next();
		int sealevel = 0;
		int steps_taken = 0;
		int valleys = 0;
		
		for(char c: steps.toCharArray())
		{
			if(c == 'U')
				steps_taken++;
			if(c == 'D')
				steps_taken--;
			if(steps_taken == sealevel && c == 'U')
				++valleys;
		}
		System.out.println(valleys);
	}
}
