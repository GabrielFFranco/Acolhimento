/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Control.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Classe criada que representa a entidade Endereço
 * @author Gabriel Ferreira Franco
 */
public class Endereco {
    
    private int idEnd;
    private String endereco;
    private int numEnd;
    private String bairro;
    private String cidade;
    private String cep;

    public Endereco(){
        
    }
    
    public Endereco(int idEnd, String endereco, int numEnd, String bairro, String cidade, String cep) {
        this.idEnd = idEnd;
        this.endereco = endereco;
        this.numEnd = numEnd;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
    }
    
    /**
     * Método para inserir um endereço no banco de dados.
     */
    public void setEndereco(){
        
        String comando = "insert into endereco (endereco, numeroEnd, bairro, cidade,"
                + " cep) values (?,?,?,?,?)";
        
        try {
            
            Connection conexao = new Conexao().getConnection();

            PreparedStatement comandoSQL = conexao.prepareStatement(comando);

            comandoSQL.setString(1, this.getEndereco());
            comandoSQL.setInt(2, this.getNumEnd());
            comandoSQL.setString(3, this.getBairro());
            comandoSQL.setString(4, this.getCidade());
            comandoSQL.setString(5, this.getCep());

            comandoSQL.executeUpdate();

            comandoSQL.close();
            conexao.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
    
    public void altEndereco(){
        
        String comando = "update endereco set endereco = ?, numeroEnd = ?, bairro = ?,"
                + " cidade = ?, cep = ? where idEndereco = ?";
        
        try {
            
            Connection conexao = new Conexao().getConnection();

            PreparedStatement comandoSQL = conexao.prepareStatement(comando);

            comandoSQL.setString(1, this.getEndereco());
            comandoSQL.setInt(2, this.getNumEnd());
            comandoSQL.setString(3, this.getBairro());
            comandoSQL.setString(4, this.getCidade());
            comandoSQL.setString(5, this.getCep());
            comandoSQL.setInt(6, this.getIdEnd());

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
                lista.setCep(retorno.getString("cep"));
                
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
    
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getIdEnd() {
        return idEnd;
    }

    public void setIdEnd(int idEnd) {
        this.idEnd = idEnd;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumEnd() {
        return numEnd;
    }

    public void setNumEnd(int numEnd) {
        this.numEnd = numEnd;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
}
