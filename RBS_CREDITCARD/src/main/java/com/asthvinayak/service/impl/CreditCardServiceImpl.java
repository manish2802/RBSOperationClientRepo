package com.asthvinayak.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.asthvinayak.bean.TransactionsDetailsDTO;
import com.asthvinayak.dao.impl.CreditCardDAOImpl;
import com.asthvinayak.service.CreditCardService;

public class CreditCardServiceImpl implements CreditCardService{
	
	CreditCardDAOImpl creditCardDAOImpl;
	public CreditCardServiceImpl() {
		creditCardDAOImpl = CreditCardDAOImpl.getInstance();
	}
	
	public List<TransactionsDetailsDTO> gettransactionDetails(int i) {
		
		return creditCardDAOImpl.gettransactionDetails(i);
		
	}
	

}
