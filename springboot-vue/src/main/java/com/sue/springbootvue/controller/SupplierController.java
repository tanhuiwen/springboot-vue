package com.sue.springbootvue.controller;

import com.sue.springbootvue.entity.Supplier;
import com.sue.springbootvue.result.Result;
import com.sue.springbootvue.result.ResultFactory;
import com.sue.springbootvue.service.impl.SupplierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class SupplierController {
    private SupplierServiceImpl supplierServiceImpl;
    @Autowired
    public SupplierController(SupplierServiceImpl supplierServiceImpl) {
        this.supplierServiceImpl = supplierServiceImpl;
    }
    @PostMapping(value = "/supplier")
    public Result addSupplier(@RequestBody Supplier supplier){
        return ResultFactory.buildSuccessResult(supplierServiceImpl.addSupplier(supplier));
    }
    @DeleteMapping(value = "/supplier/{id}")
    public Result deleteSupplier(@PathVariable Integer id){
        return ResultFactory.buildSuccessResult(supplierServiceImpl.deleteSupplier(id));
    }
    @PatchMapping(value = "/supplier")
    public Result updateSupplier(@RequestBody Supplier supplier){
        return ResultFactory.buildSuccessResult(supplierServiceImpl.updateSupplier(supplier));
    }
    @GetMapping(value = "/supplier/{id}")
    public Result getSupplier(@PathVariable Integer id){
        return ResultFactory.buildSuccessResult(supplierServiceImpl.getOne(id));
    }
    @GetMapping(value = "/suppliers")
    public Result getAll(){
        return ResultFactory.buildSuccessResult(supplierServiceImpl.findAll());
    }
}
