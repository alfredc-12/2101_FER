-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 21, 2024 at 06:17 AM
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
-- Database: `tester`
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
  `CustomerPaymentID` int(11) NOT NULL,
  `CustomerStartDate` date NOT NULL,
  `CustomerEndDate` date NOT NULL,
  `TotalCost` int(255) NOT NULL,
  `UserID` int(11) NOT NULL
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
  `EquipmentImage` longblob DEFAULT NULL,
  `EquipmentAvailability` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `equipment`
--

INSERT INTO `equipment` (`EquipmentID`, `EquipmentName`, `EquipmentCategoryID`, `EquipmentPrice`, `EquipmentDesc`, `EquipmentImage`, `EquipmentAvailability`) VALUES
(1, 'Canon DSLR Camera', '1', 500.00, 'High-quality professional DSLR camera.', NULL, 1),
(2, 'Tripod Stand', '2', 150.00, 'Adjustable tripod stand for cameras.', NULL, 1),
(3, 'LED Lighting Kit', '3', 300.00, 'Portable LED lighting for shoots.', NULL, 1),
(4, 'Boom Microphone', '4', 120.00, 'Directional microphone with wind shield.', NULL, 1),
(5, 'GoPro Hero 9', '1', 350.00, 'Compact action camera with 5K video.', NULL, 1),
(6, 'Softbox Lighting', '3', 200.00, 'Softbox for diffused lighting.', NULL, 1),
(7, 'DJI Drone', '1', 800.00, '4K drone with stabilizer.', NULL, 1),
(8, 'Backdrop Stand', '2', 100.00, 'Adjustable stand for backdrops.', NULL, 1),
(9, 'Audio Mixer', '4', 450.00, '4-channel audio mixer.', NULL, 1),
(10, 'Wireless Lavalier Mic', '4', 250.00, 'Wireless microphone system.', NULL, 1),
(11, 'Camera Slider', '2', 180.00, 'Motorized camera slider.', NULL, 1),
(12, 'Green Screen Kit', '2', 120.00, 'Collapsible green screen.', NULL, 1),
(13, 'Telephoto Lens', '1', 600.00, 'Professional telephoto lens for cameras.', NULL, 1),
(14, 'Light Reflector', '3', 80.00, 'Collapsible light reflector.', NULL, 1),
(15, 'Steadicam Rig', '2', 700.00, 'Stabilizing rig for cameras.', NULL, 1),
(16, 'HDMI Monitor', '2', 300.00, '7-inch HDMI monitor for camera previews.', NULL, 1),
(17, 'Studio Headphones', '4', 150.00, 'Noise-canceling studio headphones.', NULL, 1),
(18, 'Camera Gimbal', '2', 500.00, '3-axis gimbal for stabilization.', NULL, 1),
(19, 'Video Recorder', '1', 400.00, 'Portable 4K video recorder.', NULL, 1),
(20, 'Portable Power Bank', '3', 50.00, 'Portable power bank for gear.', NULL, 1);

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

-- --------------------------------------------------------

--
-- Table structure for table `userlist`
--

CREATE TABLE `userlist` (
  `UserID` int(11) NOT NULL,
  `CustomerName` varchar(100) NOT NULL,
  `CustomerEmail` int(100) NOT NULL,
  `CustomerPassword` int(100) NOT NULL,
  `CustomerAddress` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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
-- Indexes for table `userlist`
--
ALTER TABLE `userlist`
  ADD PRIMARY KEY (`UserID`);

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
  MODIFY `EquipmentID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `equipmentcategory`
--
ALTER TABLE `equipmentcategory`
  MODIFY `EquipmentCategoryID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `userlist`
--
ALTER TABLE `userlist`
  MODIFY `UserID` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;