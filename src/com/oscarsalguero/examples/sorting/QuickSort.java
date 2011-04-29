/**
 * 
 */
package com.oscarsalguero.examples.sorting;

/**
 * @author Oscar Salguero (RacZo)
 *
 */
public class QuickSort {

	private int[] numbers; //An array
	private int number; //Current number
	
	public void sort(int[] values){
		//Check for an empty or null array
		if(values == null || values.length==0){
			return; //The array is sorted
		}
		this.numbers = values;
		number = values.length;
		quickSort(0, number -1); //Calling the sort function
	}
	
	private void quickSort(int low, int high){
		int i = low;
		int j = high;
		
		//We neesd a pivot element from the middle of the array
		int pivot = numbers[low + (high-low)/2];
		
		//Now let's divide
		while(i <= j){
			/* If the current value FROM THE LEFT is SMALLER than the pivot element
			 * then get the next element from the left list
			 */
			while(numbers[i] < pivot){
				i ++;
			}
			
			/* If the current value FROM THE RIGHT is LARGER than the pivot element
			 * then get the next element from the right list
			 */
			while(numbers[j] < pivot){
				j --;
			}
			
			/* If we have found a value in the left list which is larger than the pivot element
			 * AND if we have found a value in the right list which is smaller than the pivot element
			 * then we exchange the values.
			 * We can increase i and j because we are done. 
			 */
			if(i <= j){
				exchangeElements(i,j);
				i++;
				j--;
			}
		}
		
		//Now we use recursion to apply the quickSort to all the array elements
		if(low < j){
			quickSort(low, j);
		}
		if(i < high){
			quickSort(i, high);
		}
		
	}
	
	
	private void exchangeElements(int i, int j){
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
		
	}

}
