package med.voll.api.domain.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.address.DadosEndereco;

public record DadosUpdateMedico(
        @NotNull
        Long id,
        String telefone,
        String nome,
        DadosEndereco endereco) {
}
