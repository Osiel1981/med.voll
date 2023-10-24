package med.voll.api.domain.paciente;

import med.voll.api.domain.address.Endereco;

public record DadosDetalhamentoPaciente(Long id, String nome, String email, String telefone, String CPF, Endereco endereco) {

    public DadosDetalhamentoPaciente(Paciente paciente) {
        this(
                paciente.getId(),
                paciente.getNome(),
                paciente.getEmail(),
                paciente.getTelefone(),
                paciente.getCPF(),
                paciente.getEndereco()
                );
    }
}
