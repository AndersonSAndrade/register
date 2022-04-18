package br.com.itcode.myfood.register.service.factory;

import br.com.itcode.myfood.register.domain.dto.ClientRegisterDTO;

import java.util.List;

public interface ClientService {
    ClientRegisterDTO saved(ClientRegisterDTO clientRegisterDTO);
    List<ClientRegisterDTO> findAll();
    ClientRegisterDTO updated(ClientRegisterDTO clientRegisterDTO);
    ClientRegisterDTO findById(Long id);
    void deleted(Long id);
}
