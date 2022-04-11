package com.gl.algorithms.model;

import java.util.Scanner;

public class PayMoney {
	private int txnArray[], totalElements, numOfTargets, targetValue[];
	Scanner sc = new Scanner(System.in);

	// Add size of transactions and instert vlaues in the array
	public void insertArrayElements() {
		System.out.println("Enter the size of transaction array:");
		totalElements = sc.nextInt();
		txnArray = new int[totalElements];
		System.out.println("Enter the values of array");
		for (int i = 0; i < totalElements; i++) {
			txnArray[i] = sc.nextInt();
		}

	}

	// provide number of targets and target value
	public void insertTargets() {
		System.out.println("Enter the total no of targets that needs to be achieved");
		numOfTargets = sc.nextInt();
		targetValue = new int[numOfTargets];
	}

	/*
	 * Provide taget value and check if the target is acheived. If sum of all
	 * elements of array is less than target value, then given target is not
	 * acheived.
	 */
	public void checkTargetAcheived() {
		for (int i = 0; i < numOfTargets; i++) {
			System.out.println("Enter the value of target");
			targetValue[i] = sc.nextInt();
			int count = 0, sum = 0;
			for (int j = 0; j < totalElements; j++) {
				count++;
				sum += txnArray[j];
				if (sum >= targetValue[i]) {
					System.out.println("Target achieved after " + count + " transactions");
					break;
				}
			}
			if (sum < targetValue[i]) {
				System.out.println("Given target is not achieved");
			}

		}
	}

}
