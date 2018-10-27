package com.asthvinayak.service.impl;
import java.sql.SQLException;
import java.util.List;
 import com.asthvinayak.bean.AccStatementDTO;
import com.asthvinayak.bean.CustomerDTO;
import com.asthvinayak.business.GetStatement;
import com.asthvinayak.dao.CreditCardDAO;
import com.asthvinayak.dao.impl.CreditCardDAOImpl;
import com.asthvinayak.service.CreditCardService;
 public class CreditCardServiceImpl implements CreditCardService {
	
	CreditCardDAO creditCardDAO = CreditCardDAOImpl.getInstance();
	
	public List<CustomerDTO> getAllCustomer() throws SQLException
	{
		List<CustomerDTO> list = creditCardDAO.getAllCustomer();
		return list;
	}
 	public List<AccStatementDTO> getCustStatement(CustomerDTO customerDTO) throws SQLException
	{
		List<AccStatementDTO> list = null;
		CustomerDTO cust = GetStatement.validCustomer(customerDTO);
		list = creditCardDAO.getAllStatement(cust.getStatement_tbl());
		
		return list;
	}
}