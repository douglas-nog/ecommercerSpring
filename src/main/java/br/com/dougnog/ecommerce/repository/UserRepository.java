package br.com.dougnog.ecommerce.repository;

import br.com.dougnog.ecommerce.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.context.annotation.ApplicationScope;

@ApplicationScope
public interface UserRepository extends JpaRepository<User, Long> {
}
