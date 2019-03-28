package com.bluflex.blurestapp.controllers.v1;


import com.bluflex.blurestapp.api.v1.model.PurchaseOrderDTO;
import com.bluflex.blurestapp.api.v1.model.PurchaseOrderLineDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/purchaseOrderLine")
public class PurchaseOrderLineController {
    //public static final String BASE_URL = ;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PurchaseOrderLineDTO> getAllPurchaseOrderLine(@PathVariable String poNumber) {
        return  null;
    }

}
