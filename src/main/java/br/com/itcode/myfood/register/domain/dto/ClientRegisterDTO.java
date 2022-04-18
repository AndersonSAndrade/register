package br.com.itcode.myfood.register.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientRegisterDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String mail;
    private String phone;
    private String cpf;
    private Instant createdAt;
    private Instant updatedAt;

}
