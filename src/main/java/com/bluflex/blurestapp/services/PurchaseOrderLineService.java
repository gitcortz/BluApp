package com.bluflex.blurestapp.services;

import com.bluflex.blurestapp.api.v1.model.PurchaseOrderDTO;
import com.bluflex.blurestapp.api.v1.model.PurchaseOrderLineDTO;

import java.util.List;

public interface PurchaseOrderLineService {
    List<PurchaseOrderLineDTO> getAllPurchaseOrderLine(String poNumber);

    PurchaseOrderLineDTO getPurchaseOrderLineById(Long id);
}
