package com.javanested;

public class MethodLocalOuterClass
{

	private int s=567;
	void m1()
	{
		int v=980;
		System.out.println(v);
		System.out.println(s);
		System.out.println();
		class InnerDemo //method lOCAL inner Class
		{
			int g=555;
			void math()
			{
				System.out.println(g);
				System.out.println(v);
				System.out.println(s);
			}
			
		}//Local inner class close
		
		InnerDemo i= new InnerDemo();
		i.math();
		
		
	}//close method
	
	public static void main(String[] args) 
	{

		MethodLocalOuterClass m = new MethodLocalOuterClass();
		m.m1();
		
	}

}
