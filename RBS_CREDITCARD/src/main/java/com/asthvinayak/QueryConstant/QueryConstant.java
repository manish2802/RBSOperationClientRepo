package com.asthvinayak.QueryConstant;
 public class QueryConstant {
 	public static String GET_CARD_INFO = "SELECT * FROM customer_cardinfo WHERE card_number=?";
	public static String GET_ALL_STATEMENT = "select * from ";
	public static String CREATE_CUST = "INSERT INTO customer_cardinfo VALUES(?,?,?,?,?)";
	public static String CREATE_STATE_TABLE = "(`id` int(11) NOT NULL AUTO_INCREMENT,`date` date DEFAULT NULL,`ref_number` varchar(25) DEFAULT NULL,`transaction_details` varchar(200) DEFAULT NULL,`reward_points` int(11) DEFAULT NULL,`currency` varchar(45) DEFAULT NULL,`international_amount` double DEFAULT NULL,`amount` double DEFAULT NULL,PRIMARY KEY (`id`))";
	public static String UPDATE_CUST = "UPDATE customer_cardinfo SET statement_table=? WHERE card_number=?";
	public static String GET_ALL_CUST_RECORD = "SELECT * FROM customer_cardinfo";
	public static String STATE_TABLE_ENTRY = "(date,ref_number,transaction_details,reward_points,currency,international_amount,amount) values(?,?,?,?,?,?,?)";
}