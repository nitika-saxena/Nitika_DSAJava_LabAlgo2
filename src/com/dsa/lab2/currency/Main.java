package com.dsa.lab2.currency;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {		
		Scanner sc= new Scanner(System.in);
		BubbleSort bs=new BubbleSort();
		CurrencyCheck cc=new CurrencyCheck();
		System.out.println("enter the size of currency denominations");
		int size=sc.nextInt();
		System.out.println("enter the currency denominations value");
		int a[]=new int[size];
		for(int i =0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		a=bs.getSortedArray(a);
		System.out.println("enter the amount you want to pay");
		int amount=sc.nextInt();
		cc.getPayValue(amount, a);
		sc.close();
		
		
	}

}
