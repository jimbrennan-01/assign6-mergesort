package mergesort;

public class MergeSort {

	public static void main(String[] args) {
		int[] array1 = {11,43,87,27,54,8,32,71,44,12};
		
		showArray(array1);
		mergeSort(array1);
		showArray(array1);
		
	}
	
	public static void showArray(int[] theArray) {
		int index;
		
		System.out.printf("[");
		for(index=0;index<theArray.length;index++) {
			if(index!=0) {
				System.out.printf(", ");
			}
			System.out.printf("%d",theArray[index]);
		}
		System.out.printf("]\n");
	}
	
	public static void partition(int[] arr, int left, int right) {
		int mid = (left + right)/2;
		int[] leftArr = new int[mid];
		int[] rightArr = new int[right - mid];
		for(int i = 0; i < arr.length; i++) {
			if(i < mid) {
				leftArr[i] = arr[i];
			}else {
				rightArr[i] = arr[i];
			}
		}
	}
	public static int[] merge(int[] arrA, int[] arrB) {
		int[] newArr = new int[arrA.length + arrB.length];
		for(int i = 0; i < newArr.length; i++) {
			if(arrA[i] == arrB[i]) {
				
			}
		}
		return newArr;
	}
	
	private static void mergeSort(int[] theArray, int left, int right) {
		//**************************************************************
		//*  Recursive Merge Sort                                      *
		//*------------------------------------------------------------*
		//*  1. Divide or partition the array section into 2 halves.   *
		//*  2. Create a subArray for each partition (half)            *
		//*  3. Merge the two subArrays to create one sorted array     *
		//*  4. Replace the original array section with the merged     *
		//*     array.                                                 *
		//**************************************************************
		if(left <= right) {
			
		}

	}
	
	public static void mergeSort(int[] array) {
		//**********************************************
		//*  Class Wrapper for the recursive mergeSort *
		//**********************************************
		mergeSort(array,0,array.length-1);
	}
}
