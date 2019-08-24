-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 05, 2019 at 03:43 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lmsass`
--

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `from` varchar(50) NOT NULL,
  `to` varchar(50) NOT NULL,
  `depdate` date NOT NULL,
  `arrdate` date NOT NULL,
  `class` varchar(50) NOT NULL,
  `adults` varchar(5) NOT NULL,
  `children` varchar(5) DEFAULT NULL,
  `infants` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`from`, `to`, `depdate`, `arrdate`, `class`, `adults`, `children`, `infants`) VALUES
('colombo', 'jakartha', '2018-05-03', '2018-10-05', 'economy', '3', '1', '1'),
('colombo', 'india', '2018-05-03', '2018-10-05', 'business', '3', '', ''),
('Colombo', 'Jakartha', '2019-02-21', '2019-02-28', 'economy', '1', '3', '4');

-- --------------------------------------------------------

--
-- Table structure for table `cargo`
--

CREATE TABLE `cargo` (
  `from` varchar(30) NOT NULL,
  `to` varchar(30) NOT NULL,
  `sdate` date NOT NULL,
  `rbefore` date NOT NULL,
  `rname` varchar(50) NOT NULL,
  `size` varchar(20) NOT NULL,
  `item` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cargo`
--

INSERT INTO `cargo` (`from`, `to`, `sdate`, `rbefore`, `rname`, `size`, `item`) VALUES
('2018-12-8', 'melbourne', '2018-12-08', '2018-08-01', 'shan perera', '5-10', 'glass');

-- --------------------------------------------------------

--
-- Table structure for table `flightinfo`
--

CREATE TABLE `flightinfo` (
  `FlightNo` varchar(50) NOT NULL,
  `From` varchar(50) NOT NULL,
  `To` varchar(50) NOT NULL,
  `DeptDate` date NOT NULL,
  `ArrDate` date NOT NULL,
  `Time` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `flightinfo`
--

INSERT INTO `flightinfo` (`FlightNo`, `From`, `To`, `DeptDate`, `ArrDate`, `Time`) VALUES
('UL231', 'Colombo', 'Karachchi', '2018-12-05', '2018-12-12', '1030 Hrs'),
('UL654', 'Colombo', 'Japan', '2018-12-14', '2018-12-27', '2100 Hrs'),
('UL231', 'Colombo', 'Karachchi', '2018-12-05', '2018-12-12', '1030 Hrs'),
('UL654', 'Colombo', 'Japan', '2018-12-14', '2018-12-27', '2100 Hrs'),
('UL234', 'India', 'Katmandu', '2018-12-20', '2018-12-29', '2100 Hrs');

-- --------------------------------------------------------

--
-- Table structure for table `passenger`
--

CREATE TABLE `passenger` (
  `FName` varchar(25) DEFAULT NULL,
  `MName` varchar(25) DEFAULT NULL,
  `SName` varchar(25) DEFAULT NULL,
  `DoB` date DEFAULT NULL,
  `Country` varchar(25) DEFAULT NULL,
  `PassportNo` varchar(10) DEFAULT NULL,
  `Email` varchar(40) DEFAULT NULL,
  `Gender` varchar(10) DEFAULT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `passenger`
--

INSERT INTO `passenger` (`FName`, `MName`, `SName`, `DoB`, `Country`, `PassportNo`, `Email`, `Gender`, `username`, `password`) VALUES
('chamodh ', 'Pruthuvi', 'amarathunga', '1996-05-03', 'Sri Lanka', 'N123456', 'deshan.amarathunga@gmail.com', 'M', 'pruthuvi', '1234'),
('gg', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'gg', 'gg'),
('dd', 'dd', 'dd', NULL, NULL, NULL, NULL, NULL, 'dd', 'dd'),
('Manisha', 'Tathsara', 'Amarathunga', '1996-04-25', 'Sri Lanka', 'N243434', 'manisha2@gmail.com', 'male', 'manisha', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `privatejet`
--

CREATE TABLE `privatejet` (
  `choice` varchar(50) NOT NULL,
  `from` varchar(50) NOT NULL,
  `to` varchar(50) NOT NULL,
  `date` date NOT NULL,
  `passengers` varchar(50) NOT NULL,
  `ride` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `privatejet`
--

INSERT INTO `privatejet` (`choice`, `from`, `to`, `date`, `passengers`, `ride`) VALUES
('Helicopter', 'dddd', 'ddd', '2123-04-05', 'ee', 'Return');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
