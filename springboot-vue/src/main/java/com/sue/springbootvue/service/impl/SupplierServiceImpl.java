package com.sue.springbootvue.service.impl;

import com.sue.springbootvue.entity.Supplier;
import com.sue.springbootvue.repository.SupplierRepository;
import com.sue.springbootvue.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SupplierServiceImpl implements SupplierService {
    private SupplierRepository supplierRepository;

    @Autowired
    public SupplierServiceImpl(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @Override
    public Supplier addSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    @Override
    public boolean deleteSupplier(Integer id) {
        supplierRepository.delete(id);
        return true;
    }

    @Override
    public Supplier updateSupplier(Supplier supplier) {
        if (supplier.getSupplierName() != null) {
            supplierRepository.updateSupplierName(supplier.getId(), supplier.getSupplierName());
        }
        if (supplier.getSupplierAddress() != null) {
            supplierRepository.updateSupplierAddress(supplier.getId(), supplier.getSupplierAddress());
        }
        if (supplier.getContactName() != null) {
            supplierRepository.updateContactName(supplier.getId(), supplier.getContactName());
        }
        if (supplier.getContactPhone() != null) {
            supplierRepository.updateContactPhone(supplier.getId(), supplier.getContactPhone());
        }
        return supplierRepository.getOne(supplier.getId());
    }

    @Override
    public Supplier getOne(Integer id) {
        return supplierRepository.getOne(id);
    }

    @Override
    public List<Supplier> findAll() {
        return supplierRepository.findAll();
    }
}
