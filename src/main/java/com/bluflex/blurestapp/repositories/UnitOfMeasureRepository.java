package com.bluflex.blurestapp.repositories;

import com.bluflex.blurestapp.domain.UnitOfMeasure;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends JpaRepository<UnitOfMeasure, Long> {
    UnitOfMeasure findByName(String name);
}
