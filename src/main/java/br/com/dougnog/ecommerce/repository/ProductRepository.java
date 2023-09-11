package br.com.dougnog.ecommerce.repository;

import br.com.dougnog.ecommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
