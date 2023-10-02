package com.dsa.lab2.currency;

public class CurrencyCheck {
	
	public void getPayValue(int amount, int a[]) {
		int demo[]=new int[a.length];
		for(int i=0;i < a.length;i++) {
			int notes=0;
			if(amount>=a[i]) {
				notes= amount/a[i];
				amount= amount - (notes* a[i]);
				demo[i]=notes;
			}
		}
		if(amount ==0 ) {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for(int i=0;i<a.length;i++) {
				if(demo[i]!=0)
					System.out.println(a[i]+":"+demo[i]);
			}
		}
		else
			System.out.println("Exact payment in the higher denomination could not be achieved");
	}
}
