/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50133
Source Host           : localhost:3306
Source Database       : school

Target Server Type    : MYSQL
Target Server Version : 50133
File Encoding         : 65001

Date: 2013-10-31 08:49:38
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO role VALUES ('1', '管理员');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO user VALUES ('1', 'admin', '123456', '44', null);
INSERT INTO user VALUES ('2', 'boya', '123456', null, null);
INSERT INTO user VALUES ('3', 'boya', '123456', null, null);
INSERT INTO user VALUES ('4', 'abc', 'ddddd', null, null);
INSERT INTO user VALUES ('5', 'asd', 'ddd', null, null);
INSERT INTO user VALUES ('8', 'abc', 'abc', null, null);
INSERT INTO user VALUES ('10', 'abc', 'abc', null, null);
INSERT INTO user VALUES ('11', 'abc', 'abc', null, null);
INSERT INTO user VALUES ('12', 'abc', 'abc', null, null);
INSERT INTO user VALUES ('13', 'abc', 'abc', null, null);
INSERT INTO user VALUES ('14', 'abc', 'abc', null, null);
INSERT INTO user VALUES ('15', 'abc', 'abc', null, null);
INSERT INTO user VALUES ('19', 'tttttt', 'tttt', null, null);
