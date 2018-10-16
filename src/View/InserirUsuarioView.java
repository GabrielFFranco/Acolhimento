package View;

import Control.CamposNumericos;
import DAO.EnderecoDAO;
import DAO.FuncionarioDAO;
import Model.Usuario;
import DAO.UsuarioDAO;
import Model.Endereco;
import Model.Funcionario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class InserirUsuarioView extends javax.swing.JDialog {

    public InserirUsuarioView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtDoc.setDocument(new CamposNumericos());
        txtNum.setDocument(new CamposNumericos());
        List<Funcionario> lista = new FuncionarioDAO().listarFuncionarios("select * from funcionario");
        for (Funcionario funcionarioLista : lista) {
            bcxResponsavel.addItem(funcionarioLista.getCpfFunc());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCidadeOrigem3 = new javax.swing.JTextField();
        lblCidadeOrigem3 = new javax.swing.JLabel();
        pnTopo = new javax.swing.JPanel();
        lblNomePrograma1 = new javax.swing.JLabel();
        lblNomeFunc = new javax.swing.JLabel();
        pnDados = new javax.swing.JPanel();
        lblTipo = new javax.swing.JLabel();
        bcxTipo = new javax.swing.JComboBox<>();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        cbxSexo = new javax.swing.JComboBox<>();
        lblDoc = new javax.swing.JLabel();
        cbxDoc = new javax.swing.JComboBox<>();
        txtDoc = new javax.swing.JTextField();
        lblCidadeOrigem = new javax.swing.JLabel();
        txtCidadeOrigem = new javax.swing.JTextField();
        lblEnderecoFamiliar = new javax.swing.JLabel();
        txtEndFamiliar = new javax.swing.JTextField();
        lblNum = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblDrogas = new javax.swing.JLabel();
        atxParecerTec = new javax.swing.JScrollPane();
        jtaPArecerTec = new javax.swing.JTextArea();
        lblDataNascimento = new javax.swing.JLabel();
        lblParecer1 = new javax.swing.JLabel();
        atxParecerTec1 = new javax.swing.JScrollPane();
        jtaDrogas = new javax.swing.JTextArea();
        lblStatus = new javax.swing.JLabel();
        bcxStatus = new javax.swing.JComboBox<>();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        lbCEP = new javax.swing.JLabel();
        lblResponsavel = new javax.swing.JLabel();
        bcxResponsavel = new javax.swing.JComboBox<>();
        lblUltCidade = new javax.swing.JLabel();
        txtUltCidade = new javax.swing.JTextField();
        lblCidadeDest = new javax.swing.JLabel();
        txtCidadeDest = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        txtCEP = new javax.swing.JFormattedTextField();
        lblSituacao = new javax.swing.JLabel();
        bcxSituacao = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();

        txtCidadeOrigem3.setBackground(new java.awt.Color(204, 204, 204));
        txtCidadeOrigem3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblCidadeOrigem3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCidadeOrigem3.setForeground(new java.awt.Color(255, 255, 255));
        lblCidadeOrigem3.setText("N°");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        pnTopo.setBackground(new java.awt.Color(204, 204, 204));
        pnTopo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNomePrograma1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        lblNomePrograma1.setForeground(new java.awt.Color(51, 102, 255));
        lblNomePrograma1.setText("SisAC");

        lblNomeFunc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNomeFunc.setForeground(new java.awt.Color(51, 102, 255));
        lblNomeFunc.setText("Funcionário do acolhimento");

        javax.swing.GroupLayout pnTopoLayout = new javax.swing.GroupLayout(pnTopo);
        pnTopo.setLayout(pnTopoLayout);
        pnTopoLayout.setHorizontalGroup(
            pnTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTopoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblNomePrograma1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 452, Short.MAX_VALUE)
                .addComponent(lblNomeFunc)
                .addGap(20, 20, 20))
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

        lblTipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(255, 255, 255));
        lblTipo.setText("Tipo");

        bcxTipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bcxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morador", "Não-Perfil", "Migrante" }));

        lblNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome*");

        txtNome.setBackground(new java.awt.Color(204, 204, 204));
        txtNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblSexo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblSexo.setForeground(new java.awt.Color(255, 255, 255));
        lblSexo.setText("Sexo*");

        cbxSexo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        lblDoc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDoc.setForeground(new java.awt.Color(255, 255, 255));
        lblDoc.setText("Documento");

        cbxDoc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbxDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Certidão de Nascimento", "RG", "CPF", "CNH" }));

        txtDoc.setBackground(new java.awt.Color(204, 204, 204));
        txtDoc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblCidadeOrigem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCidadeOrigem.setForeground(new java.awt.Color(255, 255, 255));
        lblCidadeOrigem.setText("Cidade de Origem");

        txtCidadeOrigem.setBackground(new java.awt.Color(204, 204, 204));
        txtCidadeOrigem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblEnderecoFamiliar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblEnderecoFamiliar.setForeground(new java.awt.Color(255, 255, 255));
        lblEnderecoFamiliar.setText("Endereço Familiar");

        txtEndFamiliar.setBackground(new java.awt.Color(204, 204, 204));
        txtEndFamiliar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblNum.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNum.setForeground(new java.awt.Color(255, 255, 255));
        lblNum.setText("N°");

        txtNum.setBackground(new java.awt.Color(204, 204, 204));
        txtNum.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblBairro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblBairro.setForeground(new java.awt.Color(255, 255, 255));
        lblBairro.setText("Bairro");

        txtBairro.setBackground(new java.awt.Color(204, 204, 204));
        txtBairro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblCidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCidade.setForeground(new java.awt.Color(255, 255, 255));
        lblCidade.setText("Cidade");

        txtCidade.setBackground(new java.awt.Color(204, 204, 204));
        txtCidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblDrogas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDrogas.setForeground(new java.awt.Color(255, 255, 255));
        lblDrogas.setText("Uso de substancias:");

        jtaPArecerTec.setColumns(20);
        jtaPArecerTec.setRows(5);
        atxParecerTec.setViewportView(jtaPArecerTec);

        lblDataNascimento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDataNascimento.setForeground(new java.awt.Color(255, 255, 255));
        lblDataNascimento.setText("Data Nascimento");

        lblParecer1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblParecer1.setForeground(new java.awt.Color(255, 255, 255));
        lblParecer1.setText("Parecer Técnico");

        jtaDrogas.setColumns(20);
        jtaDrogas.setRows(5);
        atxParecerTec1.setViewportView(jtaDrogas);

        lblStatus.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setText("Status");

        bcxStatus.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bcxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Evadido", "Desligado" }));

        txtDataNascimento.setBackground(new java.awt.Color(204, 204, 204));
        try {
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbCEP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbCEP.setForeground(new java.awt.Color(255, 255, 255));
        lbCEP.setText("CEP");

        lblResponsavel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblResponsavel.setForeground(new java.awt.Color(255, 255, 255));
        lblResponsavel.setText("Responsavel");

        bcxResponsavel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bcxResponsavel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        lblUltCidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUltCidade.setForeground(new java.awt.Color(255, 255, 255));
        lblUltCidade.setText("Ultima Cidade:");

        txtUltCidade.setBackground(new java.awt.Color(204, 204, 204));
        txtUltCidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblCidadeDest.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCidadeDest.setForeground(new java.awt.Color(255, 255, 255));
        lblCidadeDest.setText("Cidade Destino");

        txtCidadeDest.setBackground(new java.awt.Color(204, 204, 204));
        txtCidadeDest.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        txtCEP.setBackground(new java.awt.Color(204, 204, 204));
        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblSituacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblSituacao.setForeground(new java.awt.Color(255, 255, 255));
        lblSituacao.setText("Situação");

        bcxSituacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bcxSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atendido", "Acompanhado" }));

        javax.swing.GroupLayout pnDadosLayout = new javax.swing.GroupLayout(pnDados);
        pnDados.setLayout(pnDadosLayout);
        pnDadosLayout.setHorizontalGroup(
            pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDadosLayout.createSequentialGroup()
                        .addComponent(lblResponsavel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bcxResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(lblSituacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bcxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnDadosLayout.createSequentialGroup()
                        .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnDadosLayout.createSequentialGroup()
                                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome)
                                    .addComponent(lblTipo))
                                .addGap(27, 27, 27)
                                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bcxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnDadosLayout.createSequentialGroup()
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(lblSexo)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pnDadosLayout.createSequentialGroup()
                                .addComponent(lblDataNascimento)
                                .addGap(18, 18, 18)
                                .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(lblDoc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblParecer1)
                            .addGroup(pnDadosLayout.createSequentialGroup()
                                .addComponent(lblCidadeOrigem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCidadeOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblEnderecoFamiliar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEndFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnDadosLayout.createSequentialGroup()
                                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnDadosLayout.createSequentialGroup()
                                        .addComponent(lblBairro)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnDadosLayout.createSequentialGroup()
                                        .addComponent(lblCidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(37, 37, 37)
                                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCEP)
                                    .addComponent(lblNum))
                                .addGap(18, 18, 18)
                                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(pnDadosLayout.createSequentialGroup()
                        .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(atxParecerTec, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                            .addComponent(lblDrogas, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(atxParecerTec1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDadosLayout.createSequentialGroup()
                                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnDadosLayout.createSequentialGroup()
                                        .addComponent(lblCidadeDest)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCidadeDest, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnDadosLayout.createSequentialGroup()
                                        .addComponent(lblUltCidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtUltCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDadosLayout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addGap(44, 44, 44)
                                .addComponent(btnVoltar)
                                .addGap(56, 56, 56))))))
            .addGroup(pnDadosLayout.createSequentialGroup()
                .addGap(452, 452, 452)
                .addComponent(lblStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bcxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnDadosLayout.setVerticalGroup(
            pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(bcxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSexo)
                    .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataNascimento)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoc)
                    .addComponent(cbxDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidadeOrigem)
                    .addComponent(txtCidadeOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEnderecoFamiliar)
                    .addComponent(txtEndFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNum)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCEP)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bcxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatus))
                .addGap(9, 9, 9)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSituacao)
                        .addComponent(bcxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblResponsavel)
                        .addComponent(bcxResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDadosLayout.createSequentialGroup()
                        .addComponent(lblDrogas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atxParecerTec1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnDadosLayout.createSequentialGroup()
                        .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUltCidade)
                            .addComponent(txtUltCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCidadeDest)
                            .addComponent(txtCidadeDest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblParecer1)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDadosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atxParecerTec, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDadosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVoltar)
                            .addComponent(btnSalvar))
                        .addGap(42, 42, 42))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private int nProntuarioUsu = 0;

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

// TODO add your handling code here:
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario = new Usuario();
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        Endereco endereco = new Endereco();
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        Funcionario funcionario = new Funcionario();

        try {

            usuario.setTipoUsu((String) bcxTipo.getSelectedItem());
            usuario.setNomeUsu(txtNome.getText());
            usuario.setSexoUsu((String) cbxSexo.getSelectedItem());

            SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date dataUtil = form.parse(txtDataNascimento.getText());
            usuario.setDataNascUsu(new java.sql.Date(dataUtil.getTime()));

            usuario.setAtendidoPeloFunc_FK("076.855.759-30");
            usuario.setTipoDoc((String) cbxDoc.getSelectedItem());
            usuario.setDocumentoUsu(txtDoc.getText());
            usuario.setCidadeOrigemUsu(txtCidadeOrigem.getText());

            usuario.setStatusUsu((String) bcxStatus.getSelectedItem());

            if (bcxTipo.getSelectedItem().equals("Morador")) {
                usuario.setUltimaCidade(null);
                usuario.setCidadeDestino(null);

                usuario.setResponsavel_FK((String) bcxResponsavel.getSelectedItem());
                usuario.setDrogasUsadasUsu(jtaDrogas.getText());
                usuario.setParecerTecnicoUsu(jtaPArecerTec.getText());
                usuario.setSituacao((String) bcxSituacao.getSelectedItem());
            } else {
                usuario.setResponsavel_FK(null);
                usuario.setDrogasUsadasUsu(null);
                usuario.setParecerTecnicoUsu(null);
                usuario.setSituacao(null);

                usuario.setUltimaCidade(txtUltCidade.getText());
                usuario.setCidadeDestino(txtCidadeDest.getText());
            }

            endereco.setEndereco(txtEndFamiliar.getText());
            endereco.setBairro(txtBairro.getText());
            endereco.setNumEnd(Integer.parseInt(txtNum.getText()));
            endereco.setCidade(txtCidade.getText());
            endereco.setCep(txtCEP.getText());

            if (this.nProntuarioUsu == 0) {
                usuario.setDataCadastroUsu(new java.sql.Date(new java.util.Date().getTime()));
                if (usuario.getStatusUsu().equals("Ativo")) {
                    usuario.setDataDeEntrada(new java.sql.Date(new java.util.Date().getTime()));
                }
                enderecoDAO.setEndereco(endereco);
                usuario.setIdEndereco_FK(enderecoDAO.getUltimoEndereco());
                usuarioDAO.setUsuario(usuario);
            } else {
                if (usuarioDAO.getUsuario(nProntuarioUsu).getStatusUsu().equals("Ativo")
                        && usuario.getStatusUsu().equals("Desligado")) {
                    usuario.setDataDeSaida(new java.sql.Date(new java.util.Date().getTime()));
                } else if ((usuarioDAO.getUsuario(nProntuarioUsu).getStatusUsu().equals("Desligado")
                        && usuario.getStatusUsu().equals("Ativo"))) {
                    usuario.setDataDeSaida(null);
                    usuario.setDataDeEntrada(new java.sql.Date(new java.util.Date().getTime()));
                }
                usuario.setnProntuarioUsu(nProntuarioUsu);
                endereco.setIdEnd(usuarioDAO.getUsuario(nProntuarioUsu).getIdEndereco_FK());
                enderecoDAO.altEndereco(endereco);
                usuarioDAO.altUsuario(usuario);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(InserirUsuarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InserirUsuarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InserirUsuarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InserirUsuarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InserirUsuarioView dialog = new InserirUsuarioView(new javax.swing.JFrame(), true);
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
    private javax.swing.JScrollPane atxParecerTec;
    private javax.swing.JScrollPane atxParecerTec1;
    private javax.swing.JComboBox<String> bcxResponsavel;
    private javax.swing.JComboBox<String> bcxSituacao;
    private javax.swing.JComboBox<String> bcxStatus;
    private javax.swing.JComboBox<String> bcxTipo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbxDoc;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jtaDrogas;
    private javax.swing.JTextArea jtaPArecerTec;
    private javax.swing.JLabel lbCEP;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCidadeDest;
    private javax.swing.JLabel lblCidadeOrigem;
    private javax.swing.JLabel lblCidadeOrigem3;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblDoc;
    private javax.swing.JLabel lblDrogas;
    private javax.swing.JLabel lblEnderecoFamiliar;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeFunc;
    private javax.swing.JLabel lblNomePrograma1;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblParecer1;
    private javax.swing.JLabel lblResponsavel;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblUltCidade;
    private javax.swing.JPanel pnDados;
    private javax.swing.JPanel pnTopo;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCidadeDest;
    private javax.swing.JTextField txtCidadeOrigem;
    private javax.swing.JTextField txtCidadeOrigem3;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtDoc;
    private javax.swing.JTextField txtEndFamiliar;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtUltCidade;
    // End of variables declaration//GEN-END:variables

    void preencherUsuario(Integer nProntuarioUsu) throws ParseException {

        this.nProntuarioUsu = nProntuarioUsu;

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario = usuarioDAO.getUsuario(nProntuarioUsu);

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        Funcionario funcionario = funcionarioDAO.getFuncionario(usuario.getAtendidoPeloFunc_FK());
        Funcionario funcionarioResp = funcionarioDAO.getFuncionario(usuario.getResponsavel_FK());

        EnderecoDAO enderecoDAO = new EnderecoDAO();
        Endereco endereco = enderecoDAO.getEndereco(usuario.getIdEndereco_FK());

        for (int i = 0; i < bcxTipo.getItemCount(); i++) {
            if (bcxTipo.getItemAt(i).equals(usuario.getTipoUsu())) {
                bcxTipo.setSelectedIndex(i);
            }
        }

        txtNome.setText(usuario.getNomeUsu());

        for (int i = 0; i < cbxSexo.getItemCount(); i++) {
            if (cbxSexo.getItemAt(i).equals(usuario.getSexoUsu())) {
                cbxSexo.setSelectedIndex(i);
            }
        }

        try {
            SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
            txtDataNascimento.setText(out.format(in.parse(String.valueOf(usuario.getDataNascUsu()))));
        } catch (ParseException ex) {

        }

        for (int i = 0; i < cbxDoc.getItemCount(); i++) {
            if (cbxDoc.getItemAt(i).equals(usuario.getTipoDoc())) {
                cbxDoc.setSelectedIndex(i);
            }
        }

        txtDoc.setText(usuario.getDocumentoUsu());
        txtCidadeOrigem.setText(usuario.getCidadeOrigemUsu());

        txtEndFamiliar.setText(endereco.getEndereco());
        txtBairro.setText(endereco.getBairro());
        txtNum.setText(String.valueOf(endereco.getNumEnd()));
        txtCidade.setText(endereco.getCidade());
        txtCEP.setText(endereco.getCep());

        for (int i = 0; i < bcxStatus.getItemCount(); i++) {
            if (bcxStatus.getItemAt(i).equals(usuario.getStatusUsu())) {
                bcxStatus.setSelectedIndex(i);
            }
        }

        if (usuario.getTipoUsu().equals("Morador")) {
            for (int i = 0; i < bcxResponsavel.getItemCount(); i++) {
                if (bcxResponsavel.getItemAt(i).equals(usuario.getResponsavel_FK())) {
                    bcxResponsavel.setSelectedIndex(i);
                }
            }
            for (int i = 0; i < bcxSituacao.getItemCount(); i++) {
                if (bcxSituacao.getItemAt(i).equals(usuario.getSituacao())) {
                    bcxSituacao.setSelectedIndex(i);
                }
                jtaDrogas.setText(usuario.getDrogasUsadasUsu());
                jtaPArecerTec.setText(usuario.getParecerTecnicoUsu());
            }
        } else {
            txtUltCidade.setText(usuario.getUltimaCidade());
            txtCidadeDest.setText(usuario.getCidadeDestino());
        }
    }
}
