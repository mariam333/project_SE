package models;

public class Order {
	int orderId;
	int storeId;
	int paymentId;
	double totalPrice;
	String deliveryAddress;
	String reciptionName;
	String status;
    Boolean doneOrder;
    String time;
    
    static private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

 static private final String DB = "7VP6RBaQoU";
 static private final String DB_URL = "jdbc:mysql://remotemysql.com/"+ DB + "?useSSL=false";
 static private final String USER = "7VP6RBaQoU";
 static private final String PASS = "ov97FOeUst";
 
 
 
 
 public Order(	int storeId,int paymentId,	double totalPrice,	String deliveryAddress,	String reciptionName,String status, Boolean doneOrder, String time) 
 {
	 
	 this.storeId=storeId;
	 this.paymentId=paymentId;
	 this.totalPrice=totalPrice;
	 this.deliveryAddress=deliveryAddress;
	 this.reciptionName=reciptionName;
	 this.status=status;
	 this.doneOrder=doneOrder;
	 this.time=time;
	 
 }
 
 
}
