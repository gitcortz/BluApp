package com.bluflex.blurestapp.services;

import com.bluflex.blurestapp.api.v1.mapper.PurchaseOrderMapper;
import com.bluflex.blurestapp.api.v1.model.PurchaseOrderDTO;
import com.bluflex.blurestapp.domain.PurchaseOrder;
import com.bluflex.blurestapp.repositories.PurchaseOrderRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PurchaseOrderServiceImpl implements PurchaseOrderService {

    private final PurchaseOrderMapper purchaseOrderMapper;
    private final PurchaseOrderRepository purchaseOrderRepository;

    public PurchaseOrderServiceImpl(PurchaseOrderMapper purchaseOrderMapper,
                                    PurchaseOrderRepository purchaseOrderRepository) {
        this.purchaseOrderMapper = purchaseOrderMapper;
        this.purchaseOrderRepository = purchaseOrderRepository;
    }

    @Override
    public List<PurchaseOrderDTO> getAllPurchaseOrders() {

        return purchaseOrderRepository.findAll()
                .stream()
                .map(purchaseOrderMapper::purchaseOrderToPurchaseOrderDTO)
                .collect(Collectors.toList());

    }

    @Override
    public PurchaseOrderDTO getPurchaseOrderByPoNumber(String poNumber) {
        return null;
    }
}
