package com.saibersys.java.programs;

public class Overriding {
	void a()// overriden method
	{
		System.out.println("black girl");
	}
}
	class child extends Overriding
	{
		void a()//overriding method
		{
		System.out.println("white girl");	
	}
	public static void main( String[] args)
	{
		new child().a();
	}
	}
	
