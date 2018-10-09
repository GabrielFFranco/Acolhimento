
package View;

import DAO.Usuario;
import DAO.UsuarioDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsultaUsuarioView extends javax.swing.JFrame {


    public ConsultaUsuarioView(Integer id) {
        initComponents();
        mostrarDados(id);
    }

    private ConsultaUsuarioView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mostrarDados(Integer id) {
        Usuario obj = new Usuario();
        UsuarioDAO dao = new UsuarioDAO();
        obj.setNumProntuario(id);
        obj = dao.selecionar(obj);
        bcxTipo.setSelectedItem(obj.getTipoUsuario());
        Date data = obj.getDataNascimento();
        String dataNasc = converteData(data);
        txtDAtaNascimento.setText(dataNasc);
        txtNome.setText(obj.getNome());
        cbxSexo.setSelectedItem(obj.getSexo());
        cbxDoc.setSelectedItem(obj.getTipoDoc());
        txtDoc.setText(obj.getDocumento());
        txtCidadeOrigem.setText(obj.getCidadeOrigem());
        bcxStatus.setSelectedItem(obj.getStatusUsuario());
        cbxUF.setSelectedItem(obj.getEstadoCidOrigem());
        txtEndFamiliar.setText(String.valueOf(obj.getEndereco()));
        // +- assim acho txtBairro.setText(obj.getEndereco().getBairro);
        // +- assim acho txtNum.setText(obj.getEndereco().getNumCasa);
        txtCidade.setText(obj.getCidade());
        cbxUFCidade.setSelectedItem(obj.getEstadoCidOrigem());
        jtaDrogas.setText(obj.getDrogas());
        jtaPArecerTec.setText(obj.getParecerTec());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        lblUf = new javax.swing.JLabel();
        cbxUF = new javax.swing.JComboBox<>();
        lblEnderecoFamiliar = new javax.swing.JLabel();
        txtEndFamiliar = new javax.swing.JTextField();
        lblNum = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblUFCidade = new javax.swing.JLabel();
        cbxUFCidade = new javax.swing.JComboBox<>();
        lblDrogas = new javax.swing.JLabel();
        atxParecerTec = new javax.swing.JScrollPane();
        jtaPArecerTec = new javax.swing.JTextArea();
        txtDAtaNascimento = new javax.swing.JTextField();
        lblDataNascimento = new javax.swing.JLabel();
        lblParecer1 = new javax.swing.JLabel();
        atxParecerTec1 = new javax.swing.JScrollPane();
        jtaDrogas = new javax.swing.JTextArea();
        lblStatus = new javax.swing.JLabel();
        bcxStatus = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        pnTopo = new javax.swing.JPanel();
        lblNomePrograma1 = new javax.swing.JLabel();
        lblNomeFunc = new javax.swing.JLabel();
        lblBtnCancel = new javax.swing.JLabel();
        lblCancel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        txtNome.setEditable(false);
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
        cbxDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Certidão de Nascimento", "RG", "CPF", "CNH" }));

        txtDoc.setEditable(false);
        txtDoc.setBackground(new java.awt.Color(204, 204, 204));
        txtDoc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblCidadeOrigem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCidadeOrigem.setForeground(new java.awt.Color(255, 255, 255));
        lblCidadeOrigem.setText("Cidade de Origem");

        txtCidadeOrigem.setEditable(false);
        txtCidadeOrigem.setBackground(new java.awt.Color(204, 204, 204));
        txtCidadeOrigem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblUf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUf.setForeground(new java.awt.Color(255, 255, 255));
        lblUf.setText("UF");

        cbxUF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SP", "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "TO" }));

        lblEnderecoFamiliar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblEnderecoFamiliar.setForeground(new java.awt.Color(255, 255, 255));
        lblEnderecoFamiliar.setText("Endereço Familiar");

        txtEndFamiliar.setEditable(false);
        txtEndFamiliar.setBackground(new java.awt.Color(204, 204, 204));
        txtEndFamiliar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblNum.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNum.setForeground(new java.awt.Color(255, 255, 255));
        lblNum.setText("N°");

        txtNum.setEditable(false);
        txtNum.setBackground(new java.awt.Color(204, 204, 204));
        txtNum.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblBairro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblBairro.setForeground(new java.awt.Color(255, 255, 255));
        lblBairro.setText("Bairro");

        txtBairro.setEditable(false);
        txtBairro.setBackground(new java.awt.Color(204, 204, 204));
        txtBairro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblCidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCidade.setForeground(new java.awt.Color(255, 255, 255));
        lblCidade.setText("Cidade");

        txtCidade.setEditable(false);
        txtCidade.setBackground(new java.awt.Color(204, 204, 204));
        txtCidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblUFCidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUFCidade.setForeground(new java.awt.Color(255, 255, 255));
        lblUFCidade.setText("UF");

        cbxUFCidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbxUFCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SP", "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "TO" }));

        lblDrogas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDrogas.setForeground(new java.awt.Color(255, 255, 255));
        lblDrogas.setText("Uso de substancias:");

        jtaPArecerTec.setEditable(false);
        jtaPArecerTec.setColumns(20);
        jtaPArecerTec.setRows(5);
        atxParecerTec.setViewportView(jtaPArecerTec);

        txtDAtaNascimento.setEditable(false);
        txtDAtaNascimento.setBackground(new java.awt.Color(204, 204, 204));
        txtDAtaNascimento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblDataNascimento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDataNascimento.setForeground(new java.awt.Color(255, 255, 255));
        lblDataNascimento.setText("Data Nascimento");

        lblParecer1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblParecer1.setForeground(new java.awt.Color(255, 255, 255));
        lblParecer1.setText("Parecer Técnico");

        jtaDrogas.setEditable(false);
        jtaDrogas.setColumns(20);
        jtaDrogas.setRows(5);
        atxParecerTec1.setViewportView(jtaDrogas);

        lblStatus.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setText("Status");

        bcxStatus.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bcxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));

        javax.swing.GroupLayout pnDadosLayout = new javax.swing.GroupLayout(pnDados);
        pnDados.setLayout(pnDadosLayout);
        pnDadosLayout.setHorizontalGroup(
            pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosLayout.createSequentialGroup()
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDadosLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblNome)
                        .addGap(27, 27, 27)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(lblSexo)
                        .addGap(18, 18, 18)
                        .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnDadosLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(lblTipo)
                        .addGap(18, 18, 18)
                        .addComponent(bcxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(lblDataNascimento)
                        .addGap(18, 18, 18)
                        .addComponent(txtDAtaNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnDadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnDadosLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnDadosLayout.createSequentialGroup()
                                        .addComponent(lblDoc)
                                        .addGap(26, 26, 26)
                                        .addComponent(cbxDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(txtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnDadosLayout.createSequentialGroup()
                                        .addGap(379, 379, 379)
                                        .addComponent(lblUFCidade)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxUFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnDadosLayout.createSequentialGroup()
                                        .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnDadosLayout.createSequentialGroup()
                                                .addGap(369, 369, 369)
                                                .addComponent(lblBairro)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(4, 4, 4))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDadosLayout.createSequentialGroup()
                                                .addComponent(lblStatus)
                                                .addGap(18, 18, 18)
                                                .addComponent(bcxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(57, 57, 57)))
                                        .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(pnDadosLayout.createSequentialGroup()
                                                .addComponent(lblNum)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtNum))
                                            .addGroup(pnDadosLayout.createSequentialGroup()
                                                .addComponent(lblUf)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(pnDadosLayout.createSequentialGroup()
                                .addComponent(lblCidadeOrigem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCidadeOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnDadosLayout.createSequentialGroup()
                                    .addComponent(lblEnderecoFamiliar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtEndFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDrogas)
                                    .addGroup(pnDadosLayout.createSequentialGroup()
                                        .addComponent(lblCidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(pnDadosLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(atxParecerTec1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(atxParecerTec, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnDadosLayout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(lblParecer1)
                    .addContainerGap(623, Short.MAX_VALUE)))
        );
        pnDadosLayout.setVerticalGroup(
            pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(bcxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDataNascimento)
                    .addComponent(txtDAtaNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSexo)
                    .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoc)
                    .addComponent(txtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblStatus)
                        .addComponent(bcxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblUf)
                        .addComponent(cbxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCidadeOrigem)
                        .addComponent(txtCidadeOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnderecoFamiliar)
                    .addComponent(txtEndFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNum)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUFCidade)
                    .addComponent(cbxUFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atxParecerTec1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDrogas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(atxParecerTec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDadosLayout.createSequentialGroup()
                    .addContainerGap(353, Short.MAX_VALUE)
                    .addComponent(lblParecer1)
                    .addGap(123, 123, 123)))
        );

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        lblBtnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/error.png"))); // NOI18N

        lblCancel.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lblCancel.setText("Voltar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(769, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBtnCancel)
                    .addComponent(lblCancel))
                .addGap(47, 47, 47))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(597, Short.MAX_VALUE)
                .addComponent(lblBtnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCancel)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(101, 101, 101)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(pnTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pnDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(72, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ConsultaUsuarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaUsuarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaUsuarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaUsuarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaUsuarioView().setVisible(true);
            }
        });
    }
    
    
    protected String converteData(java.util.Date dtData){
   SimpleDateFormat formatBra;   
   formatBra = new SimpleDateFormat("dd/MM/yyyy");
   try {
      java.util.Date newData = formatBra.parse(dtData.toString());
      return (formatBra.format(newData));
   } catch (ParseException Ex) {
      return "Erro na conversão da data";
   }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane atxParecerTec;
    private javax.swing.JScrollPane atxParecerTec1;
    private javax.swing.JComboBox<String> bcxStatus;
    private javax.swing.JComboBox<String> bcxTipo;
    private javax.swing.JComboBox<String> cbxDoc;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JComboBox<String> cbxUF;
    private javax.swing.JComboBox<String> cbxUFCidade;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jtaDrogas;
    private javax.swing.JTextArea jtaPArecerTec;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblBtnCancel;
    private javax.swing.JLabel lblCancel;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCidadeOrigem;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblDoc;
    private javax.swing.JLabel lblDrogas;
    private javax.swing.JLabel lblEnderecoFamiliar;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeFunc;
    private javax.swing.JLabel lblNomePrograma1;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblParecer1;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblUFCidade;
    private javax.swing.JLabel lblUf;
    private javax.swing.JPanel pnDados;
    private javax.swing.JPanel pnTopo;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCidadeOrigem;
    private javax.swing.JTextField txtDAtaNascimento;
    private javax.swing.JTextField txtDoc;
    private javax.swing.JTextField txtEndFamiliar;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNum;
    // End of variables declaration//GEN-END:variables
}
