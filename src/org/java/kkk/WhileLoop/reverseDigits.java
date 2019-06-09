package org.java.kkk.WhileLoop;

import java.util.Scanner;

public class reverseDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		System.out.println("Please enter the number");
		int x = num.nextInt();
		
		int rem,rev=0;
		while(x>0)
		{
		 rem = x%10;
		 rev= rev*10+rem;
		 x=x/10;
		}
		System.out.println("The reverse of digits " + rev);
		
	}

}
