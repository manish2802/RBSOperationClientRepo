package com.asthvinayak.service;
import java.sql.SQLException;
import java.util.List;
 	
import com.asthvinayak.bean.AccStatementDTO;
import com.asthvinayak.bean.CustomerDTO;
 public interface CreditCardService {
 	public List<CustomerDTO> getAllCustomer() throws SQLException;
	public List<AccStatementDTO> getCustStatement(CustomerDTO customerDTO) throws SQLException;
}