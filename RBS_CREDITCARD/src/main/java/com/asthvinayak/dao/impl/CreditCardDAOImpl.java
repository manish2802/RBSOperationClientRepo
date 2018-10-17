package com.asthvinayak.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.asthvinayak.bean.CustomerDTO;
import com.asthvinayak.bean.TransactionsDetailsDTO;
import com.asthvinayak.dao.CreditCardDAO;
import com.asthvinayak.util.DBUtil;

public class CreditCardDAOImpl implements CreditCardDAO {
	
	static  CreditCardDAOImpl INSTANCE = null;

	public static synchronized CreditCardDAOImpl getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new CreditCardDAOImpl();
			return INSTANCE;
		}
		return INSTANCE;
	}
	
	public List<TransactionsDetailsDTO> gettransactionDetails(int i) {
		
	
		
		List<TransactionsDetailsDTO> list = new ArrayList<TransactionsDetailsDTO>();
		try {
		
		Connection con = DBUtil.getConnection();
		PreparedStatement pstm = con.prepareStatement("select customer.cust_id,transactions.transaction_type,transactions.transaction_amount,transactions.transaction_date from transactions inner join customer on transactions.cust_id=customer.cust_id and customer.cust_id='" + i + "'");
		//			String sql="select customer.name,transactions.transactions_type,transactions.transaction_amount,transactions.transactions_date from transactions inner join customer on transactions.customer_id=customer.customer_id";	

		
		ResultSet rs = pstm.executeQuery();
		while (rs.next()) {
			//System.out.println(rs.next());
			String id = rs.getString("cust_id");
			String transactiontype = rs.getString("transaction_type");
			int transactionAmount = rs.getInt("transaction_amount");
			String transactionDate = rs.getString("transaction_date");
			
			
			
			TransactionsDetailsDTO  transaction=new TransactionsDetailsDTO();
			transaction.setId(id);
			transaction.setTransactionType(transactiontype);
			transaction.setTransactionAmount(transactionAmount);
			transaction.setTransactionDate(transactionDate);
			
			
			
			
			
			list.add(transaction);
			System.out.println(list);
			return list;
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
		
		
	}
	

}
