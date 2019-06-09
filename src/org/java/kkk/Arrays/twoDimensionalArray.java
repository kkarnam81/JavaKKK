package org.java.kkk.Arrays;

import java.util.Scanner;

public class twoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[][] = new int[2][2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the numbers:");
		
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++) {
				x[i][j]=sc.nextInt();
			}
		}
		
		//printing the array values
		System.out.println("The values of two dimensions array are ");
		for (int i=0;i<x.length;i++)
		{
			for (int j=0;j<x.length;j++) {
				
				System.out.println("x["+ i + "] [" +j+"]=" + x[i][j]);
			}
		
			}
		
		
	}

}
