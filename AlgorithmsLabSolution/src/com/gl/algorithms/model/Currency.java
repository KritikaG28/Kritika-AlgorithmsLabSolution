package com.gl.algorithms.model;

import java.util.Scanner;

public class Currency {
	private int currencyArray[], totalElements, netAmount;

	Scanner sc = new Scanner(System.in);

	// Add size of currency denominations and instert vlaues an the array
	public void insertArrayElements() {
		System.out.println("Enter the size of transaction array:");
		totalElements = sc.nextInt();
		currencyArray = new int[totalElements];
		System.out.println("Enter the values of array");
		for (int i = 0; i < totalElements; i++) {
			currencyArray[i] = sc.nextInt();
		}
	}

	// enter net amount to be paid
	public void provideAmountToBePaid() {
		System.out.println("Enter the amount you want to pay ");
		netAmount = sc.nextInt();
	}

	/*
	 * Given:: Your payment approach in order to give min no of notes will be Print
	 * the minimum number of notes that used to pay the net amount.
	 */
	public void calculateNotesToBePaid() {
		//sort the array in decending order
		sortArray(currencyArray, 0, totalElements - 1);

		int[] noteCounter = new int[currencyArray.length];
		// count currency notes
		for (int i = 0; i < totalElements; i++) {
			if (netAmount >= currencyArray[i]) {
				noteCounter[i] = netAmount / currencyArray[i];
				netAmount = netAmount - noteCounter[i] * currencyArray[i];
			}
		}

		// Print notes
		System.out.println("Your payment approach in order to give min no of notes will be");
		for (int i = 0; i < totalElements; i++) {
			if (noteCounter[i] != 0) {
				System.out.println(currencyArray[i] + " : " + noteCounter[i]);
			}
		}

	}

	public void sortArray(int array[], int l, int r) {
		if (l < r) {
			int m = l + (r - l) / 2;
			sortArray(array, l, m);
			sortArray(array, m + 1, r);
			conquerArray(array, l, m, r);
		}
	}

	public void conquerArray(int array[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for (int i = 0; i < n1; ++i) {
			L[i] = array[l + i];
		}
		for (int j = 0; j < n2; ++j) {
			R[j] = array[m + 1 + j];
		}
		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] > R[j]) {
				array[k] = L[i];
				i++;
			} else {
				array[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			array[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			array[k] = R[j];
			j++;
			k++;
		}
	}
}
