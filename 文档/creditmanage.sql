/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50612
Source Host           : localhost:3306
Source Database       : creditmanage

Target Server Type    : MYSQL
Target Server Version : 50612
File Encoding         : 65001

Date: 2014-09-09 10:04:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(10) NOT NULL,
  `passwd` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------

-- ----------------------------
-- Table structure for `advertisement`
-- ----------------------------
DROP TABLE IF EXISTS `advertisement`;
CREATE TABLE `advertisement` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adid` varchar(20) NOT NULL,
  `imgurl` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of advertisement
-- ----------------------------

-- ----------------------------
-- Table structure for `credit`
-- ----------------------------
DROP TABLE IF EXISTS `credit`;
CREATE TABLE `credit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `credit` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of credit
-- ----------------------------

-- ----------------------------
-- Table structure for `orderlist`
-- ----------------------------
DROP TABLE IF EXISTS `orderlist`;
CREATE TABLE `orderlist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `orderlistid` varchar(20) NOT NULL,
  `paserviceid` varchar(20) NOT NULL,
  `username` varchar(20) NOT NULL,
  `ordertime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `status` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orderlist
-- ----------------------------

-- ----------------------------
-- Table structure for `paservice`
-- ----------------------------
DROP TABLE IF EXISTS `paservice`;
CREATE TABLE `paservice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `paserviceinfoid` varchar(20) NOT NULL,
  `paserviceid` varchar(20) NOT NULL,
  `type` varchar(20) NOT NULL,
  `tag1` varchar(20) NOT NULL,
  `leftnum` int(11) NOT NULL,
  `amount` int(11) NOT NULL,
  `creditcost` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of paservice
-- ----------------------------

-- ----------------------------
-- Table structure for `paserviceinfo`
-- ----------------------------
DROP TABLE IF EXISTS `paserviceinfo`;
CREATE TABLE `paserviceinfo` (
  `paserviceinfoid` int(11) NOT NULL AUTO_INCREMENT,
  `imgurl` varchar(255) DEFAULT NULL,
  `tag1` varchar(255) NOT NULL,
  `tag2` varchar(255) DEFAULT NULL,
  `tag3` varchar(255) DEFAULT NULL,
  `tag4` varchar(255) NOT NULL,
  `tag5` varchar(255) NOT NULL,
  `servicestart` datetime DEFAULT NULL,
  `serviceend` datetime DEFAULT NULL,
  PRIMARY KEY (`paserviceinfoid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of paserviceinfo
-- ----------------------------

-- ----------------------------
-- Table structure for `shopinfo`
-- ----------------------------
DROP TABLE IF EXISTS `shopinfo`;
CREATE TABLE `shopinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `shopid` varchar(20) NOT NULL,
  `paserviceinfoid` varchar(20) NOT NULL,
  `name` varchar(255) NOT NULL,
  `location` varchar(255) DEFAULT NULL,
  `xpos` double DEFAULT NULL,
  `ypos` double DEFAULT NULL,
  `interf` varchar(255) DEFAULT NULL,
  `tag1` varchar(20) NOT NULL,
  `tag2` varchar(20) DEFAULT NULL,
  `con` varchar(11) DEFAULT NULL,
  `status` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shopinfo
-- ----------------------------

-- ----------------------------
-- Table structure for `shopuser`
-- ----------------------------
DROP TABLE IF EXISTS `shopuser`;
CREATE TABLE `shopuser` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `shopid` varchar(20) NOT NULL,
  `username` varchar(20) NOT NULL,
  `passwd` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shopuser
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `passwd` varchar(20) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `con` varchar(11) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `regtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `premium` double DEFAULT NULL,
  `insured` varchar(20) DEFAULT NULL,
  `carowner` varchar(20) DEFAULT NULL,
  `factory` varchar(20) DEFAULT NULL,
  `cartype` varchar(20) DEFAULT NULL,
  `carnumber` varchar(20) DEFAULT NULL,
  `starttime` datetime DEFAULT NULL,
  `endtime` datetime DEFAULT NULL,
  `mobilephone` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
