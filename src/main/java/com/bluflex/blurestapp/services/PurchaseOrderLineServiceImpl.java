package com.bluflex.blurestapp.services;

import com.bluflex.blurestapp.api.v1.mapper.PurchaseOrderLineMapper;
import com.bluflex.blurestapp.api.v1.model.PurchaseOrderLineDTO;
import com.bluflex.blurestapp.domain.PurchaseOrder;
import com.bluflex.blurestapp.repositories.PurchaseOrderRepository;

import java.util.List;

public class PurchaseOrderLineServiceImpl implements PurchaseOrderLineService {

    private final PurchaseOrderLineMapper purchaseOrderLineMapper;
    private final PurchaseOrderRepository purchaseOrderRepository;


    public PurchaseOrderLineServiceImpl(PurchaseOrderLineMapper purchaseOrderLineMapper,
                                        PurchaseOrderRepository purchaseOrderRepository) {
        this.purchaseOrderLineMapper = purchaseOrderLineMapper;
        this.purchaseOrderRepository = purchaseOrderRepository;
    }

    @Override
    public List<PurchaseOrderLineDTO> getAllPurchaseOrderLine(String poNumber) {
        //PurchaseOrder po = purchaseOrderRepository.findByPoNumber(poNumber);


        return null;
    }

    @Override
    public PurchaseOrderLineDTO getPurchaseOrderLineById(Long id) {
        return null;
    }
}
