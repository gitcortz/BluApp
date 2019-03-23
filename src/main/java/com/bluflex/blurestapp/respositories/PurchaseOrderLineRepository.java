package com.bluflex.blurestapp.respositories;

import com.bluflex.blurestapp.domain.PurchaseOrderLine;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseOrderLineRepository extends CrudRepository<PurchaseOrderLine, Long> {
}
