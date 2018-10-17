package com.asthvinayak.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.asthvinayak.QueryConstant.QueryConstant;
import com.asthvinayak.dto.CreditCardDTO;
import com.asthvinayak.util.DBUtil;

public class CreditCardDAOImpl {
	private CreditCardDAOImpl() {

	}

	CreditCardDTO creditCardDTO;

	static CreditCardDAOImpl INSTANCE = null;

	public static synchronized CreditCardDAOImpl getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new CreditCardDAOImpl();
			return INSTANCE;
		}
		return INSTANCE;
	}

	public void createCard(CreditCardDTO creditCardDTO) throws SQLException {
		System.out.println("Enter into getCardDetails ");
		Connection con = DBUtil.getConnection();
		PreparedStatement pstm = con.prepareStatement(QueryConstant.CREATE_CARD);

		pstm.setString(1, creditCardDTO.getCardName());
		pstm.setLong(2, creditCardDTO.getCardNo());
		pstm.setDate(3, creditCardDTO.getCardExpdate());
		pstm.setInt(4, creditCardDTO.getCardCVV());

		System.out.println("Record inserted successfully");
		DBUtil.closeConnection(con, pstm);

	}

	public List<CreditCardDTO> getCardDetails() throws SQLException {

		List<CreditCardDTO> cardlist = new ArrayList<CreditCardDTO>();
		Connection con = DBUtil.getConnection();
		PreparedStatement pstm = con.prepareStatement(QueryConstant.GET_ALL_CARD);
		ResultSet rs = pstm.executeQuery();

		while (rs.next()) {
			String cardname = rs.getString("cardname");
			Long cardnum = rs.getLong("cardnumber");
			Date carddate = rs.getDate("carddate");
			int cardcvv = rs.getInt("cardcvv");

			CreditCardDTO creditCardDTO = new CreditCardDTO();
			creditCardDTO.setCardName(cardname);
			creditCardDTO.setCardNo(cardnum);
			creditCardDTO.setCardExpdate(carddate);
			creditCardDTO.setCardCVV(cardcvv);

			cardlist.add(creditCardDTO);

		}
		System.out.println(cardlist);
		DBUtil.closeConnection(con, pstm);
		return cardlist;
	}
}