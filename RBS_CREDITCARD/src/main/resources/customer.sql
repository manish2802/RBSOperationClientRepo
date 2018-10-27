CREATE TABLE `customer_cardinfo` (
  `card_number` varchar(16) NOT NULL,
  `cust_name` varchar(80) NOT NULL,
  `cvv` int(3) NOT NULL,
  `exp_date` varchar(20) NOT NULL,
  `statement_table` varchar(45) NOT NULL,
  PRIMARY KEY (`card_number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
