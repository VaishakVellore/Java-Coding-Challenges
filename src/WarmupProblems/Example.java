package WarmupProblems;

import java.util.Arrays;

public class Example {
	
	    static void printDistinct(int[] l)
	    {
	        for(int i =0; i<l.length-1; i++) {
	        	if(l[i]!= l[i+1]) {  
	        	System.out.println(l[i]+""); 
	        	continue;
	        	}
	    }
	    }
	 
	    public static void main (String[] args)
	    {
	        int [] arr = {1,2,5,4,3,3};
	        Arrays.sort(arr); 
	        System.out.printf("Modified arr[] : %s",Arrays.toString(arr)); 
	        printDistinct(arr);
	    }
}

		
