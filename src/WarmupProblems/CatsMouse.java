package WarmupProblems;

import java.util.Scanner;

public class CatsMouse {
	 public static void main(String[] args)
	 {
		 Scanner s = new Scanner(System.in);
		 int q = s.nextInt();
		 s.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	     
		 for (int qItr = 0; qItr < q; qItr++) 
		 {
	            String[] xyz = s.nextLine().split(" ");

	            int x = Integer.parseInt(xyz[0]);

	            int y = Integer.parseInt(xyz[1]);

	            int z = Integer.parseInt(xyz[2]);
	            
	            if(Math.abs(x-z) > Math.abs(y-z))
	            	System.out.println("Cat B");
	            else if(Math.abs(x-z) < Math.abs(y-z))
	            	System.out.println("Cat A");
	            else 
	            	System.out.println("Mouse C");
	     } 
	 }
}
