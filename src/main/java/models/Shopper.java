package models;


import java.sql.SQLException;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class Shopper {
	
int shopperID;
String  fullName;
String password;
String email;
int number;
int visaNumber;
int cvv;
int expiration;
int refund;

static private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

// update USER, PASS and DB URL according to credentials provided by the website:
// https://remotemysql.com/
// in future move these hard coded strings into separated config file or even better env variables
static private final String DB = "7VP6RBaQoU";
static private final String DB_URL = "jdbc:mysql://remotemysql.com/"+ DB + "?useSSL=false";
static private final String USER = "7VP6RBaQoU";
static private final String PASS = "ov97FOeUst";

public Shopper(String  fullName,String password,String email,int number,int visaNumber,int cvv ,int expiration)
{
	this.fullName=fullName;
	this.password=password;
	this.email=email;
	this.number=number;
	this.visaNumber=visaNumber;
	this.cvv=cvv;
	this.expiration=expiration;
	refund=0;
}
public static String ShowShopper(int shopperID ) {
	Connection conn = null;
	Statement stmt = null;
	String MsgtoClient="";
	try {
		Class.forName(JDBC_DRIVER);
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		stmt = conn.createStatement();
		String sql1="SELECT * FROM Shopper WHERE shopperID="+ shopperID ;
		ResultSet rs = stmt.executeQuery(sql1);
		while (rs.next()) {
			MsgtoClient=rs.getString(1)+"%"+rs.getString(2)+"%"+rs.getString(3)+"%"+rs.getString(4)+"%"+rs.getString(5)+"%"+rs.getString(6)+"%"+rs.getString(7)+"%"+rs.getString(8)+"%"+rs.getString(9);
							
		}
		rs.close();
		stmt.close();	
	}catch (SQLException se) {
		se.printStackTrace();
		System.out.println("SQLException: " + se.getMessage());
		System.out.println("SQLState: " + se.getSQLState());
		System.out.println("VendorError: " + se.getErrorCode());
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
	System.out.println(MsgtoClient);
	return MsgtoClient;	
	
}


public  boolean addShopper() throws ClassNotFoundException {
	

	Connection conn = null;
	Statement stmt = null;
	List<String> Email = new ArrayList<String>();
	try {
		Class.forName(JDBC_DRIVER);
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		stmt = conn.createStatement();
		String sql = "SELECT * FROM Shopper";
		ResultSet rs = stmt.executeQuery(sql);
		System.out.println("11111");
		while (rs.next()) {
			Email.add(rs.getString("Email"));
		}
		 if (Email.contains(email)) {
			 System.out.println("2222");
			return false;
		 }
		 else {	
			 System.out.println("3333");
			 System.out.println(fullName + password + email + number);
   String sql1 = "INSERT INTO Shopper VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
	PreparedStatement update= conn.prepareStatement(sql1);
	update.setLong(1, 0);
	update.setString(2, fullName);
	update.setString(3, password);
	update.setString(4, email);
	update.setLong(5, number);
	update.setLong(6, visaNumber);
	update.setLong(7, cvv);
	update.setLong(8, expiration);
	update.setLong(9, 0);
	update.executeUpdate();
	return true ;
		 }

    
    }
	catch (SQLException se) {
		
		se.printStackTrace();
		System.out.println("SQLException: " + se.getMessage());
        System.out.println("SQLState: " + se.getSQLState());
        System.out.println("VendorError: " + se.getErrorCode());
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			System.out.println("44444");
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
	return false;
}


}
