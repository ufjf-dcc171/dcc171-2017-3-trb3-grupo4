/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho3bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author John
 */
public class conexaoBD {
    private Connection conexao = null;
    private final PreparedStatement InserirProjeto,InserirRequer ,InserirTarefa, InserirPessoa;
    private final PreparedStatement editarTarefaDuracao, editarTarefaPecentual;
    private final PreparedStatement ListarTarefaTudo, ListarPessoaTudo, ListarProjetoTudo, ListarPendenciaTudo;
    private final PreparedStatement removerProjeto;
    public conexaoBD( ) throws Exception {
        if (conexao == null) {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String driverUrl = "jdbc:derby://localhost:1527/tarefas";
            conexao = DriverManager.getConnection(driverUrl, "usuario", "senha");
        }
        InserirProjeto = conexao.prepareStatement("INSERT INTO projeto(nome_Projeto) VALUES(?)");
        InserirTarefa = conexao.prepareStatement("INSERT INTO tarefa(nome_Projeto, nome_Tarefa, estado) VALUES( ? , ? , 'pendente')");
        InserirPessoa = conexao.prepareStatement("INSERT INTO pessoa(nome_Pessoa, e_mail, nome_Tarefa) VALUES( ? , ? , ? )");
        InserirRequer = conexao.prepareStatement("INSERT INTO requer(nome_tarefa, tarefa_requerida) VALUES( ? , ? )");
        removerProjeto = conexao.prepareStatement("DELETE FROM projeto WHERE nome_Projeto = ?");
        editarTarefaDuracao = conexao.prepareStatement("UPDATE tarefa SET duracao_esperada = ? WHERE nome_Tarefa = ?");
        editarTarefaPecentual = conexao.prepareStatement("UPDATE tarefa SET percentual_de_andamento = ? WHERE nome_Tarefa = ?");
        ListarTarefaTudo = conexao.prepareStatement("SELECT * FROM tarefa WHERE nome_Projeto = ? ORDER BY nome_Tarefa ASC");
        ListarPessoaTudo = conexao.prepareStatement("SELECT * FROM pessoa WHERE nome_Tarefa = ? ORDER BY nome_Pessoa ASC");
        ListarProjetoTudo = conexao.prepareStatement("SELECT * FROM projeto ORDER BY nome_Projeto ASC");
        ListarPendenciaTudo = conexao.prepareStatement("SELECT * FROM requer WHERE nome_tarefa = ? RIGHT JOIN tarefa ON requer.tarefa_requerida = tarefa.nome_Tarefa");
    }
    public List<Tarefa> listarTarefas(String nomeProjeto) throws Exception {
        List<Tarefa> tarefas = new ArrayList<>();
        ListarTarefaTudo.clearParameters();
        ListarTarefaTudo.setString(1, nomeProjeto);
        
        ResultSet resultado = ListarTarefaTudo.executeQuery();
        while (resultado.next()) {
            Tarefa novaTarefa = new Tarefa();
            novaTarefa.setNome_Projeto(resultado.getString(1));
            novaTarefa.setNome_Tarefa(resultado.getString(2));
            novaTarefa.setEstado(resultado.getString(3));
            novaTarefa.setData_inicio(resultado.getTimestamp(4));
            novaTarefa.setData_fim(resultado.getTimestamp(5));
            novaTarefa.setPercentual_de_andamento(resultado.getInt(6));
            novaTarefa.setDuracao_esperada(resultado.getInt(7));
            tarefas.add(novaTarefa);
        }
        return tarefas;
    }
    public List<String> listarProjetosTodos() throws Exception {
        List<String> projetos = new ArrayList<>();
        ListarProjetoTudo.clearParameters();
        
        ResultSet resultado = ListarProjetoTudo.executeQuery();
        while (resultado.next()) {
            String projeto = resultado.getString(1);
            projetos.add(projeto);
        }
        return projetos;
    }
    public List<Pessoa> listarPessoas(String nomeTarefa) throws Exception {
        List<Pessoa> pessoas = new ArrayList<>();
        ListarPessoaTudo.clearParameters();
        ListarPessoaTudo.setString(1, nomeTarefa);
        
        ResultSet resultado = ListarPessoaTudo.executeQuery();
        while (resultado.next()) {
            Pessoa novaPessoa = new Pessoa();
            novaPessoa.setNome_Pessoa(resultado.getString(1));
            novaPessoa.setE_mail(resultado.getString(2));
            novaPessoa.setNome_Tarefa(resultado.getString(3));
            pessoas.add(novaPessoa);
        }
        return pessoas;
    }
    public List<Tarefa> ListarPendecias(String nomeTarefa) throws Exception{
        List<Tarefa> tarefas = new ArrayList<>();
        ListarPendenciaTudo.clearParameters();
        ListarPendenciaTudo.setString(1, nomeTarefa);
        
        ResultSet resultado = ListarPendenciaTudo.executeQuery();
        while (resultado.next()) {
            Tarefa novaTarefa = new Tarefa();
            novaTarefa.setNome_Projeto(resultado.getString(1));
            novaTarefa.setNome_Tarefa(resultado.getString(2));
            novaTarefa.setEstado(resultado.getString(3));
            novaTarefa.setData_inicio(resultado.getTimestamp(4));
            novaTarefa.setData_fim(resultado.getTimestamp(5));
            novaTarefa.setPercentual_de_andamento(resultado.getInt(6));
            novaTarefa.setDuracao_esperada(resultado.getInt(7));
            tarefas.add(novaTarefa);
        }
        return tarefas;
    }
    public void inserirTarefa(String nomeTarefa, String nomeProjeto) throws Exception{
        InserirTarefa.clearParameters();
        InserirTarefa.setString(1, nomeProjeto);
        InserirTarefa.setString(2, nomeTarefa);
        InserirTarefa.executeUpdate();
    }
    public void inserirPendencia(String nomeTarefa, String Pendencia) throws Exception{
        InserirRequer.clearParameters();
        InserirRequer.setString(1, nomeTarefa);
        InserirRequer.setString(2, Pendencia);
        InserirRequer.executeUpdate();
    }
    public void editarDuracaoTarefa(String nomeTarefa, int duracaoEsperada) throws Exception{
        editarTarefaDuracao.clearParameters();
        editarTarefaDuracao.setInt(1, duracaoEsperada);
        editarTarefaDuracao.setString(2, nomeTarefa);
        editarTarefaDuracao.executeUpdate();
    }
    public void editarPercentualTarefa(String nomeTarefa, int percentualCompleto) throws Exception{
        editarTarefaPecentual.clearParameters();
        editarTarefaPecentual.setInt(1, percentualCompleto);
        editarTarefaPecentual.setString(2, nomeTarefa);
        editarTarefaPecentual.executeUpdate();
    }
    public void inserirProjeto(String nomeProjeto) throws Exception{
        InserirProjeto.clearParameters();
        InserirProjeto.setString(1, nomeProjeto);
        InserirProjeto.executeUpdate();
    }
    public void removerProjeto(String nomeProjeto) throws Exception{
        removerProjeto.clearParameters();
        removerProjeto.setString(1, nomeProjeto);
        removerProjeto.executeUpdate();
    }
}