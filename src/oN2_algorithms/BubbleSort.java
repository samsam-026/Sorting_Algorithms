package oN2_algorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		// this sorting algorithm guarantees at each iteration that the last element of the array is sorted.		
		int numbers[] = { 6, 0, 3, 5 };
		boolean swapped = false;
		
		// the number of elements that still need to be sorted.
		int numToSort = numbers.length - 1;

		do {
			// to check if any swaps have occurred during this traversal of the array.
			// if no swaps were made, the array is in order, and does not need to be checked again.
			swapped = false;
			for (int i = 0; i < numToSort; i++) {
				
				// if the smaller number is in the right of the array, 
				if (numbers[i] > numbers[i + 1]) {
					
					// swap with the element before on the left.
					int temp = numbers[i + 1];
					numbers[i + 1] = numbers[i];
					numbers[i] = temp;
					swapped = true;
					System.out.println(Arrays.toString(numbers));
				}
			}
			numToSort--;

		} while (swapped);

	}

}