package com.java.oopsconcept;
 class TestConstructorOne
{
	String course="surendra Dst";
	public void display()
	{
		System.out.println("parent class demo:"+course);
	}
}
class TestConstructor extends TestConstructorOne
{
	String name;
	int id;
public TestConstructor(String name,int id)
{
	this.name=name;
	this.id=id;
	this.disply();
}
public void disply() {
	System.out.println(this.name+"......."+this.id);
	System.out.println("parent class demo:"+super.course);
	super.display();

}

//public class ConstructorDemo {

	public static void main(String[] args) 
	{
		TestConstructor test=new TestConstructor("babu",1);
	}
		
	}



