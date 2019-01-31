/*
Navicat MySQL Data Transfer

Source Server         : keshe
Source Server Version : 50173
Source Host           : localhost:3306
Source Database       : jxc

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2018-12-25 11:33:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `cId` int(11) NOT NULL,
  `cName` varchar(255) DEFAULT NULL,
  `cContacts` varchar(255) DEFAULT NULL,
  `cAdress` varchar(255) DEFAULT NULL,
  `cPhone` varchar(255) DEFAULT NULL,
  `cEmal` varchar(255) DEFAULT NULL,
  `cMoney` int(11) DEFAULT NULL,
  `cBackCard` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cId`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('1001', '安踏', '111', '甘肃', '1000000', '1212@qq.com', '200', '12312');
INSERT INTO `customer` VALUES ('1002', '李宁', '222', '兰州', '120120120120', '3434@qq.com', '0', '454545454');
INSERT INTO `customer` VALUES ('1003', '鸿星尔克', '333', '甘肃', '11111111111', '111@qq.com', '20', '123321321');
INSERT INTO `customer` VALUES ('1004', '特步', '444', '兰州', '11211', '212121', '0', '213123123');
INSERT INTO `customer` VALUES ('1005', '啊', '555', '45', '4545655', '546456', '546', '546546456456');
INSERT INTO `customer` VALUES ('2222', '李明', '李明', '撒地方', '21312', '1231', '21312', '21312');

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `gId` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `pinpai` varchar(255) DEFAULT NULL,
  `gongying` varchar(255) DEFAULT NULL,
  `size` varchar(255) DEFAULT NULL,
  `kuanshi` varchar(255) DEFAULT NULL,
  `color` varchar(255) DEFAULT NULL,
  `mianliao` varchar(255) DEFAULT NULL,
  `baozhuang` varchar(255) DEFAULT NULL,
  `kucun` int(11) DEFAULT NULL,
  `jinjia` int(11) DEFAULT NULL,
  PRIMARY KEY (`gId`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1158', '的风格', '的说法', '123', 'S', '梵蒂冈', '发的个', '地方g', '袋装', '12', '1212');
INSERT INTO `goods` VALUES ('1377', '1221', '1212', '安踏', 'M', '1212', '21212', '212121', '礼品包装', '211', '12');
INSERT INTO `goods` VALUES ('2001', '裤子', '哈哈', '哈哈', '哈哈', '哈哈', '哈哈', '哈哈', '哈哈', '78', '20');
INSERT INTO `goods` VALUES ('2002', '上衣', '呵呵', '呵呵', '呵呵', '呵呵', '呵呵', '呵呵', '呵呵', '0', '50');
INSERT INTO `goods` VALUES ('2793', '123213', '123213', '123', 'S', '2133', '213123', '3213123', '袋装', '123', '213');
INSERT INTO `goods` VALUES ('3271', 'T', '撒旦', '李明', 'M', '撒旦', '倒萨', '11', '礼品包装', '20', '10');
INSERT INTO `goods` VALUES ('3544', 'T', '撒旦', '李明', 'M', '撒旦', '倒萨', '11', '礼品包装', '20', '10');
INSERT INTO `goods` VALUES ('4372', '5464545', '456456', '456', 'S', '6456', '456456', '54645', '盒装', '456', '456');
INSERT INTO `goods` VALUES ('5112', '1111', '123', '123', 'S', '1111', '1111', '1111', '袋装', '1111', '111');
INSERT INTO `goods` VALUES ('8354', '1323', '123', '123', 'S', '213123', '123', '213', '袋装', '123', '123');

-- ----------------------------
-- Table structure for orderr
-- ----------------------------
DROP TABLE IF EXISTS `orderr`;
CREATE TABLE `orderr` (
  `id` int(11) NOT NULL,
  `cId` int(11) NOT NULL,
  `gId` int(11) NOT NULL,
  `wId` int(11) NOT NULL,
  `number` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `reason` varchar(255) DEFAULT NULL,
  `oTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`,`cId`,`gId`,`wId`),
  KEY `g` (`gId`),
  KEY `w` (`wId`),
  KEY `c` (`cId`),
  CONSTRAINT `c` FOREIGN KEY (`cId`) REFERENCES `customer` (`cId`),
  CONSTRAINT `g` FOREIGN KEY (`gId`) REFERENCES `goods` (`gId`),
  CONSTRAINT `w` FOREIGN KEY (`wId`) REFERENCES `waiter` (`wId`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of orderr
-- ----------------------------
INSERT INTO `orderr` VALUES ('456', '1002', '1377', '3002', '456456', '456', '456', '456', null);
INSERT INTO `orderr` VALUES ('1546', '1001', '2001', '3001', '1', '456', '456', '出库', '2018-07-02 13:04:19');
INSERT INTO `orderr` VALUES ('2284', '1001', '3271', '3002', '10', '20', '200', '出库', '2018-07-03 15:21:50');
INSERT INTO `orderr` VALUES ('3511', '2222', '3271', '3002', '30', '10', '300', '222', '2018-07-03 15:19:51');
INSERT INTO `orderr` VALUES ('4002', '1001', '2001', '3002', '50', '20', '1000', '入库', '2018-06-28 12:53:37');
INSERT INTO `orderr` VALUES ('4003', '1002', '2001', '3001', '20', '20', '400', '出库', '2018-06-30 12:54:13');
INSERT INTO `orderr` VALUES ('5089', '1001', '2793', '3001', '123', '213', '26199', '222', '2018-07-02 12:44:01');
INSERT INTO `orderr` VALUES ('6646', '2222', '3544', '3002', '20', '10', '200', '222', '2018-07-03 15:19:29');
INSERT INTO `orderr` VALUES ('7286', '1001', '2001', '3002', '10', '20', '200', '出库', '2018-07-03 15:05:41');
INSERT INTO `orderr` VALUES ('7658', '1001', '2001', '3002', '10', '20', '200', '出库', '2018-07-03 15:06:02');
INSERT INTO `orderr` VALUES ('8764', '1001', '1158', '3002', '12', '1212', '14544', '222', '2018-07-03 14:54:51');

-- ----------------------------
-- Table structure for waiter
-- ----------------------------
DROP TABLE IF EXISTS `waiter`;
CREATE TABLE `waiter` (
  `wId` int(11) NOT NULL,
  `wName` varchar(255) DEFAULT NULL,
  `wPass` varchar(255) DEFAULT NULL,
  `wPhone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`wId`),
  KEY `wId` (`wId`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of waiter
-- ----------------------------
INSERT INTO `waiter` VALUES ('3001', '白宝宝', '222', '123123123123');
INSERT INTO `waiter` VALUES ('3002', '李俊杰', '111111', '11111111111');
INSERT INTO `waiter` VALUES ('5555', '20', '男', '100');
INSERT INTO `waiter` VALUES ('9999', '9999', '9999', '9999');
