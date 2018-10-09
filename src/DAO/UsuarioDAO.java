package DAO;

import Control.FabricaConexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class UsuarioDAO {    
    public boolean cadastrarUsuario(Usuario obj ){        
        try{
            Connection con = FabricaConexao.getConnection();
            PreparedStatement stmt = null;
            String sql = "insert into usuarios (nPontuarioUsu, nomeUsu, atendidoPeloFunc,"
                    + "  cidadeOrigemUsu,dataNascUsu, documentoUsu,"
                    + "  DrogasUsadasUsu, idEndereco, parecerTecUsu, fk_cpfFunc, sexoUsu,"
                    + " statusUsu, tipoUsu, cidade, estadocidade, estadoorigem, tipodoc)"
                    + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, 0);
            stmt.setString(2,obj.getNome());
            stmt.setString(3,obj.getAtendidoPor());
            stmt.setString(4,obj.getCidadeOrigem());
            stmt.setString(5, obj.getDataNascimento());
            stmt.setString(6,obj.getDocumento());
            stmt.setString(7,obj.getDrogas());
            stmt.setInt(8,obj.getEndereco());
            stmt.setString(9,obj.getParecerTec());
            stmt.setInt(10,obj.getResponsavel());
            stmt.setString(11,obj.getSexo());
            stmt.setString(12,obj.getStatusUsuario());
            stmt.setString(13,obj.getTipoUsuario());
            stmt.setString(14, obj.getCidade());
            stmt.setString(15, obj.getEstadoCidade());
            stmt.setString(16, obj.getEstadoCidOrigem());
            stmt.setString(17, obj.getTipoDoc());
            
            stmt.executeUpdate();
            stmt.close();
            con.close();
            return true;
        }catch(Exception ex){
            System.err.println("Erro:" + ex);
            return false;
        }
    }
    
    
    
    public List<Usuario> consultar(Usuario obj){
     try{
         List<Usuario> lista = null;
        Connection con = FabricaConexao.getConnection();
        String sql = "Select* from usuarios where nPontuarioUsu = ? OR nomeUsu = ? "
                + "OR statusUsu = ? OR tipoUsu = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, obj.getNumProntuario());
        stmt.setString(2, obj.getNome());
        stmt.setString(3, obj.getStatusUsuario());
        stmt.setString(4, obj.getTipoUsuario());
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
             obj.setNome(rs.getString("nomeUsu"));
             obj.setAtendidoPor(rs.getString("atendidoPeloFunc"));
             obj.setCidadeOrigem(rs.getString("cidadeOrigemUsu"));
             obj.setDataCadastro(rs.getDate("dataCadastroUsu"));
             obj.setDataNascimento(rs.getString("dataNascUsu"));
             obj.setDocumento(rs.getString("documentoUsu"));
             obj.setDrogas(rs.getString("DrogasUsadasUsu"));
             obj.setEndereco(rs.getInt("idEndereco"));
             obj.setNumProntuario(rs.getInt("nPontuarioUsu"));
             obj.setParecerTec(rs.getString("parecerTecUsu"));
             obj.setResponsavel(rs.getInt("fk_cpfFunc"));
             obj.setSexo(rs.getString("sexoUsu"));
             obj.setStatusUsuario(rs.getString("statusUsu"));
             obj.setTipoUsuario(rs.getString("tipoUsu"));
             lista.add(obj);
         }
        return lista;   
     }catch(Exception ex){
        return null;
     }        
    }
            
    public Usuario selecionar(Usuario obj){
     try{
        Connection con = FabricaConexao.getConnection();
        String sql = "Select* from usuarios where nPontuarioUsu = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, obj.getNumProntuario());
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
             obj.setNome(rs.getString("nomeUsu"));
             obj.setAtendidoPor(rs.getString("atendidoPeloFunc"));
             obj.setCidadeOrigem(rs.getString("cidadeOrigemUsu"));
             obj.setDataCadastro(rs.getDate("dataCadastroUsu"));
             obj.setDataNascimento(rs.getString("dataNascUsu"));
             obj.setDocumento(rs.getString("documentoUsu"));
             obj.setDrogas(rs.getString("DrogasUsadasUsu"));
             obj.setEndereco(rs.getInt("idEndereco"));
             obj.setNumProntuario(rs.getInt("nPontuarioUsu"));
             obj.setParecerTec(rs.getString("parecerTecUsu"));
             obj.setResponsavel(rs.getInt("fk_cpfFunc"));
             obj.setSexo(rs.getString("sexoUsu"));
             obj.setStatusUsuario(rs.getString("statusUsu"));
             obj.setTipoUsuario(rs.getString("tipoUsu"));
             obj.setCidade(rs.getString("cidade"));
             obj.setEstadoCidade(rs.getString("estadoCidade"));
             obj.setEstadoCidOrigem(rs.getString("EstadoOrigem"));
             obj.setTipoDoc(rs.getString("tipoDoc"));
             
         }
        return obj;   
     }catch(Exception ex){
        return null;
     }        
    }
            
            
    public List listar(){
     List<Usuario> lista = null;
     try{
        Connection con = FabricaConexao.getConnection();
        String sql = "Select* from usuarios";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        Usuario obj = new Usuario();
        while(rs.next()){
             obj.setNome(rs.getString("nomeUsu"));
             obj.setAtendidoPor(rs.getString("atendidoPeloFunc"));
             obj.setCidadeOrigem(rs.getString("cidadeOrigemUsu"));
             obj.setDataCadastro(rs.getDate("dataCadastroUsu"));
             obj.setDataNascimento(rs.getString("dataNascUsu"));
             obj.setDocumento(rs.getString("documentoUsu"));
             obj.setDrogas(rs.getString("DrogasUsadasUsu"));
             obj.setEndereco(rs.getInt("idEndereco"));
             obj.setNumProntuario(rs.getInt("nPontuarioUsu"));
             obj.setParecerTec(rs.getString("parecerTecUsu"));
             obj.setResponsavel(rs.getInt("fk_cpfFunc"));
             obj.setSexo(rs.getString("sexoUsu"));
             obj.setStatusUsuario(rs.getString("statusUsu"));
             obj.setTipoUsuario(rs.getString("tipoUsu"));
             lista.add(obj);
         }
        return lista;   
     }catch(Exception ex){
        return null;
     }
    }
            
            
            
    public boolean editar(Usuario obj){
             try{
            Connection con = FabricaConexao.getConnection();
            PreparedStatement stmt = null;
            String sql = "update from usuario set nomeUsu = ? atendidoPeloFunc = ?"
                    + "  cidadeOrigemUsu = ? dataNascUsu = ? documentoUsu = ?"
                    + "  DrogasUsadasUsu = ? idEndereco = ? parecerTecUsu = ? fk_cpfFunc = ? sexoUsu = ?"
                    + " statusUsu = ? tipoUsu = ? cidade = ? estadocidade = ? estadoorigem = ? tipodoc = ?"
                    + "where nPontuarioUsu = ?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(17, obj.getNumProntuario());
            stmt.setString(12,obj.getTipoUsuario());
            stmt.setString(1,obj.getNome());
            stmt.setString(10,obj.getStatusUsuario());
            stmt.setString(9,obj.getSexo());
            stmt.setString(4, obj.getDataNascimento());
            stmt.setString(5,obj.getDocumento());
            stmt.setString(3,obj.getCidadeOrigem());
            stmt.setString(2,obj.getAtendidoPor());
            stmt.setString(7,obj.getParecerTec());
            stmt.setString(6,obj.getDrogas());
            stmt.setInt(8,obj.getResponsavel());
            stmt.setInt(7,obj.getEndereco());
            stmt.setString(13, obj.getCidade());
            stmt.setString(14, obj.getEstadoCidade());
            stmt.setString(15, obj.getEstadoCidOrigem());
            stmt.setString(16, obj.getTipoDoc());
            

            stmt.executeUpdate();
            stmt.close();
            con.close();
            return true;
        }catch(Exception ex){
            return false;
        }   
    }    
}
