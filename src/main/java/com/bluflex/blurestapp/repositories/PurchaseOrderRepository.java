package com.bluflex.blurestapp.repositories;

import com.bluflex.blurestapp.domain.PurchaseOrder;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseOrderRepository extends CrudRepository<PurchaseOrder, Long> {
}
