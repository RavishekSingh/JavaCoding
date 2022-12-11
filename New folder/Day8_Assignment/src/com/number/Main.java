package com.number;

public class Main {

	public int[] findAndReturnPrimeNumbers(int[] inputArray) {

		int primeNo = 0;
		for (int i = 0; i < inputArray.length; i++) {
			int n = 2;
			int count = 0;
			while (n <= inputArray[i] / 2) {
				if (inputArray[i] % n == 0) {
					count++;
					break;
				}
				n++;
			}
			if (count == 0) {
				primeNo++;
			}
		}

		int[] arr = new int[primeNo];
		int index = 0;
		for (int i = 0; i < inputArray.length; i++) {
			int n1 = 2;
			int count1 = 0;
			while (n1 <= inputArray[i] / 2) {
				if (inputArray[i] % n1 == 0) {
					count1++;
					break;
				}
				n1++;
			}

			if (count1 == 0) {
				arr[index] = inputArray[i];
				index++;

			}

		}

		return arr;

	}

	public static void main(String[] args) {
		Main pn = new Main();

		int[] arr = { 8,9,6,4,25,17,5};
		int[] prime = pn.findAndReturnPrimeNumbers(arr);
		if (prime.length != 0) {
			for (int i = 0; i < prime.length; i++) {
				System.out.println(prime[i]);
			}

		} else {
			System.out.println("Prime number not found in the supplied Array");
		}

	}

}