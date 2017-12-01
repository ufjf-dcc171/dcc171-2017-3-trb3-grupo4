package trabalho3bd;


import java.sql.Timestamp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author John
 */
public class Tarefa {
    private String nome_Projeto;
    private String nome_Tarefa;
    private String estado;
    private Timestamp data_inicio;
    private Timestamp data_fim;
    private int percentual_de_andamento,duracao_esperada;

    public String getNome_Projeto() {
        return nome_Projeto;
    }

    public String getNome_Tarefa() {
        return nome_Tarefa;
    }

    public String getEstado() {
        return estado;
    }

    public Timestamp getData_inicio() {
        return data_inicio;
    }

    public Timestamp getData_fim() {
        return data_fim;
    }

    public int getPercentual_de_andamento() {
        return percentual_de_andamento;
    }

    public int getDuracao_esperada() {
        return duracao_esperada;
    }

    public void setNome_Projeto(String nome_Projeto) {
        this.nome_Projeto = nome_Projeto;
    }

    public void setNome_Tarefa(String nome_Tarefa) {
        this.nome_Tarefa = nome_Tarefa;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setData_inicio(Timestamp data_inicio) {
        this.data_inicio = data_inicio;
    }

    public void setData_fim(Timestamp data_fim) {
        this.data_fim = data_fim;
    }

    public void setPercentual_de_andamento(int percentual_de_andamento) {
        this.percentual_de_andamento = percentual_de_andamento;
    }

    public void setDuracao_esperada(int duracao_esperada) {
        this.duracao_esperada = duracao_esperada;
    }
    
}
