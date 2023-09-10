package br.com.dougnog.ecommerce.repository;

import br.com.dougnog.ecommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
