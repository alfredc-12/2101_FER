-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 17, 2024 at 05:47 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fer_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `customerlist`
--

CREATE TABLE `customerlist` (
  `CustomerListID` int(11) NOT NULL,
  `CustomerOrderID` int(11) NOT NULL,
  `EquipmentID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `customerorder`
--

CREATE TABLE `customerorder` (
  `CustomerOrderID` int(11) NOT NULL,
  `CustomerName` varchar(100) NOT NULL,
  `CustomerPhoneNumber` int(20) NOT NULL,
  `CustomerAddress` varchar(1000) NOT NULL,
  `CustomerPaymentID` int(11) NOT NULL,
  `CustomerStartDate` date NOT NULL,
  `CustomerEndDate` date NOT NULL,
  `TotalCost` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `customerpayment`
--

CREATE TABLE `customerpayment` (
  `CustomerPaymentID` int(11) NOT NULL,
  `PaymentMethod` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customerpayment`
--

INSERT INTO `customerpayment` (`CustomerPaymentID`, `PaymentMethod`) VALUES
(1, 'Cash'),
(2, 'Card'),
(3, 'Cheque'),
(4, 'Online');

-- --------------------------------------------------------

--
-- Table structure for table `equipment`
--

CREATE TABLE `equipment` (
  `EquipmentID` int(11) NOT NULL,
  `EquipmentName` varchar(100) DEFAULT NULL,
  `EquipmentCategoryID` varchar(100) DEFAULT NULL,
  `EquipmentPrice` decimal(10,2) DEFAULT NULL,
  `EquipmentDesc` text DEFAULT NULL,
  `EquipmentImage` blob DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `equipmentcategory`
--

CREATE TABLE `equipmentcategory` (
  `EquipmentCategoryID` int(11) NOT NULL,
  `CatergoryName` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `equipmentcategory`
--

INSERT INTO `equipmentcategory` (`EquipmentCategoryID`, `CatergoryName`) VALUES
(1, 'Camera'),
(2, 'Lighting'),
(3, 'Audio'),
(4, 'Miscellaneous');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customerlist`
--
ALTER TABLE `customerlist`
  ADD PRIMARY KEY (`CustomerListID`);

--
-- Indexes for table `customerorder`
--
ALTER TABLE `customerorder`
  ADD PRIMARY KEY (`CustomerOrderID`);

--
-- Indexes for table `customerpayment`
--
ALTER TABLE `customerpayment`
  ADD PRIMARY KEY (`CustomerPaymentID`);

--
-- Indexes for table `equipment`
--
ALTER TABLE `equipment`
  ADD PRIMARY KEY (`EquipmentID`);

--
-- Indexes for table `equipmentcategory`
--
ALTER TABLE `equipmentcategory`
  ADD PRIMARY KEY (`EquipmentCategoryID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customerlist`
--
ALTER TABLE `customerlist`
  MODIFY `CustomerListID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `customerorder`
--
ALTER TABLE `customerorder`
  MODIFY `CustomerOrderID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `customerpayment`
--
ALTER TABLE `customerpayment`
  MODIFY `CustomerPaymentID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `equipment`
--
ALTER TABLE `equipment`
  MODIFY `EquipmentID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `equipmentcategory`
--
ALTER TABLE `equipmentcategory`
  MODIFY `EquipmentCategoryID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
