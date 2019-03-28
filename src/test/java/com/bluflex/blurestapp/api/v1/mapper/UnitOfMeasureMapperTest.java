package com.bluflex.blurestapp.api.v1.mapper;

import com.bluflex.blurestapp.api.v1.model.UnitOfMeasureDTO;
import com.bluflex.blurestapp.domain.UnitOfMeasure;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class UnitOfMeasureMapperTest {

    UnitOfMeasureMapper unitOfMeasureMapper = UnitOfMeasureMapper.INSTANCE;

    @Test
    public void toUnitOfMeasureDTO() {
        //given
        UnitOfMeasure uom = new UnitOfMeasure();
        uom.setName("pc");
        uom.setId(1L);

        //when
        UnitOfMeasureDTO uomDTO = unitOfMeasureMapper.toUnitOfMeasureDTO(uom);

        //then
        assertEquals(uom.getId(), uomDTO.getId());
        assertEquals(uom.getName(), uomDTO.getName());

    }
}