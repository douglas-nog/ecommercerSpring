package br.com.dougnog.ecommerce.repository;

import br.com.dougnog.ecommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
