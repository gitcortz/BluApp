package com.bluflex.blurestapp.repositories;

import com.bluflex.blurestapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByName(String name);
}
