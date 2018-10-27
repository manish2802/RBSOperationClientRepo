package com.asthvinayak.business;
 import java.sql.SQLException;
 import com.asthvinayak.bean.CustomerDTO;
import com.asthvinayak.dao.CreditCardDAO;
import com.asthvinayak.dao.impl.CreditCardDAOImpl;
 public class GetStatement {
	
	public static CustomerDTO validCustomer(CustomerDTO cust) throws SQLException
	{
		CreditCardDAO creditCardDAO = CreditCardDAOImpl.getInstance();
		CustomerDTO customerDTO = creditCardDAO.getCustomer(cust.getCard_num());
		if (cust.getCard_num().equals(customerDTO.getCard_num())
				&& cust.getCust_name().equals(customerDTO.getCust_name())
				&& cust.getCvv() == customerDTO.getCvv()
				&& cust.getExp_date().equals(customerDTO.getExp_date()))
		{
			
			return customerDTO;
		}
		return null;
	}
	
	
	
}