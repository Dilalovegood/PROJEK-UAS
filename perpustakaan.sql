-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 30 Jan 2023 pada 02.04
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpustakaan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `peminjaman_buku`
--

CREATE TABLE `peminjaman_buku` (
  `id_peminjaman` char(10) NOT NULL,
  `id_anggota` char(10) DEFAULT NULL,
  `kode_buku` char(10) DEFAULT NULL,
  `jumlah_buku` int(10) DEFAULT NULL,
  `tgl_peminjaman` date DEFAULT current_timestamp(),
  `tgl_pengembalian` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `peminjaman_buku`
--

INSERT INTO `peminjaman_buku` (`id_peminjaman`, `id_anggota`, `kode_buku`, `jumlah_buku`, `tgl_peminjaman`, `tgl_pengembalian`) VALUES
('77', '2017', 'b123', 2, '2023-01-28', '2023-02-04'),
('dd', 'A012', 'ff', 2, '2023-01-29', '2023-02-05'),
('p0098', 'A011', 'K009', 1, '2023-01-29', '2023-02-05'),
('p77', '2017', 'b123', 2, '2023-01-29', '2023-02-05'),
('pq09', '2017', 'b123', 1, '2023-01-28', '2023-01-28'),
('pq988', '2012', 'k9', 1, '2023-01-29', '2023-02-05'),
('PQqq098', 'A017', 'k9', 2, '2023-01-29', '2023-02-05');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pustakawan`
--

CREATE TABLE `pustakawan` (
  `id_pustakawan` char(10) NOT NULL,
  `nama` varchar(20) DEFAULT NULL,
  `jenis_kelamin` varchar(10) DEFAULT NULL,
  `alamat` varchar(20) DEFAULT NULL,
  `pw` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pustakawan`
--

INSERT INTO `pustakawan` (`id_pustakawan`, `nama`, `jenis_kelamin`, `alamat`, `pw`) VALUES
('1999', 'yeonjun', 'L', 'Gangnam', 'ynzn'),
('20', 'v', 'l', 'skk', '99'),
('2004', '', 'lelaki', 'ansan', '123'),
('2005', 'hyuka', 'lelaki', 'gangnam', 'txt'),
('2021', 'Mohamad Reza Ashari', 'Lelaki', 'Pasirmuncang', 'Batosai7'),
('2023', 'Bagas Putra', 'Lelaki', 'Bojong genteng', 'Bagas1');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tabel_anggota`
--

CREATE TABLE `tabel_anggota` (
  `id_anggota` char(10) NOT NULL,
  `nama_anggota` varchar(20) DEFAULT NULL,
  `jenis_kelamin` varchar(10) DEFAULT NULL,
  `alamat` varchar(20) DEFAULT NULL,
  `id_pustakawan` char(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tabel_anggota`
--

INSERT INTO `tabel_anggota` (`id_anggota`, `nama_anggota`, `jenis_kelamin`, `alamat`, `id_pustakawan`) VALUES
('2012', 'sas', 'l', 'hdh', '2005'),
('2017', 'yeonjun', 'L', 'Seoul', '2023'),
('A002', 'angga', 'jl', '0876446', '2005'),
('A003', 'dede', 'nuom', '08577263', '2005'),
('A004', 'fara', 'canada', '017889006', '2005'),
('A006', 'def', 'nyoqm', '085764322', '2005'),
('A007', 'mina', 'busan', '085746987765', '2005'),
('A009', 'sad', 'pq', 'kjh', '2005'),
('A011', 'Hana', 'P', 'kk', '2005'),
('A012', 'V', 'L', 'busan', '2005'),
('A014', 'Angga', 'L', 'jhg', '2005'),
('A015', 'dk', 'Pq', 'ss', '2005'),
('A016', 'dl', 'l', 'kk', '2005'),
('A018', 'dada', 'L', 'ng', '2005');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tabel_buku`
--

CREATE TABLE `tabel_buku` (
  `kode_buku` char(10) NOT NULL,
  `judul_buku` varchar(20) DEFAULT NULL,
  `pengarang` varchar(20) DEFAULT NULL,
  `kategori` varchar(10) DEFAULT NULL,
  `penerbit` varchar(10) DEFAULT NULL,
  `tahun_terbit` char(10) DEFAULT NULL,
  `stok_buku` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tabel_buku`
--

INSERT INTO `tabel_buku` (`kode_buku`, `judul_buku`, `pengarang`, `kategori`, `penerbit`, `tahun_terbit`, `stok_buku`) VALUES
('b123', 'Pemrograman', 'Sabi', 'edukasi', 'gm', '1999', 3),
('b138', 'mamah papah', 'teguh', 'fiksi', 'gramedia', '1999', 2),
('b145', 'atlantis', 'daud', 'misteri', 'gm', '1999', 1),
('b156', 'jurnal penelitian', 'dila', 'ilmiah', 'gm', '2004', 1),
('B69', '34 Street', 'Jack Harllow', 'Action', 'Holly tree', '2012', 13),
('ff', 'rqrq', 'g', 'gh', '', '23', 3),
('K009', 'ffgbb', 'ttg', 'fiksi', 'g', '567', 9),
('K089', 'Harqrqy', 'jk', 'fks', 'rqff', '199', 6),
('k0987', 'fjj', 'kjh', 'jj', 'hh', '178', 2),
('k89', 'harqrqy', 'jk', 'fiqksiq', 'gm', '2009', 1),
('k9', 'dbd', 'hsh', 'shh', 'dd', '1299', 2);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `peminjaman_buku`
--
ALTER TABLE `peminjaman_buku`
  ADD PRIMARY KEY (`id_peminjaman`);

--
-- Indeks untuk tabel `pustakawan`
--
ALTER TABLE `pustakawan`
  ADD PRIMARY KEY (`id_pustakawan`);

--
-- Indeks untuk tabel `tabel_anggota`
--
ALTER TABLE `tabel_anggota`
  ADD PRIMARY KEY (`id_anggota`),
  ADD KEY `id_pustakawan` (`id_pustakawan`);

--
-- Indeks untuk tabel `tabel_buku`
--
ALTER TABLE `tabel_buku`
  ADD PRIMARY KEY (`kode_buku`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `tabel_anggota`
--
ALTER TABLE `tabel_anggota`
  ADD CONSTRAINT `tabel_anggota_ibfk_1` FOREIGN KEY (`id_pustakawan`) REFERENCES `pustakawan` (`id_pustakawan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
