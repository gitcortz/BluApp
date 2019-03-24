package com.bluflex.blurestapp.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class PurchaseOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String poNumber;
    private Date orderDate;
    @Enumerated(value = EnumType.STRING)
    private PurchaseOrderStatus status;
    private BigDecimal totalAmount;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "purchaseOrder")
    private Set<PurchaseOrderLine> purchaseOrderLines = new HashSet<>();


    @JsonFormat(pattern = "yyyy-mm-dd")
    @Column(updatable = false)
    private Date createdAt;
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date updatedAt;

    public PurchaseOrder addPurchaseOrderLine(PurchaseOrderLine purchaseOrderLine){
        purchaseOrderLine.setPurchaseOrder(this);
        this.purchaseOrderLines.add(purchaseOrderLine);
        return this;
    }
}
