package com.sue.springbootvue.entity;

import javax.persistence.*;

@Entity
@Table(name = "supplier", schema = "springbootvue")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Integer id;//id
    @Column(name = "supplier_name")
    private String supplierName;//供应商名称
    @Column(name = "supplier_address")
    private String supplierAddress;//供应商地址
    @Column(name = "contact_name")
    private String contactName;//联系人姓名
    @Column(name = "contact_phone")
    private String contactPhone;//联系电话
    @Column
    private Integer status = 0;//状态

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
