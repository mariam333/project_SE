

package models;

public class Payment {
	int paymentId;
	int shopperId;
	double price;
	String paymentMethod;
	String date;
	
	 static private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

	 static private final String DB = "7VP6RBaQoU";
	 static private final String DB_URL = "jdbc:mysql://remotemysql.com/"+ DB + "?useSSL=false";
	 static private final String USER = "7VP6RBaQoU";
	 static private final String PASS = "ov97FOeUst";
	 
	 


public Payment(int shopperId,double price,String paymentMethod,String date) 
{
	this.shopperId=shopperId;
	this.price=price;
	this.paymentMethod=paymentMethod;
	this.date=date;

}


}