import java.util.Scanner;
import java.math.*;

public class ElectronicsShop {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String[] bnm = s.nextLine().split(" ");
   
        int b = Integer.parseInt(bnm[0]);

        int n = Integer.parseInt(bnm[1]);

        int m = Integer.parseInt(bnm[2]);

        int[] keyboards = new int[n];

        String[] keyboardsItems = s.nextLine().split(" ");

        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
            int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
            keyboards[keyboardsItr] = keyboardsItem;
        }

        int[] drives = new int[m];

        String[] drivesItems = s.nextLine().split(" ");

        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
            int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
            drives[drivesItr] = drivesItem;
        } 
        
        int maximum = -1;
        for( int i=0; i< keyboards.length; i++)
        {
        	for(int j=0; j<drives.length; j++)
        	{
        		if(keyboards[i] + drives[j] <= b && keyboards[i] + drives[j] > maximum)
        			maximum = keyboards[i] + drives[j];
        	}
        }
        System.out.println(maximum);
	}
}
