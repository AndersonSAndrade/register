package br.com.itcode.myfood.register.configuration;

import br.com.itcode.myfood.register.common.mapper.service.ClientRegisterMapperService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    @Bean
    public ClientRegisterMapperService clientRegisterMapperService(){
        return new ClientRegisterMapperService();
    }

}
