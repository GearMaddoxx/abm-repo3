package com.abm.component.di;

import org.springframework.stereotype.Component;

@Component
public class IciciBank implements Bank {
	
	public void withdraw(int atmid, int acno, int amount) {
	System.out.println("User of IciciBank to withdraw  " +amount);
	
}

}
