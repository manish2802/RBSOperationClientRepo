package com.asthvinayak.dao;

import java.util.List;

import com.asthvinayak.bean.TransactionsDetailsDTO;


public interface CreditCardDAO{
	public List<TransactionsDetailsDTO> gettransactionDetails(int i);
}
