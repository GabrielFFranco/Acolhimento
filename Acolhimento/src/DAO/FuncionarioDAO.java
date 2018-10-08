/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Control.Conexao;
import Model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class FuncionarioDAO {
    
        public void setFuncionario(Funcionario funcionario){
    
        String comando = "insert into funcionario values (?,?,?,?,?,?,?,?,?)";

        try {
            Connection conexao = new Conexao().getConnection();

            PreparedStatement comandoSQL = conexao.prepareStatement(comando);

            comandoSQL.setDouble(1, funcionario.getCpfFunc());
            comandoSQL.setString(2, funcionario.getNomeFunc());
            comandoSQL.setDouble(3, funcionario.getRgFunc());
            comandoSQL.setDate(4, funcionario.getDataNascFunc());
            comandoSQL.setString(5, funcionario.getTelefoneFunc());
            comandoSQL.setString(6, funcionario.getEmailFunc());
            comandoSQL.setString(7, funcionario.getTipoFunc());
            comandoSQL.setString(8, funcionario.getStatusFunc());
            comandoSQL.setInt(9, funcionario.getIdEndereco_FK());
            
            comandoSQL.executeUpdate();

            comandoSQL.close();
            conexao.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void altEndereco(Funcionario funcionario){
        
        String comando = "update funcionario set nomeFunc = ?, rgFunc = ?, dataNascFunc = ?,"
                + " telefoneFunc = ?, emailFunc = ?, tipoFunc = ?, statusFunc = ?"
                + " where cpfFunc = ?";
        
        try {
            
            Connection conexao = new Conexao().getConnection();

            PreparedStatement comandoSQL = conexao.prepareStatement(comando);

            comandoSQL.setDouble(8, funcionario.getCpfFunc());
            comandoSQL.setString(1, funcionario.getNomeFunc());
            comandoSQL.setDouble(2, funcionario.getRgFunc());
            comandoSQL.setDate(3, funcionario.getDataNascFunc());
            comandoSQL.setString(4, funcionario.getTelefoneFunc());
            comandoSQL.setString(5, funcionario.getEmailFunc());
            comandoSQL.setString(6, funcionario.getTipoFunc());
            comandoSQL.setString(7, funcionario.getStatusFunc());
            
            comandoSQL.executeUpdate();

            comandoSQL.close();
            conexao.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }   
    }
    
    /**
     * Método para listar todos os funcionários.
     * @param listarFuncionarios
     * @return
     */
    public List<Funcionario> getFuncionario(String listarFuncionarios){
        
        ArrayList lista = new ArrayList();

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

    
}