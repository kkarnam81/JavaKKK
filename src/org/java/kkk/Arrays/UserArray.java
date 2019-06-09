package org.java.kkk.Arrays;

import java.util.Scanner;

public class UserArray {

	// diplaying all -id,name and salry
	void display(int x[], String y[], int z[]) {
		System.out.println("id " + "\t" + "name" + "\t" + "salary");

		for (int i = 0; i < y.length; i++) {
			System.out.println(x[i] + "\t" + y[i] + "\t" + z[i]);
		}
	}

	// displaying only id and name
	void display(int x[], String y[]) {
		System.out.println("id " + "\t" + "name");

		for (int i = 0; i < y.length; i++) {
			System.out.println(x[i] + "\t" + y[i]);
		}
	}

	void display(String s, int x[], String y[], int z[]) {
		System.out.println("id " + "\t" + "name" + "\t" + "salary");

		for (int i = 0; i < y.length; i++) {
			if (y[i].equals(s)) {
				System.out.println(x[i] + "\t" + y[i] + "\t" + z[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserArray user = new UserArray();

		// Array for employeeId
		int[] x = new int[5];
		String[] y = new String[5];
		int[] z = new int[5];

		Scanner num = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Please enter employee id,name and Salary");
			x[i] = num.nextInt();
			y[i] = num.next();
			z[i] = num.nextInt();
		}
		
		System.out.println();

		System.out.println("The entered employee ids are ");
		// printing the employee ids
		for (int i = 0; i < 5; i++) {
			System.out.println(x[i]);

		}

		System.out.println("The entered employee names are ");
		// printing the employee ids
		for (int i = 0; i < 5; i++) {
			System.out.println(y[i]);

		}

		System.out.println("The entered employee salries are ");
		// printing the employee ids
		for (int i = 0; i < 5; i++) {
			System.out.println(z[i]);

		}

		System.out.println();

		user.display(x, y, z);
		System.out.println();
		
		user.display(x, y);
		System.out.println();
		
		System.out.println("Enter a name to search for...");
		String searchName = num.next();
		user.display(searchName, x, y, z);

	}

}
