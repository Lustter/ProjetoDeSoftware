package com.example.FinanERP.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

//Anotaçao para identificar a tabela aonde os dadso serao salvos
@Table(name = "pagamentos")
@Entity (name = "Pagamento")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pagamento {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    private String nomeCliente;
    private double valor;
    private LocalDate dataPagamento;
    private String descricao;

    public Pagamento(DadosCadastroPagamento pagamento) {
        this.tipo = pagamento.tipo();
        this.nomeCliente = pagamento.nomeCliente();
        this.valor = pagamento.valor();
        this.dataPagamento = pagamento.dataPagamento();
        this.descricao = pagamento.nomeCliente();
    }
}
