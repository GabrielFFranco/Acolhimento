/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Aluno
 */
public class MenuFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public MenuFuncionario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTopo = new javax.swing.JPanel();
        lblNomeEnc = new javax.swing.JLabel();
        lblNomePrograma1 = new javax.swing.JLabel();
        pnDados = new javax.swing.JPanel();
        lblInserirFuncionario = new javax.swing.JLabel();
        lblBuscarFuncionario = new javax.swing.JLabel();
        lblInserir = new javax.swing.JLabel();
        lblConsultar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnTopo.setBackground(new java.awt.Color(204, 204, 204));
        pnTopo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNomeEnc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNomeEnc.setForeground(new java.awt.Color(51, 102, 255));
        lblNomeEnc.setText("Funcionário");

        lblNomePrograma1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        lblNomePrograma1.setForeground(new java.awt.Color(51, 102, 255));
        lblNomePrograma1.setText("SisAC");

        javax.swing.GroupLayout pnTopoLayout = new javax.swing.GroupLayout(pnTopo);
        pnTopo.setLayout(pnTopoLayout);
        pnTopoLayout.setHorizontalGroup(
            pnTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTopoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblNomePrograma1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                .addComponent(lblNomeEnc)
                .addGap(215, 215, 215))
        );
        pnTopoLayout.setVerticalGroup(
            pnTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTopoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomePrograma1)
                    .addComponent(lblNomeEnc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnDados.setBackground(new java.awt.Color(153, 153, 153));
        pnDados.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblInserirFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/USUARIO+_1.jpg"))); // NOI18N
        lblInserirFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInserirFuncionarioMouseClicked(evt);
            }
        });

        lblBuscarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BUSCAUSUARIO1_1.jpg"))); // NOI18N
        lblBuscarFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarFuncionarioMouseClicked(evt);
            }
        });

        lblInserir.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblInserir.setForeground(new java.awt.Color(51, 102, 255));
        lblInserir.setText("Inserir");

        lblConsultar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblConsultar.setForeground(new java.awt.Color(51, 102, 255));
        lblConsultar.setText("Consultar");

        javax.swing.GroupLayout pnDadosLayout = new javax.swing.GroupLayout(pnDados);
        pnDados.setLayout(pnDadosLayout);
        pnDadosLayout.setHorizontalGroup(
            pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosLayout.createSequentialGroup()
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDadosLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(lblInserirFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnDadosLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(lblInserir)))
                .addGap(135, 135, 135)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDadosLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblConsultar))
                    .addComponent(lblBuscarFuncionario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnDadosLayout.setVerticalGroup(
            pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBuscarFuncionario)
                    .addComponent(lblInserirFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInserir)
                    .addComponent(lblConsultar))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(pnTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblInserirFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInserirFuncionarioMouseClicked
    InserirFuncionarioView tela = new InserirFuncionarioView(this, true);
    tela.setVisible(true);
    }//GEN-LAST:event_lblInserirFuncionarioMouseClicked

    private void lblBuscarFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarFuncionarioMouseClicked
    BuscarFuncionarioView tela = new BuscarFuncionarioView(this, true);
    tela.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_lblBuscarFuncionarioMouseClicked

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
            java.util.logging.Logger.getLogger(MenuFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBuscarFuncionario;
    private javax.swing.JLabel lblConsultar;
    private javax.swing.JLabel lblInserir;
    private javax.swing.JLabel lblInserirFuncionario;
    private javax.swing.JLabel lblNomeEnc;
    private javax.swing.JLabel lblNomePrograma1;
    private javax.swing.JPanel pnDados;
    private javax.swing.JPanel pnTopo;
    // End of variables declaration//GEN-END:variables
}
