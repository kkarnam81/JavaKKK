package org.java.kkk.Arrays;

public class CallByReference {
	
	int x= 20;
	
	void callMethod(CallByReference ref)
	{
		ref.x = ref.x*2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByReference ref = new CallByReference();
		System.out.println("Before calling the function " + ref.x);
		ref.callMethod(ref);
		System.out.println("After calling the function " + ref.x);
	}

}
