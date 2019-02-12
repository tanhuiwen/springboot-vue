package com.sue.springbootvue.repository;

import com.sue.springbootvue.entity.MobilePhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobilePhoneRepository extends JpaRepository<MobilePhone,Integer> {
}
