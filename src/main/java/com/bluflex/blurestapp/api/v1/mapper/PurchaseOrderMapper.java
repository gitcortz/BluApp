package com.bluflex.blurestapp.api.v1.mapper;

import com.bluflex.blurestapp.api.v1.model.PurchaseOrderDTO;
import com.bluflex.blurestapp.domain.PurchaseOrder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PurchaseOrderMapper {

    PurchaseOrderMapper INSTANCE = Mappers.getMapper(PurchaseOrderMapper.class);

    PurchaseOrderDTO purchaseOrderToPurchaseOrderDTO(PurchaseOrder purchaseOrder);

    @Mapping( target = "purchaseOrderLines", ignore = true)
    PurchaseOrderDTO toPurchaseOrderDTOWithoutPurchaseOrderLines(PurchaseOrder purchaseOrder);

}
