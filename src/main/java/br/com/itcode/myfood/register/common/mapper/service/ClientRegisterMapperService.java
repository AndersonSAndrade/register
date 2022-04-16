package br.com.itcode.myfood.register.common.mapper.service;

import br.com.itcode.myfood.register.common.mapper.factory.ClientRegisterMapperFactory;
import br.com.itcode.myfood.register.domain.dto.ClientRegisterDTO;
import br.com.itcode.myfood.register.domain.entity.ClientRegisterModel;

public class ClientRegisterMapperService implements ClientRegisterMapperFactory {


    @Override
    public ClientRegisterDTO entityToDTO(ClientRegisterModel entity) {
        return null;
    }

    @Override
    public ClientRegisterModel dtoToEntity(ClientRegisterDTO dto) {
        return null;
    }
}
