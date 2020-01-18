/*
Navicat MySQL Data Transfer

Source Server         : 本机
Source Server Version : 80013
Source Host           : localhost:3306
Source Database       : mybatis-study

Target Server Type    : MYSQL
Target Server Version : 80013
File Encoding         : 65001

Date: 2020-01-18 23:46:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `user_name` varchar(60) DEFAULT NULL COMMENT '用户名称',
  `real_name` varchar(60) DEFAULT NULL COMMENT '真实名称',
  `sex` tinyint(3) DEFAULT NULL COMMENT '姓名',
  `mobile` varchar(20) DEFAULT NULL COMMENT '电话',
  `email` varchar(60) DEFAULT NULL COMMENT '邮箱',
  `note` varchar(200) DEFAULT NULL COMMENT '备注',
  `position_id` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'yoyo', '李雷', '1', '13300000000', 'yoyo@qq.com', 'yoyo的备注', '1');
INSERT INTO `t_user` VALUES ('2', 'nrsc', '韩梅梅', '2', '13300000001', 'nrsc@qq.com', 'nrsc的备注', '2');
INSERT INTO `t_user` VALUES ('3', 'lucy', '露西', '2', '13300000002', 'lucy@163.com', 'lucy的备注', '1');
INSERT INTO `t_user` VALUES ('4', 'james', '詹姆斯', '1', '13300000003', 'james@163.com', 'james的备注', '1');
