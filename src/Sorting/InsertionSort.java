package Sorting;

public class InsertionSort {
	void insertionSort(int arr[]) {
		int n = arr.length;
		for( int i=1;i<n;i++) {
			int key = arr[i];
			int j = i-1;
			while ( j >= 0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j = j-1;
			}
			arr[j+1]=key;
		}
	}
	
	void printArray(int arr[]) {
		int n = arr.length;
		for( int i =0;i<n;i++)
			System.out.println(arr[i]+" ");
	}
	
	public static void main(String args[]) {
		InsertionSort ob = new InsertionSort();
		int[] arr = {12,3,8,25,19,10};
		ob.insertionSort(arr);
		ob.printArray(arr);
	}

}
