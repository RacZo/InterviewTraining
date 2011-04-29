/**
 * 
 */
package com.oscarsalguero.examples.sorting;

/**
 * @author RacZo
 *
 */
public class MergeSort {
	
	private int numbers[];
	private int number;
	
	public void sort(int[] values){
		this.numbers = values;
		number = values.length;
		mergeSort(0, number-1 );
	}
	
	public void mergeSort(int low, int high){
		//Check if low is smaller than high, if not then the array is already sorted
		if(low < high){
			//Get the element at the half of the array
			int elementAtHalf = (low + high) / 2; //Middle element or element at the half

			//Sorting the left side of the array
			mergeSort(low, elementAtHalf);
			
			//Sorting the right side of the array
			mergeSort(elementAtHalf + 1, high);
			
			//Merge the two arrays into one that's sorted
			merge(low, elementAtHalf, high);
			
		}
	}
		
	private void merge(int low, int center, int high){
		
		//Helper Array
		int[] helper = new int[number];
		
		//Copying both parts into the helper array
		for (int i = low; i <= high; i++){
			helper[i] = numbers[i];
		}
		
		int i = low;
		int j = center + 1;
		int k = low;
		
		//Copy the smallest values from either the LEFT or the RIGHT side back into the original array
		while(i <= center && j <= high){
			if(helper[i] <= helper[j]){
				numbers[k] = helper[i];
				i++;
			}else{
				numbers[k] = helper[j];
				j++;
			}
			k++;
		}
		
		//Copying the rest of the LEFT side of the array into the target array
		while(i <= center){
			numbers[k] = helper[i];
			k++;
			i++;
		}
		helper = null;
	}
	
}
