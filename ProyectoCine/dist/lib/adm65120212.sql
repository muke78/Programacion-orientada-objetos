-- MariaDB dump 10.19  Distrib 10.5.11-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: adm65120212
-- ------------------------------------------------------
-- Server version	10.5.11-MariaDB

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
-- Temporary table structure for view `ademvi01`
--

DROP TABLE IF EXISTS `ademvi01`;
/*!50001 DROP VIEW IF EXISTS `ademvi01`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `ademvi01` (
  `IDEMPLEADO` tinyint NOT NULL,
  `NOMBRE` tinyint NOT NULL,
  `APPAT` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `ademvi02`
--

DROP TABLE IF EXISTS `ademvi02`;
/*!50001 DROP VIEW IF EXISTS `ademvi02`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `ademvi02` (
  `IDEMPLEADO` tinyint NOT NULL,
  `APPMAT` tinyint NOT NULL,
  `DIREC` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `ademvi03`
--

DROP TABLE IF EXISTS `ademvi03`;
/*!50001 DROP VIEW IF EXISTS `ademvi03`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `ademvi03` (
  `IDEMPLEADO` tinyint NOT NULL,
  `SUELDO` tinyint NOT NULL,
  `EDAD` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `ademvi04`
--

DROP TABLE IF EXISTS `ademvi04`;
/*!50001 DROP VIEW IF EXISTS `ademvi04`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `ademvi04` (
  `IDEMPLEADO` tinyint NOT NULL,
  `FECNAC` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `ademvi05`
--

DROP TABLE IF EXISTS `ademvi05`;
/*!50001 DROP VIEW IF EXISTS `ademvi05`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `ademvi05` (
  `IDEMPLEADO` tinyint NOT NULL,
  `NOMBRE` tinyint NOT NULL,
  `APPAT` tinyint NOT NULL,
  `APPMAT` tinyint NOT NULL,
  `DIREC` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `ademvi06`
--

DROP TABLE IF EXISTS `ademvi06`;
/*!50001 DROP VIEW IF EXISTS `ademvi06`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `ademvi06` (
  `IDEMPLEADO` tinyint NOT NULL,
  `NOMBRE` tinyint NOT NULL,
  `APPAT` tinyint NOT NULL,
  `APPMAT` tinyint NOT NULL,
  `DIREC` tinyint NOT NULL,
  `SUELDO` tinyint NOT NULL,
  `EDAD` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `ademvi07`
--

DROP TABLE IF EXISTS `ademvi07`;
/*!50001 DROP VIEW IF EXISTS `ademvi07`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `ademvi07` (
  `IDEMPLEADO` tinyint NOT NULL,
  `NOMBRE` tinyint NOT NULL,
  `APPAT` tinyint NOT NULL,
  `APPMAT` tinyint NOT NULL,
  `DIREC` tinyint NOT NULL,
  `SUELDO` tinyint NOT NULL,
  `EDAD` tinyint NOT NULL,
  `FECNAC` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `calculos`
--

DROP TABLE IF EXISTS `calculos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `calculos` (
  `IDEMPLEADO` int(11) DEFAULT NULL,
  `CONCEPTO` int(11) DEFAULT NULL,
  `FECHA` date DEFAULT NULL,
  `UNIDADES` int(11) DEFAULT NULL,
  `IMPORTE` double(10,2) DEFAULT NULL,
  KEY `fk_IDEMPLEADO` (`IDEMPLEADO`),
  KEY `fk_CONCEPTO` (`CONCEPTO`),
  CONSTRAINT `fk_CONCEPTO` FOREIGN KEY (`CONCEPTO`) REFERENCES `conceptos` (`CVECON`),
  CONSTRAINT `fk_IDEMPLEADO` FOREIGN KEY (`IDEMPLEADO`) REFERENCES `empleados` (`IDEMPLEADO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `calculos`
--

LOCK TABLES `calculos` WRITE;
/*!40000 ALTER TABLE `calculos` DISABLE KEYS */;
/*!40000 ALTER TABLE `calculos` ENABLE KEYS */;
UNLOCK TABLES;

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conceptos`
--

LOCK TABLES `conceptos` WRITE;
/*!40000 ALTER TABLE `conceptos` DISABLE KEYS */;
INSERT INTO `conceptos` VALUES (3,'PRUEBA3'),(4,'PRUEBA4'),(5,'PRUEBA5'),(6,'PRUEBA6'),(7,'PRUEBA7'),(8,'PRUEBA8');
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conceptos3`
--

LOCK TABLES `conceptos3` WRITE;
/*!40000 ALTER TABLE `conceptos3` DISABLE KEYS */;
/*!40000 ALTER TABLE `conceptos3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `conceptos4`
--

DROP TABLE IF EXISTS `conceptos4`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `conceptos4` (
  `CVECON` int(11) NOT NULL,
  `DESCRIPCION` varchar(50) NOT NULL,
  PRIMARY KEY (`CVECON`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conceptos4`
--

LOCK TABLES `conceptos4` WRITE;
/*!40000 ALTER TABLE `conceptos4` DISABLE KEYS */;
/*!40000 ALTER TABLE `conceptos4` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `deducciones`
--

DROP TABLE IF EXISTS `deducciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `deducciones` (
  `IDEMPLEADO` int(11) DEFAULT NULL,
  `CVECON` int(11) DEFAULT NULL,
  `FECHA` date DEFAULT NULL,
  `CANTIDAD` int(11) DEFAULT NULL,
  `IMPORTE` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deducciones`
--

LOCK TABLES `deducciones` WRITE;
/*!40000 ALTER TABLE `deducciones` DISABLE KEYS */;
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
  `FECHA` date NOT NULL,
  `CANTIDAD` int(11) DEFAULT NULL,
  `IMPORTE` double DEFAULT NULL,
  PRIMARY KEY (`IDEMPLEADO`,`CVECON`,`FECHA`),
  KEY `CVECON` (`CVECON`),
  CONSTRAINT `deducciones2_ibfk_1` FOREIGN KEY (`CVECON`) REFERENCES `conceptos2` (`CVECON`) ON UPDATE CASCADE,
  CONSTRAINT `deducciones2_ibfk_2` FOREIGN KEY (`IDEMPLEADO`) REFERENCES `empleados2` (`IDEMPLEADO`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
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
  `FECHA` date NOT NULL,
  `CANTIDAD` int(11) DEFAULT NULL,
  `IMPORTE` double DEFAULT NULL,
  PRIMARY KEY (`IDEMPLEADO`,`CVECON`,`FECHA`),
  KEY `CVECON` (`CVECON`),
  CONSTRAINT `deducciones3_ibfk_1` FOREIGN KEY (`CVECON`) REFERENCES `conceptos3` (`CVECON`) ON UPDATE CASCADE,
  CONSTRAINT `deducciones3_ibfk_2` FOREIGN KEY (`IDEMPLEADO`) REFERENCES `empleados3` (`IDEMPLEADO`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
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
  `APPMAT` varchar(35) DEFAULT NULL,
  `DIREC` varchar(35) DEFAULT NULL,
  `SUELDO` double DEFAULT NULL,
  `EDAD` int(11) DEFAULT NULL,
  `FECNAC` date DEFAULT NULL,
  PRIMARY KEY (`IDEMPLEADO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleados`
--

LOCK TABLES `empleados` WRITE;
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
INSERT INTO `empleados` VALUES (1,'ERICK','GONZALEZ','RIVERA','ECATEPEC',6000,20,'2000-12-29'),(2,'MONSERRATH','CERRITO','JIMENEZ','TULTITLAN',10000,19,'2001-10-01'),(3,'DIANA','CHAVARO','HERNANDEZ','COACALCO',11000,19,'2001-01-01'),(4,'FATIMA','MOLINA','VENEGAS','COACALCO',12000,20,'1992-07-15'),(5,'ANGEL','GONZALEZ','CRUZ','COACALCO',9000,19,'1992-11-01');
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
  `APPMAT` varchar(35) DEFAULT NULL,
  `DIREC` varchar(35) DEFAULT NULL,
  `SUELDO` double DEFAULT NULL,
  `EDAD` int(11) DEFAULT NULL,
  `FECNAC` date DEFAULT NULL,
  PRIMARY KEY (`IDEMPLEADO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
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
  `APPMAT` varchar(35) DEFAULT NULL,
  `DIREC` varchar(35) DEFAULT NULL,
  `SUELDO` double DEFAULT NULL,
  `EDAD` int(11) DEFAULT NULL,
  `FECNAC` date DEFAULT NULL,
  PRIMARY KEY (`IDEMPLEADO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleados3`
--

LOCK TABLES `empleados3` WRITE;
/*!40000 ALTER TABLE `empleados3` DISABLE KEYS */;
/*!40000 ALTER TABLE `empleados3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equiposdefutbol`
--

DROP TABLE IF EXISTS `equiposdefutbol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `equiposdefutbol` (
  `IDEQUIPO` int(11) NOT NULL,
  `NOMBRE` varbinary(100) DEFAULT NULL,
  `PROPIETARIO` varbinary(100) DEFAULT NULL,
  `DIRECCION` varbinary(100) DEFAULT NULL,
  `ESTADIO` varbinary(100) DEFAULT NULL,
  `VALOREQUIPO` varbinary(100) DEFAULT NULL,
  `PAGINA` varbinary(100) DEFAULT NULL,
  `EMAIL` varbinary(100) DEFAULT NULL,
  `NACIONALIDAD` varbinary(100) DEFAULT NULL,
  `NOJUGADORES` varbinary(100) DEFAULT NULL,
  PRIMARY KEY (`IDEQUIPO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equiposdefutbol`
--

LOCK TABLES `equiposdefutbol` WRITE;
/*!40000 ALTER TABLE `equiposdefutbol` DISABLE KEYS */;
/*!40000 ALTER TABLE `equiposdefutbol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidos`
--

DROP TABLE IF EXISTS `pedidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pedidos` (
  `IDPEDIDO` int(11) NOT NULL,
  `IDPRODUCTO` int(11) NOT NULL,
  `FECHA` date NOT NULL,
  `CANTIDAD` int(11) DEFAULT NULL,
  `IMPORTE` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`IDPEDIDO`,`IDPRODUCTO`,`FECHA`),
  KEY `IDPRODUCTO` (`IDPRODUCTO`),
  CONSTRAINT `pedidos_ibfk_1` FOREIGN KEY (`IDPRODUCTO`) REFERENCES `productos` (`IDPRODUCTO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidos`
--

LOCK TABLES `pedidos` WRITE;
/*!40000 ALTER TABLE `pedidos` DISABLE KEYS */;
INSERT INTO `pedidos` VALUES (1,1,'2010-10-10',10,100.50),(1,2,'2010-10-10',15,150.00),(1,3,'2010-11-12',5,70.00),(2,4,'2011-07-04',20,60.00),(2,6,'2011-08-12',30,30.00),(3,1,'2010-10-10',10,100.50),(4,2,'2010-10-10',15,150.00),(5,8,'2012-01-10',5,700.00),(5,9,'2012-11-12',8,300.00),(5,10,'2012-10-10',30,500.75),(6,11,'2012-02-19',14,275.03),(6,11,'2012-02-20',16,372.04),(7,3,'2012-12-02',26,650.00),(7,15,'2009-10-10',15,150.00),(8,20,'2007-11-29',100,2000.00),(8,21,'2012-12-02',100,650.00),(8,22,'2012-12-02',100,850.00),(8,23,'2012-12-02',100,250.00),(9,19,'2015-04-13',10,820.00),(9,49,'2015-04-16',26,430.00),(10,30,'2014-05-17',26,430.00),(11,25,'2005-02-27',8,355.00),(11,32,'2016-07-11',12,850.00),(12,18,'2014-09-18',10,720.00),(12,19,'2014-09-18',10,820.00),(13,1,'2010-10-10',10,100.50),(13,2,'2010-10-10',15,150.00),(14,3,'2010-11-12',5,70.00),(14,4,'2011-07-04',20,60.00),(14,6,'2011-08-12',30,30.00),(15,1,'2010-10-10',10,100.50),(16,2,'2010-10-10',15,150.00),(17,10,'2012-10-10',30,500.75),(18,9,'2012-11-12',8,300.00),(19,8,'2012-01-10',5,700.00),(20,11,'2012-02-19',14,275.03),(21,11,'2012-02-20',16,372.04),(21,15,'2009-10-10',15,150.00),(22,3,'2012-12-02',26,650.00),(23,20,'2007-11-29',100,2000.00),(23,21,'2012-12-02',100,650.00),(23,22,'2012-12-02',100,850.00),(23,23,'2012-12-02',100,250.00),(24,19,'2015-04-13',10,820.00),(25,30,'2014-05-17',26,430.00),(25,49,'2015-04-16',26,430.00),(26,32,'2016-07-11',12,850.00),(27,25,'2005-02-27',8,355.00),(28,18,'2014-09-18',10,720.00),(28,19,'2014-09-18',10,820.00),(29,1,'2017-12-12',20,350.00),(29,26,'2021-10-01',70,420.30),(29,50,'2018-09-25',150,3000.00),(30,27,'2020-07-19',20,650.20),(30,28,'2020-07-20',35,376.20),(30,29,'2019-04-13',47,653.00),(31,42,'2018-06-23',61,207.00),(32,33,'2013-06-25',52,720.00),(33,27,'2016-02-03',60,309.00),(34,17,'2013-10-15',102,604.50),(35,43,'2008-07-08',8,808.00),(36,45,'2006-09-19',66,510.00),(37,28,'2004-07-20',35,376.20),(37,29,'2003-04-13',47,653.00),(38,42,'2020-06-23',61,207.00),(39,33,'2021-06-25',52,720.00),(40,17,'2016-10-15',102,604.50),(40,27,'2019-02-03',60,309.00),(40,43,'2016-07-08',8,808.00),(41,45,'2000-12-29',66,510.00);
/*!40000 ALTER TABLE `pedidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidos2`
--

DROP TABLE IF EXISTS `pedidos2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pedidos2` (
  `idpedido` int(11) NOT NULL,
  `idproducto` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `importe` double DEFAULT NULL,
  PRIMARY KEY (`idpedido`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidos2`
--

LOCK TABLES `pedidos2` WRITE;
/*!40000 ALTER TABLE `pedidos2` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedidos2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidos3`
--

DROP TABLE IF EXISTS `pedidos3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pedidos3` (
  `idpedido` int(11) NOT NULL,
  `idproducto` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `importe` double DEFAULT NULL,
  PRIMARY KEY (`idpedido`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidos3`
--

LOCK TABLES `pedidos3` WRITE;
/*!40000 ALTER TABLE `pedidos3` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedidos3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidos4`
--

DROP TABLE IF EXISTS `pedidos4`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pedidos4` (
  `IDPEDIDO` int(11) NOT NULL,
  `IDPRODUCTO` int(11) NOT NULL,
  `FECHA` date NOT NULL,
  `CANTIDAD` int(11) DEFAULT NULL,
  `IMPORTE` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`IDPEDIDO`,`IDPRODUCTO`,`FECHA`),
  KEY `IDPRODUCTO` (`IDPRODUCTO`),
  CONSTRAINT `pedidos4_ibfk_1` FOREIGN KEY (`IDPRODUCTO`) REFERENCES `productos` (`IDPRODUCTO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `percepciones`
--

LOCK TABLES `percepciones` WRITE;
/*!40000 ALTER TABLE `percepciones` DISABLE KEYS */;
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
  `FECHA` date DEFAULT NULL,
  `CANTIDAD` int(11) DEFAULT NULL,
  `IMPORTE` double DEFAULT NULL,
  PRIMARY KEY (`IDEMPLEADO`),
  KEY `CVECON` (`CVECON`),
  CONSTRAINT `percepciones2_ibfk_1` FOREIGN KEY (`CVECON`) REFERENCES `conceptos2` (`CVECON`) ON UPDATE CASCADE,
  CONSTRAINT `percepciones2_ibfk_2` FOREIGN KEY (`IDEMPLEADO`) REFERENCES `empleados2` (`IDEMPLEADO`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
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
  `FECHA` date DEFAULT NULL,
  `CANTIDAD` int(11) DEFAULT NULL,
  `IMPORTE` double DEFAULT NULL,
  PRIMARY KEY (`IDEMPLEADO`),
  KEY `CVECON` (`CVECON`),
  CONSTRAINT `percepciones3_ibfk_1` FOREIGN KEY (`CVECON`) REFERENCES `conceptos2` (`CVECON`) ON UPDATE CASCADE,
  CONSTRAINT `percepciones3_ibfk_2` FOREIGN KEY (`IDEMPLEADO`) REFERENCES `empleados2` (`IDEMPLEADO`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
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
  `IDPRODUCTO` int(11) NOT NULL,
  `NOMBRE` varchar(35) DEFAULT NULL,
  `EXISTENCIA` double DEFAULT NULL,
  `UNIDADMEDIDA` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`IDPRODUCTO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,'GELATINA',90,'PZAS'),(2,'LECHE',20,'PZAS'),(3,'QUESO',120,'PZAS'),(4,'PAN',200,'PZAS'),(5,'MANTEQUILLA',60,'PZAS'),(6,'CARNEDERES',50,'KILOS'),(7,'AVENA',20,'PZAS'),(8,'AMARANTO',30,'PZAS'),(9,'YOGURHT',150,'PZAS'),(10,'CARNEDECERDO',40,'KILOS'),(11,'PLATOS',1000,'PZAS'),(12,'COJINES',50,'PZAS'),(13,'PLANTAS',115,'PZAS'),(14,'RECUADROS',70,'PZAS'),(15,'FOCOS',260,'PZAS'),(16,'SILLON',35,'PZAS'),(17,'AMACA',52,'PZAS'),(18,'MESAS',22,'PZAS'),(19,'MUEBLEDECORATIVO',10,'PZAS'),(20,'TAZAS',1000,'PZAS'),(21,'TELEVISION',42,'PZAS'),(22,'BOCINAS',60,'PZAS'),(23,'COMPUTADORAS',23,'PZAS'),(24,'TECLADOS',550,'PZAS'),(25,'MOUSE',130,'PZAS'),(26,'MONITORES',62,'PZAS'),(27,'TABLETS',142,'PZAS'),(28,'CONSOLAS',150,'PZAS'),(29,'JUEGOS',45,'PZAS'),(30,'IMPRESORAS',56,'PZAS'),(31,'TELEFONOS',500,'PZAS'),(32,'TENIS',250,'PZAS'),(33,'PLAYERAS',51,'PZAS'),(34,'BERMUDAS',45,'PZAS'),(35,'SHORTS',41,'PZAS'),(36,'SUDADERAS',212,'PZAS'),(37,'PANTALONES',110,'PZAS'),(38,'CHAMARRAS',54,'PZAS'),(39,'LENTESDESOL',145,'PZAS'),(40,'SOMBREROS',495,'PZAS'),(41,'CHANCLAS',159,'PZAS'),(42,'SUETER',458,'PZAS'),(43,'FALDA',415,'PZAS'),(44,'TENIS',250,'PZAS'),(45,'PLAYERAS',51,'PZAS'),(46,'TOP',251,'PZAS'),(47,'BLUSAS',654,'PZAS'),(48,'SUDADERAS',212,'PZAS'),(49,'PANTALONES',110,'PZAS'),(50,'CHAMARRAS',54,'PZAS');
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos2`
--

DROP TABLE IF EXISTS `productos2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `productos2` (
  `IDPRODUCTO` int(11) NOT NULL,
  `NOMBRE` varchar(35) DEFAULT NULL,
  `EXISTENCIA` double DEFAULT NULL,
  `UNIDADMEDIDA` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`IDPRODUCTO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos2`
--

LOCK TABLES `productos2` WRITE;
/*!40000 ALTER TABLE `productos2` DISABLE KEYS */;
INSERT INTO `productos2` VALUES (1,'PUMA',10,'PZAS'),(2,'ADIDAS',100,'PZAS'),(3,'PANAM',1000,'PZAS'),(4,'JORDAN',100,'PZAS'),(5,'NIKE',100,'PZAS'),(6,'VANS',100,'PZAS'),(7,'CONVERSE',100,'PZAS'),(8,'SUPPRA',100,'PZAS'),(9,'PIRMA',100,'PZAS'),(10,'REEBOK',100,'PZAS');
/*!40000 ALTER TABLE `productos2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos3`
--

DROP TABLE IF EXISTS `productos3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `productos3` (
  `IDPRODUCTO` int(11) NOT NULL,
  `NOMBRE` varchar(35) DEFAULT NULL,
  `EXISTENCIA` double DEFAULT NULL,
  `UNIDADMEDIDA` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`IDPRODUCTO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos3`
--

LOCK TABLES `productos3` WRITE;
/*!40000 ALTER TABLE `productos3` DISABLE KEYS */;
INSERT INTO `productos3` VALUES (1,'PUMA',10,'PZAS'),(2,'ADIDAS',100,'PZAS'),(3,'PANAM',1000,'PZAS'),(4,'JORDAN',100,'PZAS'),(5,'NIKE',100,'PZAS'),(6,'VANS',100,'PZAS'),(7,'CONVERSE',100,'PZAS'),(8,'SUPPRA',100,'PZAS'),(9,'PIRMA',100,'PZAS'),(10,'REEBOK',100,'PZAS');
/*!40000 ALTER TABLE `productos3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos4`
--

DROP TABLE IF EXISTS `productos4`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `productos4` (
  `IDPRODUCTO` int(11) NOT NULL,
  `NOMBRE` varchar(35) DEFAULT NULL,
  `EXISTENCIA` double DEFAULT NULL,
  `UNIDADMEDIDA` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos4`
--

LOCK TABLES `productos4` WRITE;
/*!40000 ALTER TABLE `productos4` DISABLE KEYS */;
INSERT INTO `productos4` VALUES (1,'GELATINA',90,'PZAS'),(2,'LECHE',20,'PZAS'),(3,'QUESO',120,'PZAS'),(4,'PAN',200,'PZAS'),(5,'MANTEQUILLA',60,'PZAS'),(6,'CARNEDERES',50,'KILOS'),(7,'AVENA',20,'PZAS'),(8,'AMARANTO',30,'PZAS'),(9,'YOGURHT',150,'PZAS'),(10,'CARNEDECERDO',40,'KILOS'),(11,'PLATOS',1000,'PZAS'),(12,'COJINES',50,'PZAS'),(13,'PLANTAS',115,'PZAS'),(14,'RECUADROS',70,'PZAS'),(15,'FOCOS',260,'PZAS'),(16,'SILLON',35,'PZAS'),(17,'AMACA',52,'PZAS'),(18,'MESAS',22,'PZAS'),(19,'MUEBLEDECORATIVO',10,'PZAS'),(20,'TAZAS',1000,'PZAS'),(21,'TELEVISION',42,'PZAS'),(22,'BOCINAS',60,'PZAS'),(23,'COMPUTADORAS',23,'PZAS'),(24,'TECLADOS',550,'PZAS'),(25,'MOUSE',130,'PZAS'),(26,'MONITORES',62,'PZAS'),(27,'TABLETS',142,'PZAS'),(28,'CONSOLAS',150,'PZAS'),(29,'JUEGOS',45,'PZAS'),(30,'IMPRESORAS',56,'PZAS'),(31,'TELEFONOS',500,'PZAS'),(32,'TENIS',250,'PZAS'),(33,'PLAYERAS',51,'PZAS'),(34,'BERMUDAS',45,'PZAS'),(35,'SHORTS',41,'PZAS'),(36,'SUDADERAS',212,'PZAS'),(37,'PANTALONES',110,'PZAS'),(38,'CHAMARRAS',54,'PZAS'),(39,'LENTESDESOL',145,'PZAS'),(40,'SOMBREROS',495,'PZAS'),(41,'CHANCLAS',159,'PZAS'),(42,'SUETER',458,'PZAS'),(43,'FALDA',415,'PZAS'),(44,'TENIS',250,'PZAS'),(45,'PLAYERAS',51,'PZAS'),(46,'TOP',251,'PZAS'),(47,'BLUSAS',654,'PZAS'),(48,'SUDADERAS',212,'PZAS'),(49,'PANTALONES',110,'PZAS'),(50,'CHAMARRAS',54,'PZAS');
/*!40000 ALTER TABLE `productos4` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos5`
--

DROP TABLE IF EXISTS `productos5`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `productos5` (
  `IDPRODUCTO` int(11) NOT NULL,
  `NOMBRE` varchar(35) DEFAULT NULL,
  `EXISTENCIA` double DEFAULT NULL,
  `UNIDADMEDIDA` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos5`
--

LOCK TABLES `productos5` WRITE;
/*!40000 ALTER TABLE `productos5` DISABLE KEYS */;
INSERT INTO `productos5` VALUES (1,'GELATINA',90,'PZAS'),(2,'LECHE',20,'PZAS'),(3,'QUESO',120,'PZAS'),(4,'PAN',200,'PZAS'),(5,'MANTEQUILLA',60,'PZAS'),(6,'CARNEDERES',50,'KILOS'),(7,'AVENA',20,'PZAS'),(8,'AMARANTO',30,'PZAS'),(9,'YOGURHT',150,'PZAS'),(10,'CARNEDECERDO',40,'KILOS'),(11,'PLATOS',1000,'PZAS'),(12,'COJINES',50,'PZAS'),(13,'PLANTAS',115,'PZAS'),(14,'RECUADROS',70,'PZAS'),(15,'FOCOS',260,'PZAS'),(16,'SILLON',35,'PZAS'),(17,'AMACA',52,'PZAS'),(18,'MESAS',22,'PZAS'),(19,'MUEBLEDECORATIVO',10,'PZAS'),(20,'TAZAS',1000,'PZAS'),(21,'TELEVISION',42,'PZAS'),(22,'BOCINAS',60,'PZAS'),(23,'COMPUTADORAS',23,'PZAS'),(24,'TECLADOS',550,'PZAS'),(25,'MOUSE',130,'PZAS'),(26,'MONITORES',62,'PZAS'),(27,'TABLETS',142,'PZAS'),(28,'CONSOLAS',150,'PZAS'),(29,'JUEGOS',45,'PZAS'),(30,'IMPRESORAS',56,'PZAS'),(31,'TELEFONOS',500,'PZAS'),(32,'TENIS',250,'PZAS'),(33,'PLAYERAS',51,'PZAS'),(34,'BERMUDAS',45,'PZAS'),(35,'SHORTS',41,'PZAS'),(36,'SUDADERAS',212,'PZAS'),(37,'PANTALONES',110,'PZAS'),(38,'CHAMARRAS',54,'PZAS'),(39,'LENTESDESOL',145,'PZAS'),(40,'SOMBREROS',495,'PZAS'),(41,'CHANCLAS',159,'PZAS'),(42,'SUETER',458,'PZAS'),(43,'FALDA',415,'PZAS'),(44,'TENIS',250,'PZAS'),(45,'PLAYERAS',51,'PZAS'),(46,'TOP',251,'PZAS'),(47,'BLUSAS',654,'PZAS'),(48,'SUDADERAS',212,'PZAS'),(49,'PANTALONES',110,'PZAS'),(50,'CHAMARRAS',54,'PZAS');
/*!40000 ALTER TABLE `productos5` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tablas`
--

DROP TABLE IF EXISTS `tablas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tablas` (
  `IDTABLA` int(11) DEFAULT NULL,
  `RENGLON` int(11) DEFAULT NULL,
  `NOMBRE` varchar(35) DEFAULT NULL,
  `LIMINF` double(10,2) DEFAULT NULL,
  `LIMSUP` double(10,2) DEFAULT NULL,
  `CUOTA` double(10,2) DEFAULT NULL,
  `PERCENTAJE` double(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tablas`
--

LOCK TABLES `tablas` WRITE;
/*!40000 ALTER TABLE `tablas` DISABLE KEYS */;
INSERT INTO `tablas` VALUES (115,1,'TABLA MENSUAL',0.01,644.58,0.00,1.92),(115,2,'TABLA MENSUAL',644.59,5470.92,12.38,6.40),(115,3,'TABLA MENSUAL',5470.93,9614.66,321.26,10.88),(115,4,'TABLA MENSUAL',9614.67,11176.62,772.10,16.00),(115,5,'TABLA MENSUAL',11176.63,13381.47,1022.01,17.92),(115,6,'TABLA MENSUAL',13381.48,26988.50,1417.12,21.36),(115,7,'TABLA MENSUAL',26988.51,42537.58,4323.58,23.52),(115,8,'TABLA MENSUAL',42537.59,81211.25,7980.73,30.00),(115,9,'TABLA MENSUAL',81211.26,108281.67,19582.83,32.00),(115,10,'TABLA MENSUAL',108281.68,324845.01,28245.36,34.00),(115,11,'TABLA MENSUAL',324845.02,99999999.99,101876.90,35.00),(116,1,'SUBSIDIO MENSUAL',0.01,1768.96,407.02,0.00),(116,2,'SUBSIDIO MENSUAL',1768.97,2653.38,406.83,0.00),(116,3,'SUBSIDIO MENSUAL',2653.39,3472.84,406.62,0.00),(116,4,'SUBSIDIO MENSUAL',3472.85,3537.87,392.77,0.00),(116,5,'SUBSIDIO MENSUAL',3537.88,4446.15,382.46,0.00),(116,6,'SUBSIDIO MENSUAL',4446.16,4717.18,354.23,0.00),(116,7,'SUBSIDIO MENSUAL',4717.19,5335.42,324.87,0.00),(116,8,'SUBSIDIO MENSUAL',5335.43,6224.67,294.63,0.00),(116,9,'SUBSIDIO MENSUAL',6224.68,7113.90,253.54,0.00),(116,10,'SUBSIDIO MENSUAL',7113.91,7382.33,217.61,0.00),(116,11,'SUBSIDIO MENSUAL',7382.34,99999999.99,0.00,0.00);
/*!40000 ALTER TABLE `tablas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `IDUSUARIO` varchar(6) NOT NULL,
  `NOMBRE` varchar(35) DEFAULT NULL,
  `PASSWORD` varchar(35) DEFAULT NULL,
  `FECVENTO` date DEFAULT NULL,
  `ESTATUS` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`IDUSUARIO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES ('dgonza','Daniel Gonzalez','111111','2021-12-31','In'),('egonza','Erick Gonzalez','123','2021-09-29','Ac'),('jgarci','Jose Juan garcia','123456','2021-06-29','Ac'),('rperez','Ricardo perez','123456','2021-12-31','Ac');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `ademvi01`
--

/*!50001 DROP TABLE IF EXISTS `ademvi01`*/;
/*!50001 DROP VIEW IF EXISTS `ademvi01`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = cp850 */;
/*!50001 SET character_set_results     = cp850 */;
/*!50001 SET collation_connection      = cp850_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `ademvi01` AS select `empleados`.`IDEMPLEADO` AS `IDEMPLEADO`,`empleados`.`NOMBRE` AS `NOMBRE`,`empleados`.`APPAT` AS `APPAT` from `empleados` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `ademvi02`
--

/*!50001 DROP TABLE IF EXISTS `ademvi02`*/;
/*!50001 DROP VIEW IF EXISTS `ademvi02`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = cp850 */;
/*!50001 SET character_set_results     = cp850 */;
/*!50001 SET collation_connection      = cp850_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `ademvi02` AS select `empleados`.`IDEMPLEADO` AS `IDEMPLEADO`,`empleados`.`APPMAT` AS `APPMAT`,`empleados`.`DIREC` AS `DIREC` from `empleados` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `ademvi03`
--

/*!50001 DROP TABLE IF EXISTS `ademvi03`*/;
/*!50001 DROP VIEW IF EXISTS `ademvi03`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = cp850 */;
/*!50001 SET character_set_results     = cp850 */;
/*!50001 SET collation_connection      = cp850_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `ademvi03` AS select `empleados`.`IDEMPLEADO` AS `IDEMPLEADO`,`empleados`.`SUELDO` AS `SUELDO`,`empleados`.`EDAD` AS `EDAD` from `empleados` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `ademvi04`
--

/*!50001 DROP TABLE IF EXISTS `ademvi04`*/;
/*!50001 DROP VIEW IF EXISTS `ademvi04`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = cp850 */;
/*!50001 SET character_set_results     = cp850 */;
/*!50001 SET collation_connection      = cp850_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `ademvi04` AS select `empleados`.`IDEMPLEADO` AS `IDEMPLEADO`,`empleados`.`FECNAC` AS `FECNAC` from `empleados` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `ademvi05`
--

/*!50001 DROP TABLE IF EXISTS `ademvi05`*/;
/*!50001 DROP VIEW IF EXISTS `ademvi05`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = cp850 */;
/*!50001 SET character_set_results     = cp850 */;
/*!50001 SET collation_connection      = cp850_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `ademvi05` AS select `ademvi01`.`IDEMPLEADO` AS `IDEMPLEADO`,`ademvi01`.`NOMBRE` AS `NOMBRE`,`ademvi01`.`APPAT` AS `APPAT`,`ademvi02`.`APPMAT` AS `APPMAT`,`ademvi02`.`DIREC` AS `DIREC` from (`ademvi01` join `ademvi02` on(`ademvi01`.`IDEMPLEADO` = `ademvi02`.`IDEMPLEADO`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `ademvi06`
--

/*!50001 DROP TABLE IF EXISTS `ademvi06`*/;
/*!50001 DROP VIEW IF EXISTS `ademvi06`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = cp850 */;
/*!50001 SET character_set_results     = cp850 */;
/*!50001 SET collation_connection      = cp850_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `ademvi06` AS select `ademvi05`.`IDEMPLEADO` AS `IDEMPLEADO`,`ademvi05`.`NOMBRE` AS `NOMBRE`,`ademvi05`.`APPAT` AS `APPAT`,`ademvi05`.`APPMAT` AS `APPMAT`,`ademvi05`.`DIREC` AS `DIREC`,`ademvi03`.`SUELDO` AS `SUELDO`,`ademvi03`.`EDAD` AS `EDAD` from (`ademvi05` join `ademvi03` on(`ademvi05`.`IDEMPLEADO` = `ademvi03`.`IDEMPLEADO`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `ademvi07`
--

/*!50001 DROP TABLE IF EXISTS `ademvi07`*/;
/*!50001 DROP VIEW IF EXISTS `ademvi07`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = cp850 */;
/*!50001 SET character_set_results     = cp850 */;
/*!50001 SET collation_connection      = cp850_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `ademvi07` AS select `ademvi06`.`IDEMPLEADO` AS `IDEMPLEADO`,`ademvi06`.`NOMBRE` AS `NOMBRE`,`ademvi06`.`APPAT` AS `APPAT`,`ademvi06`.`APPMAT` AS `APPMAT`,`ademvi06`.`DIREC` AS `DIREC`,`ademvi06`.`SUELDO` AS `SUELDO`,`ademvi06`.`EDAD` AS `EDAD`,`ademvi04`.`FECNAC` AS `FECNAC` from (`ademvi06` join `ademvi04` on(`ademvi06`.`IDEMPLEADO` = `ademvi04`.`IDEMPLEADO`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-24 19:47:09
