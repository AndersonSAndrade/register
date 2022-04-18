package br.com.itcode.myfood.register.service.impl;

import br.com.itcode.myfood.register.common.mapper.service.ClientRegisterMapperService;
import br.com.itcode.myfood.register.domain.dto.ClientRegisterDTO;
import br.com.itcode.myfood.register.domain.repository.ClientRegisterRepository;
import br.com.itcode.myfood.register.service.factory.ClientService;
import br.com.itcode.myfood.register.validation.errors.ApiRuntimeError;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ClientRegisterServiceImpl implements ClientService {
    private static final Logger LOG = LoggerFactory.getLogger(ClientRegisterServiceImpl.class);

    private final ClientRegisterRepository clientRegisterRepository;
    private final ClientRegisterMapperService clientRegisterMapperService;

    @Override
    public List<ClientRegisterDTO> findAll() {
        LOG.info("Client Listing Success");
        return clientRegisterRepository.findAll()
                .stream()
                .map(clientRegisterMapperService::entityToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ClientRegisterDTO findById(Long id) {
        LOG.info("Client FindByID Success");
        return clientRegisterRepository.findById(id).map(clientRegisterMapperService::entityToDTO).orElseGet(ClientRegisterDTO::new);
    }

    @Override
    public ClientRegisterDTO saved(ClientRegisterDTO clientRegisterDTO) {
        var clientEntity = clientRegisterRepository.save(clientRegisterMapperService.dtoToEntity(clientRegisterDTO));
        LOG.info("Client Saved Success");
        return clientRegisterMapperService.entityToDTO(clientEntity);
    }

    @Override
    public ClientRegisterDTO updated(ClientRegisterDTO clientRegisterDTO) {
        var clientEntity = clientRegisterRepository.save(clientRegisterMapperService.dtoToEntity(clientRegisterDTO));
        LOG.info("Client Saved Success");
        return clientRegisterMapperService.entityToDTO(clientEntity);
    }

    @Override
    public void deleted(Long id) {
        if(clientRegisterRepository.findById(id).isPresent()){
            LOG.info("Client Saved Success");
            clientRegisterRepository.deleteById(id);
        }
    }
}
