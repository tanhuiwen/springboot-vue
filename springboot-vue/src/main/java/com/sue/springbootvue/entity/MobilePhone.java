package com.sue.springbootvue.entity;

import javax.persistence.*;

@Entity
@Table(name = "mobile_phone", schema = "springbootvue")
public class MobilePhone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private int id;//手机id
    @Column
    private String title;//商品标题
    @Column(name = "phone_desc")
    private String phoneDesc;    //商品（手机）描述
    @Column(name = "model_number")
    private String modelNumber; //手机型号
    @Column
    private String year;   //手机上市年
    @Column
    private String month;//手机上市月
    @Column
    private String length;//机身长度
    @Column
    private String width;//机身宽度
    @Column
    private String thickness;//机身厚度
    @Column
    private String weight;//机身重量
    @Column
    private String material;//机身材质
    @Column
    private String os;//操作系统

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhoneDesc() {
        return phoneDesc;
    }

    public void setPhoneDesc(String phoneDesc) {
        this.phoneDesc = phoneDesc;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
