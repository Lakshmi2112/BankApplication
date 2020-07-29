package com.lakshmi.web.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.lakshmi.web.models.Customer;
public class TransferDao {
	public Customer transfer(float amount) {
		float currentBalance = 0;
		Customer customer = new Customer();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from customers where Name = 'Lakshmi'");			
			if(rs.next())
			{
				currentBalance = rs.getFloat("Amount");
				customer.setId(rs.getInt("Id"));
				customer.setName(rs.getString("Name"));
			}
			if(currentBalance > amount)
			{
				customer.setAmount(currentBalance - amount);
				st.executeUpdate("update customers set Amount = " + 
						(currentBalance - amount) + " where Name = 'Lakshmi'");
				st.close();
				return customer;
			}
			else
				return null;
		}
		catch(Exception e){
			System.out.println(e);
			return null;
		}
	}
}
