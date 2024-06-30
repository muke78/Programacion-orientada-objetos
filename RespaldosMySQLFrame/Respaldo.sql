-- MariaDB dump 10.19  Distrib 10.5.10-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: adm65120212
-- ------------------------------------------------------
-- Server version	10.5.10-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `conceptos`
--

DROP TABLE IF EXISTS `conceptos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `conceptos` (
  `CVECON` int(11) NOT NULL,
  `DESCRIPCION` varchar(50) NOT NULL,
  PRIMARY KEY (`CVECON`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conceptos`
--

LOCK TABLES `conceptos` WRITE;
/*!40000 ALTER TABLE `conceptos` DISABLE KEYS */;
INSERT INTO `conceptos` VALUES (1,'PRUEBA2'),(2,'PRUEBA2'),(3,'PRUEBA3'),(4,'PRUEBA4'),(5,'PRUEBA5'),(6,'PRUEBA6'),(7,'PRUEBA7'),(8,'PRUEBA8');
/*!40000 ALTER TABLE `conceptos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `conceptos2`
--

DROP TABLE IF EXISTS `conceptos2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `conceptos2` (
  `CVECON` int(11) NOT NULL,
  `DESCRIPCION` varchar(50) NOT NULL,
  PRIMARY KEY (`CVECON`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conceptos2`
--

LOCK TABLES `conceptos2` WRITE;
/*!40000 ALTER TABLE `conceptos2` DISABLE KEYS */;
/*!40000 ALTER TABLE `conceptos2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `conceptos3`
--

DROP TABLE IF EXISTS `conceptos3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `conceptos3` (
  `CVECON` int(11) NOT NULL,
  `DESCRIPCION` varchar(50) NOT NULL,
  PRIMARY KEY (`CVECON`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conceptos3`
--

LOCK TABLES `conceptos3` WRITE;
/*!40000 ALTER TABLE `conceptos3` DISABLE KEYS */;
/*!40000 ALTER TABLE `conceptos3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `deducciones`
--

DROP TABLE IF EXISTS `deducciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `deducciones` (
  `IDEMPLEADO` int(11) NOT NULL,
  `CVECON` int(11) NOT NULL,
  `FECHA` date DEFAULT NULL,
  `CANTIDAD` int(11) DEFAULT NULL,
  `IMPORTE` double DEFAULT NULL,
  PRIMARY KEY (`IDEMPLEADO`),
  KEY `fk_CVECON` (`CVECON`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deducciones`
--

LOCK TABLES `deducciones` WRITE;
/*!40000 ALTER TABLE `deducciones` DISABLE KEYS */;
INSERT INTO `deducciones` VALUES (1,1,'2017-06-15',120,200);
/*!40000 ALTER TABLE `deducciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `deducciones2`
--

DROP TABLE IF EXISTS `deducciones2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `deducciones2` (
  `IDEMPLEADO` int(11) NOT NULL,
  `CVECON` int(11) NOT NULL,
  `FECHA` date DEFAULT NULL,
  `CANTIDAD` int(11) DEFAULT NULL,
  `IMPORTE` double DEFAULT NULL,
  PRIMARY KEY (`IDEMPLEADO`),
  KEY `fk_CVECON` (`CVECON`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deducciones2`
--

LOCK TABLES `deducciones2` WRITE;
/*!40000 ALTER TABLE `deducciones2` DISABLE KEYS */;
/*!40000 ALTER TABLE `deducciones2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `deducciones3`
--

DROP TABLE IF EXISTS `deducciones3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `deducciones3` (
  `IDEMPLEADO` int(11) NOT NULL,
  `CVECON` int(11) NOT NULL,
  `FECHA` date DEFAULT NULL,
  `CANTIDAD` int(11) DEFAULT NULL,
  `IMPORTE` double DEFAULT NULL,
  PRIMARY KEY (`IDEMPLEADO`),
  KEY `fk_CVECON` (`CVECON`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deducciones3`
--

LOCK TABLES `deducciones3` WRITE;
/*!40000 ALTER TABLE `deducciones3` DISABLE KEYS */;
/*!40000 ALTER TABLE `deducciones3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleados`
--

DROP TABLE IF EXISTS `empleados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empleados` (
  `IDEMPLEADO` int(11) NOT NULL,
  `NOMBRE` varchar(35) DEFAULT NULL,
  `APPAT` varchar(35) DEFAULT NULL,
  `APMAT` varchar(35) DEFAULT NULL,
  `DIREC` varchar(35) DEFAULT NULL,
  `SUELDO` double DEFAULT NULL,
  `EDAD` int(11) DEFAULT NULL,
  `FECNAC` date DEFAULT NULL,
  PRIMARY KEY (`IDEMPLEADO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleados`
--

LOCK TABLES `empleados` WRITE;
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
INSERT INTO `empleados` VALUES (1,'ERICK','GONZALEZ','RIVERA','ECATEPEC',6000,20,'2000-12-29'),(2,'MONSERRATH','CERRITO','JIMENEZ','TULTITLAN',10000,19,'2001-10-01'),(3,'DIANA','CHAVARO','HERNANDEZ','COACALCO',11000,19,'2001-01-01'),(4,'FATIMA','MOLINA','VENEGAS','COACALCO',12000,20,'1992-07-15'),(5,'ANGEL','GONZALEZ','CRUZ','COACALCO',9000,19,'1992-11-01'),(6,'ANA','LUIS','VALLE','ECATEPEC',150000,19,'2000-07-18'),(7,'DANIEL','LUIS','VALLE','ECATEPEC',30000,16,'2003-06-03'),(8,'ALEXA','ALVARADO','MARTINEZ','ECATEPEC',150021,25,'2000-09-23');
/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleados2`
--

DROP TABLE IF EXISTS `empleados2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empleados2` (
  `IDEMPLEADO` int(11) NOT NULL,
  `NOMBRE` varchar(35) DEFAULT NULL,
  `APPAT` varchar(35) DEFAULT NULL,
  `APMAT` varchar(35) DEFAULT NULL,
  `DIREC` varchar(35) DEFAULT NULL,
  `SUELDO` double DEFAULT NULL,
  `EDAD` int(11) DEFAULT NULL,
  `FECNAC` date DEFAULT NULL,
  PRIMARY KEY (`IDEMPLEADO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleados2`
--

LOCK TABLES `empleados2` WRITE;
/*!40000 ALTER TABLE `empleados2` DISABLE KEYS */;
/*!40000 ALTER TABLE `empleados2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleados3`
--

DROP TABLE IF EXISTS `empleados3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empleados3` (
  `IDEMPLEADO` int(11) NOT NULL,
  `NOMBRE` varchar(35) DEFAULT NULL,
  `APPAT` varchar(35) DEFAULT NULL,
  `APMAT` varchar(35) DEFAULT NULL,
  `DIREC` varchar(35) DEFAULT NULL,
  `SUELDO` double DEFAULT NULL,
  `EDAD` int(11) DEFAULT NULL,
  `FECNAC` date DEFAULT NULL,
  PRIMARY KEY (`IDEMPLEADO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleados3`
--

LOCK TABLES `empleados3` WRITE;
/*!40000 ALTER TABLE `empleados3` DISABLE KEYS */;
/*!40000 ALTER TABLE `empleados3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidos`
--

DROP TABLE IF EXISTS `pedidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pedidos` (
  `idpedidos` int(11) NOT NULL,
  `idproducto` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `importe` double DEFAULT NULL,
  PRIMARY KEY (`idpedidos`,`idproducto`,`fecha`),
  KEY `idproducto` (`idproducto`),
  CONSTRAINT `pedidos_ibfk_1` FOREIGN KEY (`idproducto`) REFERENCES `productos` (`IDPRODUCTO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidos`
--

LOCK TABLES `pedidos` WRITE;
/*!40000 ALTER TABLE `pedidos` DISABLE KEYS */;
INSERT INTO `pedidos` VALUES (1,1,'2000-01-31',10,100),(1,1,'2001-12-10',10,100),(1,2,'2000-02-29',10,100),(1,2,'2001-11-11',10,100),(1,3,'2000-03-29',10,100),(1,3,'2001-10-12',10,100),(1,4,'2000-04-28',10,100),(1,4,'2001-09-13',10,100),(1,5,'2000-05-27',10,100),(1,5,'2001-08-14',10,100),(1,6,'2000-06-28',10,100),(1,6,'2001-07-15',10,100),(1,7,'2000-07-29',10,100),(1,7,'2001-06-16',10,100),(1,8,'2000-08-18',10,100),(1,8,'2001-05-17',10,100),(1,9,'2000-09-15',10,100),(1,9,'2001-02-18',10,100),(1,10,'2000-10-04',10,100),(1,10,'2001-01-19',10,100),(2,1,'2002-01-10',10,100),(2,2,'2002-02-11',10,100),(2,3,'2002-03-12',10,100),(2,4,'2002-04-13',10,100),(2,5,'2002-05-14',10,100),(2,6,'2002-06-15',10,100),(2,7,'2002-07-16',10,100),(2,8,'2002-08-17',10,100),(2,9,'2002-09-18',10,100),(2,10,'2002-10-19',10,100),(3,1,'2003-11-10',10,100),(3,2,'2003-10-11',10,100),(3,3,'2003-09-12',10,100),(3,4,'2003-08-13',10,100),(3,5,'2003-07-14',10,100),(3,6,'2003-06-15',10,100),(3,7,'2003-05-16',10,100),(3,8,'2003-04-17',10,100),(3,9,'2003-03-18',10,100),(3,10,'2003-02-19',10,100),(4,1,'2004-01-10',10,100),(4,2,'2004-02-11',10,100),(4,3,'2004-03-12',10,100),(4,4,'2004-04-13',10,100),(4,5,'2004-05-14',10,100),(4,6,'2004-06-15',10,100),(4,7,'2004-07-16',10,100),(4,8,'2004-08-17',10,100),(4,9,'2004-09-18',10,100),(4,10,'2004-10-19',10,100),(5,1,'2005-11-10',10,100),(5,2,'2005-10-11',10,100),(5,3,'2005-09-12',10,100),(5,4,'2005-08-13',10,100),(5,5,'2005-07-14',10,100),(5,6,'2005-06-15',10,100),(5,7,'2005-05-16',10,100),(5,8,'2005-04-17',10,100),(5,9,'2005-03-18',10,100),(5,10,'2005-02-19',10,100),(6,1,'2006-01-10',10,100),(6,2,'2006-02-11',10,100),(6,3,'2006-03-12',10,100),(6,4,'2006-04-13',10,100),(6,5,'2006-05-14',10,100),(6,6,'2006-06-15',10,100),(6,7,'2006-07-16',10,100),(6,8,'2006-08-17',10,100),(6,9,'2006-09-18',10,100),(6,10,'2006-10-19',10,100),(7,1,'2007-11-10',10,100),(7,2,'2007-10-11',10,100),(7,3,'2007-09-12',10,100),(7,4,'2007-08-13',10,100),(7,5,'2007-07-14',10,100),(7,6,'2007-06-15',10,100),(7,7,'2007-05-16',10,100),(7,8,'2007-04-17',10,100),(7,9,'2007-03-18',10,100),(7,10,'2007-02-19',10,100),(8,1,'2008-11-10',10,150),(8,2,'2008-10-11',10,267),(8,3,'2008-09-12',10,398),(8,4,'2008-08-13',10,480),(8,5,'2008-07-14',10,954),(8,6,'2008-06-15',10,700),(8,7,'2008-05-16',10,684),(8,8,'2008-04-17',10,481),(8,9,'2008-03-18',10,485),(8,10,'2008-02-19',10,478);
/*!40000 ALTER TABLE `pedidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidos4`
--

DROP TABLE IF EXISTS `pedidos4`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pedidos4` (
  `idpedidos` int(11) NOT NULL,
  `idproducto` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `importe` double DEFAULT NULL,
  PRIMARY KEY (`idpedidos`,`idproducto`,`fecha`),
  KEY `fk_pedidosproductos` (`idproducto`),
  CONSTRAINT `fk_pedidosproductos` FOREIGN KEY (`idproducto`) REFERENCES `productos4` (`IDPRODUCTO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidos4`
--

LOCK TABLES `pedidos4` WRITE;
/*!40000 ALTER TABLE `pedidos4` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedidos4` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `percepciones`
--

DROP TABLE IF EXISTS `percepciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `percepciones` (
  `IDEMPLEADO` int(11) NOT NULL,
  `CVECON` int(11) NOT NULL,
  `FECHA` date DEFAULT NULL,
  `CANTIDAD` int(11) DEFAULT NULL,
  `IMPORTE` double DEFAULT NULL,
  PRIMARY KEY (`IDEMPLEADO`),
  KEY `fk_CVECON` (`CVECON`),
  CONSTRAINT `fk_CVECON` FOREIGN KEY (`CVECON`) REFERENCES `conceptos` (`CVECON`),
  CONSTRAINT `fk_EMPLEADO` FOREIGN KEY (`IDEMPLEADO`) REFERENCES `empleados` (`IDEMPLEADO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `percepciones`
--

LOCK TABLES `percepciones` WRITE;
/*!40000 ALTER TABLE `percepciones` DISABLE KEYS */;
INSERT INTO `percepciones` VALUES (1,1,'2000-12-29',350,740),(2,2,'2001-10-01',420,840),(3,3,'2001-01-01',120,650),(4,4,'1992-11-01',550,849),(5,5,'1992-11-01',750,1461),(6,6,'2000-07-18',950,950),(7,7,'2003-06-03',556,846),(8,8,'2000-09-23',516,984);
/*!40000 ALTER TABLE `percepciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `percepciones2`
--

DROP TABLE IF EXISTS `percepciones2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `percepciones2` (
  `IDEMPLEADO` int(11) NOT NULL,
  `CVECON` int(11) NOT NULL,
  `FECHA` date NOT NULL,
  `CANTIDAD` int(11) DEFAULT NULL,
  `IMPORTE` double DEFAULT NULL,
  PRIMARY KEY (`IDEMPLEADO`,`FECHA`),
  KEY `fk_CVECON2` (`CVECON`),
  CONSTRAINT `fk_CVECON2` FOREIGN KEY (`CVECON`) REFERENCES `conceptos2` (`CVECON`),
  CONSTRAINT `fk_percepcionesempleados2` FOREIGN KEY (`IDEMPLEADO`) REFERENCES `empleados2` (`IDEMPLEADO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `percepciones2`
--

LOCK TABLES `percepciones2` WRITE;
/*!40000 ALTER TABLE `percepciones2` DISABLE KEYS */;
/*!40000 ALTER TABLE `percepciones2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `percepciones3`
--

DROP TABLE IF EXISTS `percepciones3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `percepciones3` (
  `IDEMPLEADO` int(11) NOT NULL,
  `CVECON` int(11) NOT NULL,
  `FECHA` date NOT NULL,
  `CANTIDAD` int(11) DEFAULT NULL,
  `IMPORTE` double DEFAULT NULL,
  PRIMARY KEY (`IDEMPLEADO`,`FECHA`),
  KEY `fk_CVECON3` (`CVECON`),
  CONSTRAINT `fk_CVECON3` FOREIGN KEY (`CVECON`) REFERENCES `conceptos3` (`CVECON`),
  CONSTRAINT `fk_percepcionesempleados3` FOREIGN KEY (`IDEMPLEADO`) REFERENCES `empleados3` (`IDEMPLEADO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `percepciones3`
--

LOCK TABLES `percepciones3` WRITE;
/*!40000 ALTER TABLE `percepciones3` DISABLE KEYS */;
/*!40000 ALTER TABLE `percepciones3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `productos` (
  `IDPRODUCTO` int(11) NOT NULL AUTO_INCREMENT,
  `NOMBRE` varchar(35) NOT NULL,
  `EXISTENCIA` double NOT NULL,
  `UNIDADMEDIDA` varchar(20) NOT NULL,
  PRIMARY KEY (`IDPRODUCTO`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,'adidas',10,'pzas'),(2,'adidas',10,'pzas'),(3,'panam',10,'pzas'),(4,'jordan',100,'pzas'),(5,'nike',100,'pzas'),(6,'converse',100,'pzas'),(7,'vans',100,'pzas'),(8,'converse',100,'pzas'),(9,'supra',100,'pzas'),(10,'pirma',100,'pzas'),(11,'adidas',10,'pzas'),(12,'adidas',10,'pzas'),(13,'panam',10,'pzas'),(14,'jordan',100,'pzas'),(15,'nike',100,'pzas'),(16,'converse',100,'pzas'),(17,'vans',100,'pzas'),(18,'converse',100,'pzas'),(19,'supra',100,'pzas'),(20,'pirma',100,'pzas');
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos2`
--

DROP TABLE IF EXISTS `productos2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `productos2` (
  `IDPRODUCTO` int(11) NOT NULL AUTO_INCREMENT,
  `NOMBRE` varchar(35) NOT NULL,
  `EXISTENCIA` double NOT NULL,
  `UNIDADMEDIDA` varchar(20) NOT NULL,
  PRIMARY KEY (`IDPRODUCTO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos2`
--

LOCK TABLES `productos2` WRITE;
/*!40000 ALTER TABLE `productos2` DISABLE KEYS */;
/*!40000 ALTER TABLE `productos2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos4`
--

DROP TABLE IF EXISTS `productos4`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `productos4` (
  `IDPRODUCTO` int(11) NOT NULL AUTO_INCREMENT,
  `NOMBRE` varchar(35) NOT NULL,
  `EXISTENCIA` double NOT NULL,
  `UNIDADMEDIDA` varchar(20) NOT NULL,
  PRIMARY KEY (`IDPRODUCTO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos4`
--

LOCK TABLES `productos4` WRITE;
/*!40000 ALTER TABLE `productos4` DISABLE KEYS */;
/*!40000 ALTER TABLE `productos4` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-13 19:56:40

C:\Program Files\MariaDB 10.5\bin>