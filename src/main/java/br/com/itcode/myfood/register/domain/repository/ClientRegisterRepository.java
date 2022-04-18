package br.com.itcode.myfood.register.domain.repository;

import br.com.itcode.myfood.register.domain.entity.ClientRegisterModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRegisterRepository extends JpaRepository<ClientRegisterModel, Long> {
}
