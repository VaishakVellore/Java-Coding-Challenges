
public class SelectionSort {

	void selectionSort(int [] arr){
		int n = arr.length;
		for(int i =0;i<n-1;i++ ) 
		{
			int min_ind = i;
			for(int j=i+1;j<n;j++) 
				if(arr[j]<arr[min_ind]) 
					min_ind = j;
		int temp = arr[min_ind];
		arr[min_ind]= arr[i];
		arr[i]=temp;
				
		}
		
	}
	
	void printArray(int[] arr) {
		int n = arr.length;
		for( int i =0; i < n;i++)
			System.out.println(arr[i]+ " ");
	}
	
	public static void main(String args[]) {
		SelectionSort ob = new SelectionSort();
		int[] arr = {45,38,10,36,12};
		ob.selectionSort(arr);
		ob.printArray(arr);
	}
}
