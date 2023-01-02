package com.java.core;

public class DataTypeDemo 
{

	//Instance Variable
	//Primitive Datatype
				//Default value   //Default Size   8bit=1byte 1024byte -->1kb 1024kb--1mb 1024mb--1GB--1024gb--1tb
	 byte b=100;  //0					//1byte  eg.byte b=20,v=60;
	short s; //0					//2byte  
	int i;   //0					//4 byte
	long l;  //0					//8byte  eg. long l=20,n=30;
	float f; //0.0f					//4byte eg float f=33.5f;
	double d; //0.0					//8byte 
	char ch;  //' ' single space    //2 byte
	boolean bl; //false				//1bit
	public static void main(String[] args)
	{

		DataTypeDemo a= new DataTypeDemo(); //name object
		//new DataTypeDemo()                 //nameless object
		
		System.out.println("Byte value ="+a.b);
		System.out.println("Short value ="+a.s);
		System.out.println("Int value ="+a.i);
		System.out.println("Long value ="+a.l);
		System.out.println("float value ="+a.f);
		System.out.println("double value ="+a.d);
		System.out.println("char value ="+a.ch);
		System.out.println("boolean value ="+a.bl);
	}
	
	
}
