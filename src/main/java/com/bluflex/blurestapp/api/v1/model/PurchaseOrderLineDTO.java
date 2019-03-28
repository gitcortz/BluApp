package com.bluflex.blurestapp.api.v1.model;

import com.bluflex.blurestapp.domain.Product;
import com.bluflex.blurestapp.domain.PurchaseOrder;
import com.bluflex.blurestapp.domain.UnitOfMeasure;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PurchaseOrderLineDTO {

    private Long id;
    private BigDecimal quantity;
    private UnitOfMeasure uom;
    private Product product;
    private BigDecimal unitPrice;
    private String color;
    private String size;
    private Date createdAt;
    private Date updatedAt;
}
