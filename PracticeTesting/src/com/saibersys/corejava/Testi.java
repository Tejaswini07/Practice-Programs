package com.saibersys.corejava;

public class Testi {
		int a=20;// instance variables
		static int b=30;//static variables
		void m1(int a)//instance method
		{
			System.out.println("instance method");
		}
		static void m2(String str)//static method
		{
			System.out.println("static method");
		}
		Testi()//constructor
		{
	   this(10);//to call 2 coonstructor without creating a new object
			
		System.out.println("o arg constructor");
		}
		Testi(int a)// 2 constructor
		{
			System.out.println("1 arg constructor");
		}
		{System.out.println("instance block");//instance block
		}
		static // static block is executed only once for the class
				{
			System.out.println("static block");//static block
		}
		public static void main(String[] args)
		{
			new Testi();//call constructor 1
			Testi t1 = new Testi();//call instance method
			t1.m1(40);
			Testi.m2("teja");//to call static method
		}

	}

