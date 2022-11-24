package com.abm.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.abm.component.CarPart;
import com.abm.component.CarPartInventory;
import com.abm.component.CarPartInventoryImpl1;
import com.abm.component.CarPartInventoryImpl4;

public class CarPartTest {

	@Test
	public void test_adding_CarPart() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Chaacha.xml");
		//CarPartInventory cpinv = (CarPartInventory) ctx.getBean("carpart4");
		CarPartInventory cpinv = (CarPartInventory) ctx.getBean("carpart5");
		CarPart cp = new CarPart();
		cp.setPartName("GearBox");
		cp.setCarModel("Tata");
		cp.setPrice(100);
		cp.setQuantity(10);
		
		cpinv.addNewPart(cp);
	}
	
	@Test
	
	public void test_fetching_CarPart_Detail() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Chaacha.xml");
		CarPartInventory cpinv = (CarPartInventory) ctx.getBean("carpart5");
		
		List<CarPart> list = cpinv.getAvailableParts();
		for(CarPart cp : list) {
			System.out.println(cp.getPartNo());
			System.out.println(cp.getPartName());
			System.out.println(cp.getCarModel());
			System.out.println(cp.getPrice());
			System.out.println(cp.getQuantity());
			System.out.println("-----------------------------------");
		}
	}
}
