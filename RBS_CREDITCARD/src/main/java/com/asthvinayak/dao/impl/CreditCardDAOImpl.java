package com.asthvinayak.dao.impl;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 import org.apache.log4j.Logger;
 import com.asthvinayak.QueryConstant.QueryConstant;
import com.asthvinayak.bean.AccStatementDTO;
import com.asthvinayak.bean.CustomerDTO;
import com.asthvinayak.dao.CreditCardDAO;
import com.asthvinayak.util.DBUtil;
 public class CreditCardDAOImpl implements CreditCardDAO {
 	private static Logger LOGGER = Logger.getLogger(CreditCardDAOImpl.class);
	private static String CLASS_NAME = "CreditCardDAOImpl";
	private CreditCardDAOImpl() {
	}
 	static CreditCardDAOImpl INSTANCE = null;
	
	
	public static synchronized CreditCardDAOImpl getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new CreditCardDAOImpl();
			return INSTANCE;
		}
 		return INSTANCE;
	}
 	
	public List<CustomerDTO> getAllCustomer() throws SQLException
	{	
		String METHOD_NAME = "getAllCustomer";
		LOGGER.debug("Enter Into " + METHOD_NAME + " in " + CLASS_NAME);
		
		List<CustomerDTO> list = new ArrayList<CustomerDTO>();
		Connection con = DBUtil.getConnection();
		PreparedStatement ps = con.prepareStatement(QueryConstant.GET_ALL_CUST_RECORD);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			CustomerDTO customerDTO = new CustomerDTO();
 			String card_num = rs.getString("card_number");
			String cust_name = rs.getString("cust_name");
			int cvv = rs.getInt("cvv");
			String exp_date = rs.getString("exp_date");
			String state_table = rs.getString("statement_table");
			
			customerDTO.setCard_num(card_num);
			customerDTO.setCust_name(cust_name);
			customerDTO.setCvv(cvv);
			customerDTO.setExp_date(exp_date);
			customerDTO.setStatement_tbl(state_table);
			
			list.add(customerDTO);
 		}
		DBUtil.closeConnection(con, ps);
		LOGGER.debug("Exit from " + METHOD_NAME + " in " + CLASS_NAME);
		return list;
	}
	
	public CustomerDTO getCustomer(String cardNum) throws SQLException {
		String METHOD_NAME = "getCustomer";
		LOGGER.debug("Enter Into " + METHOD_NAME + " in " + CLASS_NAME);
		
		CustomerDTO customerDTO = new CustomerDTO();
		Connection con = DBUtil.getConnection();
		PreparedStatement ps = con.prepareStatement(QueryConstant.GET_CARD_INFO);
		ps.setString(1, cardNum);
		ResultSet rs = ps.executeQuery();
 		while (rs.next()) {
			String cardNo = rs.getString("card_number");
			String custName = rs.getString("cust_name");
			String exp_date = rs.getString("exp_date");
			int cvv = rs.getInt("cvv");
			String statementTable = rs.getString("statement_table");
 			customerDTO.setCard_num(cardNo);
			customerDTO.setCust_name(custName);
			customerDTO.setExp_date(exp_date);
			customerDTO.setCvv(cvv);
			customerDTO.setStatement_tbl(statementTable);
 		}
		DBUtil.closeConnection(con, ps);
		LOGGER.debug("Exit from " + METHOD_NAME + " in " + CLASS_NAME);
		return customerDTO;
	}
 	public List<AccStatementDTO> getAllStatement(String table) throws SQLException {
		String METHOD_NAME = "getAllStatement";
		LOGGER.debug("Enter Into " + METHOD_NAME + " in " + CLASS_NAME);
		
		
		List<AccStatementDTO> list = new ArrayList<AccStatementDTO>();
		Connection con = DBUtil.getConnection();
		PreparedStatement ps = con.prepareStatement(QueryConstant.GET_ALL_STATEMENT + table);
		// ps.setString(1, table);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			AccStatementDTO accStatementDTO = new AccStatementDTO();
 			int id = rs.getInt("id");
			Date date = rs.getDate("date");
			String ref_number = rs.getString("ref_number");
			String transaction_details = rs.getString("transaction_details");
			int reward_points = rs.getInt("reward_points");
			String currency = rs.getString("currency");
			double international_amount = rs.getDouble("international_amount");
			double amount = rs.getDouble("amount");
 			accStatementDTO.setId(id);
			accStatementDTO.setDate(new java.util.Date(date.getTime()));
			accStatementDTO.setRef_number(ref_number);
			accStatementDTO.setTransaction_details(transaction_details);
			accStatementDTO.setReward_point(reward_points);
			accStatementDTO.setCurrency(currency);
			accStatementDTO.setInternational_amount(international_amount);
			accStatementDTO.setAmount(amount);
			list.add(accStatementDTO);
 		}
		DBUtil.closeConnection(con, ps);
		LOGGER.debug("Exit from " + METHOD_NAME + " in " + CLASS_NAME);
		return list;
	}
 }