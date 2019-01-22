package com.sue.springbootvue.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "user", schema = "springbootvue")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private int id;//用户ID
    @Column
    private String username;//用户名
    @Column
    private String password;//密码
    @Column(name = "phone_number")
    private String phoneNumber;//手机号码
    @Column
    private String email;//个人邮箱
    @OneToMany(mappedBy = "userByUserId")
    private Collection<UserAddress> userAddressesById;
    @Column
    private String department;//部门
    @Column
    private Integer status=0;//状态

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Collection<UserAddress> getUserAddressesById() {
        return userAddressesById;
    }

    public void setUserAddressesById(Collection<UserAddress> userAddressesById) {
        this.userAddressesById = userAddressesById;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) { this.department = department; }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        status = status;
    }
}
