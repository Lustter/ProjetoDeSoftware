package com.example.CronogramaRMD.model;

import java.time.LocalDate;

public record DadosCadastroCronograma(

        String nomeCliente,
        String senha,
        String CPF,
        String email,
        String telefone,
        String medicamentos,
        int idade,
        String alegias,
        String doencas,
        String descricao
) {
}
