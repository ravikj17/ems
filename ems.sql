CREATE DATABASE  IF NOT EXISTS `ems_directory`;
USE `ems_directory`;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `dept_code` varchar(8) NOT NULL,
  `dept_name` varchar(45) DEFAULT NULL,
  `dept_hod` varchar(45) DEFAULT NULL,
  `dept_email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`dept_code`)
);

--
-- Data for table `department`
--

INSERT INTO `department` VALUES 
	('ADMIN','Administration','Himani Gautam','himanigautam@gmail.com'),
	('ACCNT','Accounting','Prathmesh','prathmesh@gmail.com'),
	('CNSLT','Consulting','Deepanshi Singh','deepanshi@gmail.com'),
	('SDE','Software Development','Muskan Arora','muskan@gmail.com');


--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `salary` int(20),
  `dept` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`dept`) REFERENCES department(`dept_code`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `employee` VALUES 
	(1,'Ravi','Jaiswal','ravi@gmail.com',35000,'SDE'),
	(2,'Aman','Singh','aman@gmail.com',25000,'ACCNT'),
	(3,'Raj','Mishra','raj@gmail.com',50000,'SDE'),
	(4,'Priyanka','Singh','priyanka@gmail.com',25000,'CNSLT'),
	(5,'Aditi','Dubey','aditi@gmail.com',25000,'CNSLT');

