-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jul 11, 2022 at 05:38 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hethongktx`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `username` varchar(20) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `pasword` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `isUser` int(1) NOT NULL,
  `isAdmin` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `duyetphong`
--

CREATE TABLE `duyetphong` (
  `masv` varchar(20) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `maphong` varchar(20) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `ngayvao` date NOT NULL,
  `daduyet` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `maphong` varchar(20) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `songuoi` int(99) NOT NULL,
  `tiendien` double NOT NULL,
  `dathu` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `studentinfor`
--

CREATE TABLE `studentinfor` (
  `masv` varchar(20) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `hoten` varchar(40) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `ngaysinh` date NOT NULL,
  `gioitinh` int(1) NOT NULL,
  `lop` varchar(20) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `nganh` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `khoa` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `truong` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `CMND` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `sdtSV` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `sdtPH` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `email` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `diachi` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `anh` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `duyetphong`
--
ALTER TABLE `duyetphong`
  ADD PRIMARY KEY (`masv`);

--
-- Indexes for table `studentinfor`
--
ALTER TABLE `studentinfor`
  ADD PRIMARY KEY (`masv`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
