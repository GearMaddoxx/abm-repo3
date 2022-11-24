package com.abm.component.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hdfc")
public class hdfcAtm implements Atm {
	
	@Autowired
	private Bank bank;
	
	public void withdraw(int acno, int amount) {
	System.out.println("User at hdfc wanting to withdraw  " +amount);
	bank.withdraw(121, acno, amount);
}

}
