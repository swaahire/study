package com.shophub.dao;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;

//import com.swati.dao;

public  class ProductDAO implements Iproduct {
	public ProductDAO() {
	
}
	 private int pid,price;
	private String pname;
	
//ArrayList list =new ArrayList();
	
	@Override
	public int showProduct(int pid ) {
		Connection connection=ConnectionFactory.getConnection();
		try{
			PreparedStatement statement=connection.prepareStatement("select * from product where productid=?");
			statement.setInt(1,pid);
			
			ResultSet set=statement.executeQuery();
		 
	
			while(set.next()){
				pid=set.getInt("productid");
				pname=set.getString("productname");
			System.out.println(set.getInt(pid));
			System.out.println(set.getString(pname));	
			}
		}catch (SQLException e){
				e.printStackTrace();
			}
			return (Integer) null;
		
		}

	
	
}
		
	

	
		

	

	

	