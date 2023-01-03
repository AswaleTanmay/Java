package com.java.core;

public class LocalVariableDemo 
{
	
	//1.instance variable 
	int a=100; //-->instance variable access inside instance method directly 
						//or instance variable access inside static method using object 
	
	
	//2.static variable
	static int b=300;  //.class load
							//static var access instance method directly 
							//and static var access static method directly
	
	

	void add() //Instance Method -->Memory Allocation object create 
	{
		System.out.println("Instance var access  a-->"+a);
		//3.local variable
		int p=50;
		System.out.println("Local var access  p -->"+p);
		
		System.out.println("Static var access  b-->"+b);
		
	}//add close
	
	public static void sub() //static method--->.class create
	{
		LocalVariableDemo l=new LocalVariableDemo();
		System.out.println("Instance Var Access Static Method using obj a-->"+l.a);
		//3.local variable

		int k=66;
		System.out.println("Local Var k-->"+k);
		
	System.out.println("Static var access  b-->"+b);
	}
	public static void main(String[] args) 
	{
		//Instance method call in main method using one approach create class object
		LocalVariableDemo lv= new LocalVariableDemo();
		System.out.println("call instance method using only obj");
		lv.add();
		
		//3 approach to call static method
		//1.using obj
		System.out.println();
		System.out.println("using obj call static method ");
		lv.sub();
		
		//using Class name 
		System.out.println();
		System.out.println("using Class name ");
		LocalVariableDemo.sub();
		
		//directly call static method
		System.out.println();
		System.out.println("directly call static method");
		sub();

	}

}//class close
