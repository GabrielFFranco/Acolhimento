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
import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Empresa {

    private double cnpjEmp;
    private String nomeEmp;
    private int numeroVagasEmp;
    private String razaoSocialEmp;
    private int idEndereco_FK;

    public Empresa(){
        
    }
    
    public Empresa(double cnpjEmp, String nomeEmp, int numeroVagasEmp, String razaoSocialEmp, int idEndereco) {
        this.cnpjEmp = cnpjEmp;
        this.nomeEmp = nomeEmp;
        this.numeroVagasEmp = numeroVagasEmp;
        this.razaoSocialEmp = razaoSocialEmp;
        this.idEndereco_FK = idEndereco;
    }
    
    public int getIdEndereco_FK() {
        return idEndereco_FK;
    }

    public void setIdEndereco_FK(int idEndereco_FK) {
        this.idEndereco_FK = idEndereco_FK;
    }

    public double getCnpjEmp() {
        return cnpjEmp;
    }

    public void setCnpjEmp(double cnpjEmp) {
        this.cnpjEmp = cnpjEmp;
    }

    public String getNomeEmp() {
        return nomeEmp;
    }

    public void setNomeEmp(String nomeEmp) {
        this.nomeEmp = nomeEmp;
    }

    public int getNumeroVagasEmp() {
        return numeroVagasEmp;
    }

    public void setNumeroVagasEmp(int numeroVagasEmp) {
        this.numeroVagasEmp = numeroVagasEmp;
    }

    public String getRazaoSocialEmp() {
        return razaoSocialEmp;
    }

    public void setRazaoSocialEmp(String razaoSocialEmp) {
        this.razaoSocialEmp = razaoSocialEmp;
    }
    
    
    
}
