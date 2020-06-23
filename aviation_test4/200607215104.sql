/*
MySQL Backup
Source Server Version: 8.0.20
Source Database: aviation_test1
Date: 2020/6/7 21:51:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
--  Table structure for `ticket_admin_login_info`
-- ----------------------------
DROP TABLE IF EXISTS `ticket_admin_login_info`;
CREATE TABLE `ticket_admin_login_info` (
  `id` int NOT NULL AUTO_INCREMENT,
  `loginip` varchar(40) NOT NULL,
  `logintime` datetime DEFAULT NULL,
  `logofftime` datetime DEFAULT NULL,
  `user` varchar(40) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `wai8` (`user`),
  CONSTRAINT `wai8` FOREIGN KEY (`user`) REFERENCES `ticket_admin_user` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ticket_admin_user`
-- ----------------------------
DROP TABLE IF EXISTS `ticket_admin_user`;
CREATE TABLE `ticket_admin_user` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `rank` int NOT NULL,
  `realname` varchar(50) DEFAULT NULL,
  `description` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ticket_flight`
-- ----------------------------
DROP TABLE IF EXISTS `ticket_flight`;
CREATE TABLE `ticket_flight` (
  `id` int NOT NULL AUTO_INCREMENT,
  `flightno` varchar(20) NOT NULL,
  `flightcompony` int NOT NULL,
  `starttime` time NOT NULL,
  `endtime` time NOT NULL,
  `start` varchar(10) NOT NULL,
  `destination` varchar(10) NOT NULL,
  `plane` int NOT NULL,
  `price` float NOT NULL,
  `capability` int NOT NULL,
  `firstclass` int NOT NULL,
  `businessclass` int NOT NULL,
  `touristclass` int NOT NULL,
  `startdate` date NOT NULL,
  `enddate` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `wai2` (`flightcompony`),
  KEY `wai3` (`plane`),
  CONSTRAINT `wai2` FOREIGN KEY (`flightcompony`) REFERENCES `ticket_flight_company` (`id`),
  CONSTRAINT `wai3` FOREIGN KEY (`plane`) REFERENCES `ticket_flight_plane` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ticket_flight_company`
-- ----------------------------
DROP TABLE IF EXISTS `ticket_flight_company`;
CREATE TABLE `ticket_flight_company` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `description` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ticket_flight_config`
-- ----------------------------
DROP TABLE IF EXISTS `ticket_flight_config`;
CREATE TABLE `ticket_flight_config` (
  `id` int NOT NULL AUTO_INCREMENT,
  `kiddiscount` float DEFAULT NULL,
  `infantdiscount` float DEFAULT NULL,
  `aerodromefee` int DEFAULT NULL,
  `oilfee` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ticket_flight_info`
-- ----------------------------
DROP TABLE IF EXISTS `ticket_flight_info`;
CREATE TABLE `ticket_flight_info` (
  `id` int NOT NULL AUTO_INCREMENT,
  `date` date NOT NULL,
  `flight` int NOT NULL,
  `cutoff` float DEFAULT NULL,
  `firstclass` int DEFAULT NULL,
  `bussinessclass` int DEFAULT NULL,
  `touristclass` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `wai4` (`flight`),
  CONSTRAINT `wai4` FOREIGN KEY (`flight`) REFERENCES `ticket_flight` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ticket_flight_order`
-- ----------------------------
DROP TABLE IF EXISTS `ticket_flight_order`;
CREATE TABLE `ticket_flight_order` (
  `id` int NOT NULL AUTO_INCREMENT,
  `price` float NOT NULL,
  `tourist` int NOT NULL,
  `flight` int NOT NULL,
  `flight_payinfo` int NOT NULL,
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

-- ----------------------------
--  Table structure for `ticket_flight_payinfo`
-- ----------------------------
DROP TABLE IF EXISTS `ticket_flight_payinfo`;
CREATE TABLE `ticket_flight_payinfo` (
  `id` int NOT NULL AUTO_INCREMENT,
  `payername` varchar(30) NOT NULL,
  `payerphone` varchar(20) NOT NULL,
  `payeremail` varchar(40) DEFAULT NULL,
  `payeraddress` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ticket_flight_plane`
-- ----------------------------
DROP TABLE IF EXISTS `ticket_flight_plane`;
CREATE TABLE `ticket_flight_plane` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `description` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ticket_flight_tourist`
-- ----------------------------
DROP TABLE IF EXISTS `ticket_flight_tourist`;
CREATE TABLE `ticket_flight_tourist` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `type` varchar(50) NOT NULL,
  `nationality` varchar(50) NOT NULL,
  `gender` varchar(5) NOT NULL,
  `cert_name` varchar(50) NOT NULL,
  `cert_no` varchar(50) NOT NULL,
  `insurance` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ticket_help`
-- ----------------------------
DROP TABLE IF EXISTS `ticket_help`;
CREATE TABLE `ticket_help` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(40) NOT NULL,
  `body` varchar(400) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ticket_login`
-- ----------------------------
DROP TABLE IF EXISTS `ticket_login`;
CREATE TABLE `ticket_login` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `userip` varchar(30) NOT NULL,
  `userplatinfor` varchar(50) NOT NULL,
  `userinfor` int DEFAULT NULL,
  `logintime` datetime DEFAULT NULL,
  `logouttime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `wai1` (`username`),
  CONSTRAINT `wai1` FOREIGN KEY (`username`) REFERENCES `ticket_user` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ticket_news`
-- ----------------------------
DROP TABLE IF EXISTS `ticket_news`;
CREATE TABLE `ticket_news` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(30) NOT NULL,
  `body` varchar(400) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ticket_total_info`
-- ----------------------------
DROP TABLE IF EXISTS `ticket_total_info`;
CREATE TABLE `ticket_total_info` (
  `total` int NOT NULL,
  `totalpc` int NOT NULL,
  `totalmobile` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ticket_user`
-- ----------------------------
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

-- ----------------------------
--  Table structure for `zhifu`
-- ----------------------------
DROP TABLE IF EXISTS `zhifu`;
CREATE TABLE `zhifu` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `zhanghu` double(255,0) NOT NULL,
  `orderid` int NOT NULL,
  `zhuangtai` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `username` (`username`),
  KEY `orderid` (`orderid`),
  CONSTRAINT `zhifu_ibfk_1` FOREIGN KEY (`username`) REFERENCES `ticket_user` (`username`),
  CONSTRAINT `zhifu_ibfk_2` FOREIGN KEY (`orderid`) REFERENCES `ticket_flight_order` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records 
-- ----------------------------
INSERT INTO `ticket_admin_login_info` VALUES ('1','1111111','2020-02-29 14:33:56','2020-03-06 14:34:01','qqq'), ('2','2222222','2020-02-17 14:34:30','2020-02-27 14:34:34','qqq');
INSERT INTO `ticket_admin_user` VALUES ('qqq','qqq','1','qqq','qqq');
INSERT INTO `ticket_flight` VALUES ('1','111','1','12:21:12','12:54:55','南宁','长沙','2','222','555','222','111','210','2020-03-24','2020-03-25');
INSERT INTO `ticket_flight_company` VALUES ('1','中国南方航空集团有限公司','中国南方航空集团有限公司（China Southern Airlines，简称南航），总部设在广州');
INSERT INTO `ticket_flight_config` VALUES ('1','0.5','0.7','666','777');
INSERT INTO `ticket_flight_info` VALUES ('1','2020-03-23','1','555','111','222','222');
INSERT INTO `ticket_flight_order` VALUES ('1','666','1','1','1','2020-03-30','55','0.8','2020-04-02');
INSERT INTO `ticket_flight_payinfo` VALUES ('1','444444','777777777777','666666666','滚滚滚');
INSERT INTO `ticket_flight_plane` VALUES ('1','B737-300','波音737系列'), ('2','B747-400F','波i音747系列'), ('3','A319-100','空客320系列');
INSERT INTO `ticket_flight_tourist` VALUES ('1','444','4','yyy','0','uyyyy','yy','ggg');
INSERT INTO `ticket_help` VALUES ('1','飞行前注意事项','旅客拿到机票行程单，请注意查看姓名、航班号、日期是否正确，如有问题应立即联系您的售票代理。另外，购票时可向售票人员询问您所乘坐的机型。'), ('2','飞行中注意事项','南航的飞机头等舱都是从1排开始，经济舱都是从31排开始，如果您选乘宽体机，持有标有字母A-E的登机牌的旅客的座位在左侧通道（机头方向）；');
INSERT INTO `ticket_news` VALUES ('1','针对新型冠状病毒感染疫情的乘机指南',' 为做好新型冠状病毒感染疫情防控工作，保障广大旅客和员工的身体健康，南航已制定了疫情防控措施并严格执行。\r\n\r\n对于近期有出行需求的旅客，我们建议您查阅以下乘机指南（依照中国民航局和海关总署的相关工作要求制定），加强自身防护，确保顺利出行。 '), ('2','南航圆满实现2019安全年','2019年12月31日晚23点35分，由北京飞往广州的南航CZ3100航班平稳降落在广州白云国际机场，标志着南航圆满实现了2019安全运营年。'), ('3','关于6月8日起英国政府调整入境政策的温馨提示','根据英国政府通告，自2020年6月8日（英国时间）起，入境英国的旅客需要提前在英国政府指定的网站上填报行程和联系方式，对不遵守规定的非英国居民，海关工作人员将拒绝其入境');
INSERT INTO `ticket_user` VALUES ('人生如梦','123456789','蒋飞龙','2962735074@qq.com','某天注册','18374815325','湖南省邵阳市','请问他是哪个学校','湖南第一师范学院','湖南','长沙','2020-03-30');
