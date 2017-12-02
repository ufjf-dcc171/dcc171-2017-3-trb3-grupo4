/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho3bd;

import java.sql.Timestamp;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author John
 */
public class JanelaPendentes extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPendetes
     */
    private final JanelaPrincipal janelaPrincipal;
    private final conexaoBD bancoDeDados;
    private String nomeTarefa;

    public JanelaPendentes(JanelaPrincipal janela, conexaoBD banco) {
        this.janelaPrincipal = janela;
        this.bancoDeDados = banco;
        this.nomeTarefa = null;
        initComponents();
    }

    public void setNomeTarefa(String nomeTarefa) throws Exception {
        this.nomeTarefa = nomeTarefa;
        AtualizaPendencias();
    }

    private void AtualizaPendencias() throws Exception {

        DefaultTableModel modelo = (DefaultTableModel) this.tblPendencias.getModel();
        modelo.setRowCount(0);

        if (nomeTarefa != null && nomeTarefa.length() > 0) {
            List<Tarefa> tarefas = bancoDeDados.ListarPendencias(nomeTarefa);
            for (int i = 0; i < tarefas.size(); i++) {

                String nomePendencia = tarefas.get(i).getNome_Tarefa();
                String estado = tarefas.get(i).getEstado();
                Timestamp data_inicio = tarefas.get(i).getData_inicio();
                Timestamp data_fim = tarefas.get(i).getData_fim();
                System.out.println(nomePendencia + estado + data_inicio + data_fim);
                int percentual_de_andamento = tarefas.get(i).getPercentual_de_andamento();
                int duracao_esperada = tarefas.get(i).getDuracao_esperada();

                modelo.addRow(new Object[]{nomePendencia, estado, percentual_de_andamento, data_inicio, data_fim, duracao_esperada});

            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPendencias = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        btnAdc = new javax.swing.JButton();
        btnRmv = new javax.swing.JButton();
        txtPendecia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Duração Esperada", "Percentual de andamento", "Estado", "Data de inicio", "Data de conclusão"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblPendencias.setModel(new DefaultTableModel(new Object[]{"Nome","Estado","Completo","Data de Inicio", "Data de Conclusão", "Duracao Esperada"},0));
        tblPendencias.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblPendencias);

        btnVoltar.setText("voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnAdc.setText("adicionar");
        btnAdc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdcActionPerformed(evt);
            }
        });

        btnRmv.setText("remover");
        btnRmv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRmvActionPerformed(evt);
            }
        });

        jLabel1.setText("Tarefa:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAdc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPendecia, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRmv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVoltar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnAdc)
                    .addComponent(btnRmv)
                    .addComponent(txtPendecia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        this.janelaPrincipal.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAdcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdcActionPerformed
        try {
            String pendencia = this.txtPendecia.getText();
            if ((pendencia.length() > 0) && !(pendencia.equals(nomeTarefa))) {
                bancoDeDados.inserirPendencia(nomeTarefa, pendencia);
                AtualizaPendencias();
            }
        } catch (Exception ex) {
            Logger.getLogger(JanelaPendentes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAdcActionPerformed

    private void btnRmvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRmvActionPerformed

        int indexLinha = tblPendencias.getSelectedRow();
        try {
            if (indexLinha >= 0) {
                String nomePendecia = (String) this.tblPendencias.getValueAt(indexLinha, 0);
                this.bancoDeDados.removerPendencia(nomePendecia);
                AtualizaPendencias();
            }

        } catch (Exception ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRmvActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdc;
    private javax.swing.JButton btnRmv;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblPendencias;
    private javax.swing.JTextField txtPendecia;
    // End of variables declaration//GEN-END:variables

}
