package Sorting;

public class BubbleSort {
	void bubbleSort(int arr[]) {
		int n = arr.length;
		for( int i = 0; i< n-1;i++) 
			for( int j =0;j< n-i-1;j++) 
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
	}
	
	void printArray(int arr[]) {
		int n = arr.length;
		for( int i =0;i<n; i++) {
			System.out.println(arr[i]+ " ");
		}
	}
	
	public static void main(String args[]) {
		BubbleSort ob =  new BubbleSort();
		int[] arr =  {15, 18,2,6,7,10};
		ob.bubbleSort(arr);
		System.out.println("The new array is");
		ob.printArray(arr);
	}

}
