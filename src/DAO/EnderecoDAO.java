/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Control.Conexao;
import Model.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class EnderecoDAO {
    
    /**
     * Método para inserir um endereço no banco de dados.
     * @param endereco
     */
    public void setEndereco(Endereco endereco){
        
        String comando = "insert into endereco (endereco, numeroEnd, bairro, cidade,"
                + " cep) values (?,?,?,?,?)";
        
        try {
            
            Connection conexao = new Conexao().getConnection();

            PreparedStatement comandoSQL = conexao.prepareStatement(comando);

            comandoSQL.setString(1, endereco.getEndereco());
            comandoSQL.setInt(2, endereco.getNumEnd());
            comandoSQL.setString(3, endereco.getBairro());
            comandoSQL.setString(4, endereco.getCidade());
            comandoSQL.setDouble(5, endereco.getCep());

            comandoSQL.executeUpdate();

            comandoSQL.close();
            conexao.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
    
    public void altEndereco(Endereco endereco){
        
        String comando = "update endereco set endereco = ?, numeroEnd = ?, bairro = ?,"
                + " cidade = ?, cep = ? where idEndereco = ?";
        
        try {
            
            Connection conexao = new Conexao().getConnection();

            PreparedStatement comandoSQL = conexao.prepareStatement(comando);

            comandoSQL.setString(1, endereco.getEndereco());
            comandoSQL.setInt(2, endereco.getNumEnd());
            comandoSQL.setString(3, endereco.getBairro());
            comandoSQL.setString(4, endereco.getCidade());
            comandoSQL.setDouble(5, endereco.getCep());
            comandoSQL.setInt(6, endereco.getIdEnd());

            comandoSQL.executeUpdate();

            comandoSQL.close();
            conexao.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
     /**
     * Método para retornar um endereço
     * @param idEnd
     * @return
     */
    public Endereco getEndereco(int idEnd){
        
        Endereco lista = new Endereco();

        String listarEncaminhamentos = "SELECT endereco, numeroEnd, bairro, cidade, cep "
                + "FROM endereco WHERE idEndereco = ?";

        try {

            Connection conexao = new Conexao().getConnection();
            PreparedStatement comandoSQL = conexao.prepareStatement(listarEncaminhamentos);

            comandoSQL.setLong(1, idEnd);

            ResultSet retorno = comandoSQL.executeQuery();

            while (retorno.next()) {

                lista.setEndereco(retorno.getString("endereco"));
                lista.setNumEnd(retorno.getInt("numeroEnd"));
                lista.setBairro(retorno.getString("bairro"));
                lista.setCidade(retorno.getString("cidade"));
                lista.setCep(retorno.getDouble("cep"));
                
            }
            
            comandoSQL.close();
            conexao.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return lista;
        
    }
    
    public int getUltimoEndereco(){
        
        String comando = "Select MAX(idEndereco) as idEndereco from endereco";
        int resultado = 0;
        
        try {

            Connection conexao = new Conexao().getConnection();
            PreparedStatement comandoSQL = conexao.prepareStatement(comando);

            ResultSet retorno = comandoSQL.executeQuery();

            while (retorno.next()) {
                resultado = retorno.getInt("idEndereco");
            }
            
            comandoSQL.close();
            conexao.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return resultado;
        
    }
    
}
