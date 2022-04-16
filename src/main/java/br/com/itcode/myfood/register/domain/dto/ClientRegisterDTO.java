package br.com.itcode.myfood.register.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientRegisterDTO {

    private Long clientId;
    private String name;
    private String email;

}
