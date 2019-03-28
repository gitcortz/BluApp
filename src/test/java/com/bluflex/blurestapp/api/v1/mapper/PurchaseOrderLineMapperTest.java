package com.bluflex.blurestapp.api.v1.mapper;

import com.bluflex.blurestapp.api.v1.model.PurchaseOrderLineDTO;
import com.bluflex.blurestapp.domain.Product;
import com.bluflex.blurestapp.domain.PurchaseOrder;
import com.bluflex.blurestapp.domain.PurchaseOrderLine;
import com.bluflex.blurestapp.domain.UnitOfMeasure;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PurchaseOrderLineMapperTest {

    PurchaseOrderLineMapper purchaseOrderLineMapper = PurchaseOrderLineMapper.INSTANCE;

    private static final String PO_NUMBER = "PO-0001";

    @Test
    public void purchaseOrderLineToPurchaseOrderLineDTO() {
        //given
        /*PurchaseOrderLine poLine = new PurchaseOrderLine();
        poLine.setSize("L");
        poLine.setQuantity(new BigDecimal(1));
        poLine.setColor("none");

        Product product = new Product();
        product.setName("Shirt");
        poLine.setProduct(product);

        UnitOfMeasure uom = new UnitOfMeasure();
        uom.setName("pc");
        poLine.setUom(uom);

        //when
        PurchaseOrderLineDTO purchaseOrderLineDTO = purchaseOrderLineMapper.purchaseOrderLineToPurchaseOrderLineDTO(poLine);

        //then
        assertEquals("Shirt", purchaseOrderLineDTO.getProduct().getName());
        assertEquals("pc", purchaseOrderLineDTO.getUom().getName());
        assertEquals(new BigDecimal(1), purchaseOrderLineDTO.getQuantity());
*/

    }
}