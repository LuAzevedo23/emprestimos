package com.luazevedo.emprestimos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_historicoEmprestimo")
public class HistoricoEmprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant dataEvento;
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "emprestimo_id")
    private Emprestimo emprestimo;

    public static List<HistoricoEmprestimo> findAll() {
        return List.of();
    }

    public HistoricoEmprestimo save(HistoricoEmprestimo historicoEmprestimo) {
        return historicoEmprestimo;
    }
}

