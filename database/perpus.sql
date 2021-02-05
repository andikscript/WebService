-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 05, 2021 at 07:36 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpus`
--

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE `anggota` (
  `id_anggota` varchar(4) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `no_hp` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `anggota`
--

INSERT INTO `anggota` (`id_anggota`, `nama`, `alamat`, `no_hp`) VALUES
('A000', 'Zian Firdaus', 'Jl. Tembalang No. 15 Surakarta', '08521236214'),
('A001', 'Muslimah', 'Jl. Anggur No. 12 Surakarta', '08521236214');

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `id_buku` varchar(4) NOT NULL,
  `judul` varchar(100) NOT NULL,
  `pengarang` varchar(50) NOT NULL,
  `tahun_terbit` varchar(4) NOT NULL,
  `stok` smallint(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`id_buku`, `judul`, `pengarang`, `tahun_terbit`, `stok`) VALUES
('B001', 'Akuntansi Pengantar 1', 'Supardi', '2009', 17),
('B002', 'Aplikasi Klinis Induk Ovulasi & Stimulasi Ovariu', 'Samsulhadi', '2013', 18),
('B003', 'Aplikasi Praktis Asuhan Keperawatan Keluarga', 'Komang Ayu Heni', '2012', 19),
('B004', 'A-Z Psikologi : Berbagai kumpulan topik Psikolog', 'Zainul Anwar', '2012', 19),
('B005', 'Bangsa gagal ; Mencari identitas kebangsaan', 'Nasruddin Anshoriy', '2008', 19),
('B006', 'Biografi Gus Dur ; The Authorized Biography of KH. Abdurrahman Wahid (Soft Cover)', 'Greg Barton', '2011', 19);

-- --------------------------------------------------------

--
-- Table structure for table `pinjam`
--

CREATE TABLE `pinjam` (
  `id_pinjam` int(11) NOT NULL,
  `id_anggota` varchar(4) NOT NULL,
  `id_buku` varchar(4) NOT NULL,
  `tgl_pinjam` varchar(11) NOT NULL,
  `tgl_kembali` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pinjam`
--

INSERT INTO `pinjam` (`id_pinjam`, `id_anggota`, `id_buku`, `tgl_pinjam`, `tgl_kembali`) VALUES
(1, 'A000', 'B001', '2021-02-03', '2021-02-04'),
(2, 'A001', 'B002', '2021-02-03', '2021-02-06'),
(3, 'A000', 'B001', '2021-02-04', '2021-02-05'),
(4, 'A001', 'B001', '2021-02-04', '2021-02-07'),
(5, 'A001', 'B002', '2020-02-04', '2020-02-06'),
(6, 'A001', 'B002', '2020-02-04', '2020-02-08'),
(7, 'A000', 'B001', '2021-02-04', '2021-02-11'),
(8, 'A000', 'B002', '2021-02-04', '2021-02-07'),
(9, 'A000', 'B003', '2021-02-04', '2021-02-05'),
(10, 'A001', 'B004', '2021-02-05', '2021-02-19'),
(11, 'A001', 'B006', '2021-02-05', '2021-02-11'),
(12, 'A000', 'B001', '2021-02-05', '2021-02-06'),
(13, 'A000', 'B005', '2020-02-05', '2020-02-07');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`id_anggota`),
  ADD KEY `id_anggota` (`id_anggota`);

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`id_buku`),
  ADD KEY `id_buku` (`id_buku`);

--
-- Indexes for table `pinjam`
--
ALTER TABLE `pinjam`
  ADD PRIMARY KEY (`id_pinjam`),
  ADD KEY `id_pinjam` (`id_pinjam`),
  ADD KEY `id_anggota` (`id_anggota`),
  ADD KEY `id_buku` (`id_buku`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pinjam`
--
ALTER TABLE `pinjam`
  MODIFY `id_pinjam` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
