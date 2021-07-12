package com.new12;

public class Calculator
{

	public static void main(String[] args)
	{
	  A a = new A();
	 int sum= a.add(10, 20);
	 System.out.println(sum);
	 int sub=a.sub(50, 100);
	 System.out.println(sub);
	  
	  

	}
 
}
 class A
{
	public int add(int num1,int num2)
	{
		int result=num1+num2;
		return result;
		
	}
	public int sub(int num1,int num2)
	{
		int res=num1-num2;
		return res;
		
	}
}
