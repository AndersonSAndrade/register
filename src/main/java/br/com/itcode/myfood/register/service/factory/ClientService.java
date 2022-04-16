package br.com.itcode.myfood.register.service.factory;

import br.com.itcode.myfood.register.domain.dto.ClientRegisterDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {
    ClientRegisterDTO saved(ClientRegisterDTO clientRegisterDTO);
    List<ClientRegisterDTO> findAll();
    ClientRegisterDTO updated(ClientRegisterDTO clientRegisterDTO);
    void deleted(Long id);
}
