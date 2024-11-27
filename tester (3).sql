-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 27, 2024 at 05:16 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

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
  `UserID` int(11) NOT NULL,
  `ReturnStatus` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `customerpayment`
--

CREATE TABLE `customerpayment` (
  `CustomerPaymentID` int(11) NOT NULL,
  `PaymentMethod` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `equipment`
--

CREATE TABLE `equipment` (
  `EquipmentID` int(11) NOT NULL,
  `EquipmentName` varchar(100) DEFAULT NULL,
  `EquipmentCategoryID` varchar(100) DEFAULT NULL,
  `RentedPrice` decimal(10,2) DEFAULT NULL,
  `EquipmentDesc` text DEFAULT NULL,
  `EquipmentImage` longblob DEFAULT NULL,
  `EquipmentAvailability` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `equipment`
--

INSERT INTO `equipment` (`EquipmentID`, `EquipmentName`, `EquipmentCategoryID`, `RentedPrice`, `EquipmentDesc`, `EquipmentImage`, `EquipmentAvailability`) VALUES
(1, 'Canon EOS Rebel T7', '1', 1000.00, 'DSLR camera for high-quality photography and video recording.', NULL, 1),
(2, 'Sony Alpha a6400', '1', 1500.00, 'Mirrorless camera with advanced autofocus.', NULL, 1),
(3, 'GoPro Hero 11', '1', 800.00, 'Compact action camera for outdoor adventures.', NULL, 1),
(4, 'DJI Mini 3 Pro', '1', 2000.00, 'Drone with 4K camera for aerial footage.', NULL, 1),
(5, 'Logitech C922 Pro', '1', 300.00, 'HD webcam for streaming and video calls.', NULL, 1),
(6, 'Manfrotto Befree Tripod', '1', 350.00, 'Lightweight tripod for stable camera positioning.', NULL, 1),
(7, 'DJI Ronin-SC Gimbal Stabilizer', '1', 1000.00, '3-axis gimbal stabilizer for smooth footage.', NULL, 1),
(8, 'Lowepro ProTactic 450 AW II Backpack', '1', 500.00, 'Professional backpack for camera equipment.', NULL, 1),
(9, 'Canon EF 50mm f/1.8 Lens', '1', 400.00, 'Prime lens for portrait photography.', NULL, 1),
(10, 'Camera Cleaning Kit', '1', 50.00, 'Complete kit for camera maintenance.', NULL, 1),
(11, 'Godox SL60W LED Video Light', '2', 500.00, 'Soft and bright LED light for video shoots.', NULL, 1),
(12, '18-inch Ring Light with Stand', '2', 300.00, 'Adjustable ring light for portraits.', NULL, 1),
(13, 'Neewer Softbox Kit', '2', 700.00, 'Professional softbox for studio lighting.', NULL, 1),
(14, 'Aputure Amaran AL-M9 Light', '2', 250.00, 'Compact on-camera light for videos.', NULL, 1),
(15, '5-in-1 Collapsible Light Reflector', '2', 100.00, 'Versatile reflector for various lighting setups.', NULL, 1),
(16, 'Yongnuo YN360 III RGB Light', '2', 800.00, 'RGB light panel for creative lighting effects.', NULL, 1),
(17, 'Portable Light Stand', '2', 200.00, 'Adjustable stand for lighting equipment.', NULL, 1),
(18, 'Neewer RGB Light Tube', '2', 450.00, 'Tubular light for background effects.', NULL, 1),
(19, 'Lighting C-Clamps', '2', 100.00, 'Clamps for securing lighting equipment.', NULL, 1),
(20, 'Light Diffuser Sheets', '2', 50.00, 'Diffusion sheets for soft lighting.', NULL, 1),
(21, 'Rode VideoMic Pro Plus', '3', 750.00, 'Professional shotgun microphone for clear audio recording.', NULL, 1),
(22, 'BOYA BY-M1 Lavalier Microphone', '3', 150.00, 'Affordable clip-on microphone.', NULL, 1),
(23, 'Blue Yeti USB Microphone', '3', 500.00, 'High-quality microphone for podcasting.', NULL, 1),
(24, 'Behringer Xenyx Q802USB Audio Mixer', '3', 450.00, 'Compact mixer with USB interface.', NULL, 1),
(25, 'KRK Rokit RP5 G4 Studio Monitors', '3', 1500.00, 'Accurate sound reproduction for mixing.', NULL, 1),
(26, 'Audio-Technica ATH-M50x Headphones', '3', 600.00, 'Professional headphones for monitoring.', NULL, 1),
(27, 'Zoom H6 Recorder', '3', 1200.00, 'Portable recorder for professional audio capture.', NULL, 1),
(28, 'Pop Filter for Microphones', '3', 50.00, 'Reduces popping sounds in recordings.', NULL, 1),
(29, 'Microphone Boom Arm', '3', 200.00, 'Adjustable arm for mounting microphones.', NULL, 1),
(30, 'Rode Wireless GO II Mic System', '3', 2000.00, 'Wireless microphone system for mobile recording.', NULL, 1),
(31, 'Green Screen Backdrop', '4', 300.00, '10x12 feet green screen for chroma key effects.', NULL, 1),
(32, '128GB Sandisk Extreme Pro SD Card', '4', 100.00, 'High-speed SD card for storage.', NULL, 1),
(33, '1TB Samsung T7 Portable SSD', '4', 800.00, 'Portable SSD for fast data transfer.', NULL, 1),
(34, 'Battery Packs for Cameras', '4', 150.00, 'Rechargeable battery pack for cameras.', NULL, 1),
(35, 'Portable Power Bank (20,000 mAh)', '4', 200.00, 'Power bank for charging devices on the go.', NULL, 1),
(36, 'Extension Cords with Surge Protector', '4', 100.00, 'Multi-outlet extension cord for powering devices.', NULL, 1),
(37, 'Cable Organizers', '4', 50.00, 'Organizers for managing cables and wires.', NULL, 1),
(38, 'HDMI Cable (6 ft)', '4', 70.00, 'High-speed HDMI cable for video output.', NULL, 1),
(39, 'BenQ PD2700U 4K Monitor', '4', 2500.00, '4K monitor for video editing.', NULL, 1),
(40, 'Adobe Premiere Pro Subscription', '4', 1500.00, 'Video editing software license.', NULL, 1),
(41, 'Studio Desk', '4', 2000.00, 'Sturdy desk for studio setups.', NULL, 1),
(42, 'Foldable Chair for Shoots', '4', 150.00, 'Portable chair for studio or outdoor shoots.', NULL, 1),
(43, 'Camera Lens Filters (ND and UV)', '4', 100.00, 'Filters for controlling light and reflections.', NULL, 1),
(44, 'Smartphone Holder with Tripod Mount', '4', 150.00, 'Holder for mounting smartphones to tripods.', NULL, 1),
(45, 'External Flash (Godox TT600)', '4', 350.00, 'On-camera flash for low-light photography.', NULL, 1),
(46, 'Cable Extensions for Audio (XLR)', '4', 80.00, 'Extension cables for audio equipment.', NULL, 1),
(47, 'Dust Covers for Equipment', '4', 50.00, 'Covers to protect equipment from dust.', NULL, 1),
(48, 'Bluetooth Remote Shutter for Smartphones', '4', 50.00, 'Remote shutter for smartphone cameras.', NULL, 1),
(49, 'Whiteboard for Pre-Shooting Notes', '4', 300.00, 'Whiteboard for organizing shoot plans.', NULL, 1);

-- --------------------------------------------------------

--
-- Table structure for table `equipmentcategory`
--

CREATE TABLE `equipmentcategory` (
  `EquipmentCategoryID` int(11) NOT NULL,
  `CatergoryName` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `package`
--

CREATE TABLE `package` (
  `PackageID` int(11) NOT NULL,
  `PackageName` varchar(100) NOT NULL,
  `RentedPrice` int(11) NOT NULL,
  `PackageDesc` text NOT NULL,
  `PackageImage` longblob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `packageequipment`
--

CREATE TABLE `packageequipment` (
  `PackageEquipmentID` int(11) NOT NULL,
  `PackageID` int(11) NOT NULL,
  `EquipmentID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `userlist`
--

CREATE TABLE `userlist` (
  `UserID` int(11) NOT NULL,
  `CustomerName` varchar(100) NOT NULL,
  `CustomerEmail` varchar(100) NOT NULL,
  `CustomerPassword` varchar(100) NOT NULL,
  `CustomerAddress` text NOT NULL,
  `CustomerPhone` int(100) NOT NULL
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
-- Indexes for table `package`
--
ALTER TABLE `package`
  ADD PRIMARY KEY (`PackageID`);

--
-- Indexes for table `packageequipment`
--
ALTER TABLE `packageequipment`
  ADD PRIMARY KEY (`PackageEquipmentID`);

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
  MODIFY `CustomerPaymentID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `equipment`
--
ALTER TABLE `equipment`
  MODIFY `EquipmentID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=50;

--
-- AUTO_INCREMENT for table `equipmentcategory`
--
ALTER TABLE `equipmentcategory`
  MODIFY `EquipmentCategoryID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `package`
--
ALTER TABLE `package`
  MODIFY `PackageID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `packageequipment`
--
ALTER TABLE `packageequipment`
  MODIFY `PackageEquipmentID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `userlist`
--
ALTER TABLE `userlist`
  MODIFY `UserID` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
