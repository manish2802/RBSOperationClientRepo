package com.asthvinayak.bean;
 import javax.xml.bind.annotation.XmlRootElement;
 @XmlRootElement
public class CustomerDTO {
 	private String card_num;
	private String cust_name;
	private int cvv;
	private String exp_date;
	private String statement_tbl;
	
	public String getCard_num() {
		return card_num;
	}
	public void setCard_num(String card_num) {
		this.card_num = card_num;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getExp_date() {
		return exp_date;
	}
	public void setExp_date(String exp_date) {
		this.exp_date = exp_date;
	}
	public String getStatement_tbl() {
		return statement_tbl;
	}
	public void setStatement_tbl(String statement_tbl) {
		this.statement_tbl = statement_tbl;
	}
	@Override
	public String toString() {
		return "CustomerDTO [card_num=" + card_num + ", cust_name=" + cust_name + ", cvv=" + cvv + ", exp_date="
				+ exp_date + ", statement_tbl=" + statement_tbl + "]";
	}
	
	
}