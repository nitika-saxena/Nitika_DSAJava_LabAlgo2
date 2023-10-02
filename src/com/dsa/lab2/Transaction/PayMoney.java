package com.dsa.lab2.Transaction;

public class PayMoney {
	
	public int getCount(int target,int a[]) {
		int count;
		int total=0;
		for(count=0;count<a.length;count++) {
			total=+a[count];
			if(total>=target) 
				return count++;			
		}
		
		return 0;
		 
	}

}
