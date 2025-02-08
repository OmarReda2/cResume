-- ------------------------- <1.create user> ------------------------- 
-- CREATE USER 'ecommerceapp'@'localhost' IDENTIFIED BY 'ecommerceapp';

-- GRANT ALL PRIVILEGES ON * . * TO 'ecommerceapp'@'localhost';

-- #
-- # Starting with MySQL 8.0.4, the MySQL team changed the 
-- # default authentication plugin for MySQL server 
-- # from mysql_native_password to caching_sha2_password.
-- #
-- # The command below will make the appropriate updates for your user account.
-- #
-- # See the MySQL Reference Manual for details: 
-- # https://dev.mysql.com/doc/refman/8.0/en/caching-sha2-pluggable-authentication.html
-- #
-- ALTER USER 'ecommerceapp'@'localhost' IDENTIFIED WITH mysql_native_password BY 'ecommerceapp';
-- ------------------------- </create user> ------------------------- 




-- ------------------------- <2.Create Schema resume-app> -------------------------
-- DROP SCHEMA IF EXISTS `resume-app`;
-- CREATE SCHEMA `resume-app`;
-- ------------------------- </Create Schema resume-app> -------------------------




-- ------------------------- <3.Create Tables> -------------------------
-- Prep work
USE `resume-app`;
SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `user`;
DROP TABLE IF EXISTS `course`;
DROP TABLE IF EXISTS `education`;
DROP TABLE IF EXISTS `link`;
SET FOREIGN_KEY_CHECKS=1;


-- Table structure for table `user`
CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `intro` text DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- Table structure for table `course`
CREATE TABLE `course` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `description` text DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `start_date` datetime(6) DEFAULT NULL,
  `end_date` datetime(6) DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `K_course_user_id` (`user_id`),
  CONSTRAINT `FK_course_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- Table structure for table `eduction`
CREATE TABLE `eduction` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `description` text DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `grade` varchar(255) DEFAULT NULL,
  `gpa` decimal(19,2) DEFAULT NULL,
  `start_date` datetime(6) DEFAULT NULL,
  `end_date` datetime(6) DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `K_eduction_user_id` (`user_id`),
  CONSTRAINT `FK_eduction_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- Table structure for table `link`
CREATE TABLE `link` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `K_link_user_id` (`user_id`),
  CONSTRAINT `FK_link_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
