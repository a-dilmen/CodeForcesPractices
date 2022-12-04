package com.dilmen;

import java.util.Scanner;

public class NextRound_158A {

	public static void main(String[] args) {
		// First create query array 
		// check for positive number
			// if no positive number exists return 0, else pass the index of first positive number
		// check for equality of current index and next index(index+1) values starting from index of first positive number
			// return the index value + 1 since array index starts from 0
			
		
		Scanner scanner = new Scanner(System.in);
		int queryLength = scanner.nextInt();
		int limit = scanner.nextInt() - 1;
		int[] query = new int[queryLength];

		for (int i = 0; i < query.length; i++) {
			query[i] = scanner.nextInt();
		}
		int firstPositiveNumberIndexInLimit = limit;
		if (query[limit] < 1) {
			for (int i = limit; i >= 0; i--) {
				if (query[i] > 0) {
					firstPositiveNumberIndexInLimit = i;
					break;
				}
				if (query[0] < 1) {
					System.out.println(0);
					return;
				}
			}
		}
		try {
			for (int i = firstPositiveNumberIndexInLimit; i < query.length; i++) {
				if (query[i] != query[i+1]) {
					System.out.println(i+1);
					return;
				}
				firstPositiveNumberIndexInLimit=i+1;
			}
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println(firstPositiveNumberIndexInLimit+1);
			return;
		}

	}

}
