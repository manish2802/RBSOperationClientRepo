package com.asthvinayak.dao;

import java.sql.SQLException;
import java.util.List;

import com.asthvinayak.bean.AccStatementDTO;
import com.asthvinayak.bean.CustomerDTO;

public interface CreditCardDAO {

	public List<CustomerDTO> getAllCustomer() throws SQLException;
	public CustomerDTO getCustomer(String cardNum) throws SQLException;
	public List<AccStatementDTO> getAllStatement(String table) throws SQLException;
}