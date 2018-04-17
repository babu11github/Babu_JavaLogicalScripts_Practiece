package com.java.logicalprograms;

public class Object {
	
    public static String sim ="Airtel";
	public static int a = 232;
	public static float f= 3.14f;

	public static String raju()
	{
	System.out.println("raju method");
	
	String ap = "AndraPradesh";
	return ap;
	
	}

	public static int  rani()
	{
	System.out.println("rani method");
	int p = 23;
	 return p;
	}

	public static String venky()
	{
	System.out.println("venky method");
	String ss="laddu";
	return ss;
	}

	public static float chiru()
	{
	System.out.println("chiru method");
	float ff=3.147f;
	return ff;
	}

	public static void main(String[] args)
	{
		Object oo=new Object();
		String ac = oo.sim;
		System.out.println("sim name is "+ac);
		float a=oo.f;
		System.out.println(f);
		int i = oo.a;
		String al = oo.sim;
		String bb= oo.venky();
		System.out.println(bb);
		
	}
}



