package com.bluflex.blurestapp.controllers.v1;

import com.bluflex.blurestapp.api.v1.model.UnitOfMeasureDTO;
import com.bluflex.blurestapp.domain.UnitOfMeasure;
import com.bluflex.blurestapp.services.UnitOfMeasureService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class UnitOfMeasureControllerTest {

    @Mock
    UnitOfMeasureService unitOfMeasureService;

    @InjectMocks
    UnitOfMeasureController unitOfMeasureController;

    MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        mockMvc = MockMvcBuilders.standaloneSetup(unitOfMeasureController)
                //.setControllerAdvice(new RestResponseEntityExceptionHandler())
                .build();
    }

    @Test
    public void getAllUnitOfMeasure() throws Exception {

        UnitOfMeasureDTO unitOfMeasureDTO = new UnitOfMeasureDTO();
        unitOfMeasureDTO.setId(1L);
        unitOfMeasureDTO.setName("pc");

        Set<UnitOfMeasureDTO> uoms = new HashSet<>(Arrays.asList(unitOfMeasureDTO, new UnitOfMeasureDTO()));

        when(unitOfMeasureService.getAllUnitOfMeasure()).thenReturn(uoms);


        mockMvc.perform(get(UnitOfMeasureController.BASE_URL)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
                //.andExpect(jsonPath("$.categories", hasSize(2)));

    }

    @Test
    public void getUnitOfMeasureByName() throws Exception {

        when(unitOfMeasureService.getByName("pc")).thenReturn(new UnitOfMeasureDTO());

        mockMvc.perform(get(UnitOfMeasureController.BASE_URL)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}