package com.bluflex.blurestapp.services;

import com.bluflex.blurestapp.api.v1.mapper.PurchaseOrderMapper;
import com.bluflex.blurestapp.api.v1.model.PurchaseOrderDTO;
import com.bluflex.blurestapp.domain.PurchaseOrder;
import com.bluflex.blurestapp.repositories.PurchaseOrderRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class PurchaseOrderServiceImplTest {

    PurchaseOrderService purchaseOrderService;

    @Mock
    PurchaseOrderRepository purchaseOrderRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        purchaseOrderService = new PurchaseOrderServiceImpl(PurchaseOrderMapper.INSTANCE,
                                                                purchaseOrderRepository);
    }

    @Test
    public void getAllPurchaseOrders() {
        //given
        List<PurchaseOrder> purchaseOrders = Arrays.asList(new PurchaseOrder(), new PurchaseOrder());

        when(purchaseOrderRepository.findAll()).thenReturn(purchaseOrders);

        //when
        List<PurchaseOrderDTO> purchaseOrderDTOs = purchaseOrderService.getAllPurchaseOrders();

        //then
        assertEquals(2, purchaseOrderDTOs.size());

    }

    @Test
    public void getPurchaseOrderByPoNumber() {
    }
}