/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.FuncionarioDAO;
import Model.Funcionario;
import java.text.ParseException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class BuscarFuncionarioView extends javax.swing.JDialog {

    /**
     * Creates new form BuscarFuncionarioView
     */
    public BuscarFuncionarioView(java.awt.Frame parent, boolean modal) {
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

        jPanel1 = new javax.swing.JPanel();
        lNome = new javax.swing.JLabel();
        lCpf = new javax.swing.JLabel();
        lTipo = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        cbTipo = new javax.swing.JComboBox<>();
        txtStatus = new javax.swing.JLabel();
        bEditar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        cbStatus = new javax.swing.JComboBox<>();
        jspFuncionarios = new javax.swing.JScrollPane();
        jtFuncionarios = new javax.swing.JTable();
        bBuscar = new javax.swing.JButton();
        pnTopo = new javax.swing.JPanel();
        lblNomeFunc = new javax.swing.JLabel();
        lblNomePrograma1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1, 2));
        setPreferredSize(new java.awt.Dimension(797, 491));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lNome.setForeground(new java.awt.Color(255, 255, 255));
        lNome.setText("Nome");
        jPanel1.add(lNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        lCpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lCpf.setForeground(new java.awt.Color(255, 255, 255));
        lCpf.setText("CPF");
        jPanel1.add(lCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        lTipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lTipo.setForeground(new java.awt.Color(255, 255, 255));
        lTipo.setText("Tipo");
        jPanel1.add(lTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 410, -1));
        jPanel1.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 180, -1));

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Auxiliar", "Coordenador", "Tecnico" }));
        jPanel1.add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 80, -1));

        txtStatus.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtStatus.setForeground(new java.awt.Color(255, 255, 255));
        txtStatus.setText("Status");
        jPanel1.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        bEditar.setBackground(new java.awt.Color(204, 204, 204));
        bEditar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bEditar.setText("Editar");
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });
        jPanel1.add(bEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 90, -1));

        bCancelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bCancelar.setText("Cancelar");
        jPanel1.add(bCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Ativo", "Inativo", " " }));
        jPanel1.add(cbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 90, -1));

        jtFuncionarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "Tipo", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspFuncionarios.setViewportView(jtFuncionarios);

        jPanel1.add(jspFuncionarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 590, 210));

        bBuscar.setBackground(new java.awt.Color(204, 204, 204));
        bBuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(bBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 90, -1));

        pnTopo.setBackground(new java.awt.Color(204, 204, 204));
        pnTopo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnTopo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNomeFunc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNomeFunc.setForeground(new java.awt.Color(51, 102, 255));
        lblNomeFunc.setText("Funcionário");
        pnTopo.add(lblNomeFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 39, -1, -1));

        lblNomePrograma1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        lblNomePrograma1.setForeground(new java.awt.Color(51, 102, 255));
        lblNomePrograma1.setText("SisAC");
        pnTopo.add(lblNomePrograma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 22, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(763, 580));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed

        int linhaSelecionada = jtFuncionarios.getSelectedRow();

        if (linhaSelecionada == -1) {
        } else {
            try {
                InserirFuncionarioView insFunc = new InserirFuncionarioView(new javax.swing.JFrame(), true);
                insFunc.preencherFuncionario((String) jtFuncionarios.getValueAt(linhaSelecionada, 0));
                insFunc.setVisible(true);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        }

    }//GEN-LAST:event_bEditarActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed

        List<Funcionario> lista;
        String comando = "select * from funcionario";

        if (!"".equals(txtCpf.getText())
                || !"".equals(txtNome.getText())
                || !"Selecione".equals(cbStatus.getSelectedItem())
                || !"Selecione".equals(cbTipo.getSelectedItem())) {

            comando = comando + " where";

            if (!"".equals(txtCpf.getText())) {
                comando = comando + " cpfFunc = '" + txtCpf.getText() + "' and";
            }
            if (!"".equals(txtNome.getText())) {
                comando = comando + " nomeFunc = '" + txtNome.getText() + "' and";
            }
            if (!"Selecione".equals(cbStatus.getSelectedItem())) {
                comando = comando + " statusFunc = '" + cbStatus.getSelectedItem() + "' and";
            }
            if (!"Selecione".equals(cbTipo.getSelectedItem())) {
                comando = comando + " tipoFunc = '" + cbTipo.getSelectedItem() + "' and";
            }
            
            comando = comando.substring(0, comando.length() - 4);
        }
        System.out.println(comando);
        lista = new FuncionarioDAO().listarFuncionarios(comando);

        DefaultTableModel modelo = (DefaultTableModel) jtFuncionarios.getModel();

        for (int i = modelo.getRowCount() - 1; i > -1; i--) {
            modelo.removeRow(i);
        }

        for (Funcionario funcionario : lista) {

            Object[] vetor = new Object[]{
                funcionario.getCpfFunc(),
                funcionario.getNomeFunc(),
                funcionario.getTipoFunc(),
                funcionario.getStatusFunc()
            };

            modelo.addRow(vetor);
        }
    }//GEN-LAST:event_bBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarFuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarFuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarFuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarFuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscarFuncionarioView dialog = new BuscarFuncionarioView(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bEditar;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jspFuncionarios;
    private javax.swing.JTable jtFuncionarios;
    private javax.swing.JLabel lCpf;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lTipo;
    private javax.swing.JLabel lblNomeFunc;
    private javax.swing.JLabel lblNomePrograma1;
    private javax.swing.JPanel pnTopo;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtNome;
    private javax.swing.JLabel txtStatus;
    // End of variables declaration//GEN-END:variables
}
