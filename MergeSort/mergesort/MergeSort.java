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
	
	public static int[] merge(int[] arrA, int[] arrB) {
		int[] newArr = new int[arrA.length + arrB.length];
		int arrAIndex = 0;
		int arrBIndex = 0;
		int i = 0;
		while(arrAIndex < arrA.length && arrBIndex < arrB.length) {
			if(arrA[arrAIndex] <= arrB[arrBIndex]) {
				newArr[i] = arrA[arrAIndex];
				arrAIndex++;
			}else {
				newArr[i] = arrB[arrBIndex];
				arrBIndex++;
			}
			i++;
		}
		while (arrAIndex < arrA.length) {
			newArr[i] = arrA[arrAIndex];
			arrAIndex++;
			i++;
		}
		while (arrBIndex < arrB.length) {
			newArr[i] = arrB[arrBIndex];
			arrBIndex++;
			i++;
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
		if(left < right) {
			int mid = (left + right) / 2;
			
			mergeSort(theArray, left, mid);        
			mergeSort(theArray, mid + 1, right);
			
			int[] leftArr = new int[mid - left + 1];
			int[] rightArr = new int[right - mid];
			
			for(int i = left; i <= right; i++) {
				if(i <= mid) {
					leftArr[i - left] = theArray[i];
				}else {
					rightArr[i - mid - 1] = theArray[i];
				}
			}
			
			int[] merged = merge(leftArr, rightArr);
			
			for(int k = 0; k < merged.length; k++) {
				theArray[left + k] = merged[k];
			}

	
		}

	}
	
	public static void mergeSort(int[] array) {
		//**********************************************
		//*  Class Wrapper for the recursive mergeSort *
		//**********************************************
		mergeSort(array,0,array.length-1);
	}
}
