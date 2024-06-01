-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 01, 2024 at 01:46 AM
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
-- Database: `crud app`
--

-- --------------------------------------------------------

--
-- Table structure for table `goals`
--

CREATE TABLE `goals` (
  `goal_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `title` text NOT NULL,
  `details` text DEFAULT NULL,
  `target_date` date NOT NULL,
  `status` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `goals`
--

INSERT INTO `goals` (`goal_id`, `user_id`, `title`, `details`, `target_date`, `status`) VALUES
(1, 1, 'Learn new game', NULL, '2024-07-04', 'pending'),
(2, 1, 'Complete online course', 'Finish the Java programming course on Coursera', '2024-08-01', 'in progress'),
(3, 2, 'Read 12 books', 'Read one book each month', '2024-12-31', 'pending'),
(4, 2, 'Run a marathon', 'Train for and complete a marathon', '2024-10-15', 'pending'),
(5, 3, 'Learn French', 'Take French classes at the local community center', '2024-09-30', 'in progress'),
(6, 3, 'Save $5000', 'Save money by reducing unnecessary expenses', '2024-12-31', 'pending'),
(7, 4, 'Travel to Japan', 'Plan and go on a trip to Japan', '2024-11-20', 'pending'),
(8, 4, 'Start a blog', 'Create a blog to write about personal finance tips', '2024-07-15', 'pending'),
(9, 5, 'Learn to cook 10 new recipes', 'Experiment with new recipes from different cuisines', '2024-08-30', 'pending'),
(10, 5, 'Meditate daily', 'Incorporate meditation into the daily routine', '2024-06-30', 'in progress');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
