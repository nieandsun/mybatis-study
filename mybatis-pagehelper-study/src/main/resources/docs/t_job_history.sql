/*
Navicat MySQL Data Transfer

Source Server         : 本机
Source Server Version : 80013
Source Host           : localhost:3306
Source Database       : mybatis-study

Target Server Type    : MYSQL
Target Server Version : 80013
File Encoding         : 65001

Date: 2020-01-18 23:45:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_job_history
-- ----------------------------
DROP TABLE IF EXISTS `t_job_history`;
CREATE TABLE `t_job_history` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` bigint(11) NOT NULL COMMENT '用户id，与t_user表的id相对应，真实开发中应该很少这么干',
  `company_name` varchar(100) DEFAULT NULL,
  `years` int(3) DEFAULT NULL COMMENT '工作年限',
  `title` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_job_history
-- ----------------------------
INSERT INTO `t_job_history` VALUES ('1', '1', '阿里', '2', '程序员');
INSERT INTO `t_job_history` VALUES ('2', '2', '百度', '4', '项目经理');
INSERT INTO `t_job_history` VALUES ('3', '2', '腾讯', '1', '程序员');
INSERT INTO `t_job_history` VALUES ('4', '3', '京东', '1', '测试');
INSERT INTO `t_job_history` VALUES ('5', '4', '网易', '2', '测试主管');
INSERT INTO `t_job_history` VALUES ('6', '4', '苏宁', '3', '测试主管');
INSERT INTO `t_job_history` VALUES ('7', '4', '头条', '2', '程序猿');
