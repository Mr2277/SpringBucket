package com.child.sale.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * (Sale)实体类
 *
 * @author makejava
 * @since 2021-04-04 21:20:13
 */
@Component
public class Sale implements Serializable {
    private static final long serialVersionUID = -41535678054988247L;
    
    private Object id;
    
    private String ymd;
    
    private String region;
    
    private String formats;
    
    private String stores;
    
    private String storename;
    
    private String bill;
    
    private String vipid;
    
    private String vipAge;
    
    private String vipSex;
    
    private String shopid;
    
    private String shopname;
    
    private String deptid;
    
    private String deptname;
    
    private String classid3;
    
    private String nameClass3;
    
    private String classid4;
    
    private String nameClass4;
    
    private String classid5;
    
    private String nameClass5;
    
    private String standards;
    
    private String unitSale;
    
    private String timeDef;
    
    private String priceCom;
    
    private String priceMust;
    
    private String priceSalechg;
    
    private String numSale;
    
    private String valueSale;
    
    private String valueSaleAfterdisc;
    
    private String isrtn;


    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getYmd() {
        return ymd;
    }

    public void setYmd(String ymd) {
        this.ymd = ymd;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getFormats() {
        return formats;
    }

    public void setFormats(String formats) {
        this.formats = formats;
    }

    public String getStores() {
        return stores;
    }

    public void setStores(String stores) {
        this.stores = stores;
    }

    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }

    public String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public String getVipid() {
        return vipid;
    }

    public void setVipid(String vipid) {
        this.vipid = vipid;
    }

    public String getVipAge() {
        return vipAge;
    }

    public void setVipAge(String vipAge) {
        this.vipAge = vipAge;
    }

    public String getVipSex() {
        return vipSex;
    }

    public void setVipSex(String vipSex) {
        this.vipSex = vipSex;
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getClassid3() {
        return classid3;
    }

    public void setClassid3(String classid3) {
        this.classid3 = classid3;
    }

    public String getNameClass3() {
        return nameClass3;
    }

    public void setNameClass3(String nameClass3) {
        this.nameClass3 = nameClass3;
    }

    public String getClassid4() {
        return classid4;
    }

    public void setClassid4(String classid4) {
        this.classid4 = classid4;
    }

    public String getNameClass4() {
        return nameClass4;
    }

    public void setNameClass4(String nameClass4) {
        this.nameClass4 = nameClass4;
    }

    public String getClassid5() {
        return classid5;
    }

    public void setClassid5(String classid5) {
        this.classid5 = classid5;
    }

    public String getNameClass5() {
        return nameClass5;
    }

    public void setNameClass5(String nameClass5) {
        this.nameClass5 = nameClass5;
    }

    public String getStandards() {
        return standards;
    }

    public void setStandards(String standards) {
        this.standards = standards;
    }

    public String getUnitSale() {
        return unitSale;
    }

    public void setUnitSale(String unitSale) {
        this.unitSale = unitSale;
    }

    public String getTimeDef() {
        return timeDef;
    }

    public void setTimeDef(String timeDef) {
        this.timeDef = timeDef;
    }

    public String getPriceCom() {
        return priceCom;
    }

    public void setPriceCom(String priceCom) {
        this.priceCom = priceCom;
    }

    public String getPriceMust() {
        return priceMust;
    }

    public void setPriceMust(String priceMust) {
        this.priceMust = priceMust;
    }

    public String getPriceSalechg() {
        return priceSalechg;
    }

    public void setPriceSalechg(String priceSalechg) {
        this.priceSalechg = priceSalechg;
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

    public String getValueSaleAfterdisc() {
        return valueSaleAfterdisc;
    }

    public void setValueSaleAfterdisc(String valueSaleAfterdisc) {
        this.valueSaleAfterdisc = valueSaleAfterdisc;
    }

    public String getIsrtn() {
        return isrtn;
    }

    public void setIsrtn(String isrtn) {
        this.isrtn = isrtn;
    }

}