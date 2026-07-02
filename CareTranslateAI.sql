CREATE DATABASE  IF NOT EXISTS `caretranslate_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `caretranslate_db`;
-- MySQL dump 10.13  Distrib 8.0.46, for Win64 (x86_64)
--
-- Host: localhost    Database: caretranslate_db
-- ------------------------------------------------------
-- Server version	8.0.46

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
-- Table structure for table `care_records`
--

DROP TABLE IF EXISTS `care_records`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `care_records` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `record_date` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `record_time` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `content` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `note` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `care_records`
--

LOCK TABLES `care_records` WRITE;
/*!40000 ALTER TABLE `care_records` DISABLE KEYS */;
INSERT INTO `care_records` VALUES (1,'用藥','2026/07/02','08:00','早餐後已服藥','由 Lina 紀錄','2026-07-02 08:02:58'),(2,'血壓','2026/07/02','09:00','120/80 mmHg','正常','2026-07-02 08:02:58'),(3,'體溫','2026/07/02','10:00','36.7°C','正常','2026-07-02 08:02:58'),(4,'用藥','2026/07/02','08:00','早餐後已服藥','由 Lina 紀錄','2026-07-02 08:03:02'),(5,'血壓','2026/07/02','09:00','120/80 mmHg','正常','2026-07-02 08:03:02'),(6,'體溫','2026/07/02','10:00','36.7°C','正常','2026-07-02 08:03:02');
/*!40000 ALTER TABLE `care_records` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `language_translations`
--

DROP TABLE IF EXISTS `language_translations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `language_translations` (
  `id` int NOT NULL AUTO_INCREMENT,
  `category` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `zh_text` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `vi_text` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `id_text` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `fil_text` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `language_translations`
--

LOCK TABLES `language_translations` WRITE;
/*!40000 ALTER TABLE `language_translations` DISABLE KEYS */;
INSERT INTO `language_translations` VALUES (1,'飲食','請喝水。','Xin hãy uống nước.','Silakan minum air.','Please drink water.','2026-07-02 08:02:58'),(2,'用藥','請吃藥。','Xin hãy uống thuốc.','Silakan minum obat.','Please take medicine.','2026-07-02 08:02:58'),(3,'身體','你哪裡不舒服？','Bạn khó chịu ở đâu?','Bagian mana yang tidak nyaman?','Where do you feel uncomfortable?','2026-07-02 08:02:58'),(4,'緊急','請幫忙，病人走失了。','Xin giúp đỡ, bệnh nhân bị lạc.','Tolong bantu, pasien hilang.','Please help, the patient is missing.','2026-07-02 08:02:58'),(5,'飲食','請喝水。','Xin hãy uống nước.','Silakan minum air.','Please drink water.','2026-07-02 08:03:02'),(6,'用藥','請吃藥。','Xin hãy uống thuốc.','Silakan minum obat.','Please take medicine.','2026-07-02 08:03:02'),(7,'身體','你哪裡不舒服？','Bạn khó chịu ở đâu?','Bagian mana yang tidak nyaman?','Where do you feel uncomfortable?','2026-07-02 08:03:02'),(8,'緊急','請幫忙，病人走失了。','Xin giúp đỡ, bệnh nhân bị lạc.','Tolong bantu, pasien hilang.','Please help, the patient is missing.','2026-07-02 08:03:02');
/*!40000 ALTER TABLE `language_translations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lost_reports`
--

DROP TABLE IF EXISTS `lost_reports`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lost_reports` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `location` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `last_time` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `police_station` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `phone` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `status` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lost_reports`
--

LOCK TABLES `lost_reports` WRITE;
/*!40000 ALTER TABLE `lost_reports` DISABLE KEYS */;
/*!40000 ALTER TABLE `lost_reports` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sos_records`
--

DROP TABLE IF EXISTS `sos_records`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sos_records` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `phone` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `note` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sos_records`
--

LOCK TABLES `sos_records` WRITE;
/*!40000 ALTER TABLE `sos_records` DISABLE KEYS */;
INSERT INTO `sos_records` VALUES (1,'跌倒','119 / 家屬 0912-345-678','顯示電話，不自動撥號','2026-07-02 08:02:58'),(2,'走失','110 / 最近警局','提供定位與警局通報流程','2026-07-02 08:02:58'),(3,'呼吸困難','119','緊急求助電話顯示','2026-07-02 08:02:58'),(4,'跌倒','119 / 家屬 0912-345-678','顯示電話，不自動撥號','2026-07-02 08:03:02'),(5,'走失','110 / 最近警局','提供定位與警局通報流程','2026-07-02 08:03:02'),(6,'呼吸困難','119','緊急求助電話顯示','2026-07-02 08:03:02');
/*!40000 ALTER TABLE `sos_records` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `email` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `password` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `role` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'小美','family@example.com','1234','家屬','2026-07-02 08:02:58'),(2,'Lina','caregiver@example.com','1234','外籍照護員','2026-07-02 08:02:58'),(3,'阿公','elder@example.com','1234','被照顧者','2026-07-02 08:02:58'),(4,'Admin','admin@example.com','admin','管理者','2026-07-02 08:02:58'),(5,'小美','family@example.com','1234','家屬','2026-07-02 08:03:02'),(6,'Lina','caregiver@example.com','1234','外籍照護員','2026-07-02 08:03:02'),(7,'阿公','elder@example.com','1234','被照顧者','2026-07-02 08:03:02'),(8,'Admin','admin@example.com','admin','管理者','2026-07-02 08:03:02');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-07-02 16:04:28
