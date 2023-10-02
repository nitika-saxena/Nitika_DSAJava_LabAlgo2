package com.dsa.lab2.Transaction;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		PayMoney pm= new PayMoney();
		System.out.println("enter the size of transaction array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the values of array");
		for(int i =0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter the total no of targets that needs to be achieved");
		int noOfTarget=sc.nextInt();
		for(int i=0;i<noOfTarget;i++) {
			System.out.println("enter the value of target");
			int target= sc.nextInt();
			int count = pm.getCount(target, a);
			if(count!=0)
				System.out.println("Target achieved after "+count+ " transactions");
			else
				System.out.println("Given target is not achieved");
			System.out.println();
			
		}
		
		sc.close();
	}

}
