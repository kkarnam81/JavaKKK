package org.java.kkk.ForLoop;

import java.util.Scanner;

public class tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Scanner num = new Scanner(System.in);
			
			System.out.println("Please enter the number:");
			
			int x = num.nextInt();
			
			for (int i=1;i<=10;i++)
			{
				System.out.println(x + "*" + i + "=" + x*i );
			}
			
		}
	}

}
