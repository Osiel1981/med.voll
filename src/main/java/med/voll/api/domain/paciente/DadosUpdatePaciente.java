package med.voll.api.domain.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.address.DadosEndereco;

public record DadosUpdatePaciente(@NotNull
                                 Long id,
                                 String telefone,
                                 String nome,
                                 DadosEndereco endereco) {
}
