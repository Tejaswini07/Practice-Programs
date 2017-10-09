package com.saibersys.corejava;

public class Primenumber { 
			 public static void main(String args[]){  
			  int i,m=0,r=0;    
			  int n=17;//it is the number to be checked  
			  m=n/2;    
			  for(i=2;i<=m;i++){    
			   if(n%i==0){    
			   System.out.println("Number is not prime");    
			   r=1;    
			   break;    
			   }    
			  }    
			  if(r==0)    
			  System.out.println("Number is prime");    

	}

}
