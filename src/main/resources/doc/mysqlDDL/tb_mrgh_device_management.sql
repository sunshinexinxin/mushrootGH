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

 Date: 08/07/2018 10:40:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_mrgh_device_management
-- ----------------------------
DROP TABLE IF EXISTS `tb_mrgh_device_management`;
CREATE TABLE `tb_mrgh_device_management` (
  `device_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '设备编号',
  `device_name` varchar(32) DEFAULT NULL COMMENT '设备名称',
  `mush_base_id` varchar(32) DEFAULT NULL COMMENT '基地编号',
  `mush_base_name` varchar(32) DEFAULT NULL COMMENT '基地名称',
  `mushRoom_id` varchar(32) DEFAULT NULL COMMENT '大棚编号',
  `mushRoom_name` varchar(32) DEFAULT NULL COMMENT '大棚名称',
  `installer_id` varchar(32) DEFAULT NULL COMMENT '安装人员编号',
  `installer_name` varchar(32) DEFAULT NULL COMMENT '安装人员姓名',
  `installer_phone` varchar(32) DEFAULT NULL COMMENT '安装人员联系方式',
  `installer_time` varchar(32) DEFAULT NULL COMMENT '安装时间',
  `maintenance_id` varchar(32) DEFAULT NULL COMMENT '维护人员id',
  `maintenance_name` varchar(32) DEFAULT NULL COMMENT '维护人员姓名',
  `maintenance_phone` varchar(32) DEFAULT NULL COMMENT '维护人员联系方式',
  `del_flag` varchar(16) NOT NULL COMMENT '删除标识.初始为0;删除为1',
  `memo` varchar(32) DEFAULT NULL COMMENT '备注',
  `ctime` varchar(32) DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`device_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

SET FOREIGN_KEY_CHECKS = 1;
