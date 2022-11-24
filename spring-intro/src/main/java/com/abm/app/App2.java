package com.abm.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abm.component.ByeByeWorld;
import com.abm.component.HelloWorld;

public class App2 {
	public static void main(String[] args) {
		//Loading IoC Container of spring
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Chaacha.xml");
		ByeByeWorld bbw = (ByeByeWorld) ctx.getBean("bye");
		System.out.println(bbw.Bye(" DHARMESH"));
}
}