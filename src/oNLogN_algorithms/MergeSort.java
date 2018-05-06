package oNLogN_algorithms;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int numbers[] = { 14, 33, 27, 10, 35, 19, 42, 44 };
		System.out.println(Arrays.toString(numbers));
		numbers = mergeSort(numbers);
	}

	public static int[] mergeSort(int[] numbers) {

		if (numbers.length == 1) {
			return numbers;
		}

		int mid = numbers.length / 2;

		int arr1[] = Arrays.copyOfRange(numbers, 0, mid);
		int arr2[] = Arrays.copyOfRange(numbers, mid, numbers.length);

		arr1 = mergeSort(arr1);
		arr2 = mergeSort(arr2);
		
		System.out.println("Array1 = " + Arrays.toString(arr1) + " Array2 = " + Arrays.toString(arr2));

		return merge(arr1, arr2);

	}

	public static int[] merge(int[] arr1, int[] arr2) {

		int arr3[] = new int[arr1.length + arr2.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				arr3[k] = arr1[i];
				i++;
			} else {
				arr3[k] = arr2[j];
				j++;
			}
			k++;
		}

		while (i < arr1.length) {
			arr3[k] = arr1[i];
			i++;
			k++;
		}
		
		while (j < arr2.length) {
			arr3[k] = arr2[j];
			j++;
			k++;
		}
		
		System.out.println(Arrays.toString(arr3));

		return arr3;
	}

}
