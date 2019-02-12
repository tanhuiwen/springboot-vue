package com.sue.springbootvue.service;

import com.sue.springbootvue.entity.Supplier;
import com.sue.springbootvue.entity.User;

import java.util.List;

public interface SupplierService {
    public Supplier addSupplier(Supplier supplier);

    public boolean deleteSupplier(Integer id);

    public Supplier updateSupplier(Supplier supplier);

    public Supplier getOne(Integer id);

    public List<Supplier> findAll();
}
