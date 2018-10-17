package com.rest.creditcard.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import com.sun.xml.internal.bind.XmlAccessorFactory;


@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name="creditcard")

public class CreditCard {

public String cardID;
@XmlElement(required=true)
public String getCardID() {
	return cardID;
}
public void setCardID(String cardID) {
	this.cardID = cardID;
}
@XmlElement(required=true)
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}

@XmlElement(required=true)
public String getCvv() {
	return cvv;
}
public void setCvv(String cvv) {
	this.cvv = cvv;
}
public String cname;
public String cvv;

	
	
}
