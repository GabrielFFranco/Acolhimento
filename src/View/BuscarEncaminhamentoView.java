/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.EncaminhamentoDAO;
import DAO.EnderecoDAO;
import DAO.FuncionarioDAO;
import Model.Encaminhamento;
import Model.Endereco;
import Model.Funcionario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class BuscarEncaminhamentoView extends javax.swing.JDialog {

    /**
     * Creates new form InserirUsuarioView
     */
    public BuscarEncaminhamentoView(java.awt.Frame parent, boolean modal) {
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
        lblNomeEnc = new javax.swing.JLabel();
        lblNomePrograma1 = new javax.swing.JLabel();
        pnDados = new javax.swing.JPanel();
        lblNomeDoFuncionario = new javax.swing.JLabel();
        txtCpfFunc = new javax.swing.JTextField();
        lblPeriodo = new javax.swing.JLabel();
        jcbTipoEncaminhamento = new javax.swing.JComboBox<>();
        jlStatus = new javax.swing.JLabel();
        jcbStatus = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEncaminhamento = new javax.swing.JTable();
        lblPeriodoA = new javax.swing.JLabel();
        lblTipoDeEncaminhamento = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        txtSegundaData = new javax.swing.JFormattedTextField();
        txtPrimeiraData = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnTopo.setBackground(new java.awt.Color(204, 204, 204));
        pnTopo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNomeEnc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNomeEnc.setForeground(new java.awt.Color(51, 102, 255));
        lblNomeEnc.setText("Encaminhamento");

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
                .addComponent(lblNomeEnc)
                .addContainerGap(222, Short.MAX_VALUE))
        );
        pnTopoLayout.setVerticalGroup(
            pnTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTopoLayout.createSequentialGroup()
                .addGroup(pnTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTopoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblNomePrograma1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTopoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNomeEnc)
                        .addGap(13, 13, 13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnTopo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 16, 620, -1));

        pnDados.setBackground(new java.awt.Color(153, 153, 153));
        pnDados.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnDados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNomeDoFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNomeDoFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeDoFuncionario.setText("Nº Prontuario");
        pnDados.add(lblNomeDoFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txtCpfFunc.setBackground(new java.awt.Color(204, 204, 204));
        txtCpfFunc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pnDados.add(txtCpfFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 410, -1));

        lblPeriodo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPeriodo.setForeground(new java.awt.Color(255, 255, 255));
        lblPeriodo.setText("Período");
        pnDados.add(lblPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jcbTipoEncaminhamento.setBackground(new java.awt.Color(204, 204, 204));
        jcbTipoEncaminhamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Sistema de Saúde", "Sistema de educação", "Sistema Judiciário", "Órgão parceiro" }));
        pnDados.add(jcbTipoEncaminhamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 123, -1));

        jlStatus.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlStatus.setForeground(new java.awt.Color(255, 255, 255));
        jlStatus.setText("Status");
        pnDados.add(jlStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        jcbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Anulado", "Válido" }));
        pnDados.add(jcbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 146, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        pnDados.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 190, 110, -1));

        btnCancelar.setText("Cancelar");
        pnDados.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 100, -1));

        jtEncaminhamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tipo", "Status", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtEncaminhamento);

        pnDados.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 231, 550, 180));

        lblPeriodoA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPeriodoA.setForeground(new java.awt.Color(255, 255, 255));
        lblPeriodoA.setText("Á");
        pnDados.add(lblPeriodoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        lblTipoDeEncaminhamento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblTipoDeEncaminhamento.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoDeEncaminhamento.setText("Tipo");
        pnDados.add(lblTipoDeEncaminhamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        pnDados.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 110, -1));

        txtSegundaData.setBackground(new java.awt.Color(204, 204, 204));
        try {
            txtSegundaData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pnDados.add(txtSegundaData, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 100, -1));

        txtPrimeiraData.setBackground(new java.awt.Color(204, 204, 204));
        try {
            txtPrimeiraData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pnDados.add(txtPrimeiraData, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 100, -1));

        getContentPane().add(pnDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 620, 470));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 112, 1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        int linhaSelecionada = jtEncaminhamento.getSelectedRow();

        if (linhaSelecionada == -1) {
        } else {
            try {
                InserirEncaminhamentoView insEnc = new InserirEncaminhamentoView(new javax.swing.JFrame(), true);
                insEnc.preencherEncaminhamento((int) jtEncaminhamento.getValueAt(linhaSelecionada, 0));
                insEnc.setVisible(true);

            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        }


    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        List<Encaminhamento> lista;
        String comando = "select * from encaminhamento";

        if (!"".equals(txtCpfFunc.getText())
                || !"".equals(txtPrimeiraData.getText())
                || !"".equals(txtSegundaData.getText())
                || !"Selecione".equals(jcbStatus.getSelectedItem())
                || !"Selecione".equals(jcbTipoEncaminhamento.getSelectedItem())) {

            comando = comando + " where";

            if (!"".equals(txtCpfFunc.getText())) {
                comando = comando + " nProntuarioUsu = '" + txtCpfFunc.getText() + "' and";
            }
            if (!"".equals(txtPrimeiraData.getText()) && !"".equals(txtSegundaData.getText())) {
                try {
                    SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy");
                    java.util.Date dataUtil = form.parse(txtPrimeiraData.getText());
                    java.sql.Date PData = new java.sql.Date(dataUtil.getTime());

                    dataUtil = form.parse(txtSegundaData.getText());
                    java.sql.Date SData = new java.sql.Date(dataUtil.getTime());

                    comando = comando + " dataEnc BETWEEN '" + PData + "' and '"
                            + SData + "' and";
                } catch (ParseException e) {

                }
            }
            if (!"Selecione".equals(jcbStatus.getSelectedItem())) {
                comando = comando + " statusEnc = " + jcbStatus.getSelectedItem() + " and";
            }
            if (!"Selecione".equals(jcbTipoEncaminhamento.getSelectedItem())) {
                comando = comando + " tipoEnc = '" + jcbTipoEncaminhamento.getSelectedItem() + "' and";
            }
            comando = comando.substring(0, comando.length() - 4);
        }

        System.out.println(comando);
        lista = new EncaminhamentoDAO().getEncaminhamento(comando);

        DefaultTableModel modelo = (DefaultTableModel) jtEncaminhamento.getModel();

        for (int i = modelo.getRowCount() - 1; i > -1; i--) {
            modelo.removeRow(i);
        }

        for (Encaminhamento encaminhamento : lista) {
            Object[] vetor = new Object[]{
                encaminhamento.getIdEnc(),
                encaminhamento.getTipoEnc(),
                encaminhamento.getStatusEnc(),
                encaminhamento.getDataEnc()
            };

            modelo.addRow(vetor);
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarEncaminhamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarEncaminhamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarEncaminhamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarEncaminhamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscarEncaminhamentoView dialog = new BuscarEncaminhamentoView(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> jcbStatus;
    private javax.swing.JComboBox<String> jcbTipoEncaminhamento;
    private javax.swing.JLabel jlStatus;
    private javax.swing.JTable jtEncaminhamento;
    private javax.swing.JLabel lblNomeDoFuncionario;
    private javax.swing.JLabel lblNomeEnc;
    private javax.swing.JLabel lblNomePrograma1;
    private javax.swing.JLabel lblPeriodo;
    private javax.swing.JLabel lblPeriodoA;
    private javax.swing.JLabel lblTipoDeEncaminhamento;
    private javax.swing.JPanel pnDados;
    private javax.swing.JPanel pnTopo;
    private javax.swing.JTextField txtCpfFunc;
    private javax.swing.JFormattedTextField txtPrimeiraData;
    private javax.swing.JFormattedTextField txtSegundaData;
    // End of variables declaration//GEN-END:variables
}
