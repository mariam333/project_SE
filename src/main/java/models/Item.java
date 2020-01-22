package models;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Item {
	
	int itemId;
	int  storeId;
	String color;
	int quantity;
	double price;
	String type;

static private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
static private final String DB = "7VP6RBaQoU";
static private final String DB_URL = "jdbc:mysql://remotemysql.com/"+ DB + "?useSSL=false";
static private final String USER = "7VP6RBaQoU";
static private final String PASS = "ov97FOeUst";


 public Item(int  storeId,String color,int quantity,double price,String type)
{
	this.storeId=storeId;
	this.color=color;
	this.quantity=quantity;
	this.price=price;
	this.type=type;
}


public void addItem() throws ClassNotFoundException {

	Connection conn = null;
	try {
		Class.forName(JDBC_DRIVER);
		conn = DriverManager.getConnection(DB_URL, USER, PASS);

	
   String sql = "INSERT INTO Item (storeId, color,quantity,price,type) VALUES (?, ?, ?,?,?)";
	PreparedStatement update= conn.prepareStatement(sql);

    
	update.setLong(1, storeId);
	update.setString(2, color);
	update.setLong(3, quantity);
	update.setDouble(4, price);
	update.setString(5, type);
	update.executeUpdate();

    }
	catch (SQLException se) {
		
		se.printStackTrace();
		System.out.println("SQLException: " + se.getMessage());
        System.out.println("SQLState: " + se.getSQLState());
        System.out.println("VendorError: " + se.getErrorCode());
	}
}


public void deleteItem() throws ClassNotFoundException {
	

	Connection conn = null;
	try {
		Class.forName(JDBC_DRIVER);
		conn = DriverManager.getConnection(DB_URL, USER, PASS);

	
   String sql = "DELETE FROM Item WHERE itemId=?";;
	PreparedStatement update= conn.prepareStatement(sql);

    itemId=7790;
	update.setLong(1, itemId);
	update.executeUpdate();

    
    }
	catch (SQLException se) {
		
		se.printStackTrace();
		System.out.println("SQLException: " + se.getMessage());
        System.out.println("SQLState: " + se.getSQLState());
        System.out.println("VendorError: " + se.getErrorCode());
	}


}





}

 