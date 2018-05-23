import java.util.Scanner;

public class DrawingBook_Easy {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int p = s.nextInt();
		
		System.out.println(Math.min(p/2, n/2 - p/2));
	}
}
