/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50713
 Source Host           : localhost:3306
 Source Schema         : dop

 Target Server Type    : MySQL
 Target Server Version : 50713
 File Encoding         : 65001

 Date: 08/07/2022 16:45:48
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for margin_analysis
-- ----------------------------
DROP TABLE IF EXISTS `margin_analysis`;
CREATE TABLE `margin_analysis`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `reactor_type` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '反应堆堆型（\r\nA：A型，\r\nB：B型）',
  `core_life` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '堆芯寿期（50,100）',
  `shift` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '档位（\r\ns1：一档，\r\ns2：二档，\r\ns3：三低速档，\r\ns4：四高速挡，\r\ns5：五档，\r\ns6：六档）\r\n',
  `break_location` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '破口位置 （\r\nb1：热管段，\r\nb2：冷管段，\r\nb3：过渡段）',
  `break_size` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '破口尺寸',
  `file_address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '文件名称',
  `mp` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '主泵',
  `mgv1` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '主闸阀#1',
  `mgv2` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '主闸阀#2',
  `hhsip` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '高压安注入泵',
  `lpsip` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '低压安注入泵',
  `hhsiv` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '高压安注入阀',
  `lpsiv` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '低压安注入阀',
  `whrp` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '余热排除泵',
  `rdiv` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '余热排出隔离阀',
  `sbv1` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '蒸汽隔离阀1',
  `sbv2` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '蒸汽隔离阀2',
  `des_file` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '折线图数据文件地址',
  `accsqe_file` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '事故序列文件地址',
  `ofp_file` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '超限提示文件地址',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `check`(`reactor_type`, `core_life`, `shift`, `break_location`, `break_size`, `mp`, `mgv1`, `mgv2`, `hhsip`, `lpsip`, `hhsiv`, `lpsiv`, `whrp`, `sbv1`, `sbv2`) USING BTREE COMMENT '运行分析数据唯一性校验'
) ENGINE = InnoDB AUTO_INCREMENT = 89 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
