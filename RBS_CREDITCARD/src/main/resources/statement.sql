CREATE TABLE `5432678912349876_StatementTable` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `ref_number` varchar(25) DEFAULT NULL,
  `transaction_details` varchar(200) DEFAULT NULL,
  `reward_points` int(11) DEFAULT NULL,
  `currency` varchar(45) DEFAULT NULL,
  `international_amount` double DEFAULT NULL,
  `amount` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
