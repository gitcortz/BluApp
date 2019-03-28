package com.bluflex.blurestapp.services;

import com.bluflex.blurestapp.api.v1.model.UnitOfMeasureDTO;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureDTO> getAllUnitOfMeasure();

    UnitOfMeasureDTO getByName(String name);
}
