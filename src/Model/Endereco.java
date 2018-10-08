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
