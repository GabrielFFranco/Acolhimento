/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Control.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabri
 */
public class Funcionario {
    
    private double cpfFunc;
    private String nomeFunc;
    private double rgFunc;
    private Date dataNascFunc;
    private String telefoneFunc;
    private String emailFunc;
    private String tipoFunc;
    private String statusFunc;
    private int idEndereco_FK;

    public Funcionario(double cpfFunc, String nomeFunc, double rgFunc, Date dataNascFunc, String telefoneFunc, String emailFunc, String tipoFunc, String statusFunc, int idEndereco_FK) {
        this.cpfFunc = cpfFunc;
        this.nomeFunc = nomeFunc;
        this.rgFunc = rgFunc;
        this.dataNascFunc = dataNascFunc;
        this.telefoneFunc = telefoneFunc;
        this.emailFunc = emailFunc;
        this.tipoFunc = tipoFunc;
        this.statusFunc = statusFunc;
        this.idEndereco_FK = idEndereco_FK;
    }

    public Funcionario() {
    }
    
    public void setFuncionario(){
    
        String comando = "insert into funcionario values (?,?,?,?,?,?,?,?,?)";

        try {
            Connection conexao = new Conexao().getConnection();

            PreparedStatement comandoSQL = conexao.prepareStatement(comando);

            comandoSQL.setDouble(1, this.getCpfFunc());
            comandoSQL.setString(2, this.getNomeFunc());
            comandoSQL.setDouble(3, this.getRgFunc());
            comandoSQL.setDate(4, this.getDataNascFunc());
            comandoSQL.setString(5, this.getTelefoneFunc());
            comandoSQL.setString(6, this.getEmailFunc());
            comandoSQL.setString(7, this.getTipoFunc());
            comandoSQL.setString(8, this.getStatusFunc());
            comandoSQL.setInt(9, this.getIdEndereco_FK());
            
            comandoSQL.executeUpdate();

            comandoSQL.close();
            conexao.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void altEndereco(){
        
        String comando = "update funcionario set nomeFunc = ?, rgFunc = ?, dataNascFunc = ?,"
                + " telefoneFunc = ?, emailFunc = ?, tipoFunc = ?, statusFunc = ?"
                + " where cpfFunc = ?";
        
        try {
            
            Connection conexao = new Conexao().getConnection();

            PreparedStatement comandoSQL = conexao.prepareStatement(comando);

            comandoSQL.setString(1, this.getNomeFunc());
            comandoSQL.setDouble(2, this.getRgFunc());
            comandoSQL.setDate(3, this.getDataNascFunc());
            comandoSQL.setString(4, this.getTelefoneFunc());
            comandoSQL.setString(5, this.getEmailFunc());
            comandoSQL.setString(6, this.getTipoFunc());
            comandoSQL.setString(7, this.getStatusFunc());
            comandoSQL.setDouble(8, this.getCpfFunc());

            comandoSQL.executeUpdate();

            comandoSQL.close();
            conexao.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }   
    }
    
    /**
     * Método para listar todos os funcionários.
     * @return
     */
    public List<Funcionario> getFuncionario(){
        
        ArrayList lista = new ArrayList();

        String listarFuncionarios = "SELECT * FROM funcionario";

        Connection conexao;
        try {
            conexao = new Conexao().getConnection();
            
            PreparedStatement comandoSQL = conexao.prepareStatement(listarFuncionarios);
            
            ResultSet retorno = comandoSQL.executeQuery();

            while (retorno.next()) {

                Funcionario funcionario = new Funcionario();
                
                funcionario.setCpfFunc(retorno.getDouble("cpfFunc"));
                funcionario.setNomeFunc(retorno.getString("nomeFunc"));
                funcionario.setRgFunc(retorno.getDouble("rgFunc"));
                funcionario.setDataNascFunc(retorno.getDate("dataNascFunc"));
                funcionario.setTelefoneFunc(retorno.getString("telefoneFunc"));
                funcionario.setEmailFunc(retorno.getString("emailFunc"));
                funcionario.setTipoFunc(retorno.getString("tipoFunc"));
                funcionario.setStatusFunc(retorno.getString("statusFunc"));
                funcionario.setIdEndereco_FK(retorno.getInt("idEndereco"));
                
                /*
                Object[] linha = new Object[6];

                linha[0] = retorno.getString("tipoEnc");
                linha[1] = retorno.getString("localEnc");
                linha[2] = retorno.getString("statusEnc");
                linha[3] = retorno.getLong("cpfFunc");
                linha[4] = retorno.getLong("nProntuarioUsu");
                linha[5] = retorno.getString("idEndereco");
                */
                
                lista.add(funcionario);
            }
            
            comandoSQL.close();
            conexao.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return lista;
        
    }
    
    public Funcionario getFuncionario(double cpf){
        
        Funcionario funcionario = new Funcionario();

        String listarFuncionarios = "SELECT * FROM funcionario WHERE cpfFunc = ?";

        try {

            Connection conexao = new Conexao().getConnection();
            PreparedStatement comandoSQL = conexao.prepareStatement(listarFuncionarios);

            comandoSQL.setDouble(1, cpf);

            ResultSet retorno = comandoSQL.executeQuery();

            while (retorno.next()) {

                funcionario.setCpfFunc(retorno.getDouble("cpfFunc"));
                funcionario.setNomeFunc(retorno.getString("nomeFunc"));
                funcionario.setRgFunc(retorno.getDouble("rgFunc"));
                funcionario.setDataNascFunc(retorno.getDate("dataNascFunc"));
                funcionario.setTelefoneFunc(retorno.getString("telefoneFunc"));
                funcionario.setEmailFunc(retorno.getString("emailFunc"));
                funcionario.setTipoFunc(retorno.getString("tipoFunc"));
                funcionario.setStatusFunc(retorno.getString("statusFunc"));
                funcionario.setIdEndereco_FK(retorno.getInt("idEndereco"));
                
            }
            
            comandoSQL.close();
            conexao.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return funcionario;
        
    }
    
    public double getCpfFunc() {
        return cpfFunc;
    }

    public void setCpfFunc(double cpfFunc) {
        this.cpfFunc = cpfFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public double getRgFunc() {
        return rgFunc;
    }

    public void setRgFunc(double rgFunc) {
        this.rgFunc = rgFunc;
    }

    public Date getDataNascFunc() {
        return dataNascFunc;
    }

    public void setDataNascFunc(Date dataNascFunc) {
        this.dataNascFunc = dataNascFunc;
    }

    public String getTelefoneFunc() {
        return telefoneFunc;
    }

    public void setTelefoneFunc(String telefoneFunc) {
        this.telefoneFunc = telefoneFunc;
    }

    public String getEmailFunc() {
        return emailFunc;
    }

    public void setEmailFunc(String emailFunc) {
        this.emailFunc = emailFunc;
    }

    public String getTipoFunc() {
        return tipoFunc;
    }

    public void setTipoFunc(String tipoFunc) {
        this.tipoFunc = tipoFunc;
    }

    public String getStatusFunc() {
        return statusFunc;
    }

    public void setStatusFunc(String statusFunc) {
        this.statusFunc = statusFunc;
    }

    public int getIdEndereco_FK() {
        return idEndereco_FK;
    }

    public void setIdEndereco_FK(int idEndereco_FK) {
        this.idEndereco_FK = idEndereco_FK;
    }
        
}
