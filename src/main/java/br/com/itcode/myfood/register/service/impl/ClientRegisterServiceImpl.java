package br.com.itcode.myfood.register.service.impl;

import br.com.itcode.myfood.register.domain.dto.ClientRegisterDTO;
import br.com.itcode.myfood.register.service.factory.ClientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ClientRegisterServiceImpl implements ClientService {
    private static final Logger LOG = LoggerFactory.getLogger(ClientRegisterServiceImpl.class);

    @Override
    public ClientRegisterDTO saved(ClientRegisterDTO clientRegisterDTO) {
        return null;
    }

    @Override
    public List<ClientRegisterDTO> findAll() {
        return null;
    }

    @Override
    public ClientRegisterDTO updated(ClientRegisterDTO clientRegisterDTO) {
        return null;
    }

    @Override
    public void deleted(Long id) {

    }
}
