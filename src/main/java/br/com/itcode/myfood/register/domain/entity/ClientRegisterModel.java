package br.com.itcode.myfood.register.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientRegisterModel {

    private Long clientId;
    private String name;
    private String email;

}
