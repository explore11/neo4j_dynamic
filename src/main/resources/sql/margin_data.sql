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

 Date: 08/07/2022 16:45:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for margin_data
-- ----------------------------
DROP TABLE IF EXISTS `margin_data`;
CREATE TABLE `margin_data`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `reactor_type` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '反应堆堆型（\r\nA：A型，\r\nB：B型）',
  `core_life` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '堆芯寿期（50,100）',
  `shift` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '档位（\r\ns1：一档，\r\ns2：二档，\r\ns3：三低速档，\r\ns4：四高速挡，\r\ns5：五档，\r\ns6：六档）\r\n',
  `break_location` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '破口位置 （\r\nb1：热管段，\r\nb2：冷管段，\r\nb3：过渡段）',
  `break_size` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '破口尺寸',
  `transient_accidents` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '其他瞬态事故（\r\nt1：蒸汽发生器单根传热管双端剪切断裂，\r\nt2：给水流量降低，\r\nt3：给水温度降低 ，\r\nt4：稳压器安全阀卡开，\r\nt5：一组控制棒组件失控抽出，\r\nt6：全艇断电\r\n）',
  `des_file` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '输出结果文件路径',
  `accident_sequence_file` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '事故序列文件路径',
  `overflow_promp_file` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '超限提示文件',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `checkone`(`reactor_type`, `core_life`, `shift`, `break_location`, `break_size`) USING BTREE COMMENT '失水事故数据唯一性校验',
  UNIQUE INDEX `checktwo`(`reactor_type`, `core_life`, `shift`, `transient_accidents`) USING BTREE COMMENT '瞬态事故数据唯一性校验'
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
