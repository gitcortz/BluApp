package com.bluflex.blurestapp.repositories;

import com.bluflex.blurestapp.domain.PurchaseOrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderLineRepository extends JpaRepository<PurchaseOrderLine, Long> {
    
}
