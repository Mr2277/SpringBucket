package com.child.sale.entity;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.io.Serializable;

public class ShoppingFlow implements Serializable {

    private static final long serialVersionUID = -219988432063763456L;

    private String bill;

    private String vipId;

    private String deptId;

    private String deptName;

    private String standards;

    private String numSale;

    private String valueSale;

    public String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public String getVipId() {
        return vipId;
    }

    public void setVipId(String vipId) {
        this.vipId = vipId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getStandards() {
        return standards;
    }

    public void setStandards(String standards) {
        this.standards = standards;
    }

    public String getNumSale() {
        return numSale;
    }

    public void setNumSale(String numSale) {
        this.numSale = numSale;
    }

    public String getValueSale() {
        return valueSale;
    }

    public void setValueSale(String valueSale) {
        this.valueSale = valueSale;
    }

}
