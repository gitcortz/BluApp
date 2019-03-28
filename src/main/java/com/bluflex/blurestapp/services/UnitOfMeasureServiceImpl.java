package com.bluflex.blurestapp.services;

import com.bluflex.blurestapp.api.v1.mapper.UnitOfMeasureMapper;
import com.bluflex.blurestapp.api.v1.model.UnitOfMeasureDTO;
import com.bluflex.blurestapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UnitOfMeasureServiceImpl implements UnitOfMeasureService {

    UnitOfMeasureMapper unitOfMeasureMapper;
    UnitOfMeasureRepository unitOfMeasureRepository;

    public UnitOfMeasureServiceImpl(UnitOfMeasureMapper unitOfMeasureMapper,
                                    UnitOfMeasureRepository unitOfMeasureRepository) {
        this.unitOfMeasureMapper = unitOfMeasureMapper;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @Override
    public Set<UnitOfMeasureDTO> getAllUnitOfMeasure() {
        return this.unitOfMeasureRepository.findAll()
                .stream()
                .map(unitOfMeasureMapper::toUnitOfMeasureDTO)
                .collect(Collectors.toSet());
    }

    @Override
    public UnitOfMeasureDTO getByName(String name) {
        return unitOfMeasureMapper.toUnitOfMeasureDTO(this.unitOfMeasureRepository.findByName(name));
    }
}
