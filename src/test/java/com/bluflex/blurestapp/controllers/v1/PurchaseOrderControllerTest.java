package com.bluflex.blurestapp.controllers.v1;

import com.bluflex.blurestapp.api.v1.model.PurchaseOrderDTO;
import com.bluflex.blurestapp.domain.PurchaseOrder;
import com.bluflex.blurestapp.services.PurchaseOrderService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class PurchaseOrderControllerTest {

    public static final String PO_NUMBER = "PO-0001";

    @Mock
    PurchaseOrderService purchaseOrderService;

    @InjectMocks
    PurchaseOrderController purchaseOrderController;

    MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        mockMvc = MockMvcBuilders.standaloneSetup(purchaseOrderController)
                //.setControllerAdvice(new RestResponseEntityExceptionHandler())
                .build();
    }

    @Test
    public void getAllPurchaseOrdersTest() throws Exception {
        PurchaseOrderDTO purchaseOrderDTO = new PurchaseOrderDTO();
        purchaseOrderDTO.setId(11L);
        purchaseOrderDTO.setPoNumber(PO_NUMBER);

        PurchaseOrderDTO purchaseOrderDTO2 = new PurchaseOrderDTO();
        purchaseOrderDTO.setId(22L);
        purchaseOrderDTO.setPoNumber(PO_NUMBER);

        List<PurchaseOrderDTO> purchaseOrders = Arrays.asList(purchaseOrderDTO, purchaseOrderDTO2);

        when(purchaseOrderService.getAllPurchaseOrders()).thenReturn(purchaseOrders);

        mockMvc.perform(get(PurchaseOrderController.BASE_URL)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)));
    }

    @Test
    public void getPurchaseOrderByPoNumberTest() throws Exception {
        PurchaseOrderDTO purchaseOrderDTO = new PurchaseOrderDTO();
        purchaseOrderDTO.setId(11L);
        purchaseOrderDTO.setPoNumber(PO_NUMBER);


        when(purchaseOrderService.getPurchaseOrderByPoNumber(anyString())).thenReturn(purchaseOrderDTO);

        mockMvc.perform(get(PurchaseOrderController.BASE_URL + "/PO-0001")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.poNumber", equalTo(PO_NUMBER)));
    }
}