package com.bluflex.blurestapp.respositories;

import com.bluflex.blurestapp.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
