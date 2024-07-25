-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Mar 24, 2022 at 04:18 PM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `patients_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
CREATE TABLE IF NOT EXISTS `patient` (
  `patient_id` int(11) NOT NULL AUTO_INCREMENT,
  `patient_name` varchar(50) NOT NULL,
  `patient_address` varchar(50) NOT NULL,
  `patient_mobile` int(11) NOT NULL,
  `age` int(11) NOT NULL,
  `reason` varchar(50) NOT NULL,
  PRIMARY KEY (`patient_id`)
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`patient_id`, `patient_name`, `patient_address`, `patient_mobile`, `age`, `reason`) VALUES
(1, 'D.M.Dangalle', 'Wattala', 778897423, 42, 'Fever'),
(2, 'Pubudu Jayasinghe', 'Wattala', 777656893, 31, 'Eczema'),
(3, 'Gladston Daniel', 'Wattala', 777232478, 22, 'Kindney Stones'),
(4, 'Sachindu Weerasinghe', 'Galle', 777656893, 26, 'Chest Pain'),
(5, 'Alakshana Suresh', 'Kandy', 777656893, 48, 'Kidney Failure'),
(6, 'Monali Bandara', 'Moratuwa', 777656893, 63, 'Heart Attack '),
(7, 'Mohamed Shahid', 'Peliyagoda', 777656893, 25, 'Check Up'),
(8, 'Peshala Nilmini', 'Colombo', 777656893, 36, 'Nerve Surgery'),
(9, 'Malinga Fonseka', 'Pettah', 777656893, 48, 'Rash'),
(10, 'Govindan Sivaraj', 'Slave Island', 777656893, 21, 'Food Allergy'),
(11, 'Amy Jackson', 'Ja-ela', 777656893, 55, 'Kidney Stones'),
(12, 'Vijay Sethupathi', 'Wattala', 777656893, 29, 'Eczema');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
