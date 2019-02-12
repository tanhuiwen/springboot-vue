package com.sue.springbootvue.service;

import com.sue.springbootvue.entity.MobilePhone;

import java.util.List;

public interface MobilePhoneService {
    public void delete();
    public void updateMobilePhone();
    public List<MobilePhone> findAll();
}
