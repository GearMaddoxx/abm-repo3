package com.abm.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abm.component.Calculator;
import com.abm.component.HelloWorld;
import com.abm.component.TextEditor;
import com.abm.component.di.Atm;
import com.abm.component.di.hdfcAtm;

public class App {
		public static void main(String[] args) {
			//Loading IoC Container of spring
			ApplicationContext ctx = new ClassPathXmlApplicationContext("Chaacha.xml");
			//Accessing a bean
			/*
			 * HelloWorld hw = (HelloWorld) ctx.getBean("hello"); //
			 * System.out.println(hw.sayHello(" DHARMESH"));
			 * 
			 * Calculator c = (Calculator) ctx.getBean("calc"); c.Add(10, 10); c.Sub(110,
			 * 10); TextEditor te = (TextEditor) ctx.getBean("txtEditor");
			 * te.loadDocument("");
			 */
			for(int i=0; i<5;i++) {
			HelloWorld hw = (HelloWorld) ctx.getBean("hello"); //
			System.out.println(hw.sayHello(" DHARMESH"));
			}
			
//			hdfcAtm hd = (hdfcAtm) ctx.getBean("hdfc");
//			hd.withdraw(121, 111111);
		}
}
