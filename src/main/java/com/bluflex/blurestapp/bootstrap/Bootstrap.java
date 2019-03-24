package com.bluflex.blurestapp.bootstrap;

import com.bluflex.blurestapp.domain.PurchaseOrder;
import com.bluflex.blurestapp.domain.PurchaseOrderLine;
import com.bluflex.blurestapp.repositories.PurchaseOrderLineRepository;
import com.bluflex.blurestapp.repositories.PurchaseOrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Bootstrap implements CommandLineRunner {

    private PurchaseOrderRepository purchaseOrderRepository;
    private PurchaseOrderLineRepository purchaseOrderLineRepository;

    public Bootstrap(PurchaseOrderRepository purchaseOrderRepository,
                     PurchaseOrderLineRepository purchaseOrderLineRepository) {
        this.purchaseOrderRepository = purchaseOrderRepository;
        this.purchaseOrderLineRepository = purchaseOrderLineRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        PurchaseOrder po = new PurchaseOrder();
        po.setPoNumber("PO-12233");
        po.setTotalAmount(new BigDecimal(100.23));
        purchaseOrderRepository.save(po);

        PurchaseOrderLine poline = new PurchaseOrderLine();
        poline.setPurchaseOrder(po);
        poline.setQuantity(new BigDecimal(1));
        poline.setSize("L");
        purchaseOrderLineRepository.save(poline);


        System.out.println("Data loaded " + purchaseOrderRepository.count());
        System.out.println("Data loaded " + purchaseOrderLineRepository.count());

    }
}
