/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.SistemaTreinamentoController;
import Model.DAO.Banco;

/**
 * View Inicial do Sistema
 * @author Adauto
 */
public class SistemaTreinamento extends javax.swing.JFrame {

    private final SistemaTreinamentoController controller;

    /**
     * Cria novo form SistemaTreinamento
     * Passa esta View como parâmetro para seu Controller
     * Incia o Bando de Dados
     */
    public SistemaTreinamento() {
        initComponents();
        this.controller = new SistemaTreinamentoController(this);
        Banco.inicia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCadastro = new javax.swing.JMenu();
        jMenuPessoa = new javax.swing.JMenuItem();
        jMenuSala = new javax.swing.JMenuItem();
        jMenuEspaco = new javax.swing.JMenuItem();
        MenuConsulta = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Treinamento");
        setPreferredSize(new java.awt.Dimension(600, 600));
        setSize(new java.awt.Dimension(400, 400));

        MenuCadastro.setText("Cadastro");

        jMenuPessoa.setText("Pessoas");
        jMenuPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPessoaActionPerformed(evt);
            }
        });
        MenuCadastro.add(jMenuPessoa);

        jMenuSala.setText("Salas");
        jMenuSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalaActionPerformed(evt);
            }
        });
        MenuCadastro.add(jMenuSala);

        jMenuEspaco.setText("Espaço Café");
        jMenuEspaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEspacoActionPerformed(evt);
            }
        });
        MenuCadastro.add(jMenuEspaco);

        jMenuBar1.add(MenuCadastro);

        MenuConsulta.setText("Consulta");
        jMenuBar1.add(MenuConsulta);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPessoaActionPerformed
        // TODO add your handling code here:
        this.controller.navegarParaPessoa();
    }//GEN-LAST:event_jMenuPessoaActionPerformed

    private void jMenuSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalaActionPerformed
        // TODO add your handling code here:
        this.controller.navegarParaSala();
    }//GEN-LAST:event_jMenuSalaActionPerformed

    private void jMenuEspacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEspacoActionPerformed
        // TODO add your handling code here:
        this.controller.navegarParaEspaco();
    }//GEN-LAST:event_jMenuEspacoActionPerformed

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
            java.util.logging.Logger.getLogger(SistemaTreinamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaTreinamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaTreinamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaTreinamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaTreinamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenu MenuConsulta;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuEspaco;
    private javax.swing.JMenuItem jMenuPessoa;
    private javax.swing.JMenuItem jMenuSala;
    // End of variables declaration//GEN-END:variables
}
