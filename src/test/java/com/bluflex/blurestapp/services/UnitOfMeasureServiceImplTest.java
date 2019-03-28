package com.bluflex.blurestapp.services;

import com.bluflex.blurestapp.api.v1.mapper.UnitOfMeasureMapper;
import com.bluflex.blurestapp.api.v1.model.PurchaseOrderDTO;
import com.bluflex.blurestapp.api.v1.model.UnitOfMeasureDTO;
import com.bluflex.blurestapp.domain.PurchaseOrder;
import com.bluflex.blurestapp.domain.UnitOfMeasure;
import com.bluflex.blurestapp.repositories.UnitOfMeasureRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class UnitOfMeasureServiceImplTest {

    UnitOfMeasureService unitOfMeasureService;

    @Mock
    UnitOfMeasureRepository unitOfMeasureRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        unitOfMeasureService = new UnitOfMeasureServiceImpl(UnitOfMeasureMapper.INSTANCE,
                                            unitOfMeasureRepository);
    }


    @Test
    public void getAllUnitOfMeasure() {
        //given
        List<UnitOfMeasure> uoms = Arrays.asList(new UnitOfMeasure());

        when(unitOfMeasureRepository.findAll()).thenReturn(uoms);

        //when
        Set<UnitOfMeasureDTO> unitOfMeasureDTOS = unitOfMeasureService.getAllUnitOfMeasure();

        //then
        assertEquals(1, unitOfMeasureDTOS.size());
        verify(unitOfMeasureRepository, times(1)).findAll();

    }

    @Test
    public void findByName() {
        //given
        UnitOfMeasure uom = new UnitOfMeasure();
        uom.setName("pc");

        when(unitOfMeasureRepository.findByName(anyString())).thenReturn(uom);

        //when
        UnitOfMeasureDTO unitOfMeasureDTO = unitOfMeasureService.getByName(anyString());

        //then
        assertEquals("pc", unitOfMeasureDTO.getName());
        verify(unitOfMeasureRepository, times(1)).findByName("");
    }
}