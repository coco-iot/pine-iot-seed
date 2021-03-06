package com.yunqiic.dataapi.db.domain;

import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Database Table Remarks:
 *   闹钟表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table pine_alarm
 */
public class PineAlarm {
    @ApiModelProperty(value = "主键ID")
    private Long pineAlarmId;

    @ApiModelProperty(value = "client_id")
    private Long clientId;

    @ApiModelProperty(value = "闹钟名称")
    private String alarmName;

    @ApiModelProperty(value = "闹钟时间戳")
    private Long alarmTime;

    @ApiModelProperty(value = "记录时间戳")
    private Long logTime;

    @ApiModelProperty(value = "一周中哪几天下标，从周日开始，比如 0,1,3")
    private String weekIndex;

    @ApiModelProperty(value = "一周中哪几天，从周日开始，比如 日,一,二")
    private String week;

    @ApiModelProperty(value = "是否打开 1-是，0-否")
    private Integer isOpen;

    @ApiModelProperty(value = "设备编码")
    private String deviceCode;

    @ApiModelProperty(value = "用户编码")
    private String userCode;

    @ApiModelProperty(value = "sdk方案：1-拓步sdk 2-裂变sdk 3-舟海sdk 4-酷热sdk 5-优创亿sdk 6-魔样sdk")
    private Integer deviceFirm;

    @ApiModelProperty(value = "设备名称")
    private String deviceName;

    @ApiModelProperty(value = "设备Mac地址")
    private String deviceMac;

    @ApiModelProperty(value = "状态 -1-删除 1-正常")
    private Byte status;

    @ApiModelProperty(value = "操作人ID")
    private Integer operatorId;

    @ApiModelProperty(value = "操作人 记录操作人用户名，程序自动执行时记system")
    private String operator;

    @ApiModelProperty(value = "备注(如：功能描述)")
    private String comment;

    @ApiModelProperty(value = "创建时间")
    private Long createTime;

    @ApiModelProperty(value = "更新时间")
    private Long updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pine_alarm.pine_alarm_id
     *
     * @return the value of pine_alarm.pine_alarm_id
     *
     * @mbg.generated
     */
    public Long getPineAlarmId() {
        return pineAlarmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pine_alarm.pine_alarm_id
     *
     * @param pineAlarmId the value for pine_alarm.pine_alarm_id
     *
     * @mbg.generated
     */
    public void setPineAlarmId(Long pineAlarmId) {
        this.pineAlarmId = pineAlarmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pine_alarm.client_id
     *
     * @return the value of pine_alarm.client_id
     *
     * @mbg.generated
     */
    public Long getClientId() {
        return clientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pine_alarm.client_id
     *
     * @param clientId the value for pine_alarm.client_id
     *
     * @mbg.generated
     */
    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pine_alarm.alarm_name
     *
     * @return the value of pine_alarm.alarm_name
     *
     * @mbg.generated
     */
    public String getAlarmName() {
        return alarmName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pine_alarm.alarm_name
     *
     * @param alarmName the value for pine_alarm.alarm_name
     *
     * @mbg.generated
     */
    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pine_alarm.alarm_time
     *
     * @return the value of pine_alarm.alarm_time
     *
     * @mbg.generated
     */
    public Long getAlarmTime() {
        return alarmTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pine_alarm.alarm_time
     *
     * @param alarmTime the value for pine_alarm.alarm_time
     *
     * @mbg.generated
     */
    public void setAlarmTime(Long alarmTime) {
        this.alarmTime = alarmTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pine_alarm.log_time
     *
     * @return the value of pine_alarm.log_time
     *
     * @mbg.generated
     */
    public Long getLogTime() {
        return logTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pine_alarm.log_time
     *
     * @param logTime the value for pine_alarm.log_time
     *
     * @mbg.generated
     */
    public void setLogTime(Long logTime) {
        this.logTime = logTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pine_alarm.week_index
     *
     * @return the value of pine_alarm.week_index
     *
     * @mbg.generated
     */
    public String getWeekIndex() {
        return weekIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pine_alarm.week_index
     *
     * @param weekIndex the value for pine_alarm.week_index
     *
     * @mbg.generated
     */
    public void setWeekIndex(String weekIndex) {
        this.weekIndex = weekIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pine_alarm.week
     *
     * @return the value of pine_alarm.week
     *
     * @mbg.generated
     */
    public String getWeek() {
        return week;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pine_alarm.week
     *
     * @param week the value for pine_alarm.week
     *
     * @mbg.generated
     */
    public void setWeek(String week) {
        this.week = week;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pine_alarm.is_open
     *
     * @return the value of pine_alarm.is_open
     *
     * @mbg.generated
     */
    public Integer getIsOpen() {
        return isOpen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pine_alarm.is_open
     *
     * @param isOpen the value for pine_alarm.is_open
     *
     * @mbg.generated
     */
    public void setIsOpen(Integer isOpen) {
        this.isOpen = isOpen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pine_alarm.device_code
     *
     * @return the value of pine_alarm.device_code
     *
     * @mbg.generated
     */
    public String getDeviceCode() {
        return deviceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pine_alarm.device_code
     *
     * @param deviceCode the value for pine_alarm.device_code
     *
     * @mbg.generated
     */
    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pine_alarm.user_code
     *
     * @return the value of pine_alarm.user_code
     *
     * @mbg.generated
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pine_alarm.user_code
     *
     * @param userCode the value for pine_alarm.user_code
     *
     * @mbg.generated
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pine_alarm.device_firm
     *
     * @return the value of pine_alarm.device_firm
     *
     * @mbg.generated
     */
    public Integer getDeviceFirm() {
        return deviceFirm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pine_alarm.device_firm
     *
     * @param deviceFirm the value for pine_alarm.device_firm
     *
     * @mbg.generated
     */
    public void setDeviceFirm(Integer deviceFirm) {
        this.deviceFirm = deviceFirm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pine_alarm.device_name
     *
     * @return the value of pine_alarm.device_name
     *
     * @mbg.generated
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pine_alarm.device_name
     *
     * @param deviceName the value for pine_alarm.device_name
     *
     * @mbg.generated
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pine_alarm.device_mac
     *
     * @return the value of pine_alarm.device_mac
     *
     * @mbg.generated
     */
    public String getDeviceMac() {
        return deviceMac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pine_alarm.device_mac
     *
     * @param deviceMac the value for pine_alarm.device_mac
     *
     * @mbg.generated
     */
    public void setDeviceMac(String deviceMac) {
        this.deviceMac = deviceMac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pine_alarm.status
     *
     * @return the value of pine_alarm.status
     *
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pine_alarm.status
     *
     * @param status the value for pine_alarm.status
     *
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pine_alarm.operator_id
     *
     * @return the value of pine_alarm.operator_id
     *
     * @mbg.generated
     */
    public Integer getOperatorId() {
        return operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pine_alarm.operator_id
     *
     * @param operatorId the value for pine_alarm.operator_id
     *
     * @mbg.generated
     */
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pine_alarm.operator
     *
     * @return the value of pine_alarm.operator
     *
     * @mbg.generated
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pine_alarm.operator
     *
     * @param operator the value for pine_alarm.operator
     *
     * @mbg.generated
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pine_alarm.comment
     *
     * @return the value of pine_alarm.comment
     *
     * @mbg.generated
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pine_alarm.comment
     *
     * @param comment the value for pine_alarm.comment
     *
     * @mbg.generated
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pine_alarm.create_time
     *
     * @return the value of pine_alarm.create_time
     *
     * @mbg.generated
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pine_alarm.create_time
     *
     * @param createTime the value for pine_alarm.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pine_alarm.update_time
     *
     * @return the value of pine_alarm.update_time
     *
     * @mbg.generated
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pine_alarm.update_time
     *
     * @param updateTime the value for pine_alarm.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pine_alarm
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pineAlarmId=").append(pineAlarmId);
        sb.append(", clientId=").append(clientId);
        sb.append(", alarmName=").append(alarmName);
        sb.append(", alarmTime=").append(alarmTime);
        sb.append(", logTime=").append(logTime);
        sb.append(", weekIndex=").append(weekIndex);
        sb.append(", week=").append(week);
        sb.append(", isOpen=").append(isOpen);
        sb.append(", deviceCode=").append(deviceCode);
        sb.append(", userCode=").append(userCode);
        sb.append(", deviceFirm=").append(deviceFirm);
        sb.append(", deviceName=").append(deviceName);
        sb.append(", deviceMac=").append(deviceMac);
        sb.append(", status=").append(status);
        sb.append(", operatorId=").append(operatorId);
        sb.append(", operator=").append(operator);
        sb.append(", comment=").append(comment);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pine_alarm
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PineAlarm other = (PineAlarm) that;
        return (this.getPineAlarmId() == null ? other.getPineAlarmId() == null : this.getPineAlarmId().equals(other.getPineAlarmId()))
            && (this.getClientId() == null ? other.getClientId() == null : this.getClientId().equals(other.getClientId()))
            && (this.getAlarmName() == null ? other.getAlarmName() == null : this.getAlarmName().equals(other.getAlarmName()))
            && (this.getAlarmTime() == null ? other.getAlarmTime() == null : this.getAlarmTime().equals(other.getAlarmTime()))
            && (this.getLogTime() == null ? other.getLogTime() == null : this.getLogTime().equals(other.getLogTime()))
            && (this.getWeekIndex() == null ? other.getWeekIndex() == null : this.getWeekIndex().equals(other.getWeekIndex()))
            && (this.getWeek() == null ? other.getWeek() == null : this.getWeek().equals(other.getWeek()))
            && (this.getIsOpen() == null ? other.getIsOpen() == null : this.getIsOpen().equals(other.getIsOpen()))
            && (this.getDeviceCode() == null ? other.getDeviceCode() == null : this.getDeviceCode().equals(other.getDeviceCode()))
            && (this.getUserCode() == null ? other.getUserCode() == null : this.getUserCode().equals(other.getUserCode()))
            && (this.getDeviceFirm() == null ? other.getDeviceFirm() == null : this.getDeviceFirm().equals(other.getDeviceFirm()))
            && (this.getDeviceName() == null ? other.getDeviceName() == null : this.getDeviceName().equals(other.getDeviceName()))
            && (this.getDeviceMac() == null ? other.getDeviceMac() == null : this.getDeviceMac().equals(other.getDeviceMac()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getOperatorId() == null ? other.getOperatorId() == null : this.getOperatorId().equals(other.getOperatorId()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pine_alarm
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPineAlarmId() == null) ? 0 : getPineAlarmId().hashCode());
        result = prime * result + ((getClientId() == null) ? 0 : getClientId().hashCode());
        result = prime * result + ((getAlarmName() == null) ? 0 : getAlarmName().hashCode());
        result = prime * result + ((getAlarmTime() == null) ? 0 : getAlarmTime().hashCode());
        result = prime * result + ((getLogTime() == null) ? 0 : getLogTime().hashCode());
        result = prime * result + ((getWeekIndex() == null) ? 0 : getWeekIndex().hashCode());
        result = prime * result + ((getWeek() == null) ? 0 : getWeek().hashCode());
        result = prime * result + ((getIsOpen() == null) ? 0 : getIsOpen().hashCode());
        result = prime * result + ((getDeviceCode() == null) ? 0 : getDeviceCode().hashCode());
        result = prime * result + ((getUserCode() == null) ? 0 : getUserCode().hashCode());
        result = prime * result + ((getDeviceFirm() == null) ? 0 : getDeviceFirm().hashCode());
        result = prime * result + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        result = prime * result + ((getDeviceMac() == null) ? 0 : getDeviceMac().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getOperatorId() == null) ? 0 : getOperatorId().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table pine_alarm
     *
     * @mbg.generated
     */
    public enum Column {
        pineAlarmId("pine_alarm_id", "pineAlarmId", "BIGINT", false),
        clientId("client_id", "clientId", "BIGINT", false),
        alarmName("alarm_name", "alarmName", "VARCHAR", false),
        alarmTime("alarm_time", "alarmTime", "BIGINT", false),
        logTime("log_time", "logTime", "BIGINT", false),
        weekIndex("week_index", "weekIndex", "VARCHAR", false),
        week("week", "week", "VARCHAR", false),
        isOpen("is_open", "isOpen", "INTEGER", false),
        deviceCode("device_code", "deviceCode", "VARCHAR", false),
        userCode("user_code", "userCode", "VARCHAR", false),
        deviceFirm("device_firm", "deviceFirm", "INTEGER", false),
        deviceName("device_name", "deviceName", "VARCHAR", false),
        deviceMac("device_mac", "deviceMac", "VARCHAR", false),
        status("status", "status", "TINYINT", true),
        operatorId("operator_id", "operatorId", "INTEGER", false),
        operator("operator", "operator", "VARCHAR", true),
        comment("comment", "comment", "VARCHAR", true),
        createTime("create_time", "createTime", "BIGINT", false),
        updateTime("update_time", "updateTime", "BIGINT", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table pine_alarm
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table pine_alarm
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table pine_alarm
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table pine_alarm
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table pine_alarm
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table pine_alarm
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table pine_alarm
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table pine_alarm
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table pine_alarm
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table pine_alarm
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table pine_alarm
         *
         * @mbg.generated
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table pine_alarm
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table pine_alarm
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table pine_alarm
         *
         * @mbg.generated
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table pine_alarm
         *
         * @mbg.generated
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table pine_alarm
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}