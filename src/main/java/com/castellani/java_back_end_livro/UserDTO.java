package com.castellani.java_back_end_livro;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    @NotBlank(message = "NOme é Obrigatório")
    private String nome;
    @NotBlank(message = "CPF é obrigatório")
    private String cpf;
    private String endereco;
    @NotBlank(message = "E-mail é obrigatório")
    private String email;
    private String telefone;
    private LocalDateTime dataCadastro;
}
