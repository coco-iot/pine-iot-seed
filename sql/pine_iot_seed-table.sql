SET NAMES utf8mb4;
use pine_iot_seed;

CREATE TABLE `pine_alarm` (
    `pine_alarm_id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `client_id` bigint(20) NOT NULL DEFAULT '0' COMMENT 'client_id',
    `alarm_name` varchar(32) NOT NULL DEFAULT '' COMMENT '闹钟名称',
    `alarm_time` bigint(20) NOT NULL DEFAULT '0' COMMENT '闹钟时间戳',
    `log_time` bigint(20) NOT NULL DEFAULT '0' COMMENT '记录时间戳',
    `week_index` varchar(32) NOT NULL DEFAULT '0' COMMENT '一周中哪几天下标，从周日开始，比如 0,1,3',
    `week` varchar(32) NOT NULL DEFAULT '' COMMENT '一周中哪几天，从周日开始，比如 日,一,二',
    `is_open` int(11) NOT NULL DEFAULT '0' COMMENT '是否打开 1-是，0-否',
    `device_code` varchar(64) NOT NULL DEFAULT '' COMMENT '设备编码',
    `user_code` varchar(64) NOT NULL DEFAULT '' COMMENT '用户编码',
    `device_firm` int(11) NOT NULL DEFAULT '0' COMMENT 'sdk方案：1-拓步sdk 2-裂变sdk 3-舟海sdk 4-酷热sdk 5-优创亿sdk 6-魔样sdk',
    `device_name` varchar(64) NOT NULL DEFAULT '0' COMMENT '设备名称',
    `device_mac` varchar(64) NOT NULL DEFAULT '0' COMMENT '设备Mac地址',
    `status` tinyint NOT NULL DEFAULT '0' COMMENT '状态 -1-删除 1-正常',
    `operator_id` int NOT NULL DEFAULT '0' COMMENT '操作人ID',
    `operator` varchar(20) NOT NULL DEFAULT '' COMMENT '操作人 记录操作人用户名，程序自动执行时记system',
    `comment` varchar(100) NOT NULL DEFAULT '' COMMENT '备注(如：功能描述)',
    `create_time` bigint NOT NULL DEFAULT '0' COMMENT '创建时间',
    `update_time` bigint NOT NULL DEFAULT '0' COMMENT '更新时间',
    PRIMARY KEY (`pine_alarm_id`),
    KEY `idx_alarm_name` (`alarm_name`),
    KEY `idx_st_ct` (`status`,`create_time`),
    KEY `idx_df_dn_dm` (`device_firm`,`device_name`,`device_mac`),
    KEY `idx_uc_ci` (`user_code`,`client_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='闹钟表';

