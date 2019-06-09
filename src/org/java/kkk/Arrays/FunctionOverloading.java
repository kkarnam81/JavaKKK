package org.java.kkk.Arrays;

public class FunctionOverloading {
	
	static int square(int x)
	{
		return x*x;
	}
	
	static double square(double x)
	{
		return x*x;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int x= FunctionOverloading.square(5);
      double y= FunctionOverloading.square(6.6);
      System.out.println(x);
      System.out.println(y);
	}

}
