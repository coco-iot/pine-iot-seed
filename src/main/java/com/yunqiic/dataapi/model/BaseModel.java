package com.yunqiic.dataapi.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

public class BaseModel {

    /**
     * client_id
     */
    @Column(name = "client_id")
    @ApiModelProperty(value="client_id")
    private Long clientId;

    /**
     * 记录时间戳
     */
    @Column(name = "log_time")
    @ApiModelProperty(value="记录时间戳")
    private Long logTime;

    /**
     * 设备编码
     */
    @Column(name = "device_code")
    @ApiModelProperty(value="设备编码")
    private String deviceCode;

    /**
     * 用户编码
     */
    @Column(name = "user_code")
    @ApiModelProperty(value="用户编码")
    private String userCode;

    /**
     * sdk方案：1-拓步sdk 2-裂变sdk 3-舟海sdk 4-酷热sdk 5-优创亿sdk 6-魔样sdk
     */
    @Column(name = "device_firm")
    @ApiModelProperty(value="sdk方案：1-拓步sdk 2-裂变sdk 3-舟海sdk 4-酷热sdk 5-优创亿sdk 6-魔样sdk")
    private Integer deviceFirm;

    /**
     * 设备名称
     */
    @Column(name = "device_name")
    @ApiModelProperty(value="设备名称")
    private String deviceName;

    /**
     * 设备Mac地址
     */
    @Column(name = "device_mac")
    @ApiModelProperty(value="设备Mac地址")
    private String deviceMac;

    /**
     * 状态 -1-删除 1-正常
     */
    @ApiModelProperty(value="状态 -1-删除 1-正常")
    private Byte status;

    /**
     * 操作人ID
     */
    @Column(name = "operator_id")
    @ApiModelProperty(value="操作人ID")
    private Integer operatorId;

    /**
     * 操作人 记录操作人用户名，程序自动执行时记system
     */
    @ApiModelProperty(value="操作人 记录操作人用户名，程序自动执行时记system")
    private String operator;

    /**
     * 备注(如：功能描述)
     */
    @ApiModelProperty(value="备注(如：功能描述)")
    private String comment;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="创建时间")
    private Long createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    @ApiModelProperty(value="更新时间")
    private Long updateTime;

    /**
     * 获取client_id
     *
     * @return client_id - client_id
     */
    public Long getClientId() {
        return clientId;
    }

    /**
     * 设置client_id
     *
     * @param clientId client_id
     */
    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    /**
     * 获取记录时间戳
     *
     * @return log_time - 记录时间戳
     */
    public Long getLogTime() {
        return logTime;
    }

    /**
     * 设置记录时间戳
     *
     * @param logTime 记录时间戳
     */
    public void setLogTime(Long logTime) {
        this.logTime = logTime;
    }

    /**
     * 获取设备编码
     *
     * @return device_code - 设备编码
     */
    public String getDeviceCode() {
        return deviceCode;
    }

    /**
     * 设置设备编码
     *
     * @param deviceCode 设备编码
     */
    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    /**
     * 获取用户编码
     *
     * @return user_code - 用户编码
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * 设置用户编码
     *
     * @param userCode 用户编码
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    /**
     * 获取sdk方案：1-拓步sdk 2-裂变sdk 3-舟海sdk 4-酷热sdk 5-优创亿sdk 6-魔样sdk
     *
     * @return device_firm - sdk方案：1-拓步sdk 2-裂变sdk 3-舟海sdk 4-酷热sdk 5-优创亿sdk 6-魔样sdk
     */
    public Integer getDeviceFirm() {
        return deviceFirm;
    }

    /**
     * 设置sdk方案：1-拓步sdk 2-裂变sdk 3-舟海sdk 4-酷热sdk 5-优创亿sdk 6-魔样sdk
     *
     * @param deviceFirm sdk方案：1-拓步sdk 2-裂变sdk 3-舟海sdk 4-酷热sdk 5-优创亿sdk 6-魔样sdk
     */
    public void setDeviceFirm(Integer deviceFirm) {
        this.deviceFirm = deviceFirm;
    }

    /**
     * 获取设备名称
     *
     * @return device_name - 设备名称
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * 设置设备名称
     *
     * @param deviceName 设备名称
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * 获取设备Mac地址
     *
     * @return device_mac - 设备Mac地址
     */
    public String getDeviceMac() {
        return deviceMac;
    }

    /**
     * 设置设备Mac地址
     *
     * @param deviceMac 设备Mac地址
     */
    public void setDeviceMac(String deviceMac) {
        this.deviceMac = deviceMac;
    }

    /**
     * 获取状态 -1-删除 1-正常
     *
     * @return status - 状态 -1-删除 1-正常
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态 -1-删除 1-正常
     *
     * @param status 状态 -1-删除 1-正常
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取操作人ID
     *
     * @return operator_id - 操作人ID
     */
    public Integer getOperatorId() {
        return operatorId;
    }

    /**
     * 设置操作人ID
     *
     * @param operatorId 操作人ID
     */
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * 获取操作人 记录操作人用户名，程序自动执行时记system
     *
     * @return operator - 操作人 记录操作人用户名，程序自动执行时记system
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 设置操作人 记录操作人用户名，程序自动执行时记system
     *
     * @param operator 操作人 记录操作人用户名，程序自动执行时记system
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * 获取备注(如：功能描述)
     *
     * @return comment - 备注(如：功能描述)
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置备注(如：功能描述)
     *
     * @param comment 备注(如：功能描述)
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}