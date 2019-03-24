package com.bluflex.blurestapp.bootstrap;

import com.bluflex.blurestapp.domain.PurchaseOrder;
import com.bluflex.blurestapp.domain.PurchaseOrderLine;
import com.bluflex.blurestapp.repositories.PurchaseOrderLineRepository;
import com.bluflex.blurestapp.repositories.PurchaseOrderRepository;
import com.bluflex.blurestapp.repositories.UnitOfMeasureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class Bootstrap implements CommandLineRunner {

    private PurchaseOrderRepository purchaseOrderRepository;
    private PurchaseOrderLineRepository purchaseOrderLineRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public Bootstrap(PurchaseOrderRepository purchaseOrderRepository,
                     PurchaseOrderLineRepository purchaseOrderLineRepository,
                        UnitOfMeasureRepository unitOfMeasureRepository) {
        this.purchaseOrderRepository = purchaseOrderRepository;
        this.purchaseOrderLineRepository = purchaseOrderLineRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        PurchaseOrder po = new PurchaseOrder();
        po.setPoNumber("PO-12233");
        po.setTotalAmount(new BigDecimal(100.23));

        PurchaseOrderLine poline = new PurchaseOrderLine();
        poline.setPurchaseOrder(po);
        poline.setQuantity(new BigDecimal(1));
        poline.setSize("L");

        po.addPurchaseOrderLine(poline);

        purchaseOrderRepository.save(po);

        /*
        PurchaseOrderLine poline = new PurchaseOrderLine();
        poline.setPurchaseOrder(po);
        poline.setQuantity(new BigDecimal(1));
        poline.setSize("L");
        purchaseOrderLineRepository.save(poline);
*/

        System.out.println("Data loaded " + purchaseOrderRepository.count());
        System.out.println("Data loaded " + purchaseOrderLineRepository.count());
        Iterable<PurchaseOrder> purchaseOrders = purchaseOrderRepository.findAll();

        purchaseOrders.forEach(purchaseOrder -> System.out.println(purchaseOrder.getId()));
    }
}
