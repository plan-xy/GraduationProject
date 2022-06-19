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
-- Table structure for table `libpic`
--

DROP TABLE IF EXISTS `libpic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `libpic` (
  `picid` int NOT NULL AUTO_INCREMENT,
  `storyid` int DEFAULT NULL,
  `pic` longtext,
  `disableflag` tinyint unsigned DEFAULT '0',
  `foundtime` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`picid`),
  KEY `libraryFK_idx` (`storyid`),
  CONSTRAINT `libraryFK` FOREIGN KEY (`storyid`) REFERENCES `library` (`storyid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libpic`
--

LOCK TABLES `libpic` WRITE;
/*!40000 ALTER TABLE `libpic` DISABLE KEYS */;
INSERT INTO `libpic` VALUES (2,7,'https://img.7os.top/pub/Cpic/2.jpg',0,'2022-03-19 16:39:53'),(3,8,'https://img.7os.top/pub/Cpic/3.jpg',0,'2022-03-19 16:39:53'),(4,9,'https://img.7os.top/pub/Cpic/1.jpg',0,'2022-03-19 16:39:53'),(5,10,'https://img.7os.top/pub/Cpic/carousel1.jpg',0,'2022-03-19 16:39:53'),(6,18,'https://img.7os.top/pub/Cpic/v2-db47ed7233f759e474ce108413055540_720w.jpg',0,'2022-05-23 23:45:27'),(7,20,'https://img.7os.top/pub/Cpic/faf9eb2e52e848d5b0dc72bd8302b0bd.jpg',0,'2022-05-24 00:00:10'),(8,21,'https://img.7os.top/pub/Cpic/641.png',0,'2022-05-24 00:07:51');
/*!40000 ALTER TABLE `libpic` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-02 15:56:04
