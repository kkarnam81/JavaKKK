package org.java.kkk.WhileLoop;

import java.util.Scanner;

public class WhileAddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		System.out.println("Please enter the number");
		int x = num.nextInt();
		
		int rem,sum=0;
		
		while(x>0)
		{
			rem = x%10;
			sum=sum+rem;
			x=x/10;
		}
		System.out.println("The sum of the digits is " + sum);
		

	}

}
