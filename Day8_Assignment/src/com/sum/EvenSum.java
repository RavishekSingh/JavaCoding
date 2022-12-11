package com.sum;

import java.util.Scanner;

public class EvenSum {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of N");
		int N=sc.nextInt();
		System.out.println("Enter value of M");
		int M= sc.nextInt();
		
		int [][] arr = new int[N][M];
		int k=1;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				arr[i][j]= k++;
			}
		}
		
		for(int i=0;i<M;i++) {
			int sum=0;
			for(int j=0;j<N;j++) {
				if(arr[j][i]%2==0) {
					sum=sum+arr[j][i];
				}
			}
			System.out.println(sum);
		}
	

	}

}
