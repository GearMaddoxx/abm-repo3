package com.abm.component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("carpart4")
public class CarPartInventoryImpl4 implements CarPartInventory {
		
		@Autowired
		private JdbcTemplate jdbcTemplate;
		
		public void addNewPart(CarPart carPart) {

		        String sql = "insert into tbl_carpart(part_name, car_model, price, quantity) values(?,?,?,?)";
		        jdbcTemplate.update(sql,carPart.getPartName(), carPart.getCarModel(), carPart.getPrice(), carPart.getQuantity());
		}
	        
		public List<CarPart> getAvailableParts() {
				
		        String sql = "select * from tbl_carpart";
		        List<CarPart> list = jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(CarPart.class));
					
		        return list;
		}

}
