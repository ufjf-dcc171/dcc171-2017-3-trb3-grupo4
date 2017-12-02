/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho3bd;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author John
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form NovoJFrame
     */
    private final conexaoBD BancoDeDados;
    private final JanelaEditarAdicionar JAdicionar;
    private final JanelaPendentes JPendentes;
    private final JanelaPessoas JPessoas;
    private final JanelaListaTarefas JTarefas;

    public JanelaPrincipal() throws Exception {
        BancoDeDados = new conexaoBD();

        JTarefas = new JanelaListaTarefas(this);
        JTarefas.setVisible(false);

        JPessoas = new JanelaPessoas(this, this.BancoDeDados);
        JPessoas.setVisible(false);

        JAdicionar = new JanelaEditarAdicionar(this, this.BancoDeDados);
        JAdicionar.setVisible(false);

        JPendentes = new JanelaPendentes(this, this.BancoDeDados);
        JPendentes.setVisible(false);

        initComponents();
        AtualizaProjetos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTarefas = new javax.swing.JTable();
        btnPAssociadas = new javax.swing.JButton();
        btnLstCorrentes = new javax.swing.JButton();
        btnLstConcluidas = new javax.swing.JButton();
        btnLstPendentes = new javax.swing.JButton();
        btnLstProntas = new javax.swing.JButton();
        btnPendencias = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnAddTarefa = new javax.swing.JButton();
        btnRmvTarefa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbProjetos = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnAdcProjeto = new javax.swing.JButton();
        btnRmvProjeto = new javax.swing.JButton();
        txtProjeto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblTarefas.setModel(new DefaultTableModel(new Object[]{"Nome","Estado","Completo","Data de Inicio", "Data de Conclusão", "Duracao Esperada"},0));
        tblTarefas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblTarefas);

        btnPAssociadas.setText("Pessoas Associadas");
        btnPAssociadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPAssociadasActionPerformed(evt);
            }
        });

        btnLstCorrentes.setText("Listar Correntes");
        btnLstCorrentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLstCorrentesActionPerformed(evt);
            }
        });

        btnLstConcluidas.setText("Listar Concluidas");
        btnLstConcluidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLstConcluidasActionPerformed(evt);
            }
        });

        btnLstPendentes.setText("Listar Pendentes");
        btnLstPendentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLstPendentesActionPerformed(evt);
            }
        });

        btnLstProntas.setText("Listar Prontas a Iniciar");
        btnLstProntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLstProntasActionPerformed(evt);
            }
        });

        btnPendencias.setText("Pendências");
        btnPendencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendenciasActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");

        btnAddTarefa.setText("Adicionar Tarefa");
        btnAddTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTarefaActionPerformed(evt);
            }
        });

        btnRmvTarefa.setText("Remover Tarefa");
        btnRmvTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRmvTarefaActionPerformed(evt);
            }
        });

        jLabel1.setText("Projetos:");

        cbProjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProjetosActionPerformed(evt);
            }
        });

        jButton1.setText("Iniciar Tarefa");

        jButton3.setText("Finalizar Tarefa");

        btnAdcProjeto.setText("Adicionar Projeto");
        btnAdcProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdcProjetoActionPerformed(evt);
            }
        });

        btnRmvProjeto.setText("Remover Projeto");
        btnRmvProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRmvProjetoActionPerformed(evt);
            }
        });

        jLabel2.setText("Projeto:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLstPendentes)
                        .addGap(6, 6, 6)
                        .addComponent(btnPendencias)
                        .addGap(10, 10, 10)
                        .addComponent(btnRmvTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLstConcluidas)
                                .addGap(6, 6, 6)
                                .addComponent(btnLstCorrentes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPAssociadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLstProntas)
                                .addGap(6, 6, 6)
                                .addComponent(btnEditar)
                                .addGap(10, 10, 10)
                                .addComponent(btnAddTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(4, 4, 4)
                                .addComponent(cbProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAdcProjeto)
                                    .addComponent(btnRmvProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtProjeto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(10, 10, 10))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(cbProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLstConcluidas)
                    .addComponent(btnLstCorrentes)
                    .addComponent(btnPAssociadas))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLstProntas)
                    .addComponent(btnEditar)
                    .addComponent(btnAddTarefa))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLstPendentes)
                    .addComponent(btnPendencias)
                    .addComponent(btnRmvTarefa))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdcProjeto)
                        .addComponent(jLabel2))
                    .addComponent(jButton1))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(txtProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRmvProjeto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtualizaProjetos() throws Exception {
        cbProjetos.removeAllItems();
        List<String> projetos = BancoDeDados.listarProjetosTodos();
        for (int i = 0; i < projetos.size(); i++) {
            cbProjetos.addItem(projetos.get(i));
        }
    }

    private void AtualizaTarefa() throws Exception {
        String nomeProjeto = (String) this.cbProjetos.getSelectedItem();
        DefaultTableModel modelo = (DefaultTableModel) tblTarefas.getModel();
        modelo.setRowCount(0);
        if (nomeProjeto.length() > 0) {
            List<Tarefa> tarefas = BancoDeDados.listarTarefas(nomeProjeto);
            for (int i = 0; i < tarefas.size(); i++) {

                String nomeTarefa = tarefas.get(i).getNome_Tarefa();
                String estado = tarefas.get(i).getEstado();
                Timestamp data_inicio = tarefas.get(i).getData_inicio();
                Timestamp data_fim = tarefas.get(i).getData_fim();

                int percentual_de_andamento = tarefas.get(i).getPercentual_de_andamento();
                int duracao_esperada = tarefas.get(i).getDuracao_esperada();

                modelo.addRow(new Object[]{nomeTarefa, estado, percentual_de_andamento, data_inicio, data_fim, duracao_esperada});

            }
        }
    }

    private void cbProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProjetosActionPerformed

        try {
            AtualizaTarefa();
        } catch (Exception ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_cbProjetosActionPerformed

    private void btnLstConcluidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLstConcluidasActionPerformed
        try {
            String nomeProjeto = (String) this.cbProjetos.getSelectedItem();
            if (nomeProjeto.length() > 0) {
                this.JTarefas.setListaTarefas(this.BancoDeDados.listarTarefasEstado("concluida", nomeProjeto));
                this.JTarefas.setTxtEstado("Concluidas:");
                this.setVisible(false);
                this.JTarefas.setVisible(true);
                this.JTarefas.setLocationRelativeTo(null);
            }
        } catch (Exception ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLstConcluidasActionPerformed

    private void btnAdcProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdcProjetoActionPerformed
        try {
            String nomeProjeto = this.txtProjeto.getText();
            if (nomeProjeto.length() > 0) {
                this.BancoDeDados.inserirProjeto(nomeProjeto);
                AtualizaProjetos();
            }
        } catch (Exception ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAdcProjetoActionPerformed

    private void btnRmvProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRmvProjetoActionPerformed
        try {
            String nomeProjeto = this.txtProjeto.getText();
            if (nomeProjeto.length() > 0) {
                this.BancoDeDados.removerProjeto(nomeProjeto);
                AtualizaProjetos();
            }
        } catch (Exception ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRmvProjetoActionPerformed

    private void btnAddTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTarefaActionPerformed
        try {
            this.setVisible(false);
            String nomeProjeto = (String) this.cbProjetos.getSelectedItem();
            this.JAdicionar.setNomeProjeto(nomeProjeto);
            this.JAdicionar.setVisible(true);
            this.JAdicionar.setLocationRelativeTo(null);
            AtualizaTarefa();
        } catch (Exception ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddTarefaActionPerformed

    private void btnPendenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendenciasActionPerformed
        int IndexLinha = this.tblTarefas.getSelectedRow();
        try {
            if (IndexLinha >= 0) {

                this.setVisible(false);
                String nomeTarefa = (String) this.tblTarefas.getValueAt(IndexLinha, 0);
                this.JPendentes.setNomeTarefa(nomeTarefa);
                this.JPendentes.setVisible(true);
                this.JPendentes.setLocationRelativeTo(null);

            }
        } catch (Exception ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPendenciasActionPerformed

    private void btnPAssociadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPAssociadasActionPerformed
        int IndexLinha = this.tblTarefas.getSelectedRow();
        try {
            if (IndexLinha >= 0) {

                this.setVisible(false);
                String nomeTarefa = (String) this.tblTarefas.getValueAt(IndexLinha, 0);
                this.JPessoas.setNomeTarefa(nomeTarefa);
                this.JPessoas.setVisible(true);
                this.JPessoas.setLocationRelativeTo(null);

            }
        } catch (Exception ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPAssociadasActionPerformed

    private void btnRmvTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRmvTarefaActionPerformed

        int indexLinha = tblTarefas.getSelectedRow();
        try {
            if (indexLinha >= 0) {
                String nomeTarefa = (String) this.tblTarefas.getValueAt(indexLinha, 0);
                this.BancoDeDados.removerTarefa(nomeTarefa);
                AtualizaTarefa();
            }

        } catch (Exception ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRmvTarefaActionPerformed

    private void btnLstPendentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLstPendentesActionPerformed
        try {
            String nomeProjeto = (String) this.cbProjetos.getSelectedItem();

            if (nomeProjeto.length() > 0) {
                this.JTarefas.setListaTarefas(this.BancoDeDados.listarTarefasEstado("pendente", nomeProjeto));
                this.JTarefas.setTxtEstado("pendentes:");
                this.setVisible(false);
                this.JTarefas.setVisible(true);
                this.JTarefas.setLocationRelativeTo(null);
            }
        } catch (Exception ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLstPendentesActionPerformed

    private void btnLstCorrentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLstCorrentesActionPerformed
        try {
            String nomeProjeto = (String) this.cbProjetos.getSelectedItem();
            if (nomeProjeto.length() > 0) {
                this.JTarefas.setListaTarefas(this.BancoDeDados.listarTarefasEstado("iniciada", nomeProjeto));
                this.JTarefas.setTxtEstado("Iniciadas:");
                this.setVisible(false);
                this.JTarefas.setVisible(true);
                this.JTarefas.setLocationRelativeTo(null);
            }
        } catch (Exception ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLstCorrentesActionPerformed

    private void btnLstProntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLstProntasActionPerformed

        String nomeProjeto = (String) cbProjetos.getSelectedItem();
        String nomeTarefa;
        List<Tarefa> tarefas, PendenciasNaoConcluidas;
        List<Tarefa> TarefasProntasInciar = new ArrayList<>();
        try {

            if (nomeProjeto.length() > 0) {

                tarefas = BancoDeDados.listarTarefasEstado("pendente", nomeProjeto);
                for (int i = 0; i < tarefas.size(); i++) {

                    nomeTarefa = tarefas.get(i).getNome_Tarefa();
                    PendenciasNaoConcluidas = BancoDeDados.ListarPendenciasPendentes(nomeTarefa);

                    if (PendenciasNaoConcluidas.size() < 1) {
                        TarefasProntasInciar.add(tarefas.get(i));
                    }
                }
                this.JTarefas.setListaTarefas(TarefasProntasInciar);
                this.JTarefas.setTxtEstado("Tarefas Prontas Para Iniciar:");
                this.setVisible(false);
                this.JTarefas.setVisible(true);
                this.JTarefas.setLocationRelativeTo(null);
            }

        } catch (Exception ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnLstProntasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JanelaPrincipal().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdcProjeto;
    private javax.swing.JButton btnAddTarefa;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLstConcluidas;
    private javax.swing.JButton btnLstCorrentes;
    private javax.swing.JButton btnLstPendentes;
    private javax.swing.JButton btnLstProntas;
    private javax.swing.JButton btnPAssociadas;
    private javax.swing.JButton btnPendencias;
    private javax.swing.JButton btnRmvProjeto;
    private javax.swing.JButton btnRmvTarefa;
    private javax.swing.JComboBox<String> cbProjetos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTarefas;
    private javax.swing.JTextField txtProjeto;
    // End of variables declaration//GEN-END:variables
}
