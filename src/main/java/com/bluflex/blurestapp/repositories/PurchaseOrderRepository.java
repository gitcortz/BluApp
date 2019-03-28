package com.bluflex.blurestapp.repositories;

import com.bluflex.blurestapp.domain.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {
    PurchaseOrder findByPoNumber(String poNumber);
}
