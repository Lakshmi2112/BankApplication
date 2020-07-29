package com.lakshmi.web.dao;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.sql.*;
import com.lakshmi.web.models.*;
public class TransactionDao {
	public ArrayList<Transaction> getTransaction() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from transactions order by Id desc limit 5");
			ArrayList<Transaction> trans = new ArrayList<Transaction>();
			while(rs.next())
			{
				Transaction t = new Transaction(rs.getInt("Id"),rs.getString("Sentby"),
						rs.getString("Receivedby"),rs.getFloat("Amount"),rs.getString("Datetime") );
				trans.add(t);
			}
			st.close();
			return trans;
		}
		catch(Exception e){
			System.out.println(e);
			return null;
		}
	}
}
