package com.shophub.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.shophub.dao.ConnectionFactory;
import com.shophub.dao.Products;

public class ProductDAO {
	
    
        Connection connection = null;
        ConnectionFactory.getConnection();
    
   try
     {
    	 PreparedStatement statement = connection.prepareStatement("select * from product where product_id=?");
	
	     ResultSet set = statement.executeQuery();
	
      while(set.next())
	    {
         String name=set.getString("name");
         int product_Id=set.getInt("product_Id");
	     int price=set.getInt("price");
	
	     arr.add(new Products(name,product_Id,price));
        }
     }
	catch(SQLException e)
	    {
		  e.printStackTrace();
	    }
	    return arr ;

	
}


 public static void main(String args[])
{
	
	System.out.println(new ProductDAO().getData());
}
}


