/*
Navicat MySQL Data Transfer

Source Server         : 本机
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : mybatis-study

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2020-01-14 19:53:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_salary
-- ----------------------------
DROP TABLE IF EXISTS `t_salary`;
CREATE TABLE `t_salary` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名，实际项目里应该会用员工编号',
  `base_salary` decimal(10,2) DEFAULT NULL COMMENT '基本工资',
  `post_salary` decimal(10,2) DEFAULT NULL COMMENT '岗位工资',
  `meal_allowance` decimal(10,2) DEFAULT NULL COMMENT '餐补',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_salary
-- ----------------------------
INSERT INTO `t_salary` VALUES ('1', 'yoyo', '2000.00', '8000.00', '200.00');
INSERT INTO `t_salary` VALUES ('2', 'nrsc', '1500.00', '700.00', '20.00');
INSERT INTO `t_salary` VALUES ('3', 'lucy', '2500.00', '8888.00', '88.00');
INSERT INTO `t_salary` VALUES ('4', 'james', '1000.00', '1000.00', '100.00');
