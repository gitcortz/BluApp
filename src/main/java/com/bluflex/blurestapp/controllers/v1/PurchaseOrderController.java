package com.bluflex.blurestapp.controllers.v1;

import com.bluflex.blurestapp.api.v1.model.PurchaseOrderDTO;
import com.bluflex.blurestapp.domain.PurchaseOrder;
import com.bluflex.blurestapp.services.PurchaseOrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(PurchaseOrderController.BASE_URL)
public class PurchaseOrderController {
    public static final String BASE_URL = "/api/v1/purchaseOrder";

    private final PurchaseOrderService purchaseOrderService;

    public PurchaseOrderController(PurchaseOrderService purchaseOrderService) {
        this.purchaseOrderService = purchaseOrderService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PurchaseOrderDTO> getAllPurchaseOrders() {
        return purchaseOrderService.getAllPurchaseOrders();
    }

    @GetMapping("{poNumber}")
    @ResponseStatus(HttpStatus.OK)
    public PurchaseOrderDTO getPurchaseOrderByPoNumber(@PathVariable String poNumber){
        return purchaseOrderService.getPurchaseOrderByPoNumber(poNumber);
    }
}
