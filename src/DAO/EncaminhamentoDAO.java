/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Control.Conexao;
import Model.Encaminhamento;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class EncaminhamentoDAO {
    
    /**
     * Método para inserir um encaminhamento no banco de dados.
     * @param encaminhamento
     */
    public void setEncaminhamento(Encaminhamento encaminhamento) {

        String comando = "insert into encaminhamento (tipoEnc, localEnc, statusEnc, cpfFunc,"
                + " nProntuarioUsu, dataEnc, idEndereco) values (?,?,?,?,?,?,?)";

        try {
            Connection conexao = new Conexao().getConnection();

            PreparedStatement comandoSQL = conexao.prepareStatement(comando);

            comandoSQL.setString(1, encaminhamento.getTipoEnc());
            comandoSQL.setString(2, encaminhamento.getLocalEnc());
            comandoSQL.setString(3, encaminhamento.getStatusEnc());
            comandoSQL.setString(4, encaminhamento.getCpfFunc_FK());
            comandoSQL.setLong(5, encaminhamento.getnProntuarioUsu_FK());
            comandoSQL.setDate(6, encaminhamento.getDataEnc());
            comandoSQL.setLong(7, encaminhamento.getIdEndereco_FK());

            comandoSQL.executeUpdate();

            comandoSQL.close();
            conexao.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    /**
     *Método para alterar um encaminhamento no banco de dados
     * @param encaminhamento
     */
    public void altEncaminhamento(Encaminhamento encaminhamento) {
        
        String comando = "update encaminhamento set tipoEnc = ?, localEnc = ?,"
                + " statusEnc = ?, cpfFunc = ?, nProntuarioUsu = ?, dataEnc = ? , idEndereco = ?"
                + " where idEnc = ?";

        try {
            Connection conexao = new Conexao().getConnection();

            PreparedStatement comandoSQL = conexao.prepareStatement(comando);

            comandoSQL.setString(1, encaminhamento.getTipoEnc());
            comandoSQL.setString(2, encaminhamento.getLocalEnc());
            comandoSQL.setString(3, encaminhamento.getStatusEnc());
            comandoSQL.setString(4, encaminhamento.getCpfFunc_FK());
            comandoSQL.setLong(5, encaminhamento.getnProntuarioUsu_FK());
            comandoSQL.setLong(7, encaminhamento.getIdEndereco_FK());
            comandoSQL.setDate(6, encaminhamento.getDataEnc());
            comandoSQL.setInt(8, encaminhamento.getIdEnc());

            comandoSQL.executeUpdate();

            comandoSQL.close();
            conexao.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }

    /**
     * Método para retornar todos os encaminhamentos
     *
     * @param listaEnc
     * @return
     */
    public List<Encaminhamento> getEncaminhamento(String listaEnc) {

        ArrayList lista = new ArrayList();

        Connection conexao;
        try {
            conexao = new Conexao().getConnection();
            
            PreparedStatement comandoSQL = conexao.prepareStatement(listaEnc);

            ResultSet retorno = comandoSQL.executeQuery();

            while (retorno.next()) {

                Encaminhamento encaminhamento = new Encaminhamento();
                
                encaminhamento.setIdEnc(retorno.getInt("idEnc"));
                encaminhamento.setTipoEnc(retorno.getString("tipoEnc"));
                encaminhamento.setLocalEnc(retorno.getString("localEnc"));
                encaminhamento.setStatusEnc(retorno.getString("statusEnc"));
                encaminhamento.setCpfFunc_FK(retorno.getString("cpfFunc"));
                encaminhamento.setnProntuarioUsu_FK(retorno.getLong("nProntuarioUsu"));
                encaminhamento.setDataEnc(retorno.getDate("dataEnc"));
                encaminhamento.setIdEndereco_FK(retorno.getLong("idEndereco"));
                

                lista.add(encaminhamento);
            }
            
            comandoSQL.close();
            conexao.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return lista;
    }

    public Encaminhamento getEncaminhamento(long idEnc) {

        Encaminhamento lista = new Encaminhamento();

        String listarEncaminhamentos = "SELECT tipoEnc, localEnc, statusEnc, cpfFunc, nProntuarioUsu, dataEnc, idEndereco "
                + "FROM encaminhamento WHERE idEnc = ?";

        try {

            Connection conexao = new Conexao().getConnection();
            PreparedStatement comandoSQL = conexao.prepareStatement(listarEncaminhamentos);

            comandoSQL.setLong(1, idEnc);

            ResultSet retorno = comandoSQL.executeQuery();

            while (retorno.next()) {

                lista.setTipoEnc(retorno.getString("tipoEnc"));
                lista.setLocalEnc(retorno.getString("localEnc"));
                lista.setStatusEnc(retorno.getString("statusEnc"));
                lista.setCpfFunc_FK(retorno.getString("cpfFunc"));
                lista.setnProntuarioUsu_FK(retorno.getLong("nProntuarioUsu"));
                lista.setDataEnc(retorno.getDate("dataEnc"));
                lista.setIdEndereco_FK(retorno.getLong("idEndereco"));
            }
            
            comandoSQL.close();
            conexao.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return lista;

    }
    
    public Encaminhamento buscaDatas(Date dataum,Date datadois) {

        Encaminhamento lista = new Encaminhamento();

        String listarEncaminhamentos = "SELECT tipoEnc, localEnc, statusEnc, cpfFunc, nProntuarioUsu, dataEnc, idEndereco "
                + "FROM encaminhamento WHERE dataEnc BETWEEN ? AND ?";

        try {

            Connection conexao = new Conexao().getConnection();
            PreparedStatement comandoSQL = conexao.prepareStatement(listarEncaminhamentos);

            comandoSQL.setDate(1, dataum);
            comandoSQL.setDate(2, datadois);

            ResultSet retorno = comandoSQL.executeQuery();

            while (retorno.next()) {

                lista.setTipoEnc(retorno.getString("tipoEnc"));
                lista.setLocalEnc(retorno.getString("localEnc"));
                lista.setStatusEnc(retorno.getString("statusEnc"));
                lista.setCpfFunc_FK(retorno.getString("cpfFunc"));
                lista.setnProntuarioUsu_FK(retorno.getLong("nProntuarioUsu"));
                lista.setDataEnc(retorno.getDate("dataEnc"));
                lista.setIdEndereco_FK(retorno.getLong("idEndereco"));
            }
            
            comandoSQL.close();
            conexao.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return lista;

    }

}
