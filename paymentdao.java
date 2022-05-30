package com.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.model.payment;

@Repository
public class paymentdao implements paymentdaointe  {
public paymentdao() {
	System.out.println("paymentdao");
	}

@Autowired 
JdbcTemplate jdbc;
	public void setJdbc(JdbcTemplate jdbc) {
	this.jdbc = jdbc;
}

	@Override
	public int addpayment(payment p) {
		String query="insert into payment  values (' "+p.getCard_name()+" ',"+p.getCard_number()+","
				+p.getDay()+","+p.getMonth()+","+p.getCvv()+")"; 						
		
		int x=jdbc.update(query);
		//jdbc
		
		
		return x;
		
	}

	
		
		// TODO Auto-generated method stub
		


	@Override
	public boolean delpayment(int cvv) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public payment searchProduct(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public payment updatepayment(payment payment1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<payment> displayAllpayment() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
