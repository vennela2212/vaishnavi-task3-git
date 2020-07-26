package com.mavenpro.calculator;

import java.util.*;
public class App {
		public interface operators{
			public int add(int a,int b);
			public int sub(int a,int b);
			public int mul(int a,int b);
			public int div(int a,int b);
			
		}
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		App ap=new App();
		operations p=ap.new operations();
		System.out.println("Enter the two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int n=0;
		System.out.println("1.Addition\n"+"2.Substraction\n"+"3.Mutiplication\n"+"4.Division\n"+"5.Exit");
		while(n!=5)
		{
			System.out.println("choose operation");
			 n=sc.nextInt();
			switch(n)
			{
			case 1:System.out.println("The Addition of Two numbers "+a+" and "+b+" is "+p.add(a,b));
				break;
			case 2:System.out.println("The Subtraction of Two numbers "+a+" and "+b+" is "+p.sub(a,b));
				break;
			case 3:System.out.println("The Multiplication of Two numbers "+a+" and "+b+" is "+p.mul(a,b));
				break;
			case 4:System.out.println("The Division of Two numbers "+a+" and "+b+" is "+p.div(a,b));
				break;
			case 5:System.exit(0);
			default:System.exit(0);
			}
		}
		sc.close();
		
	}
	public class operations implements operators{
	public int add(int a,int b) {
		return (a+b);
	}
	
	public int mul(int a,int b) {
		return (a*b);
	}

	public int div(int a,int b) {
		return (a/b);
	}

	public int sub(int a,int b) {
				return (a-b);
			}
	}

}