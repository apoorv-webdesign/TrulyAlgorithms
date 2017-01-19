package com.neu.cs5800;

import java.util.Arrays;
//Purpose: The classic merge sort

public class MergeSort {
	int inv_count=0;
	
	// recursively divide and sort the array
	@SuppressWarnings("rawtypes")
	public Comparable[] startMergeSort(Comparable[] array){
		if(array.length <=1){
			return array;
		}
		Comparable[] left = new Comparable[array.length/2];
		Comparable[] right = new Comparable[array.length-left.length];
		
		System.arraycopy(array, 0, left, 0, array.length/2);
		System.arraycopy(array, left.length, right, 0, right.length);	
		
		//divide the array recursively and sort it
		startMergeSort(left);
		startMergeSort(right);
		//System.out.println(Arrays.toString(right));
		return doMerge(left, right, array);
	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Comparable[] doMerge(Comparable[]left, Comparable[]right, Comparable[] array){
		int left_counter =0;
		int right_counter =0;
		int result_counter=0;
		//int inv_count=0;
		
		while(left_counter<left.length && right_counter<right.length){
			if(left[left_counter].compareTo(right[right_counter]) <0){
				array[result_counter]= left[left_counter];
				left_counter++;
			}
			else{
				array[result_counter]=right[right_counter];
				right_counter++;
				inv_count+=left.length;
			}
			result_counter++;
		}
		System.out.println(inv_count);
		System.arraycopy(left,left_counter, array, result_counter, left.length-left_counter);
		System.arraycopy(right,right_counter, array, result_counter, right.length-right_counter);
		return array;
	}
	
	public static void main(String[] args) {
		Integer [] array = {5, 4, 3, 2, 1, 0};
		
		MergeSort ms = new MergeSort();
		System.out.println(Arrays.toString(ms.startMergeSort(array)));
	}

}
