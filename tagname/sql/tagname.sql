/*
Navicat MySQL Data Transfer

Source Server         : 部署环境
Source Server Version : 50727
Source Host           : 192.168.100.208:3306
Source Database       : tagname

Target Server Type    : MYSQL
Target Server Version : 50727
File Encoding         : 65001

Date: 2019-10-31 10:05:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_r_tag
-- ----------------------------
DROP TABLE IF EXISTS `t_r_tag`;
CREATE TABLE `t_r_tag` (
  `tag_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `kks` varchar(50) NOT NULL COMMENT 'kks',
  `code` varchar(50) DEFAULT NULL,
  `tag_type` varchar(50) NOT NULL COMMENT '��״̬',
  `tag_desc` varchar(100) DEFAULT NULL COMMENT '����',
  `unit` varchar(20) DEFAULT NULL,
  `flag` int(2) DEFAULT NULL,
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `othertagname` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`tag_id`),
  UNIQUE KEY `weiyi` (`kks`) USING BTREE,
  UNIQUE KEY `onlyone` (`kks`,`code`,`tag_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=200055 DEFAULT CHARSET=utf8 COMMENT='����';

-- ----------------------------
-- Records of t_r_tag
-- ----------------------------
INSERT INTO `t_r_tag` VALUES ('1000', '10LAB80AA402-ZC.UNIT1@NET1', 'DIGEIN', 'DIGEIN', '中压省煤器入口疏水电动门已关', '', '1', '2019-07-04 10:02:42', '10LAB80AA402-ZC');
INSERT INTO `t_r_tag` VALUES ('1001', '10LAB80AA402-ZO.UNIT1@NET1', 'DIGEIN', 'DIGEIN', '中压省煤器入口疏水电动门已开', '', '1', '2019-07-04 10:02:42', '10LAB80AA402-ZO');
INSERT INTO `t_r_tag` VALUES ('1002', '10LAB80CF_DEV.UNIT1@NET1', 'DIGITAL', 'DIGITAL', '中压给水至凝结水入口流量偏差大', '', '1', '2019-07-04 10:02:42', '10LAB80CF_DEV');
INSERT INTO `t_r_tag` VALUES ('1003', '10LAB80CF_MED.UNIT1@NET1', 'ANALOG', 'ANALOG', '中压给水至凝结水入口流量3选值', 't/h', '1', '2019-07-04 10:02:42', '10LAB80CF_MED');
INSERT INTO `t_r_tag` VALUES ('1004', '10LAB80CF_SL.UNIT1@NET1', 'MSDD', 'MSDD', '中压给水至凝结水入口流量3选', '', '1', '2019-07-04 10:02:42', '10LAB80CF_SL');
INSERT INTO `t_r_tag` VALUES ('1005', '10LAB80CF101.UNIT1@NET1', 'ANAEIN', 'ANAEIN', '中压给水流量A', 'KPa', '1', '2019-09-18 16:10:49', '10LAB80CF101');
INSERT INTO `t_r_tag` VALUES ('1006', '10LAB80CF101_COMP.UNIT1@NET1', 'ANALOG', 'ANALOG', '中压给水流量A补偿值', 't/h', '1', '2019-07-04 10:02:42', '10LAB80CF101_COMP');
INSERT INTO `t_r_tag` VALUES ('1007', '10LAB80CF102.UNIT1@NET1', 'ANAEIN', 'ANAEIN', '中压给水流量B', 'KPa', '1', '2019-09-18 16:10:49', '10LAB80CF102');
INSERT INTO `t_r_tag` VALUES ('1008', '10LAB80CF102_COMP.UNIT1@NET1', 'ANALOG', 'ANALOG', '中压给水流量B补偿值', 't/h', '1', '2019-07-04 10:02:42', '10LAB80CF102_COMP');
INSERT INTO `t_r_tag` VALUES ('1009', '10LAB80CF103.UNIT1@NET1', 'ANAEIN', 'ANAEIN', '中压给水流量C', 'KPa', '1', '2019-09-18 16:10:49', '10LAB80CF103');
INSERT INTO `t_r_tag` VALUES ('1010', '10LAB80CF103_COMP.UNIT1@NET1', 'ANALOG', 'ANALOG', '中压给水流量C补偿值', 't/h', '1', '2019-07-04 10:02:42', '10LAB80CF103_COMP');
INSERT INTO `t_r_tag` VALUES ('1011', '10LAB80CF104.UNIT1@NET1', 'ANAEIN', 'ANAEIN', '中压给水至凝结水入口流量', 'KPa', '1', '2019-09-18 16:10:49', '10LAB80CF104');
INSERT INTO `t_r_tag` VALUES ('1012', '10LAB80CT_DEV.UNIT1@NET1', 'DIGITAL', 'DIGITAL', '中压给水温度偏差大', '', '1', '2019-07-04 10:02:42', '10LAB80CT_DEV');
INSERT INTO `t_r_tag` VALUES ('1013', '10LAB80CT_MED.UNIT1@NET1', 'ANALOG', 'ANALOG', '中压给水温度3选值', '℃', '1', '2019-07-04 10:02:42', '10LAB80CT_MED');
INSERT INTO `t_r_tag` VALUES ('1014', '10LAB80CT_SL.UNIT1@NET1', 'MSDD', 'MSDD', '中压给水温度3选', '', '1', '2019-07-04 10:02:42', '10LAB80CT_SL');
INSERT INTO `t_r_tag` VALUES ('1015', '10LAB80CT601.UNIT1@NET1', 'ANAEIN', 'ANAEIN', '中压给水温度A', '℃', '1', '2019-07-04 10:02:42', '10LAB80CT601');
INSERT INTO `t_r_tag` VALUES ('1016', '10LAB80CT602.UNIT1@NET1', 'ANAEIN', 'ANAEIN', '中压给水温度B', '℃', '1', '2019-07-04 10:02:42', '10LAB80CT602');
INSERT INTO `t_r_tag` VALUES ('1017', '10LAB80CT603.UNIT1@NET1', 'ANAEIN', 'ANAEIN', '中压给水温度C', '℃', '1', '2019-07-04 10:02:42', '10LAB80CT603');
INSERT INTO `t_r_tag` VALUES ('1018', '10LAB92_FO1.UNIT1@NET1', 'DIGITAL', 'DIGITAL', '#1机B高压给水泵电机绕组温度高(6取3)', '', '1', '2019-07-04 10:02:42', '10LAB92_FO1');
INSERT INTO `t_r_tag` VALUES ('1019', '10LAB92_FO10.UNIT1@NET1', 'DIGITAL', 'DIGITAL', '#1机高压给水泵变频器故障', '', '1', '2019-07-04 10:02:42', '10LAB92_FO10');
INSERT INTO `t_r_tag` VALUES ('1020', '10LAB92_FO2.UNIT1@NET1', 'DIGITAL', 'DIGITAL', '#1机B高压给水泵电机驱动端轴承温度高', '', '1', '2019-07-04 10:02:42', '10LAB92_FO2');
INSERT INTO `t_r_tag` VALUES ('1021', '10LAB92_FO3.UNIT1@NET1', 'DIGITAL', 'DIGITAL', '#1机B高压给水泵电机非驱动端轴承温度高', '', '1', '2019-07-04 10:02:42', '10LAB92_FO3');
INSERT INTO `t_r_tag` VALUES ('1022', '10LAB92_FO4.UNIT1@NET1', 'DIGITAL', 'DIGITAL', '#1机B高压给水泵驱动端径向轴承温度高', '', '1', '2019-07-04 10:02:42', '10LAB92_FO4');
INSERT INTO `t_r_tag` VALUES ('1023', '10LAB92_FO5.UNIT1@NET1', 'DIGITAL', 'DIGITAL', '#1机B高压给水泵非驱动端径向轴承温度高', '', '1', '2019-07-04 10:02:43', '10LAB92_FO5');
INSERT INTO `t_r_tag` VALUES ('1024', '10HAH80AA502.UNIT1@NET1', 'MSDD', 'MSDD', '中压饱和蒸汽放空电动门', '', '1', '2019-07-04 10:02:43', '10HAH80AA502');
