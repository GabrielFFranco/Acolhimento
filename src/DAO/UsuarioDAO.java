package DAO;

import Control.AbrirConexao;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    public void setUsuario(Usuario usuario) {

        String comando = "insert into usuario (tipoUsu, dataCadastroUsu, "
                + "nomeUsu, statusUsu, sexoUsu, dataNascUsu, tipoDoc, "
                + "documentoUsu, cidadeOrigemUsu, atendidoPeloFunc, "
                + "parecerTecnicoUsu, drogasUsadasUsu, "
                + "situacao, ultimaCidade, cidadeDestino, "
                + "dataDeEntrada, "
                + "cpfFunc, idEndereco) value (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        if(usuario.getIdEndereco_FK() == 0){
            comando = comando.substring(0, comando.length() - 57) 
                    + ") value (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
        
        try {

            Connection conexao = new AbrirConexao().getConnection();

            PreparedStatement comandoSQL = conexao.prepareStatement(comando);

            comandoSQL.setString(1, usuario.getTipoUsu());
            comandoSQL.setDate(2, new java.sql.Date(new java.util.Date().getTime()));
            comandoSQL.setString(3, usuario.getNomeUsu());
            comandoSQL.setString(4, usuario.getStatusUsu());
            comandoSQL.setString(5, usuario.getSexoUsu());
            comandoSQL.setDate(6, usuario.getDataNascUsu());
            comandoSQL.setString(7, usuario.getTipoDoc());
            comandoSQL.setString(8, usuario.getDocumentoUsu());
            comandoSQL.setString(9, usuario.getCidadeOrigemUsu());
            comandoSQL.setString(10, usuario.getAtendidoPeloFunc_FK());
            comandoSQL.setString(11, usuario.getParecerTecnicoUsu());
            comandoSQL.setString(12, usuario.getDrogasUsadasUsu());
            comandoSQL.setString(13, usuario.getSituacao());
            comandoSQL.setString(14, usuario.getUltimaCidade());
            comandoSQL.setString(15, usuario.getCidadeDestino());
            comandoSQL.setDate(16, new java.sql.Date(new java.util.Date().getTime()));
            comandoSQL.setString(17, usuario.getResponsavel_FK());
            if(usuario.getIdEndereco_FK() != 0){
            comandoSQL.setObject(18, usuario.getIdEndereco_FK());
            }
            
            comandoSQL.executeUpdate();

            comandoSQL.close();
            conexao.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void altUsuario(Usuario usuario) {

        String comando = "update usuario set tipoUsu = ?, "
                + "nomeUsu = ?, statusUsu = ?, sexoUsu = ?, dataNascUsu = ?, tipoDoc = ?, "
                + "documentoUsu = ?, cidadeOrigemUsu = ?, atendidoPeloFunc = ?, "
                + "parecerTecnicoUsu = ?, drogasUsadasUsu = ?, "
                + "situacao = ?, ultimaCidade = ?, cidadeDestino = ?, dataDeEntrada = ?, "
                + "dataDeSaida = ?, cpfFunc = ?, idEndereco  = ? where nProntuarioUsu = ?";

        if(usuario.getIdEndereco_FK() == 0){
            comando = comando.substring(0, comando.length() - 42) + " where nProntuarioUsu = ?";
        }
        
        try {

            Connection conexao = new AbrirConexao().getConnection();

            PreparedStatement comandoSQL = conexao.prepareStatement(comando);

            comandoSQL.setString(1, usuario.getTipoUsu());
            comandoSQL.setString(2, usuario.getNomeUsu());
            comandoSQL.setString(3, usuario.getStatusUsu());
            comandoSQL.setString(4, usuario.getSexoUsu());
            comandoSQL.setDate(5, usuario.getDataNascUsu());
            comandoSQL.setString(6, usuario.getTipoDoc());
            comandoSQL.setString(7, usuario.getDocumentoUsu());
            comandoSQL.setString(8, usuario.getCidadeOrigemUsu());
            comandoSQL.setString(9, usuario.getAtendidoPeloFunc_FK());
            comandoSQL.setString(10, usuario.getParecerTecnicoUsu());
            comandoSQL.setString(11, usuario.getDrogasUsadasUsu());
            comandoSQL.setString(12, usuario.getSituacao());
            comandoSQL.setString(13, usuario.getUltimaCidade());
            comandoSQL.setString(14, usuario.getCidadeDestino());
            comandoSQL.setDate(15, usuario.getDataDeEntrada());
            comandoSQL.setDate(16, usuario.getDataDeSaida());
            comandoSQL.setString(17, usuario.getResponsavel_FK());
            if(usuario.getIdEndereco_FK() != 0){
                comandoSQL.setInt(18, usuario.getIdEndereco_FK());
                comandoSQL.setInt(19, usuario.getnProntuarioUsu());
            }
            comandoSQL.setInt(18, usuario.getnProntuarioUsu());

            comandoSQL.executeUpdate();

            comandoSQL.close();
            conexao.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public List<Usuario> listarUsuario(String listarUsuarios) {

        ArrayList lista = new ArrayList();

        Connection conexao;
        try {
            conexao = new AbrirConexao().getConnection();

            PreparedStatement comandoSQL = conexao.prepareStatement(listarUsuarios);

            ResultSet retorno = comandoSQL.executeQuery();

            while (retorno.next()) {

                Usuario usuario = new Usuario();

                usuario.setnProntuarioUsu(retorno.getInt("nProntuarioUsu"));
                usuario.setTipoUsu(retorno.getString("tipoUsu"));
                usuario.setDataCadastroUsu(retorno.getDate("dataCadastroUsu"));
                usuario.setNomeUsu(retorno.getString("nomeUsu"));
                usuario.setStatusUsu(retorno.getString("statusUsu"));
                usuario.setSexoUsu(retorno.getString("sexoUsu"));
                usuario.setDataNascUsu(retorno.getDate("dataNascUsu"));
                usuario.setTipoDoc(retorno.getString("tipoDoc"));
                usuario.setDocumentoUsu(retorno.getString("documentoUsu"));
                usuario.setCidadeOrigemUsu(retorno.getString("cidadeOrigemUsu"));
                usuario.setAtendidoPeloFunc_FK(retorno.getString("atendidoPeloFunc"));
                usuario.setParecerTecnicoUsu(retorno.getString("parecerTecnicoUsu"));
                usuario.setDrogasUsadasUsu(retorno.getString("drogasUsadasUsu"));
                usuario.setSituacao(retorno.getString("situacao"));
                usuario.setUltimaCidade(retorno.getString("ultimaCidade"));
                usuario.setCidadeDestino(retorno.getString("cidadeDestino"));
                usuario.setDataDeEntrada(retorno.getDate("dataDeEntrada"));
                usuario.setDataDeSaida(retorno.getDate("dataDeSaida"));
                usuario.setResponsavel_FK(retorno.getString("cpfFunc"));
                usuario.setIdEndereco_FK(retorno.getInt("idEndereco"));

                lista.add(usuario);
            }

            comandoSQL.close();
            conexao.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return lista;
    }

    public Usuario getUsuario(int nProntuario) {

        String comando = "select * from usuario where nProntuarioUsu = ?";

        Usuario usuario = new Usuario();

        Connection conexao;
        try {

            conexao = new AbrirConexao().getConnection();

            PreparedStatement comandoSQL = conexao.prepareStatement(comando);

            comandoSQL.setInt(1, nProntuario);

            ResultSet retorno = comandoSQL.executeQuery();

            while (retorno.next()) {

                usuario.setnProntuarioUsu(retorno.getInt("nProntuarioUsu"));
                usuario.setTipoUsu(retorno.getString("tipoUsu"));
                usuario.setDataCadastroUsu(retorno.getDate("dataCadastroUsu"));
                usuario.setNomeUsu(retorno.getString("nomeUsu"));
                usuario.setStatusUsu(retorno.getString("statusUsu"));
                usuario.setSexoUsu(retorno.getString("sexoUsu"));
                usuario.setDataNascUsu(retorno.getDate("dataNascUsu"));
                usuario.setTipoDoc(retorno.getString("tipoDoc"));
                usuario.setDocumentoUsu(retorno.getString("documentoUsu"));
                usuario.setCidadeOrigemUsu(retorno.getString("cidadeOrigemUsu"));
                usuario.setAtendidoPeloFunc_FK(retorno.getString("atendidoPeloFunc"));
                usuario.setParecerTecnicoUsu(retorno.getString("parecerTecnicoUsu"));
                usuario.setDrogasUsadasUsu(retorno.getString("drogasUsadasUsu"));
                usuario.setSituacao(retorno.getString("situacao"));
                usuario.setUltimaCidade(retorno.getString("ultimaCidade"));
                usuario.setCidadeDestino(retorno.getString("cidadeDestino"));
                usuario.setDataDeEntrada(retorno.getDate("dataDeEntrada"));
                usuario.setDataDeSaida(retorno.getDate("dataDeSaida"));
                usuario.setResponsavel_FK(retorno.getString("cpfFunc"));
                usuario.setIdEndereco_FK(retorno.getInt("idEndereco"));

            }

            comandoSQL.close();
            conexao.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return usuario;
    }
}
