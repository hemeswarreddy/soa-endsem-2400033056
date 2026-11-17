package com.klef.soa.service;

import java.util.List;

import com.klef.soa.entity.StorageUnit;

public interface StorageUnitService {
    StorageUnit addstorageunit(StorageUnit storageUnit);
    String deletestorageunit(Long id);
    List<StorageUnit> displayallstorageUnits();
}

