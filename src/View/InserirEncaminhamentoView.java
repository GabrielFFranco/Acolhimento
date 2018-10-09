/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.EncaminhamentoDAO;
import DAO.EnderecoDAO;
import DAO.FuncionarioDAO;
import DAO.UsuarioDAO;
import Model.Encaminhamento;
import Model.Endereco;
import Model.Funcionario;
import Model.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class InserirEncaminhamentoView extends javax.swing.JDialog {

    /**
     * Creates new form InserirUsuarioView
     */
    public InserirEncaminhamentoView(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        List<Usuario> lista = new UsuarioDAO().listar();
        for(Usuario usuarioLista : lista){
            jcbNomes.addItem(usuarioLista.getNome());
            cbNProntuario.addItem(String.valueOf(usuarioLista.getNumProntuario()));
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

        pnTopo = new javax.swing.JPanel();
        lblNomeEnc = new javax.swing.JLabel();
        lblNomePrograma1 = new javax.swing.JLabel();
        pnDados = new javax.swing.JPanel();
        lblNomeDoUsuario = new javax.swing.JLabel();
        lblTipoDeEncaminhamento = new javax.swing.JLabel();
        jlLocalEncaminhamento = new javax.swing.JLabel();
        txtLocalEncaminhamento = new javax.swing.JTextField();
        jlEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jlBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jlNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jlCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jlCep = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jcbTipoEncaminhamento = new javax.swing.JComboBox<>();
        jlCidade1 = new javax.swing.JLabel();
        txtFuncRealizouEnc = new javax.swing.JTextField();
        jlStatus = new javax.swing.JLabel();
        jcbStatus = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jcbNomes = new javax.swing.JComboBox<>();
        cbNProntuario = new javax.swing.JComboBox<>();
        jlNProntuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        lblNomeDoUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNomeDoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeDoUsuario.setText("Nome do Usuario*");

        lblTipoDeEncaminhamento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblTipoDeEncaminhamento.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoDeEncaminhamento.setText("Tipo de Encaminhamento");

        jlLocalEncaminhamento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlLocalEncaminhamento.setForeground(new java.awt.Color(255, 255, 255));
        jlLocalEncaminhamento.setText("Local de Encaminhamento");

        txtLocalEncaminhamento.setBackground(new java.awt.Color(204, 204, 204));
        txtLocalEncaminhamento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jlEndereco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlEndereco.setForeground(new java.awt.Color(255, 255, 255));
        jlEndereco.setText("Endereço*");

        txtEndereco.setBackground(new java.awt.Color(204, 204, 204));

        jlBairro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlBairro.setForeground(new java.awt.Color(255, 255, 255));
        jlBairro.setText("Bairro*");

        txtBairro.setBackground(new java.awt.Color(204, 204, 204));

        jlNumero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlNumero.setForeground(new java.awt.Color(255, 255, 255));
        jlNumero.setText("Nº");

        txtNumero.setBackground(new java.awt.Color(204, 204, 204));

        jlCidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlCidade.setForeground(new java.awt.Color(255, 255, 255));
        jlCidade.setText("Cidade");

        txtCidade.setBackground(new java.awt.Color(204, 204, 204));

        jlCep.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlCep.setForeground(new java.awt.Color(255, 255, 255));
        jlCep.setText("CEP");

        txtCep.setBackground(new java.awt.Color(204, 204, 204));

        jcbTipoEncaminhamento.setBackground(new java.awt.Color(204, 204, 204));
        jcbTipoEncaminhamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Sistema de Saúde", "Sistema de educação", "Sistema Judiciário", "Órgão parceiro" }));

        jlCidade1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlCidade1.setForeground(new java.awt.Color(255, 255, 255));
        jlCidade1.setText("<html>Funcionário que realizou<br/>\no encaminhamento");

        txtFuncRealizouEnc.setBackground(new java.awt.Color(204, 204, 204));

        jlStatus.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlStatus.setForeground(new java.awt.Color(255, 255, 255));
        jlStatus.setText("Status*");

        jcbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Anulado", "Válido" }));

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        jcbNomes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jcbNomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trocaNome(evt);
            }
        });

        cbNProntuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbNProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trocaNPront(evt);
            }
        });

        jlNProntuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlNProntuario.setForeground(new java.awt.Color(255, 255, 255));
        jlNProntuario.setText("Nº Prontuario");

        javax.swing.GroupLayout pnDadosLayout = new javax.swing.GroupLayout(pnDados);
        pnDados.setLayout(pnDadosLayout);
        pnDadosLayout.setHorizontalGroup(
            pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlStatus)
                    .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jlCidade1)
                        .addComponent(lblNomeDoUsuario)
                        .addComponent(lblTipoDeEncaminhamento)
                        .addComponent(jlLocalEncaminhamento)
                        .addComponent(jlEndereco)
                        .addComponent(jlBairro)
                        .addComponent(jlCidade)))
                .addGap(18, 18, 18)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDadosLayout.createSequentialGroup()
                        .addComponent(jcbTipoEncaminhamento, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(299, 299, 299))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDadosLayout.createSequentialGroup()
                        .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnDadosLayout.createSequentialGroup()
                                .addComponent(jcbNomes, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                                .addComponent(jlNProntuario))
                            .addGroup(pnDadosLayout.createSequentialGroup()
                                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtLocalEncaminhamento, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFuncRealizouEnc, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbStatus, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNumero)
                                    .addComponent(jlCep))))
                        .addGap(29, 29, 29)
                        .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCep, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(txtNumero)
                            .addComponent(cbNProntuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(125, 125, 125))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addGap(144, 144, 144))
        );
        pnDadosLayout.setVerticalGroup(
            pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeDoUsuario)
                    .addComponent(jcbNomes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNProntuario))
                .addGap(18, 18, 18)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoDeEncaminhamento)
                    .addComponent(jcbTipoEncaminhamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLocalEncaminhamento)
                    .addComponent(txtLocalEncaminhamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlEndereco)
                    .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlNumero)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCidade)
                    .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlCep)
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFuncRealizouEnc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlStatus)
                    .addComponent(jcbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalvar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private int idEnc = 0;
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        
        
        EncaminhamentoDAO encaminhamentoDAO = new EncaminhamentoDAO();
        Encaminhamento encaminhamento = new  Encaminhamento();
        
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        Endereco endereco = new Endereco();
        
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        Funcionario funcionario = new Funcionario();
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario = new Usuario();
        
        encaminhamento.setnProntuarioUsu_FK(Integer.parseInt((String) cbNProntuario.getSelectedItem()));
        
        encaminhamento.setTipoEnc(jcbTipoEncaminhamento.getSelectedItem().toString());
        encaminhamento.setStatusEnc(jcbStatus.getSelectedItem().toString());
        encaminhamento.setLocalEnc(txtLocalEncaminhamento.getText());
        encaminhamento.setCpfFunc_FK(Double.parseDouble(txtFuncRealizouEnc.getText()));
        java.util.Date dataUtil = new java.util.Date();  
        java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());
        encaminhamento.setDataEnc(dataSql);
        
        endereco.setEndereco(txtEndereco.getText());
        endereco.setNumEnd(Integer.parseInt(txtNumero.getText()));
        endereco.setBairro(txtBairro.getText());
        endereco.setCidade(txtCidade.getText());
        endereco.setCep(Double.parseDouble(txtCep.getText()));

        if (this.idEnc != 0) {
            
            endereco.setIdEnd(this.idEnc);
            enderecoDAO.altEndereco(endereco);
            encaminhamentoDAO.altEncaminhamento(encaminhamento);
            
        } else {
            enderecoDAO.setEndereco(endereco);
            encaminhamento.setIdEndereco_FK(enderecoDAO.getUltimoEndereco());
            encaminhamentoDAO.setEncaminhamento(encaminhamento);
        } 
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void trocaNome(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trocaNome
int i = jcbNomes.getSelectedIndex();
        cbNProntuario.setSelectedIndex(i);
    }//GEN-LAST:event_trocaNome

    private void trocaNPront(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trocaNPront
int i = cbNProntuario.getSelectedIndex();
        jcbNomes.setSelectedIndex(i);
    }//GEN-LAST:event_trocaNPront

    public void preencherEncaminhamento(int idEnc) throws ParseException {
        
        this.idEnc = idEnc;
        
        EncaminhamentoDAO encaminhamentoDAO = new EncaminhamentoDAO();
        Encaminhamento encaminhamento;
        
        encaminhamento = encaminhamentoDAO.getEncaminhamento(idEnc);
        
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        Endereco endereco;
        
        endereco = enderecoDAO.getEndereco((int)encaminhamento.getIdEndereco_FK());
        
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        Funcionario funcionario;
        
        funcionario = funcionarioDAO.getFuncionario(encaminhamento.getCpfFunc_FK());
        
        cbNProntuario.setText(funcionario.getNomeFunc());
        
        for (int i = 0; i < jcbTipoEncaminhamento.getItemCount(); i++) {
            if (jcbTipoEncaminhamento.getItemAt(i).equals(encaminhamento.getTipoEnc())) {
                jcbTipoEncaminhamento.setSelectedIndex(i);
            }
        };
        txtLocalEncaminhamento.setText(encaminhamento.getLocalEnc());
        txtEndereco.setText(endereco.getEndereco());
        txtNumero.setText(String.valueOf(endereco.getNumEnd()));
        txtBairro.setText(endereco.getBairro());
        txtCidade.setText(endereco.getCidade());
        txtCep.setText(String.valueOf(endereco.getCep()));
        txtFuncRealizouEnc.setText(funcionario.getNomeFunc());
        for (int i = 0; i < jcbStatus.getItemCount(); i++) {
            if (jcbStatus.getItemAt(i).equals(encaminhamento.getStatusEnc())) {
                jcbStatus.setSelectedIndex(i);
            }
        }
        
    }
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
            java.util.logging.Logger.getLogger(InserirEncaminhamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InserirEncaminhamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InserirEncaminhamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InserirEncaminhamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                InserirEncaminhamentoView dialog = new InserirEncaminhamentoView(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbNProntuario;
    private javax.swing.JComboBox<String> jcbNomes;
    private javax.swing.JComboBox<String> jcbStatus;
    private javax.swing.JComboBox<String> jcbTipoEncaminhamento;
    private javax.swing.JLabel jlBairro;
    private javax.swing.JLabel jlCep;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlCidade1;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlLocalEncaminhamento;
    private javax.swing.JLabel jlNProntuario;
    private javax.swing.JLabel jlNumero;
    private javax.swing.JLabel jlStatus;
    private javax.swing.JLabel lblNomeDoUsuario;
    private javax.swing.JLabel lblNomeEnc;
    private javax.swing.JLabel lblNomePrograma1;
    private javax.swing.JLabel lblTipoDeEncaminhamento;
    private javax.swing.JPanel pnDados;
    private javax.swing.JPanel pnTopo;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFuncRealizouEnc;
    private javax.swing.JTextField txtLocalEncaminhamento;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
