-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        10.6.5-MariaDB - mariadb.org binary distribution
-- 서버 OS:                        Win64
-- HeidiSQL 버전:                  11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- company 데이터베이스 구조 내보내기
DROP DATABASE IF EXISTS `company`;
CREATE DATABASE IF NOT EXISTS `company` /*!40100 DEFAULT CHARACTER SET utf8mb3 */;
USE `company`;

-- 테이블 company.news_ageny_mst 구조 내보내기
DROP TABLE IF EXISTS `news_ageny_mst`;
CREATE TABLE IF NOT EXISTS `news_ageny_mst` (
  `na_code` int(11) NOT NULL AUTO_INCREMENT,
  `na_name` varchar(50) NOT NULL,
  PRIMARY KEY (`na_code`),
  UNIQUE KEY `na_name` (`na_name`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;

-- 테이블 데이터 company.news_ageny_mst:~3 rows (대략적) 내보내기
DELETE FROM `news_ageny_mst`;
/*!40000 ALTER TABLE `news_ageny_mst` DISABLE KEYS */;
INSERT INTO `news_ageny_mst` (`na_code`, `na_name`) VALUES
	(2, 'KT'),
	(3, 'LG U+'),
	(1, 'Sk Telecom');
/*!40000 ALTER TABLE `news_ageny_mst` ENABLE KEYS */;

-- 테이블 company.phone_number_mst 구조 내보내기
DROP TABLE IF EXISTS `phone_number_mst`;
CREATE TABLE IF NOT EXISTS `phone_number_mst` (
  `phone` varchar(50) NOT NULL,
  `na_code` int(11) NOT NULL COMMENT '1 = "SK Telecom"\r\n2 = "KT"\r\n3 = "LG U+"',
  PRIMARY KEY (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- 테이블 데이터 company.phone_number_mst:~3 rows (대략적) 내보내기
DELETE FROM `phone_number_mst`;
/*!40000 ALTER TABLE `phone_number_mst` DISABLE KEYS */;
INSERT INTO `phone_number_mst` (`phone`, `na_code`) VALUES
	('010-6610-6518', 1),
	('010-6611-6518', 2),
	('010-6612-6518', 3);
/*!40000 ALTER TABLE `phone_number_mst` ENABLE KEYS */;

-- 테이블 company.product_mst 구조 내보내기
DROP TABLE IF EXISTS `product_mst`;
CREATE TABLE IF NOT EXISTS `product_mst` (
  `product_code` int(50) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(50) NOT NULL,
  `category_code` int(50) NOT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`product_code`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb3;

-- 테이블 데이터 company.product_mst:~11 rows (대략적) 내보내기
DELETE FROM `product_mst`;
/*!40000 ALTER TABLE `product_mst` DISABLE KEYS */;
INSERT INTO `product_mst` (`product_code`, `product_name`, `category_code`, `create_date`, `update_date`) VALUES
	(10, '빨강 텀블러', 1, '2022-01-25 21:22:59', '2022-01-25 21:22:59'),
	(11, '파랑텀블러', 1, '2022-01-25 21:22:59', '2022-01-25 21:22:59'),
	(12, '머그컵', 2, '2022-01-25 21:22:59', '2022-01-25 21:22:59'),
	(13, '손잡이가 없는 머그컵', 2, '2022-01-25 21:22:59', '2022-01-25 21:22:59'),
	(14, '손잡이가 있는 머그컵', 2, '2022-01-25 21:22:59', '2022-01-25 21:22:59'),
	(15, '텀블러', 1, '2022-02-03 19:02:28', '2022-02-03 19:02:28'),
	(16, '빨강 텀블러', 1, '2022-02-03 19:02:28', '2022-02-03 19:02:28'),
	(17, '파랑텀블러', 1, '2022-02-03 19:02:28', '2022-02-03 19:02:28'),
	(18, '머그컵', 2, '2022-02-03 19:02:28', '2022-02-03 19:02:28'),
	(19, '손잡이가 없는 머그컵', 2, '2022-02-03 19:02:28', '2022-02-03 19:02:28'),
	(20, '손잡이가 있는 머그컵', 2, '2022-02-03 19:02:28', '2022-02-03 19:02:28');
/*!40000 ALTER TABLE `product_mst` ENABLE KEYS */;

-- 테이블 company.user_dtl 구조 내보내기
DROP TABLE IF EXISTS `user_dtl`;
CREATE TABLE IF NOT EXISTS `user_dtl` (
  `user_code` int(11) NOT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `addr` varchar(100) DEFAULT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`user_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- 테이블 데이터 company.user_dtl:~3 rows (대략적) 내보내기
DELETE FROM `user_dtl`;
/*!40000 ALTER TABLE `user_dtl` DISABLE KEYS */;
INSERT INTO `user_dtl` (`user_code`, `phone`, `addr`, `create_date`, `update_date`) VALUES
	(18, '010-6610-6518', NULL, '2022-01-25 21:48:16', '2022-01-25 21:48:16');
/*!40000 ALTER TABLE `user_dtl` ENABLE KEYS */;

-- 테이블 company.user_mst 구조 내보내기
DROP TABLE IF EXISTS `user_mst`;
CREATE TABLE IF NOT EXISTS `user_mst` (
  `user_code` int(11) NOT NULL AUTO_INCREMENT COMMENT '(정보입력란)',
  `username` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL,
  `name` varchar(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`user_code`) USING BTREE,
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb3 COMMENT='사용자 마스터 정보\r\n상세정보는 user_dtl 테이블을 조인하여야 함\r\n(정보입력란)';

-- 테이블 데이터 company.user_mst:~6 rows (대략적) 내보내기
DELETE FROM `user_mst`;
/*!40000 ALTER TABLE `user_mst` DISABLE KEYS */;
INSERT INTO `user_mst` (`user_code`, `username`, `password`, `name`, `email`, `create_date`, `update_date`) VALUES
	(1, 'jaehyeon', '1234', '재현', 'a@naver.com', '2022-01-25 20:11:53', '2022-01-25 20:11:53'),
	(2, 'jaehyeon2', '1234', '재현', 'b@naver.com', '2022-01-25 20:11:53', '2022-01-25 20:11:53'),
	(3, 'jahyeon1', '1234', '재현', 'c@naver.com', '2022-01-25 20:26:11', '2022-01-25 20:26:11'),
	(4, 'hyeon', '1234', '김재현', 'g@naver.com', '2022-01-25 20:33:38', '2022-01-25 20:33:38'),
	(5, 'hyeon2', '1234', '김재현3', 'D@naver.com', '2022-01-25 20:38:37', '2022-01-25 20:38:37'),
	(18, 'jaehyeon3', '1234', '재현', 'e@naver.com', '2022-01-25 20:11:53', '2022-01-25 20:11:53');
/*!40000 ALTER TABLE `user_mst` ENABLE KEYS */;

-- 트리거 company.user_dtl_before_delete 구조 내보내기
DROP TRIGGER IF EXISTS `user_dtl_before_delete`;
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `user_dtl_before_delete` BEFORE DELETE ON `user_dtl` FOR EACH ROW BEGIN
	delete
	from
		phone_number_mst
	where
		phone = OLD.phone;

END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- 트리거 company.user_mst_after_insert 구조 내보내기
DROP TRIGGER IF EXISTS `user_mst_after_insert`;
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `user_mst_after_insert` AFTER INSERT ON `user_mst` FOR EACH ROW BEGIN
	INSERT into
		user_dtl(
			user_code,
			create_date,
			update_date
		)
	VALUES(
		NEW.user_code,
		NOW(),
		NOW()
	);
	
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- 트리거 company.user_mst_before_delete 구조 내보내기
DROP TRIGGER IF EXISTS `user_mst_before_delete`;
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `user_mst_before_delete` BEFORE DELETE ON `user_mst` FOR EACH ROW BEGIN
	delete
	from
		user_dtl
	where
		user_code = OLD.user_code;	

END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
