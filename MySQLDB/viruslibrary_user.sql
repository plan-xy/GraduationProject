-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: viruslibrary
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `nickname` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `userid` int NOT NULL AUTO_INCREMENT,
  `gender` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `loginday` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `career` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `grade` int DEFAULT NULL,
  `account` int unsigned NOT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `password` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `email` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `useravater` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci,
  `disableflag` tinyint unsigned DEFAULT '0',
  `foundtime` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`userid`),
  UNIQUE KEY `idUser_UNIQUE` (`userid`),
  UNIQUE KEY `account_UNIQUE` (`account`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb3 COMMENT='This is user table ';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('DemoAuthor',0,'male','2022-05-05','2022-05-04 17:49:04','Author',2,666666,'666666','666666','666666@aa.cpm','https://img1.imgtp.com/2022/04/27/ngz0vDTS.jpg',0,'2022-05-05 01:49:04'),('Admin',1,'male','2022-03-10','2022-05-04 17:49:04','programmer',2,100100,'17866510361','100','admin.com','https://img1.imgtp.com/2022/04/27/ngz0vDTS.jpg',0,NULL),('辟谣中心',2,'female','2022-03-10','2022-05-04 17:49:04','coder',2,100101,'17866510364','100100','await.com','https://img1.imgtp.com/2022/04/27/GQM6wokB.jpg',0,NULL),('TaoKe',3,'male','2022-03-10','2022-03-10 13:32:16','GaiLIuzi',2,300,'17866541036','300','300.com','https://img1.imgtp.com/2022/04/27/yuyZ9XLm.jpg',0,'2022-03-10 21:32:16'),('里斯2',11,'female','2022-03-11','2022-04-27 09:38:06','pro',1,4271738,'17896654126','999999','9999.ui','https://img1.imgtp.com/2022/04/27/yuyZ9XLm.jpg',0,'2022-04-27 17:38:06'),('yu',15,'male','2022-04-25','2022-04-29 15:29:38','Career178',1,4292329,NULL,'123','yu@qq.com','https://img1.imgtp.com/2022/04/29/wK5n0U4Q.jpg',0,'2022-04-29 23:29:38'),('ds',18,'male','2022-06-30','2022-06-01 01:24:35','Passager',1,6010924,NULL,'900','Yey@q','https://img1.imgtp.com/2022/04/29/eicyZb6R.jpg',0,'2022-06-01 09:24:35');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-02 15:56:09
