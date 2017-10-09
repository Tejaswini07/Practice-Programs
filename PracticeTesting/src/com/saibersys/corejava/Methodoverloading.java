package com.saibersys.corejava;

public class Methodoverloading {
		void m1(int a)//overloading method
		{
			System.out.println("int m1 method");
		}
		void m1(int a, int b)//same method name with diff no.of args
		{
	    System.out.println("int, int  m1 method");
		}
		void m1(char ch)//same method with diff data types
		{
			System.out.println("char m1 method");
		}
	public static void main(String[] args)
		{
		Methodoverloading t = new Methodoverloading();
		t.m1(10);
		t.m1(10,20);
		t.m1('T');
		}
	}


