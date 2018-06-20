package WarmupProblems;

import java.util.*;

public class GradingStudents {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int in = Integer.parseInt(scan.nextLine().trim());
		int[] grades = new int[in];
		
		for(int i = 0; i < in ;i++)
		{
			int items = Integer.parseInt(scan.nextLine().trim());
			grades[i] = items;
		}
		
		for(int i = 0; i < grades.length;i++)
		{
			if(grades[i] >= 38 && grades[i]%5 >2)
				grades[i] = grades[i] + (5 - (grades[i]%5));
			
			System.out.println(grades[i]);
		}
	}
}
