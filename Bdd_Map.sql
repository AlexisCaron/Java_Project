CREATE DATABASE  IF NOT EXISTS `boulderdash` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `boulderdash`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: boulderdash
-- ------------------------------------------------------
-- Server version	5.7.17-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `example`
--

DROP TABLE IF EXISTS `example`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `example` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `example`
--

LOCK TABLES `example` WRITE;
/*!40000 ALTER TABLE `example` DISABLE KEYS */;
INSERT INTO `example` VALUES (1,'Example 1'),(2,'Example 2'),(3,'Example 3'),(4,'Exmaple 4');
/*!40000 ALTER TABLE `example` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `map`
--

DROP TABLE IF EXISTS `map`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `map` (
  `ID_Map` int(11) NOT NULL AUTO_INCREMENT,
  `MapPattern` varchar(2000) NOT NULL,
  PRIMARY KEY (`ID_Map`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `map`
--

LOCK TABLES `map` WRITE;
/*!40000 ALTER TABLE `map` DISABLE KEYS */;
INSERT INTO `map` VALUES (1,'CCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\nCTTSSSSSSCSSSSSSSSSSDSSSSSCSRC\nCTTSSRSSSSSSDSSSSSRSSSSSSSCSSC\nCSSSSSSSCSSRRSSCCSSSSSSSSSSSSC\nCSSSSSSSSSSSSSSSSSSSSSTTSSSSSC\nCSSSSSSSSSSSSSSCSSSSSSTTSSSSSC\nCCCCCCCCCCSSSSSSSSSSSSSSSSSSSC\nCSSSSSSSSCCCSSSSSSSSSSCSSSSSSC\nCSSRRRSSCSSCCSSSSSSSSRSSSSSSSC\nCSSSSSSCSSSSSCCSSSSSDSSSSSSCSC\nCSSSSSCSSSSSSSSSSSSSSSSSSSSSSC\nCSSSSCSSSSSSDSSSSSSSRSSSSRSSSC\nCSSSCSSSSSSSSSSSSRSSSSRRSSSSSC\nCSSSSSSSSSSCSSSCSSSSSSCCSSSSSC\nCSSRRRSSSSSSSSSSSSSSSSSSSSSSSC\nCSSSSSSCSSSCCCCSSSSSSSSSSSSSSC\nCSSSSSSSCSSSSSSCSSRRRRRSSSSSSC\nCSSSSSSSSSCSSSSSCSSSSSSSSSSSSC\nCSSSSSSSSSDSSSSSSCCCCCCCCCCCCC\nCSSSSSSSSSSSSSSSSSSSSSSSSSSSSC\nCSCCCCCCCSSSSSRRSSSSSSSSSSSSSC\nCSSSSSSSSRRSSSSSSSSSSSSSSSSSSC\nCSSSSSSSSSSRSSSSSSSSSRSSSSSSSC\nCSSSSSSSSSSCCCSSSSSSSSSSSSSSSC\nCSRRSSTTSSSSSCSSSSSDSSSSSRSSSC\nCSSSSSTTSSSSCSSSSSCCSSSSSSSSSC\nCSCCSSSSSSSSCSSSSSSSSSSSSSSSSC\nCSSSSSSSSSSSCSSSSCCSSSSSSSSSSC\nCDSSSSSSSSSSCSSSSSSSSSSSSCCSSC\nCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC'),(2,'CCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\nCTSSSSSSSSSSSSSSCSSSSSSSSSCSDC\nCRCRCRCRCRCDSSSSSSRSSSSSSSSSSC\nCSSSSSSSCSSRRSCCCSSCSSSSCCSSSC\nCSSSSSSSSSSSSSSSSSSSSSTTSSSSSC\nCSSSSSSSSSSSSSSCSSSSSTTTSSSSSC\nCCCCRRRRRCSSSSSCSTTTTTTSSSSSSC\nCSSSSSSSSCCCSSCSCSSSSCCCCCCCRC\nCSSRRRSRCSSCCSSSSRSSSRSSSSSSSC\nCSSSSSRRRSSSSCCSSSCSSSSSSSSCSC\nCSSSSSCRSSSSSSSSSSSCCCSSSSSSSC\nCSSSSRSSSSSDDSSSSSSSRSSSSRSSSC\nCSSSCSCSSCSSSSSSSRSSSCRRSSSSSC\nCSSSSSSSSSSCSSSCSSSSSSCCSSSSSC\nCSSRRRSSSSSSSSSSSSSSSSSSSSSSSC\nCSSSSSSCSSSCCRCSSSSSSSSSSSSSSC\nCSSSSSSSCSSSSSSCSSRRRRRSSSSSSC\nCSSSSSSSSCCSSSSSCSSSSSSSSSSSSC\nCSSSSSSSSSDSSSSSSCCCCCCCCCCCCC\nCSSSSSSSSSSSSSSCSSSSSSSSSSSSSC\nCSCCCCCCCSSSSSRRSSSSSSSSSSSSSC\nCSSSSSSRRSSSSSSCSSSSSSSSSSSSSC\nCSSSSSSSSRSSSSSCSSSSSRRRSSSSSC\nCSSSSSSSSSCCCCSCSCRCCCCCCCSSSC\nCSCCSSTTSSSSSCSCSCSDSSCSSRSSSC\nCSSSSSTTSSSSCSSCSCCCCSSCSSSSSC\nCSCCSSSSSSSSCSRSSSSSSSSSCSSSSC\nCSCSSSSSSSSSCSCSSCCSSSSSSCSSSC\nCDCSSSSSSSSSCSSSSSSSSSSSSCCSSC\nCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC'),(3,'CCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\nCTSCSSSCSCSSSSSSSSSSDSCSSSCSRC\nCSSCSRSCSSSDCCDSSSSSRCSSSSSSSC\nCSSCCSSCCSSRRSSCCSSSCSSSSSSSSC\nCSSSSSSSSSSSSSCSSTTTTTTTSSSSSC\nCCCCCSSCCCCSSCSTTTTTTTTTSSSSSC\nCSSSSSSSSSSSSCSTTSSSSSSSSSSSSC\nCSSSSSSSSSSSSCSTTSSSSSCSSSSSSC\nCSSSSCSCSRRSCSSSSSSRSSSSSSSSSC\nCSSSCSSSSSSSSCCSSSSSDSSSSSSCSC\nCCSSSCSSSSSSSSCCSSSSSSSSSSSSSC\nCSSSRSSSSSSDDSSSSSSSRSSSSRSSSC\nCSRRTSSSSSSSSSSSSRSSSSRRSSSSSC\nCSSSTCSSSSSCSSSCSSSSSSCCSSSSSC\nCSSRTRCSSSSSSSSSCSSSSSSSSSSSSC\nCSSSSSSCSSSCCCCCSSSSSSSSSSSSSC\nCSSSSSSSCSSSSSSCSSRRRRRSSSSSSC\nCSSSSSSSCTTSSSSSCSSSSSSSSSSSSC\nCCCCSSSSCTSSSSSSSCCCCCCCCCCCCC\nCSSSSSSSTTSSSSSSSSSSSSSSSSSSSC\nCSSSSSTTTSSSSRRSSCSSSSSRRSSSSC\nCSSSSSTTSRRSSSSSSCSSSSSSSSSSSC\nCSSSSTTTSSSRSSSSSSSSSRSSSSSSSC\nCSSSRTCSSSSCCCSSRRSSSSSSSSSSSC\nCCCCCTCSSSSSSCSSSSSSSSSSRSSSSC\nCSSSSTCSSSSSRSSSSSRRRRCRSSSSSC\nCSSSSTCSSSSSRSSSSSSSSSSSSSSSSC\nCSSSSSCSSSSSRSSSSRRSSSSSSSSSSC\nCDSSSSCSSSSSRSSSSSSSSSSSSCCSSC\nCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC'),(4,'CCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\nCTSSSSSCSCSSSSSSSSSSDSCSSSCSRC\nCSCSSRSCSSSSCCDSSSSSRCSSSSSSSC\nCSSCSSSCCSSRRSSCCSSSCSSCCSSSSC\nCSSSCSSSSTTTTTTTTTTTTTTTSSSSSC\nCCRCCSSCCTTTTTTTTTTTTTTTSSCSSC\nCSSSSSSSSSSSSCCCCSSSSSSSSSSSSC\nCSSSSSSSSSSSSCSCCSSSSSCSSSRSSC\nCSSSSCSCSRRSCSSSSSSRRRSSSSSSSC\nCSSSCSSSSSSSSCCSSSSSDRSSSSSCSC\nCSRSSCSSRSSSSSCCSSSSCRSSSSSSSC\nCSSSRSSSSSSRDSSSSSSSRSSSSRSSSC\nCSRRTSSCSSSSSSSSSRSTSSRRSSSSSC\nCSSSTCSSRSSCSSSCSSSSSSCCSSSCCC\nCSSRTRCSSSSSSSSSCSSSSSSSSRSSSC\nCSSSSSSCSSRCCCCCSSSSCSSSSRSSSC\nCSSDSSSSCSSSSSSCSSRRRRRSSCSSSC\nCSSRSSSSCTTSSSSSTRSSSSSSCSSSDC\nCCRCSSSSCSSSSSCCTCCCCCCCCCCCCC\nCSSSCSSSSTSSSSSCTSSSSSSSSSSSSC\nCSSSSSSSSSSSRRSCTSSSSSRRRSSSSC\nCSSSSSTTSRRSSSSCCCSSCSSSSSSSSC\nCSSSSTTTSSSRSSSSSSCSSRSSSSSCSC\nCSSSRTCSSSSCCCSSRRSSSSCSSSSSSC\nCRCSCTSSCSSSSCSSSSSDSCTRSRSSSC\nCSSSSTCSSSSSRSSSSSRRRRTCCCCCCC\nCSSSSTSSSSSSRSSSSSSSSCTSSSTSSC\nCSSSSSSSCCSSRSSSTRRSSCTSSSSSSC\nCCCSSSSSSSSSRSSSSSSSSCSSSRCSDC\nCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC'),(5,'CCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\nCTSSSSSSSSSSSSSSSSCSDSSSSSCSRC\nCSSCSTTTTTTDCCRSSSCSSCSSSSSSSC\nCSSCCTTCTTTRRSSCCSSSSSSSSSSSSC\nCSSSSTTSSSSSSSCSSTTTTTTTSSSSSC\nCRCSCTTCCCCSSCSTTTTTTTTTSSSSSC\nCSSSSTTSSSSSTTTTTCCSSSSSSSSSSC\nCDSSSTTSSSTTTTTTTCCSSSCSSCCCCC\nCSSSSTTSSRTTCSSSSSCRSSSSSSSSSC\nCSSSCTTSSSTTSCCSSSSSDSSSCSSCSC\nCSSSSTTSTTTTSSCCSSSSSSSSSSSSSC\nCSSSRTTSTTSDDSSSSCSSRSSSSRSSSC\nCSRRSTTRRSSSSSSSSRSSSSRRSSSSSC\nCSSCSTTSSSSCSSSCSSSSSSCCSSSSSC\nCSCSSTTCSCSSSSSCSSSSCCSSSSCCSC\nCCSSSTTCSSSCCCCCSSSCSSSSSSSSSC\nCSCCSTTSCSSSSSSCSSRRRRRSSSSCSC\nCSSSSTTSCSSSSSSSCSSSSSSSSCCSSC\nCSSSSTTSSSCSSSSSSSSSSSSCSSSSSC\nCSRRSTTCCSSCCCSSSSRRSSSSSCSSSC\nCSRSSTTSSSSSSSSSSSRRSSSCSSSSSC\nCSSRSTTSRRRSSSSSSSSSSSSSSSSSSC\nCSSSSTTSSSSRSSSSSCSCSSSSRRSSSC\nCSSSRTTRRSSSSSSSSRRSSSSSSSSSSC\nCSSSSTTSSSSCSSSCCSSSSSSRRSSCCC\nCCCSSTTSSSSCSCCSSSSSSSSCCSSCSC\nCSSSSTTSSSSCSSRRRRSSSSSRRSSDSC\nCSSSSSCSSSSCSSSSSSSSSSSCSSSSSC\nCRRSSDCSSSSCSSSSSSRRSSSSSCCSSC\nCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC');
/*!40000 ALTER TABLE `map` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'boulderdash'
--

--
-- Dumping routines for database 'boulderdash'
--
/*!50003 DROP PROCEDURE IF EXISTS `findAllExamples` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_VALUE_ON_ZERO' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `findAllExamples`()
    NO SQL
SELECT id, name
FROM example ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `findExampleById` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_VALUE_ON_ZERO' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `findExampleById`(IN `id` INT)
    NO SQL
SELECT id, name
FROM example
WHERE example.id = id ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `findExampleByName` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_VALUE_ON_ZERO' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `findExampleByName`(IN `name` VARCHAR(255))
    NO SQL
SELECT id, name
FROM example
WHERE example.name = name ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Level1` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Level1`()
SELECT MapPattern
From map
Where ID_Map = 1 ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Level2` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Level2`()
SELECT MapPattern
From map
Where ID_Map = 2 ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Level3` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Level3`()
SELECT MapPattern
From map
Where ID_Map = 3 ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Level4` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Level4`()
SELECT MapPattern
From map
Where ID_Map = 4 ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Level5` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Level5`()
SELECT MapPattern
From map
Where ID_Map = 5 ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-23 16:48:57
