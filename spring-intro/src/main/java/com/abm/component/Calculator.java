package com.abm.component;

import org.springframework.stereotype.Component;

@Component("calc")
public class Calculator {
	public void Add(int x, int y) {
		System.out.println(x+y);
	}
	public void Sub(int x,int y) {
		System.out.println(x-y);
	}

}
