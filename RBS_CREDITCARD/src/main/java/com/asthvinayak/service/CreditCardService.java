package com.asthvinayak.service;

import java.util.List;

import com.asthvinayak.bean.TransactionsDetailsDTO;;

public interface CreditCardService {
	public List<TransactionsDetailsDTO> gettransactionDetails(int i);
}
