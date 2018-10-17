package com.asthvinayak.QueryConstant;

public class QueryConstant {

	public static String CREATE_CARD = "insert into loginuser.cardinfo (card_num, card_name,card_date,card_cvv)" + "values(?,?,?,?)";
	
	public static String GET_ALL_CARD = "SELECT * FROM loginuser.cardinfo";
	
	
}
