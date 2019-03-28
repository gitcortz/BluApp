package com.bluflex.blurestapp.api.v1.mapper;

import com.bluflex.blurestapp.api.v1.model.PurchaseOrderDTO;
import com.bluflex.blurestapp.api.v1.model.PurchaseOrderLineDTO;
import com.bluflex.blurestapp.domain.PurchaseOrder;
import com.bluflex.blurestapp.domain.PurchaseOrderLine;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PurchaseOrderLineMapper {

    PurchaseOrderLineMapper INSTANCE = Mappers.getMapper(PurchaseOrderLineMapper.class);

    PurchaseOrderLineDTO purchaseOrderLineToPurchaseOrderLineDTO(PurchaseOrderLine purchaseOrderLine);

}

