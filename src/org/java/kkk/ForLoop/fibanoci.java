package org.java.kkk.ForLoop;

public class fibanoci {
	public static void main(String[] args)
	{
		int fab1=0;
		int fab2=1;
		int fab3;
		System.out.println(fab1);
		System.out.println(fab2);
		
		for(int i=0;i<8;i++)
		{
			fab3= fab1+fab2;
			
			System.out.println(fab3);
			fab1= fab2;
			fab2=fab3;
		}
 

	}

}
