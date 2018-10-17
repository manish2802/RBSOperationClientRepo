package com.asthvinayak.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TransactionsDetailsDTO {
	private String id;
	private String transactionType;
	private int transactionAmount;
	private String transactionDate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public int getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(int transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	@Override
	public String toString() {
		return "TransactionsDetailsDTO [id=" + id + ",transactionType=" + transactionType + ",transactionAmount=" + transactionAmount + ",transactionDate=" + transactionDate + "]";
	}
}
