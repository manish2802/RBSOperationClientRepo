package com.asthvinayak.bean;
 import java.util.Date;
 import javax.xml.bind.annotation.XmlRootElement;
 @XmlRootElement
public class AccStatementDTO {
 	private int id;
	private Date date;
	private String ref_number;
	private String transaction_details;
	private int reward_point;
	private String currency;
	private double international_amount;
	private double amount;
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getRef_number() {
		return ref_number;
	}
	public void setRef_number(String ref_number) {
		this.ref_number = ref_number;
	}
	public String getTransaction_details() {
		return transaction_details;
	}
	public void setTransaction_details(String transaction_details) {
		this.transaction_details = transaction_details;
	}
	public int getReward_point() {
		return reward_point;
	}
	public void setReward_point(int reward_point) {
		this.reward_point = reward_point;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public double getInternational_amount() {
		return international_amount;
	}
	public void setInternational_amount(double international_amount) {
		this.international_amount = international_amount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "AccStatementDTO [id=" + id + ", date=" + date + ", ref_number=" + ref_number + ", transaction_details="
				+ transaction_details + ", reward_point=" + reward_point + ", currency=" + currency
				+ ", international_amount=" + international_amount + ", amount=" + amount + "]";
	}
	
	
	
	
	
}