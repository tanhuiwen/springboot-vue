package com.sue.springbootvue.repository;

import com.sue.springbootvue.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
    /**
     * 根据id“删除”该供应商（修改供应商状态）
     * @param id
     */
    @Transactional
    @Modifying
    @Query("update Supplier supplier set supplier.status=1 where supplier.id=:id")
    void delete(@Param("id") Integer id);

    /**
     * 修改供应商名称
     * @param id
     * @param supplierName
     */
    @Transactional
    @Modifying
    @Query("update Supplier supplier set supplier.supplierName=:supplierName where supplier.id=:id")
    void updateSupplierName(@Param("id") Integer id, @Param("supplierName") String supplierName);

    /**
     * 修改供应商地址
     * @param id
     * @param supplierAddress
     */
    @Transactional
    @Modifying
    @Query("update Supplier supplier set supplier.supplierAddress=:supplierAddress where supplier.id=:id")
    void updateSupplierAddress(@Param("id") Integer id, @Param("supplierAddress") String supplierAddress);

    /**
     * 修改联系人
     * @param id
     * @param contactName
     */
    @Transactional
    @Modifying
    @Query("update Supplier supplier set supplier.contactName=:contactName where supplier.id=:id")
    void updateContactName(@Param("id") Integer id, @Param("contactName") String contactName);

    /**
     * 修改联系电话
     * @param id
     * @param contactPhone
     */
    @Transactional
    @Modifying
    @Query("update Supplier supplier set supplier.contactPhone=:contactPhone where supplier.id=:id")
    void updateContactPhone(@Param("id") Integer id, @Param("contactPhone") String contactPhone);
}
