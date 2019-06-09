package org.java.kkk.ForLoop;

import java.util.Scanner;

public class reverseDigits {

	public static void main(String[] args)
	{
		int rem,rev= 0;
		Scanner num = new Scanner(System.in);
		
		System.out.println("Please enter the number:");
		
		int x = num.nextInt();
		
		for(;x>0;x=x/10)
		{
			rem = x%10;
			rev= rev*10+rem;
		}
		
		System.out.println("The reverse of the numbers " + rev);
	}
}
