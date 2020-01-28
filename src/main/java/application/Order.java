package src.main.java.application;
import java.util.Date;
public class Order {
	private String content;
	private String status;
	private Date PurchesTime;
	private double total;
	
	
	public Order(String content, String status, Date purchesTime , double money){
		super();
		this.content = content;
		this.status = status;
		PurchesTime = purchesTime;
		this.total=money;
	}
	
	public double getMoney() {
		return total;
	}

	public void setMoney(double money) {
		this.total = money;
	}

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getPurchesTime() {
		return PurchesTime;
	}
	public void setPurchesTime(Date purchesTime) {
		PurchesTime = purchesTime;
	}
	
}
