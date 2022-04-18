package br.com.itcode.myfood.register.common.mapper.service;

import br.com.itcode.myfood.register.common.mapper.factory.ClientRegisterMapperFactory;
import br.com.itcode.myfood.register.domain.dto.ClientRegisterDTO;
import br.com.itcode.myfood.register.domain.entity.ClientRegisterModel;
import org.modelmapper.ModelMapper;

public class ClientRegisterMapperService implements ClientRegisterMapperFactory {

    private final ModelMapper modelMapper;

    public ClientRegisterMapperService() {
        this.modelMapper = new ModelMapper();
    }


    @Override
    public ClientRegisterDTO entityToDTO(ClientRegisterModel entity) {
        return modelMapper.map(entity, ClientRegisterDTO.class);
    }

    @Override
    public ClientRegisterModel dtoToEntity(ClientRegisterDTO dto) {
        return modelMapper.map(dto, ClientRegisterModel.class);
    }

    @Override
    public ClientRegisterDTO savedDtoToEntity(ClientRegisterDTO dto) {
        return null;
    }
}
