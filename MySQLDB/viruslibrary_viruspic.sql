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
-- Table structure for table `viruspic`
--

DROP TABLE IF EXISTS `viruspic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `viruspic` (
  `picid` int NOT NULL AUTO_INCREMENT,
  `virusid` int DEFAULT NULL,
  `pic` longtext,
  `disableflag` tinyint unsigned DEFAULT '0',
  `foundtime` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`picid`),
  KEY `virus_viruspic_idx` (`virusid`),
  CONSTRAINT `virus_viruspic` FOREIGN KEY (`virusid`) REFERENCES `virus` (`virusid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `viruspic`
--

LOCK TABLES `viruspic` WRITE;
/*!40000 ALTER TABLE `viruspic` DISABLE KEYS */;
INSERT INTO `viruspic` VALUES (2,1,'Bug\'s Pic',0,NULL),(3,2,'CaiHongMao\'s pic',0,NULL),(4,1,'Bug\'s TwoPic',0,'2022-03-10 22:04:47'),(5,12,'https://img.7os.top/pub/Cpic/sas.jpg',0,'2022-03-19 15:55:26'),(6,13,'https://img.7os.top/pub/Cpic/hiv (2).jpg',0,'2022-03-19 15:56:11'),(7,14,'https://img.7os.top/pub/Cpic/mazhen.jpg',0,'2022-03-19 15:59:01'),(8,15,'https://img.7os.top/pub/Cpic/tianhua.jpg',0,'2022-03-19 15:59:01'),(9,16,'https://img.7os.top/pub/Cpic/2019.jpg',0,'2022-05-02 15:33:28'),(10,17,'https://img.7os.top/pub/Cpic/aibola.jpg',0,'2022-05-02 15:42:12'),(11,18,'https://img.7os.top/pub/Cpic/th.jpg',0,'2022-05-02 16:00:58'),(12,19,'https://img.7os.top/pub/Cpic/denggere.jpg',0,'2022-05-02 16:10:59'),(13,20,'https://img.7os.top/pub/Cpic/f9dcd100baa1cd11cd5ebfa4b712c8fcc2ce2d4e.jpg',0,'2022-05-23 23:42:50'),(14,21,'https://img.7os.top/pub/Cpic/dsa8.jpg',0,'2022-05-23 23:58:26'),(15,22,'https://img.7os.top/pub/Cpic/e824b899a9014c0820edd3b6087b02087af4f4cb.jpg',0,'2022-05-24 00:05:36');
/*!40000 ALTER TABLE `viruspic` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-02 15:56:08
