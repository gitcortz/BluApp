package com.bluflex.blurestapp.api.v1.mapper;

import com.bluflex.blurestapp.api.v1.model.UnitOfMeasureDTO;
import com.bluflex.blurestapp.domain.UnitOfMeasure;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UnitOfMeasureMapper {

    UnitOfMeasureMapper INSTANCE = Mappers.getMapper(UnitOfMeasureMapper.class);

    UnitOfMeasureDTO toUnitOfMeasureDTO(UnitOfMeasure unitOfMeasure);

}
