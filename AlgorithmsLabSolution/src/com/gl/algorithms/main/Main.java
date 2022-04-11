package com.gl.algorithms.main;

import com.gl.algorithms.model.Currency;
import com.gl.algorithms.model.PayMoney;

public class Main {
	
	public static void main(String[] args) {
		
		//Question 1: PayMoney Transactions
		System.out.println("*****PayMoney Transactions*****");
		PayMoney payMoney = new PayMoney();
		payMoney.insertArrayElements();
		payMoney.insertTargets();
		payMoney.checkTargetAcheived();		
		
		
		//Question 2: currency denominations
		System.out.println("\n\n*****Currency denominations*****");
		Currency currency = new Currency();
		currency.insertArrayElements();
		currency.provideAmountToBePaid();
		currency.calculateNotesToBePaid();
		
	}
}
