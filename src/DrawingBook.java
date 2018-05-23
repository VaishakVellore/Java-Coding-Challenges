import java.util.Scanner;

public class DrawingBook {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int p = s.nextInt();
		int count1 = 0;
		int count2 = 0;
		int flips1 = 0;
		int flips2 = 0;
	
		for(int i=1; i<p; i++)
		{
			count1 = i;
			if(count1 != p) {
				i = i+2;
				flips1++;
			}	
		} 
		for(int i=n; i>p; i--)
		{
			count2 = i;
			if(count2 != p) {
				i = i-2;
				flips2++;
			}	
		}
		System.out.println(flips1 <flips2 ? flips1: flips2);
		
	}
}
