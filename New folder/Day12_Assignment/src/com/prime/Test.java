package com.prime;

public class Test implements Intr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int[] display(int p) {
		// TODO Auto-generated method stub

		int primeNo = 0;
		for (int i = 2; i <= p; i++) {
			int n = 2;
			int count = 0;
			while (n <= i / 2) {
				if (i % n == 0) {
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
		for (int i = 2; i <= p; i++) {
			int n1 = 2;
			int count1 = 0;
			while (n1 <= i / 2) {
				if (i % n1 == 0) {
					count1++;
					break;
				}
				n1++;
			}

			if (count1 == 0) {
				arr[index] = i;
				index++;

			}

		}

		return arr;

	}

}
