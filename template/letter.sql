/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50612
Source Host           : localhost:3306
Source Database       : tjutwwxscs

Target Server Type    : MYSQL
Target Server Version : 50612
File Encoding         : 65001

Date: 2014-09-12 09:50:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for letter
-- ----------------------------
DROP TABLE IF EXISTS `letter`;
CREATE TABLE `letter` (
  `lid` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `receiver` varchar(20) NOT NULL,
  `sender` varchar(20) DEFAULT NULL,
  `senderaddr` varchar(50) DEFAULT NULL,
  `time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `status` int(11) unsigned NOT NULL DEFAULT '1' COMMENT '1：信件在团委 2：信件已取',
  PRIMARY KEY (`lid`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of letter
-- ----------------------------
INSERT INTO `letter` VALUES ('0000000001', 'catold', 'who', '山西', '2014-07-21 00:00:00', '2');
INSERT INTO `letter` VALUES ('0000000013', '李鸣瀚', '啊', '啊', '2014-08-11 11:23:36', '1');
INSERT INTO `letter` VALUES ('0000000016', '崔晨晖啊', '包扬', '天津大学', '2014-08-07 18:29:22', '1');
INSERT INTO `letter` VALUES ('0000000019', '我是来测试的啊', '测试的', '呵呵', '2014-08-07 18:29:21', '1');
INSERT INTO `letter` VALUES ('0000000020', '逗死我了啊', '真逗', '啊', '2014-08-07 18:29:20', '1');
INSERT INTO `letter` VALUES ('0000000022', '嘻嘻哈哈哈啊', '额', 'sb', '2014-08-07 18:29:19', '1');
INSERT INTO `letter` VALUES ('0000000025', '坑', '', '', '2014-07-24 10:16:56', '1');
INSERT INTO `letter` VALUES ('0000000026', '包扬', '', '', '2014-07-24 10:17:02', '1');
INSERT INTO `letter` VALUES ('0000000030', '空空空', '上面是手写的。。。', '空', '2014-07-24 10:19:58', '1');
INSERT INTO `letter` VALUES ('0000000032', 'nihao', 'nihao', 'niaho', '2014-07-25 14:24:23', '1');
INSERT INTO `letter` VALUES ('0000000033', 'daye', 'qugba', 'ajsldfjsa', '2014-07-25 14:24:31', '1');
INSERT INTO `letter` VALUES ('0000000034', '啊', '啊', '啊', '2014-07-29 15:44:48', '1');
INSERT INTO `letter` VALUES ('0000000035', '啊', '啊', '啊', '2014-07-29 15:53:45', '1');
INSERT INTO `letter` VALUES ('0000000036', 'test', 'tst', '', '2014-07-29 15:55:13', '1');
INSERT INTO `letter` VALUES ('0000000038', '啊', '啊', '', '2014-08-07 17:06:59', '2');
INSERT INTO `letter` VALUES ('0000000039', '金强国啊', '哈哈', '卫津路92号', '2014-08-07 18:29:23', '1');
INSERT INTO `letter` VALUES ('0000000040', '哈哈啊', '阿斯蒂芬', '速度', '2014-08-07 18:29:24', '1');
INSERT INTO `letter` VALUES ('0000000041', '撒旦法啊', '苏大', '速度', '2014-08-07 18:29:24', '1');
INSERT INTO `letter` VALUES ('0000000042', 'a', 'a', '', '2014-08-19 11:04:13', '1');
INSERT INTO `letter` VALUES ('0000000043', '金强国', '', '', '2014-08-19 11:04:23', '1');
INSERT INTO `letter` VALUES ('0000000044', '擦擦擦擦擦擦擦', '啊', '', '2014-08-19 11:20:39', '1');
