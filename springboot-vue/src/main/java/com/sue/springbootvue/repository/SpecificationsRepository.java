package com.sue.springbootvue.repository;

import com.sue.springbootvue.entity.Specifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecificationsRepository extends JpaRepository<Specifications,Integer> {
}
