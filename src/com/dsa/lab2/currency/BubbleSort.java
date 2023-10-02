package com.dsa.lab2.currency;

public class BubbleSort {

	public int[] getSortedArray(int a[]) {
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]<a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		return a;
	}
}
