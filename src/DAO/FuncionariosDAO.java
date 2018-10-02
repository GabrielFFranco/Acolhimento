/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Control.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author gabri
 */
public class FuncionariosDAO {
    
    private double cpfFunc;
    private String nomeFunc;
    private double rgFunc;
    private Date dataNascFunc;
    private String telefoneFunc;
    private String emailFunc;
    private String tipoFunc;
    private String statusFunc;
    private int idEndereco_FK;

    public FuncionariosDAO(double cpfFunc, String nomeFunc, double rgFunc, Date dataNascFunc, String telefoneFunc, String emailFunc, String tipoFunc, String statusFunc, int idEndereco_FK) {
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

    public FuncionariosDAO() {
    }
    
    FuncionariosDAO funcionario = new FuncionariosDAO();
    
    public void setFuncionario(){
    
        String comando = "insert into funcionario values (?,?,?,?,?,?,?,?,?)";

        try {
            Connection conexao = new Conexao().getConnection();

            PreparedStatement comandoSQL = conexao.prepareStatement(comando);

            comandoSQL.setDouble(1, this.getCpfFunc());
            comandoSQL.setString(2, this.getNomeFunc());
            comandoSQL.setDouble(3, this.getRgFunc());
            comandoSQL.setDate(4, (java.sql.Date) this.getDataNascFunc());
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
