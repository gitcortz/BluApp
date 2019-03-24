package com.bluflex.blurestapp.services;

import com.bluflex.blurestapp.api.v1.model.PurchaseOrderDTO;
import com.bluflex.blurestapp.domain.PurchaseOrder;

import java.util.List;

public interface PurchaseOrderService {

    List<PurchaseOrderDTO> getAllPurchaseOrders();

    PurchaseOrderDTO getPurchaseOrderByPoNumber(String poNumber);
}
