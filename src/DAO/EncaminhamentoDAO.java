/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Control.Conexao;
import Model.Encaminhamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
                + " nProntuarioUsu, idEndereco) values (?,?,?,?,?,?)";

        try {
            Connection conexao = new Conexao().getConnection();

            PreparedStatement comandoSQL = conexao.prepareStatement(comando);

            comandoSQL.setString(1, encaminhamento.getTipoEnc());
            comandoSQL.setString(2, encaminhamento.getLocalEnc());
            comandoSQL.setString(3, encaminhamento.getStatusEnc());
            comandoSQL.setLong(4, encaminhamento.getCpfFunc_FK());
            comandoSQL.setLong(5, encaminhamento.getnProntuarioUsu_FK());
            comandoSQL.setLong(6, encaminhamento.getIdEndereco_FK());

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
                + " statusEnc = ?, cpfFunc = ?, nProntuarioUsu = ?, idEndereco = ?"
                + " where idEnc = ?";

        try {
            Connection conexao = new Conexao().getConnection();

            PreparedStatement comandoSQL = conexao.prepareStatement(comando);

            comandoSQL.setString(1, encaminhamento.getTipoEnc());
            comandoSQL.setString(2, encaminhamento.getLocalEnc());
            comandoSQL.setString(3, encaminhamento.getStatusEnc());
            comandoSQL.setLong(4, encaminhamento.getCpfFunc_FK());
            comandoSQL.setLong(5, encaminhamento.getnProntuarioUsu_FK());
            comandoSQL.setLong(6, encaminhamento.getIdEndereco_FK());
            comandoSQL.setInt(7, encaminhamento.getIdEnc());

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
     * @return
     */
    public ArrayList getEncaminhamento() {

        ArrayList lista = new ArrayList();

        String listarEncaminhamentos = "SELECT tipoEnc, localEnc, statusEnc, cpfFunc, nProntuarioUsu, idEndereco "
                + "FROM encaminhamento";

        Connection conexao;
        try {
            conexao = new Conexao().getConnection();
            
            PreparedStatement comandoSQL = conexao.prepareStatement(listarEncaminhamentos);

            ResultSet retorno = comandoSQL.executeQuery();

            while (retorno.next()) {

                Object[] linha = new Object[6];

                linha[0] = retorno.getString("tipoEnc");
                linha[1] = retorno.getString("localEnc");
                linha[2] = retorno.getString("statusEnc");
                linha[3] = retorno.getLong("cpfFunc");
                linha[4] = retorno.getLong("nProntuarioUsu");
                linha[5] = retorno.getString("idEndereco");

                lista.add(linha);
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

        String listarEncaminhamentos = "SELECT tipoEnc, localEnc, statusEnc, cpfFunc, nProntuarioUsu, idEndereco "
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
                lista.setCpfFunc_FK(retorno.getLong("cpfFunc"));
                lista.setnProntuarioUsu_FK(retorno.getLong("nProntuarioUsu"));
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
