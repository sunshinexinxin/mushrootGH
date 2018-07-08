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

 Date: 08/07/2018 10:40:30
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_mrgh_data_acquisition
-- ----------------------------
DROP TABLE IF EXISTS `tb_mrgh_data_acquisition`;
CREATE TABLE `tb_mrgh_data_acquisition` (
  `idno` int(11) NOT NULL AUTO_INCREMENT,
  `mushroom_pointid` varchar(32) NOT NULL,
  `mushroom_airtemp` varchar(16) NOT NULL,
  `mushroom_airhumidity` varchar(16) NOT NULL,
  `mushroom_soiltemp` varchar(16) NOT NULL,
  `mushroom_soilmoisture` varchar(16) NOT NULL,
  `mushroom_ightintensity` varchar(16) NOT NULL,
  `mushroom_co2densuty` varchar(16) NOT NULL,
  `memo` varchar(32) DEFAULT NULL,
  `ctime` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`idno`)
) ENGINE=InnoDB AUTO_INCREMENT=1073 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_mrgh_data_acquisition
-- ----------------------------
BEGIN;
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1001, '00004', '10.8', '10.8', '30.49', '41.29', '49.22', '42.62', 'test', '20170409234110');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1002, '00007', '16.91', '12.9', '21.01', '13.27', '44.98', '33.03', 'test', '20170409234114');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1003, '00035', '35.22', '32.4', '13.61', '37.44', '24.46', '16.06', 'test', '20170409234117');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1004, '00013', '16.4', '43.58', '34.63', '22.91', '46.2', '33.53', 'test', '20170409234120');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1005, '00030', '35.43', '39.33', '13.48', '20.89', '35.07', '10.91', 'test', '20170409234123');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1006, '00037', '28.51', '34.54', '16.36', '17.36', '13.06', '33.03', 'test', '20170409234126');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1007, '00010', '12.12', '24.62', '18.62', '12.66', '33.62', '16.64', 'test', '20170409234129');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1008, '00003', '36.04', '34.63', '5.16', '33.17', '10.0', '14.58', 'test', '20170409234132');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1010, '00020', '30.29', '46.76', '13.25', '49.38', '45.47', '38.46', 'test', '20170409234138');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1012, '00020', '14.12', '17.73', '29.64', '20.79', '48.81', '27.78', 'test', '20170409234144');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1013, '00005', '33.89', '37.5', '11.82', '35.06', '43.21', '50.65', 'test', '20170409234147');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1014, '00024', '15.46', '14.71', '23.93', '32.55', '48.62', '11.5', 'test', '20170409234150');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1015, '00005', '10.27', '30.54', '36.67', '39.25', '15.16', '41.15', 'test', '20170409234153');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1016, '00009', '17.55', '47.47', '27.29', '23.57', '28.25', '39.14', 'test', '20170409234156');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1017, '00031', '10.66', '27.17', '14.55', '12.89', '40.0', '25.55', 'test', '20170409234159');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1018, '00011', '10.07', '16.98', '26.14', '35.21', '11.26', '44.62', 'test', '20170409234202');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1019, '00031', '44.64', '43.3', '32.71', '33.61', '18.7', '29.26', 'test', '20170409234205');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1020, '00033', '0.61', '30.72', '14.42', '13.67', '45.68', '11.9', 'test', '20170409234208');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1021, '00013', '0.19', '45.26', '12.71', '15.0', '12.0', '10.87', 'test', '20170409234211');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1022, '00002', '33.52', '13.08', '13.06', '46.55', '16.43', '13.68', 'test', '20170409234214');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1023, '00031', '25.71', '10.73', '2.36', '44.62', '18.67', '23.09', 'test', '20170409234217');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1024, '00015', '15.69', '47.13', '16.8', '17.39', '17.67', '10.6', 'test', '20170409234220');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1025, '00004', '6.48', '41.12', '1.69', '16.13', '15.62', '29.21', 'test', '20170409234223');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1026, '00016', '8.35', '48.26', '2.39', '25.78', '35.11', '11.72', 'test', '20170409234226');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1027, '00030', '35.03', '25.24', '24.48', '14.69', '11.75', '32.28', 'test', '20170409234229');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1028, '00022', '25.16', '25.57', '8.98', '21.29', '47.08', '43.83', 'test', '20170409234232');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1029, '00037', '25.03', '16.95', '7.83', '16.67', '25.82', '32.36', 'test', '20170409234235');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1030, '00035', '11.58', '16.9', '26.76', '14.65', '16.1', '41.56', 'test', '20170409234238');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1031, '00005', '37.75', '49.36', '33.7', '29.73', '46.35', '47.54', 'test', '20170409234241');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1032, '00022', '24.66', '19.42', '28.46', '35.58', '43.97', '32.87', 'test', '20170409234244');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1033, '00006', '3.48', '24.87', '4.83', '17.43', '30.32', '30.49', 'test', '20170409234247');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1034, '00012', '7.46', '18.27', '9.09', '43.38', '29.12', '42.55', 'test', '20170409234250');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1035, '00021', '1.01', '46.91', '5.09', '16.68', '32.89', '38.8', 'test', '20170409234253');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1036, '00003', '0.14', '46.01', '11.89', '42.71', '13.24', '28.87', 'test', '20170409234256');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1037, '00018', '5.55', '27.32', '37.43', '41.59', '38.26', '14.95', 'test', '20170409234259');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1038, '00028', '6.88', '32.59', '15.25', '23.64', '49.2', '21.08', 'test', '20170409234303');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1039, '00023', '19.25', '13.64', '4.7', '25.97', '44.5', '13.38', 'test', '20170409234306');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1040, '00030', '24.24', '35.48', '29.52', '42.57', '43.08', '17.24', 'test', '20170409234309');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1041, '00022', '27.95', '26.2', '15.88', '46.22', '25.78', '46.77', 'test', '20170409234312');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1042, '00036', '19.1', '28.5', '10.75', '49.02', '33.13', '19.55', 'test', '20170409234315');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1043, '00008', '28.01', '18.43', '29.15', '11.94', '16.55', '19.06', 'test', '20170409234318');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1044, '00007', '23.5', '13.33', '5.59', '16.49', '26.69', '48.05', 'test', '20170409234321');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1045, '00011', '14.21', '17.99', '10.86', '12.09', '37.82', '36.51', 'test', '20170409234324');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1046, '00005', '11.01', '40.65', '10.9', '39.61', '23.23', '13.69', 'test', '20170409234327');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1047, '00034', '23.85', '12.95', '19.63', '26.62', '50.89', '38.95', 'test', '20170409234330');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1048, '00008', '18.49', '50.38', '28.58', '23.81', '36.61', '27.11', 'test', '20170409234333');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1049, '00036', '30.18', '25.36', '21.02', '39.96', '47.36', '33.42', 'test', '20170409234336');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1050, '00027', '6.74', '29.15', '0.67', '12.55', '27.35', '12.06', 'test', '20170409234339');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1051, '00022', '2.83', '33.07', '16.43', '47.38', '14.8', '40.4', 'test', '20170409234342');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1052, '00028', '30.87', '40.21', '35.53', '22.28', '25.0', '42.36', 'test', '20170409234345');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1053, '00010', '22.4', '46.9', '26.89', '18.71', '39.34', '29.25', 'test', '20170409234348');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1054, '00014', '0.67', '50.48', '24.75', '12.15', '34.2', '15.18', 'test', '20170409234351');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1055, '00031', '35.83', '46.51', '15.46', '49.42', '11.84', '28.95', 'test', '20170409234354');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1056, '00016', '18.79', '11.0', '22.35', '28.83', '28.28', '36.59', 'test', '20170409234357');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1057, '00002', '4.8', '49.78', '7.21', '50.19', '10.5', '50.01', 'test', '20170409234400');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1058, '00011', '10.8', '10.8', '30.49', '41.29', '49.22', '42.62', 'test', '20170409014110');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1059, '00011', '16.91', '12.9', '21.01', '13.27', '44.98', '33.03', 'test', '20170409024114');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1060, '00011', '35.22', '32.4', '13.61', '37.44', '24.46', '16.06', 'test', '20170409034117');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1061, '00011', '16.4', '43.58', '34.63', '22.91', '46.2', '33.53', 'test', '20170409044120');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1062, '00011', '35.43', '39.33', '13.48', '20.89', '35.07', '10.91', 'test', '20170409054123');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1063, '00011', '28.51', '34.54', '16.36', '17.36', '13.06', '33.03', 'test', '20170409064126');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1064, '00011', '12.12', '24.62', '18.62', '12.66', '33.62', '16.64', 'test', '20170409074129');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1065, '00011', '36.04', '34.63', '5.16', '33.17', '10.0', '14.58', 'test', '20170409084132');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1066, '00011', '30.29', '46.76', '13.25', '49.38', '45.47', '38.46', 'test', '20170409234138');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1067, '00011', '14.12', '17.73', '29.64', '20.79', '48.81', '27.78', 'test', '20170409234144');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1068, '00011', '33.89', '37.5', '11.82', '35.06', '43.21', '50.65', 'test', '20170409234147');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1069, '00011', '15.46', '14.71', '23.93', '32.55', '48.62', '11.5', 'test', '20170409234150');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1070, '00011', '10.27', '30.54', '36.67', '39.25', '15.16', '41.15', 'test', '20170409234153');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1071, '00011', '17.55', '47.47', '27.29', '23.57', '28.25', '39.14', 'test', '20170409234156');
INSERT INTO `tb_mrgh_data_acquisition` VALUES (1072, '00011', '10.66', '27.17', '14.55', '12.89', '40.0', '25.55', 'test', '20170409234159');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
