package Model;

import Control.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Classe para controlar a entidade de relacionamentos.
 *
 * @author Gabriel Ferreira Franco
 */
public class Encaminhamento {

    private int idEnc;
    private String tipoEnc;
    private String localEnc;
    private String statusEnc;
    private long cpfFunc_FK;
    private long nProntuarioUsu_FK;
    private long idEndereco_FK;

    public Encaminhamento() {

    }

    public Encaminhamento(int idEnc, String tipoEnc, String localEnc, String statusEnc, long cpfFunc_FK, long nProntuarioUsu_FK, long idEndereco_FK) {
        this.idEnc = idEnc;
        this.tipoEnc = tipoEnc;
        this.localEnc = localEnc;
        this.statusEnc = statusEnc;
        this.cpfFunc_FK = cpfFunc_FK;
        this.nProntuarioUsu_FK = nProntuarioUsu_FK;
        this.idEndereco_FK = idEndereco_FK;
    }

    public int getIdEnc() {
        return idEnc;
    }

    public void setIdEnc(int idEnc) {
        this.idEnc = idEnc;
    }

    public long getIdEndereco_FK() {
        return idEndereco_FK;
    }

    public void setIdEndereco_FK(long idEndereco_FK) {
        this.idEndereco_FK = idEndereco_FK;
    }

    public String getLocalEnc() {
        return localEnc;
    }

    public void setLocalEnc(String localEnc) {
        this.localEnc = localEnc;
    }

    public String getStatusEnc() {
        return statusEnc;
    }

    public void setStatusEnc(String statusEnc) {
        this.statusEnc = statusEnc;
    }

    public long getCpfFunc_FK() {
        return cpfFunc_FK;
    }

    public void setCpfFunc_FK(long cpfFunc_FK) {
        this.cpfFunc_FK = cpfFunc_FK;
    }

    public long getnProntuarioUsu_FK() {
        return nProntuarioUsu_FK;
    }

    public void setnProntuarioUsu_FK(long nProntuarioUsu_FK) {
        this.nProntuarioUsu_FK = nProntuarioUsu_FK;
    }

    public String getTipoEnc() {
        return tipoEnc;
    }

    public void setTipoEnc(String tipoEnc) {
        this.tipoEnc = tipoEnc;
    }

}
