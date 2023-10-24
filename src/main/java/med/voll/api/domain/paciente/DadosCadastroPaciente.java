package med.voll.api.domain.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.address.DadosEndereco;

public record DadosCadastroPaciente(
        @NotBlank
        String nome,
        @NotBlank @Email
        String email,
        @Pattern(regexp = "\\d{11}")
        String CPF,
        @Pattern(regexp = "\\d{10,11}")
        String telefone,
        @NotNull @Valid
        DadosEndereco endereco) {
}
