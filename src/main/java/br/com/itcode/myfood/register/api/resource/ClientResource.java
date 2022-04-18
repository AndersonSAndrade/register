package br.com.itcode.myfood.register.api.resource;

import br.com.itcode.myfood.register.domain.dto.ClientRegisterDTO;
import br.com.itcode.myfood.register.domain.entity.ClientRegisterModel;
import br.com.itcode.myfood.register.service.factory.ClientService;
import br.com.itcode.myfood.register.validation.errors.ApiRuntimeError;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Throw;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @Slf4j
@RequestMapping("/public/register")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ClientResource {
    private static final Logger LOG = LoggerFactory.getLogger(ClientResource.class);

    private final ClientService service;


    @GetMapping
    public ResponseEntity<List<ClientRegisterDTO>> findAll(){
        return ResponseEntity.ok().body(service.findAll());
    }


    @PostMapping
    public ResponseEntity<ClientRegisterDTO> clientRegister(@RequestBody ClientRegisterDTO clientRegisterDTO){

        if(clientRegisterDTO.getId() == null){
            LOG.info("CLIENT ERROR: {}", clientRegisterDTO.getFirstName());
            throw new ApiRuntimeError("Client id not found!");
        }
        LOG.info("CLIENT: {}", clientRegisterDTO.getFirstName());
        return ResponseEntity.status(HttpStatus.CREATED).body(clientRegisterDTO);
    }

}
