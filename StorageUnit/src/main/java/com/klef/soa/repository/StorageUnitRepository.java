package com.klef.soa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.soa.entity.StorageUnit;

@Repository
public interface StorageUnitRepository extends JpaRepository<StorageUnit, Long> {
}