package com.bluflex.blurestapp.api.v1.mapper;

import com.bluflex.blurestapp.api.v1.model.PurchaseOrderDTO;
import com.bluflex.blurestapp.domain.PurchaseOrder;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PurchaseOrderMapperTest {

    private static final String PO_NUMBER = "PO-0001";
    private static final BigDecimal TOTAL_AMOUNT = new BigDecimal("10.00");
    PurchaseOrderMapper purchaseOrderMapper = PurchaseOrderMapper.INSTANCE;

    @Test
    public void purchaseOrderToPurchaseOrderDTO() {
        //given
        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.setPoNumber(PO_NUMBER);
        purchaseOrder.setTotalAmount(TOTAL_AMOUNT);

        //when
        PurchaseOrderDTO purchaseOrderDTO = purchaseOrderMapper.purchaseOrderToPurchaseOrderDTO(purchaseOrder);

        //then
        assertEquals(PO_NUMBER, purchaseOrderDTO.getPoNumber());
        assertEquals(TOTAL_AMOUNT, purchaseOrderDTO.getTotalAmount());
    }
}