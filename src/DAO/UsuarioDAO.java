package DAO;

import Model.Usuario;
import Control.FabricaConexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    public boolean cadastrarUsuario(Usuario obj) {
        try {
            Connection con = FabricaConexao.getConnection();
            PreparedStatement stmt = null;
            String sql = "insert into usuario (nomeUsu, atendidoPeloFunc,"
                    + " cidadeOrigemUsu,dataNascUsu, documentoUsu,"
                    + " DrogasUsadasUsu, idEndereco, parecerTecnicoUsu, cpfFunc, sexoUsu,"
                    + " statusUsu, tipoUsu, tipoDoc, dataCadastroUsu)"
                    + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getAtendidoPor());
            stmt.setString(3, obj.getCidadeOrigem());
            stmt.setString(4, obj.getDataNascimento());
            stmt.setString(5, obj.getDocumento());
            stmt.setString(6, obj.getDrogas());
            stmt.setInt(7, obj.getEndereco());
            stmt.setString(8, obj.getParecerTec());
            stmt.setDouble(9, obj.getResponsavel());
            stmt.setString(10, obj.getSexo());
            stmt.setString(11, obj.getStatusUsuario());
            stmt.setString(12, obj.getTipoUsuario());
            stmt.setString(13, obj.getTipoDoc());
            stmt.setString(14, obj.getDataCadastro());

            stmt.executeUpdate();
            stmt.close();
            con.close();
            return true;
        } catch (Exception ex) {
            System.err.println("Erro:" + ex);
            return false;
        }
    }

    public List<Usuario> consultar(Usuario obj) {
        List<Usuario> lista = null;

        try {

            Connection con = FabricaConexao.getConnection();
            String sql = "Select* from usuario where nPontuarioUsu = ? OR nomeUsu = ? "
                    + "OR statusUsu = ? OR tipoUsu = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getNumProntuario());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getStatusUsuario());
            stmt.setString(4, obj.getTipoUsuario());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                obj.setNome(rs.getString("nomeUsu"));
                obj.setAtendidoPor(rs.getString("atendidoPeloFunc"));
                obj.setCidadeOrigem(rs.getString("cidadeOrigemUsu"));
                obj.setDataCadastro(rs.getString("dataCadastroUsu"));
                obj.setDataNascimento(rs.getString("dataNascUsu"));
                obj.setDocumento(rs.getString("documentoUsu"));
                obj.setDrogas(rs.getString("DrogasUsadasUsu"));
                obj.setEndereco(rs.getInt("idEndereco"));
                obj.setNumProntuario(rs.getInt("nPontuarioUsu"));
                obj.setParecerTec(rs.getString("parecerTecnicoUsu"));
                obj.setResponsavel(rs.getDouble("cpfFunc"));
                obj.setSexo(rs.getString("sexoUsu"));
                obj.setStatusUsuario(rs.getString("statusUsu"));
                obj.setTipoUsuario(rs.getString("tipoUsu"));
                lista.add(obj);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    public Usuario selecionar(int obg) {
        Usuario usuario = new Usuario();
        try {
            
            Connection con = FabricaConexao.getConnection();
            String sql = "Select* from usuario where nProntuarioUsu = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obg);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                usuario.setNome(rs.getString("nomeUsu"));
                usuario.setAtendidoPor(rs.getString("atendidoPeloFunc"));
                usuario.setCidadeOrigem(rs.getString("cidadeOrigemUsu"));
                usuario.setDataCadastro(rs.getString("dataCadastroUsu"));
                usuario.setDataNascimento(rs.getString("dataNascUsu"));
                usuario.setDocumento(rs.getString("documentoUsu"));
                usuario.setDrogas(rs.getString("DrogasUsadasUsu"));
                usuario.setEndereco(rs.getInt("idEndereco"));
                usuario.setNumProntuario(rs.getInt("nProntuarioUsu"));
                usuario.setParecerTec(rs.getString("parecerTecnicoUsu"));
                usuario.setResponsavel(rs.getDouble("cpfFunc"));
                usuario.setSexo(rs.getString("sexoUsu"));
                usuario.setStatusUsuario(rs.getString("statusUsu"));
                usuario.setTipoUsuario(rs.getString("tipoUsu"));
                usuario.setTipoDoc(rs.getString("tipoDoc"));

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return usuario;
    }

    public List<Usuario> listar() {
        ArrayList lista = new ArrayList();
        try {
            
            
            Connection con = FabricaConexao.getConnection();
            String sql = "select * from usuario";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setNome(rs.getString("nomeUsu"));
                usuario.setAtendidoPor(rs.getString("atendidoPeloFunc"));
                usuario.setCidadeOrigem(rs.getString("cidadeOrigemUsu"));
                usuario.setDataCadastro(rs.getString("dataCadastroUsu"));
                usuario.setDataNascimento(rs.getString("dataNascUsu"));
                usuario.setDocumento(rs.getString("documentoUsu"));
                usuario.setDrogas(rs.getString("DrogasUsadasUsu"));
                usuario.setEndereco(rs.getInt("idEndereco"));
                usuario.setNumProntuario(rs.getInt("nProntuarioUsu"));
                usuario.setParecerTec(rs.getString("parecerTecnicoUsu"));
                usuario.setResponsavel(rs.getDouble("cpfFunc"));
                usuario.setSexo(rs.getString("sexoUsu"));
                usuario.setStatusUsuario(rs.getString("statusUsu"));
                usuario.setTipoUsuario(rs.getString("tipoUsu"));
                lista.add(usuario);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    public boolean editar(Usuario obj) {
        try {
            Connection con = FabricaConexao.getConnection();
            PreparedStatement stmt = null;
            String sql = "update from usuario set nomeUsu = ? atendidoPeloFunc = ?"
                    + "  cidadeOrigemUsu = ? dataNascUsu = ? documentoUsu = ?"
                    + "  DrogasUsadasUsu = ? idEndereco = ? parecerTecUsu = ? fk_cpfFunc = ? sexoUsu = ?"
                    + " statusUsu = ? tipoUsu = ? tipodoc = ?"
                    + "where nPontuarioUsu = ?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(14, obj.getNumProntuario());
            stmt.setString(12, obj.getTipoUsuario());
            stmt.setString(1, obj.getNome());
            stmt.setString(10, obj.getStatusUsuario());
            stmt.setString(9, obj.getSexo());
            stmt.setString(4, obj.getDataNascimento());
            stmt.setString(5, obj.getDocumento());
            stmt.setString(3, obj.getCidadeOrigem());
            stmt.setString(2, obj.getAtendidoPor());
            stmt.setString(7, obj.getParecerTec());
            stmt.setString(6, obj.getDrogas());
            stmt.setDouble(8, obj.getResponsavel());
            stmt.setInt(7, obj.getEndereco());
            stmt.setString(13, obj.getTipoDoc());

            stmt.executeUpdate();
            stmt.close();
            con.close();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
