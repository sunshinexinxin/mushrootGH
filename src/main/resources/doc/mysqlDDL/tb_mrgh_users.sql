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

 Date: 08/07/2018 10:41:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_mrgh_users
-- ----------------------------
DROP TABLE IF EXISTS `tb_mrgh_users`;
CREATE TABLE `tb_mrgh_users` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(32) DEFAULT NULL COMMENT '用户姓名',
  `user_age` varchar(32) DEFAULT NULL COMMENT '用户年龄',
  `user_psd` varchar(32) DEFAULT NULL COMMENT '用户密码',
  `user_phone` varchar(32) DEFAULT NULL COMMENT '用户联系方式',
  `user_add` varchar(32) DEFAULT NULL COMMENT '用户地址',
  `status` varchar(32) DEFAULT NULL COMMENT '用户身份标识.0:开发测试;1:普通用户;2:管理员',
  `del_flag` varchar(32) DEFAULT '0' COMMENT '删除标识.初始为0;删除为1',
  `memo` varchar(32) DEFAULT NULL COMMENT '备注',
  `ctime` varchar(32) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22010108 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_mrgh_users
-- ----------------------------
BEGIN;
INSERT INTO `tb_mrgh_users` VALUES (22010001, 'test0', '25', 'e10adc3949ba59abbe56e057f20f883e', '13028698635', '河北石家庄众鑫大厦', '0', '0', '开发测试-测试岗', '2017-11-29 21:20:49');
INSERT INTO `tb_mrgh_users` VALUES (22010002, 'test1', '25', 'e10adc3949ba59abbe56e057f20f883e', '13028698635', '河北科技大学', '1', '0', '开发测试-普通用户', '2017-11-29 21:20:49');
INSERT INTO `tb_mrgh_users` VALUES (22010003, 'test2', '25', 'e10adc3949ba59abbe56e057f20f883e', '13028698600', '建设大街1103号', '2', '0', '开发测试-管理员', '2017-11-29 21:20:49');
INSERT INTO `tb_mrgh_users` VALUES (22010004, 'test3', '25', 'e10adc3949ba59abbe56e057f20f883e', '13028698635', '河北科技大学', '1', '0', '开发测试-普通用户', '2017-11-29 21:20:49');
INSERT INTO `tb_mrgh_users` VALUES (22010106, '11', '11', '6512bd43d9caa6e02c990b0a82652dca', '13028698635', '13028698635', '1', '0', '13028698635', '2017-11-29 21:20:49');
INSERT INTO `tb_mrgh_users` VALUES (22010107, 'test4', '11', 'e10adc3949ba59abbe56e057f20f883e', '13028698635', '开发测试-普通用户', '0', '0', '开发测试-普通用户', '2017-11-29 22:24:24');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
