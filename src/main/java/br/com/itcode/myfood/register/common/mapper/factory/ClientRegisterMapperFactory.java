package br.com.itcode.myfood.register.common.mapper.factory;

import br.com.itcode.myfood.register.domain.dto.ClientRegisterDTO;
import br.com.itcode.myfood.register.domain.entity.ClientRegisterModel;

public interface ClientRegisterMapperFactory {

    ClientRegisterDTO entityToDTO(ClientRegisterModel entity);
    ClientRegisterModel dtoToEntity(ClientRegisterDTO dto);
    ClientRegisterDTO savedDtoToEntity(ClientRegisterDTO dto);

}
