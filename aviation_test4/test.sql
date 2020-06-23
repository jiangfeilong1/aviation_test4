/*
SQLyog Professional v12.09 (64 bit)
MySQL - 5.7.20-log : Database - aviation_test1
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`aviation_test1` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `aviation_test1`;

/*Table structure for table `ticket_admin_login_info` */

DROP TABLE IF EXISTS `ticket_admin_login_info`;

CREATE TABLE `ticket_admin_login_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `loginip` varchar(40) NOT NULL,
  `logintime` datetime DEFAULT NULL,
  `logofftime` datetime DEFAULT NULL,
  `user` varchar(40) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `wai8` (`user`),
  CONSTRAINT `wai8` FOREIGN KEY (`user`) REFERENCES `ticket_admin_user` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `ticket_admin_login_info` */

insert  into `ticket_admin_login_info`(`id`,`loginip`,`logintime`,`logofftime`,`user`) values (1,'1111111','2020-02-29 14:33:56','2020-03-06 14:34:01','qqq'),(2,'2222222','2020-02-17 14:34:30','2020-02-27 14:34:34','qqq');

/*Table structure for table `ticket_admin_user` */

DROP TABLE IF EXISTS `ticket_admin_user`;

CREATE TABLE `ticket_admin_user` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `rank` int(11) NOT NULL,
  `realname` varchar(50) DEFAULT NULL,
  `description` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ticket_admin_user` */

insert  into `ticket_admin_user`(`username`,`password`,`rank`,`realname`,`description`) values ('qqq','qqq',1,'qqq','qqq');

/*Table structure for table `ticket_flight` */

DROP TABLE IF EXISTS `ticket_flight`;

CREATE TABLE `ticket_flight` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `flightno` varchar(20) NOT NULL,
  `flightcompony` int(11) NOT NULL,
  `starttime` time NOT NULL,
  `endtime` time NOT NULL,
  `start` varchar(10) NOT NULL,
  `destination` varchar(10) NOT NULL,
  `plane` int(11) NOT NULL,
  `price` float NOT NULL,
  `capability` int(11) NOT NULL,
  `firstclass` int(11) NOT NULL,
  `businessclass` int(11) NOT NULL,
  `touristclass` int(11) NOT NULL,
  `startdate` date NOT NULL,
  `enddate` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `wai2` (`flightcompony`),
  KEY `wai3` (`plane`),
  CONSTRAINT `wai2` FOREIGN KEY (`flightcompony`) REFERENCES `ticket_flight_company` (`id`),
  CONSTRAINT `wai3` FOREIGN KEY (`plane`) REFERENCES `ticket_flight_plane` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `ticket_flight` */

insert  into `ticket_flight`(`id`,`flightno`,`flightcompony`,`starttime`,`endtime`,`start`,`destination`,`plane`,`price`,`capability`,`firstclass`,`businessclass`,`touristclass`,`startdate`,`enddate`) values (1,'111',1,'12:21:12','12:54:55','对对对','刚刚好',2,222,333,22,666,666,'2020-03-24','2020-03-25');

/*Table structure for table `ticket_flight_company` */

DROP TABLE IF EXISTS `ticket_flight_company`;

CREATE TABLE `ticket_flight_company` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `description` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `ticket_flight_company` */

insert  into `ticket_flight_company`(`id`,`name`,`description`) values (1,'湖南航空公司滚滚滚','哈哈哈哈哈哈滚滚滚');

/*Table structure for table `ticket_flight_config` */

DROP TABLE IF EXISTS `ticket_flight_config`;

CREATE TABLE `ticket_flight_config` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kiddiscount` float DEFAULT NULL,
  `infantdiscount` float DEFAULT NULL,
  `aerodromefee` int(11) DEFAULT NULL,
  `oilfee` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `ticket_flight_config` */

insert  into `ticket_flight_config`(`id`,`kiddiscount`,`infantdiscount`,`aerodromefee`,`oilfee`) values (1,0.5,0.7,666,777);

/*Table structure for table `ticket_flight_info` */

DROP TABLE IF EXISTS `ticket_flight_info`;

CREATE TABLE `ticket_flight_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` date NOT NULL,
  `flight` int(11) NOT NULL,
  `cutoff` float DEFAULT NULL,
  `firstclass` int(11) DEFAULT NULL,
  `bussinessclass` int(11) DEFAULT NULL,
  `touristclass` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `wai4` (`flight`),
  CONSTRAINT `wai4` FOREIGN KEY (`flight`) REFERENCES `ticket_flight` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `ticket_flight_info` */

insert  into `ticket_flight_info`(`id`,`date`,`flight`,`cutoff`,`firstclass`,`bussinessclass`,`touristclass`) values (1,'2020-03-23',1,555,111,222,222);

/*Table structure for table `ticket_flight_order` */

DROP TABLE IF EXISTS `ticket_flight_order`;

CREATE TABLE `ticket_flight_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `price` float NOT NULL,
  `tourist` int(11) NOT NULL,
  `flight` int(11) NOT NULL,
  `flight_payinfo` int(11) NOT NULL,
  `orderdate` date NOT NULL,
  `cabin` varchar(10) DEFAULT NULL,
  `cutoff` float DEFAULT NULL,
  `orderdisposetime` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `wai5` (`tourist`),
  KEY `wai6` (`flight`),
  KEY `wai7` (`flight_payinfo`),
  CONSTRAINT `wai5` FOREIGN KEY (`tourist`) REFERENCES `ticket_flight_tourist` (`id`),
  CONSTRAINT `wai6` FOREIGN KEY (`flight`) REFERENCES `ticket_flight` (`id`),
  CONSTRAINT `wai7` FOREIGN KEY (`flight_payinfo`) REFERENCES `ticket_flight_payinfo` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `ticket_flight_order` */



/*Table structure for table `ticket_flight_payinfo` */

DROP TABLE IF EXISTS `ticket_flight_payinfo`;
insert  into `ticket_flight_order`(`id`,`price`,`tourist`,`flight`,`flight_payinfo`,`orderdate`,`cabin`,`cutoff`,`orderdisposetime`) values (1,666,1,1,1,'2020-03-30','55',0.8,'2020-04-02');
CREATE TABLE `ticket_flight_payinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `payername` varchar(30) NOT NULL,
  `payerphone` varchar(20) NOT NULL,
  `payeremail` varchar(40) DEFAULT NULL,
  `payeraddress` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `ticket_flight_payinfo` */

insert  into `ticket_flight_payinfo`(`id`,`payername`,`payerphone`,`payeremail`,`payeraddress`) values (1,'444444','777777777777','666666666','滚滚滚');

/*Table structure for table `ticket_flight_plane` */

DROP TABLE IF EXISTS `ticket_flight_plane`;

CREATE TABLE `ticket_flight_plane` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `description` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `ticket_flight_plane` */

insert  into `ticket_flight_plane`(`id`,`name`,`description`) values (1,'22222','哈哈哈哈哈哈哈哈哈哈或或或或或或或'),(2,'333','将集结就军军军军军军军军'),(3,'33','88888888888888');

/*Table structure for table `ticket_flight_tourist` */

DROP TABLE IF EXISTS `ticket_flight_tourist`;

CREATE TABLE `ticket_flight_tourist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `type` varchar(50) NOT NULL,
  `nationality` varchar(50) NOT NULL,
  `gender` varchar(5) NOT NULL,
  `cert_name` varchar(50) NOT NULL,
  `cert_no` varchar(50) NOT NULL,
  `insurance` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `ticket_flight_tourist` */

insert  into `ticket_flight_tourist`(`id`,`name`,`type`,`nationality`,`gender`,`cert_name`,`cert_no`,`insurance`) values (1,'444','4','yyy','0','uyyyy','yy','ggg');

/*Table structure for table `ticket_help` */

DROP TABLE IF EXISTS `ticket_help`;

CREATE TABLE `ticket_help` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(40) NOT NULL,
  `body` varchar(400) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `ticket_help` */

insert  into `ticket_help`(`id`,`title`,`body`) values (1,'eeee','iiiiii'),(2,'人人人人人','iiiiiiii');

/*Table structure for table `ticket_login` */

DROP TABLE IF EXISTS `ticket_login`;

CREATE TABLE `ticket_login` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `userip` varchar(30) NOT NULL,
  `userplatinfor` varchar(50) NOT NULL,
  `userinfor` int(11) DEFAULT NULL,
  `logintime` datetime DEFAULT NULL,
  `logouttime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `wai1` (`username`),
  CONSTRAINT `wai1` FOREIGN KEY (`username`) REFERENCES `ticket_user` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ticket_login` */

/*Table structure for table `ticket_news` */

DROP TABLE IF EXISTS `ticket_news`;

CREATE TABLE `ticket_news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(30) NOT NULL,
  `body` varchar(400) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `ticket_news` */

insert  into `ticket_news`(`id`,`title`,`body`) values (1,'444','人人人人人若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若'),(2,'333','人人人人人若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若若');

/*Table structure for table `ticket_total_info` */

DROP TABLE IF EXISTS `ticket_total_info`;

CREATE TABLE `ticket_total_info` (
  `total` int(11) NOT NULL,
  `totalpc` int(11) NOT NULL,
  `totalmobile` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ticket_total_info` */

/*Table structure for table `ticket_user` */

DROP TABLE IF EXISTS `ticket_user`;

CREATE TABLE `ticket_user` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `realname` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  `phone` varchar(20) NOT NULL,
  `address` varchar(50) DEFAULT NULL,
  `question` varchar(100) NOT NULL,
  `answer` varchar(100) NOT NULL,
  `province` varchar(50) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `regdate` date DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ticket_user` */

insert  into `ticket_user`(`username`,`password`,`realname`,`email`,`description`,`phone`,`address`,`question`,`answer`,`province`,`city`,`regdate`) values ('11111','8888888','ggg','555555','uuuuu','888888','88888','88888','99999','ii','iii','2020-03-30');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
