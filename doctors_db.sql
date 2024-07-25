-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Mar 24, 2022 at 04:17 PM
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
-- Database: `doctors_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
CREATE TABLE IF NOT EXISTS `doctor` (
  `doctor_id` int(11) NOT NULL AUTO_INCREMENT,
  `doctor_name` varchar(50) NOT NULL,
  `doctor_mobile` int(10) NOT NULL,
  `doctor_address` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `specialization` varchar(50) NOT NULL,
  PRIMARY KEY (`doctor_id`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`doctor_id`, `doctor_name`, `doctor_mobile`, `doctor_address`, `email`, `specialization`) VALUES
(1, 'Nelum Wickramasinghe', 772626298, 'Wattala', 'nelum@gmail.com', 'Dermatologist'),
(2, 'Dinya Fernando', 775467310, 'Mabola', 'dinya@yahoo.com', 'Allergist'),
(3, 'Nandana Bandara', 772289603, 'Kadawaththa', 'nandana@gmail.com', 'Cardiologist'),
(4, 'Sarasi Dasanya', 766894756, 'Colombo', 'sarasi@yahoo.com', 'Endocrinologist'),
(5, 'Helindu Abeygunawardana', 777323796, 'Kandy', 'helindu@gmail.com', 'Gastroenterologist'),
(6, 'Gayani Perera', 771478965, 'Wattala', 'gayania@yahoo.com', 'Neurologist'),
(7, 'Chelsea Fernando', 728602413, 'Galle', 'chelsea@gmail.com', 'Oncologist'),
(8, 'Sanduni Sewwandi', 717567894, 'Maradana', 'sanduni@gmail.com', 'Psychiatrist'),
(9, 'Kamal Khan', 772597310, 'Mabola', 'kamal@gmail.com', 'Radiologist');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
