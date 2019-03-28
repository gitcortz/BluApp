package com.bluflex.blurestapp.api.v1.model;

import com.bluflex.blurestapp.domain.PurchaseOrderLine;
import com.bluflex.blurestapp.domain.PurchaseOrderStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Data
public class PurchaseOrderDTO {
    private Long id;
    private String poNumber;
    private Date orderDate;
    @Enumerated(value = EnumType.STRING)
    private PurchaseOrderStatus status;
    private BigDecimal totalAmount;
    private Set<PurchaseOrderLine> purchaseOrderLines = new HashSet<>();

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date createdAt;
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date updatedAt;

}
