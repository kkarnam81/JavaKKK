package org.java.kkk.ForLoop;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int x = num.nextInt();
		int fact=1;
		
		for(int i=1;i<=x;i++) {
			fact = fact*i;
		}
		System.out.println("The factorial is " + fact);

	}

}
