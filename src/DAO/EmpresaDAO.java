/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Control.Conexao;
import Model.Empresa;
import Model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class EmpresaDAO {

    /**
     * Método para inserir uma empresa no banco de dados.
     *
     * @param empresa
     */
    public void setEmpresa(Empresa empresa) {

        String setar = "insert into empresa values (?,?,?,?,?)";

        try {
            Connection conexao = new Conexao().getConnection();

            PreparedStatement comandoSQL = conexao.prepareStatement(setar);

            comandoSQL.setString(1, empresa.getCnpjEmp());
            comandoSQL.setString(2, empresa.getNomeEmp());
            comandoSQL.setInt(3, empresa.getNumeroVagasEmp());
            comandoSQL.setString(4, empresa.getRazaoSocialEmp());
            comandoSQL.setInt(5, empresa.getIdEndereco_FK());

            comandoSQL.executeUpdate();

            comandoSQL.close();
            conexao.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    /**
     * Método para alterar uma empresa no banco de dados
     *
     * @param empresa
     */
    public void altEmpresa(Empresa empresa) {

        String comando = "update empresa set nomeEmp = ?, numeroVagasEmp = ?, "
                + "razaoSocialEmp = ?, idEndereco = ? where cnpjEmp = ?";

        try {
            Connection conexao = new Conexao().getConnection();

            PreparedStatement comandoSQL = conexao.prepareStatement(comando);

            comandoSQL.setString(5, empresa.getCnpjEmp());
            comandoSQL.setString(1, empresa.getNomeEmp());
            comandoSQL.setInt(2, empresa.getNumeroVagasEmp());
            comandoSQL.setString(3, empresa.getRazaoSocialEmp());
            comandoSQL.setInt(4, empresa.getIdEndereco_FK());

            comandoSQL.executeUpdate();

            comandoSQL.close();
            conexao.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Retorna uma empresa
     *
     * @return
     */
    public Empresa getEmpresa() {

        Empresa empresa = new Empresa();

        String listarEmpresa = "SELECT * FROM empresa";

        try {

            Connection conexao = new Conexao().getConnection();

            PreparedStatement comandoSQL = conexao.prepareStatement(listarEmpresa);

            ResultSet retorno = comandoSQL.executeQuery();

            if (retorno.next() == false) {
                return null;
            }else{
                retorno.beforeFirst();
                while (retorno.next()) {

                    empresa.setCnpjEmp(retorno.getString("cnpjEmp"));
                    empresa.setNomeEmp(retorno.getString("nomeEmp"));
                    empresa.setNumeroVagasEmp(retorno.getInt("numeroVagasEmp"));
                    empresa.setRazaoSocialEmp(retorno.getString("razaoSocialEmp"));
                    empresa.setIdEndereco_FK(retorno.getInt("idEndereco"));

                }
            }

            comandoSQL.close();
            conexao.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return empresa;

    }
}
