package com.neu.cs5800;

public class InversionCount {
	/*Given a sequence of n distinct numbers A = a1, a2, . . ., an, we say that a[i] and a[j] are
			inverted if i < j but a[i] > a[j]. The number of inversions in the sequence A, denoted
			v(A), is the number of pairs a[i] and a[j] that are inverted. v(A) provides a measure of
			how close A is to being sorted in increasing order.
	Complexity : O(n^2)*/
	
	public static void main(String[] args) {
		int[] inversion={2, 3, 4, 10, 6, 1};
		int inversion_count=0;
		for(int i=0; i<inversion.length-1; i++){
			for(int j=i+1; j<inversion.length;j++){
				if(inversion[i]>inversion[j]){
					inversion_count++;
				}
			}
		}
		System.out.println("The inversion count is "+inversion_count);
	}

}
