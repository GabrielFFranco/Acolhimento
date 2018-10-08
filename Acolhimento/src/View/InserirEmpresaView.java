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
public class InserirEmpresaView extends javax.swing.JDialog {

    /**
     * Creates new form InserirUsuarioView
     */
    public InserirEmpresaView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        lblNomeFunc = new javax.swing.JLabel();
        lblNomePrograma1 = new javax.swing.JLabel();
        pnDados = new javax.swing.JPanel();
        lblNomeDaEmpresa = new javax.swing.JLabel();
        txtNomeDaEmpresa = new javax.swing.JTextField();
        lblCNPJ = new javax.swing.JLabel();
        jtfCNPJ = new javax.swing.JTextField();
        txtNVagas = new javax.swing.JTextField();
        lblNVagas = new javax.swing.JLabel();
        jlRazaoSocial = new javax.swing.JLabel();
        jtfRazaoSocial = new javax.swing.JTextField();
        jlEndereco = new javax.swing.JLabel();
        jtfEndereco = new javax.swing.JTextField();
        jlBairro = new javax.swing.JLabel();
        jtfBairro = new javax.swing.JTextField();
        jlNumero = new javax.swing.JLabel();
        jtfNumero = new javax.swing.JTextField();
        jlCidade = new javax.swing.JLabel();
        jtfCidade = new javax.swing.JTextField();
        jlCep = new javax.swing.JLabel();
        jtfCep = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        pnTopo.setBackground(new java.awt.Color(204, 204, 204));
        pnTopo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNomeFunc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNomeFunc.setForeground(new java.awt.Color(51, 102, 255));
        lblNomeFunc.setText("Empresa");

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
                .addGap(131, 131, 131)
                .addComponent(lblNomeFunc)
                .addContainerGap(446, Short.MAX_VALUE))
        );
        pnTopoLayout.setVerticalGroup(
            pnTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTopoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomePrograma1)
                    .addComponent(lblNomeFunc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnDados.setBackground(new java.awt.Color(153, 153, 153));
        pnDados.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNomeDaEmpresa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNomeDaEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeDaEmpresa.setText("Nome da Empresa*");

        txtNomeDaEmpresa.setBackground(new java.awt.Color(204, 204, 204));
        txtNomeDaEmpresa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNomeDaEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeDaEmpresaActionPerformed(evt);
            }
        });

        lblCNPJ.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCNPJ.setForeground(new java.awt.Color(255, 255, 255));
        lblCNPJ.setText("CNPJ*");

        jtfCNPJ.setBackground(new java.awt.Color(204, 204, 204));

        txtNVagas.setBackground(new java.awt.Color(204, 204, 204));
        txtNVagas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblNVagas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNVagas.setForeground(new java.awt.Color(255, 255, 255));
        lblNVagas.setText("N° de Vagas*");

        jlRazaoSocial.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlRazaoSocial.setForeground(new java.awt.Color(255, 255, 255));
        jlRazaoSocial.setText("Razão Social*");

        jtfRazaoSocial.setBackground(new java.awt.Color(204, 204, 204));
        jtfRazaoSocial.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jlEndereco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlEndereco.setForeground(new java.awt.Color(255, 255, 255));
        jlEndereco.setText("Endereço*");

        jtfEndereco.setBackground(new java.awt.Color(204, 204, 204));

        jlBairro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlBairro.setForeground(new java.awt.Color(255, 255, 255));
        jlBairro.setText("Bairro*");

        jtfBairro.setBackground(new java.awt.Color(204, 204, 204));

        jlNumero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlNumero.setForeground(new java.awt.Color(255, 255, 255));
        jlNumero.setText("Nº");

        jtfNumero.setBackground(new java.awt.Color(204, 204, 204));

        jlCidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlCidade.setForeground(new java.awt.Color(255, 255, 255));
        jlCidade.setText("Cidade");

        jtfCidade.setBackground(new java.awt.Color(204, 204, 204));

        jlCep.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlCep.setForeground(new java.awt.Color(255, 255, 255));
        jlCep.setText("CEP");

        jtfCep.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout pnDadosLayout = new javax.swing.GroupLayout(pnDados);
        pnDados.setLayout(pnDadosLayout);
        pnDadosLayout.setHorizontalGroup(
            pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeDaEmpresa)
                    .addComponent(lblNVagas)
                    .addComponent(jlRazaoSocial)
                    .addComponent(jlEndereco)
                    .addComponent(jlBairro)
                    .addComponent(jlCidade))
                .addGap(18, 18, 18)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNomeDaEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addComponent(txtNVagas)
                    .addComponent(jtfRazaoSocial)
                    .addComponent(jtfEndereco)
                    .addComponent(jtfBairro)
                    .addComponent(jtfCidade))
                .addGap(34, 34, 34)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCNPJ)
                    .addComponent(jlNumero)
                    .addComponent(jlCep))
                .addGap(18, 18, 18)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfCNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addGroup(pnDadosLayout.createSequentialGroup()
                        .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnDadosLayout.setVerticalGroup(
            pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeDaEmpresa)
                    .addComponent(txtNomeDaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCNPJ)
                    .addComponent(jtfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNVagas)
                    .addComponent(txtNVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRazaoSocial)
                    .addComponent(jtfRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlEndereco)
                    .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlNumero)
                        .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlBairro)
                    .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCidade)
                    .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlCep)
                        .addComponent(jtfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(241, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(pnTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeDaEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeDaEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeDaEmpresaActionPerformed

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
            java.util.logging.Logger.getLogger(InserirEmpresaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InserirEmpresaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InserirEmpresaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InserirEmpresaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InserirEmpresaView dialog = new InserirEmpresaView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlBairro;
    private javax.swing.JLabel jlCep;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlNumero;
    private javax.swing.JLabel jlRazaoSocial;
    private javax.swing.JTextField jtfBairro;
    private javax.swing.JTextField jtfCNPJ;
    private javax.swing.JTextField jtfCep;
    private javax.swing.JTextField jtfCidade;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JTextField jtfNumero;
    private javax.swing.JTextField jtfRazaoSocial;
    private javax.swing.JLabel lblCNPJ;
    private javax.swing.JLabel lblNVagas;
    private javax.swing.JLabel lblNomeDaEmpresa;
    private javax.swing.JLabel lblNomeFunc;
    private javax.swing.JLabel lblNomePrograma1;
    private javax.swing.JPanel pnDados;
    private javax.swing.JPanel pnTopo;
    private javax.swing.JTextField txtNVagas;
    private javax.swing.JTextField txtNomeDaEmpresa;
    // End of variables declaration//GEN-END:variables
}