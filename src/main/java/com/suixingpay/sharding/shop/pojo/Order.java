package com.suixingpay.sharding.shop.pojo;

import java.util.Date;

/**
 * describe:
 *
 * @author: shi_lei@suixingpay.com
 * @date: 2018/12/13 10:54:10:54
 * @version: V1.0
 * @review:
 */
public class Order {
    private int id;
    private String orderId;
    private int userId;
    private String productName;
    private Date createTime;
    private String tcd;
    private int sysId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getSysId() {
        return sysId;
    }

    public void setSysId(int sysId) {
        this.sysId = sysId;
    }

    public String getTcd() {
        return tcd;
    }

    public void setTcd(String tcd) {
        this.tcd = tcd;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderId='" + orderId + '\'' +
                ", userId=" + userId +
                ", productName='" + productName + '\'' +
                ", createTime=" + createTime +
                ", tcd='" + tcd + '\'' +
                ", sysId=" + sysId +
                '}';
    }
}
