package org.java.kkk.ForLoop;

import java.util.Scanner;

public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner num = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int x = num.nextInt();
		
		int sum = 0, rem =0;
		for(;x>0;x=x/10)
		{
			rem = x%10;
			sum = sum+rem;
		}
		System.out.println("The sum of all digits is " + sum);
		num.close();

	}

}
