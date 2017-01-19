package com.neu.cs5800;

import java.util.Arrays;

// Purpose: The Fisher-Yates shuffle (named after Ronald Fisher and Frank Yates) 
//is used to randomly permute given input (list)

public class FisherYatesShuffle {

	int[] fisherYatesShuffle(int[] arr) {
		int random = (int) (Math.random() * 10) % arr.length;
		int tmp = 0;

		for (int i = arr.length - 1; i > 0; i--) {
			tmp = arr[i];
			arr[i] = arr[random];
			arr[random] = tmp;
			random = (int) (Math.random() * 10) % arr.length;
			System.out.println(random);
		}

		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 12, 34, 56, 78, 92 };

		FisherYatesShuffle fys = new FisherYatesShuffle();
		System.out.println(Arrays.toString(fys.fisherYatesShuffle(arr)));
	}

}
