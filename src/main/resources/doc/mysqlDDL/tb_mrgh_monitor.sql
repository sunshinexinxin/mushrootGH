/*
 Navicat Premium Data Transfer

 Source Server         : root@localhost
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : 127.0.0.1:3306
 Source Schema         : graduate

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001

 Date: 08/07/2018 10:40:48
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_mrgh_monitor
-- ----------------------------
DROP TABLE IF EXISTS `tb_mrgh_monitor`;
CREATE TABLE `tb_mrgh_monitor` (
  `mushroom_pointid` int(11) NOT NULL AUTO_INCREMENT COMMENT '大棚编号,如001;002',
  `mushroom_name` varchar(32) NOT NULL COMMENT '蘑菇大棚的名字 如:001号大棚;002号大棚',
  `user_id` varchar(32) DEFAULT NULL COMMENT '大棚负责人id',
  `mushroom_desc` varchar(128) DEFAULT NULL COMMENT '大棚的描述信息',
  `mushroom_status` int(11) DEFAULT NULL COMMENT '大棚监控状态,0：非监控;1:监控中',
  `mushroom_long` varchar(32) DEFAULT NULL COMMENT '大棚的经度',
  `mushroom_lat` varchar(32) DEFAULT NULL COMMENT '大棚的纬度',
  `mushroom_length` varchar(32) DEFAULT NULL COMMENT '大棚的长度',
  `mushroom_width` varchar(32) DEFAULT NULL COMMENT '大棚的宽度',
  `mushroom_area` varchar(32) DEFAULT NULL COMMENT '大棚的面积',
  `del_flag` varchar(32) DEFAULT NULL COMMENT '删除标识.初始为0;删除为1',
  `memo` varchar(32) DEFAULT NULL COMMENT '备注',
  `ctime` varchar(32) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`mushroom_pointid`)
) ENGINE=InnoDB AUTO_INCREMENT=21008 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_mrgh_monitor
-- ----------------------------
BEGIN;
INSERT INTO `tb_mrgh_monitor` VALUES (21001, '1号基地', '22010001', '我是一个基地', 1, '114.2010280000', '38.8550600000', '30', '5', '150', '0', '我是备注', '2017-11-29 21:20:49');
INSERT INTO `tb_mrgh_monitor` VALUES (21002, '2号基地', '22010001', '我是一个基地', 1, '114.1999860000', '38.8543850000', '30', '5', '150', '0', '我是备注', '2017-11-29 21:20:49');
INSERT INTO `tb_mrgh_monitor` VALUES (21003, '3号基地', '22010001', '我是一个基地', 1, '114.2007760000', '38.8508730000', '30', '5', '150', '0', '我是备注', '2017-11-29 21:20:49');
INSERT INTO `tb_mrgh_monitor` VALUES (21004, '4号基地', '22010002', '我是一个基地', 1, '114.2007750000', '38.8508730000', '30', '5', '150', '0', '我是备注', '2017-11-29 21:20:49');
INSERT INTO `tb_mrgh_monitor` VALUES (21005, '5号基地', '22010002', '我是一个基地', 1, '114.2001700000', '38.8508770000', '30', '5', '150', '0', '我是备注', '2017-11-29 21:20:49');
INSERT INTO `tb_mrgh_monitor` VALUES (21006, '6号基地', '22010003', '我是一个基地', 1, '114.2004760000', '38.8502730000', '30', '5', '150', '0', '我是备注', '2017-11-29 21:20:49');
INSERT INTO `tb_mrgh_monitor` VALUES (21007, '7号基地', '22010003', '我是一个基地', 1, '114.2006760000', '38.8506730000', '30', '5', '150', '0', '我是备注', '2017-11-29 21:20:49');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
