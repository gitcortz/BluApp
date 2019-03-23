package com.bluflex.blurestapp.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class PurchaseOrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal quantity;

    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure uom;

    @OneToOne(fetch = FetchType.EAGER)
    private Product product;

    private BigDecimal unitPrice;
    private String color;
    private String size;

    @ManyToOne
    private PurchaseOrder purchaseOrder;

    @JsonFormat(pattern = "yyyy-mm-dd")
    @Column(updatable = false)
    private Date createdAt;
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date updatedAt;
}
