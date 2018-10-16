package Model;

import java.sql.Date;

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
    private String cpfFunc_FK;
    private long nProntuarioUsu_FK;
    private long idEndereco_FK;
    private Date dataEnc;

    public Encaminhamento() {

    }

    public Encaminhamento(int idEnc, String tipoEnc, String localEnc, String statusEnc, String cpfFunc_FK, long nProntuarioUsu_FK, long idEndereco_FK, Date dataEnc) {
        this.idEnc = idEnc;
        this.tipoEnc = tipoEnc;
        this.localEnc = localEnc;
        this.statusEnc = statusEnc;
        this.cpfFunc_FK = cpfFunc_FK;
        this.nProntuarioUsu_FK = nProntuarioUsu_FK;
        this.idEndereco_FK = idEndereco_FK;
        this.dataEnc = dataEnc;
    }

    public int getIdEnc() {
        return idEnc;
    }

    public void setIdEnc(int idEnc) {
        this.idEnc = idEnc;
    }

    public String getTipoEnc() {
        return tipoEnc;
    }

    public void setTipoEnc(String tipoEnc) {
        this.tipoEnc = tipoEnc;
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

    public String getCpfFunc_FK() {
        return cpfFunc_FK;
    }

    public void setCpfFunc_FK(String cpfFunc_FK) {
        this.cpfFunc_FK = cpfFunc_FK;
    }

    public long getnProntuarioUsu_FK() {
        return nProntuarioUsu_FK;
    }

    public void setnProntuarioUsu_FK(long nProntuarioUsu_FK) {
        this.nProntuarioUsu_FK = nProntuarioUsu_FK;
    }

    public long getIdEndereco_FK() {
        return idEndereco_FK;
    }

    public void setIdEndereco_FK(long idEndereco_FK) {
        this.idEndereco_FK = idEndereco_FK;
    }

    public Date getDataEnc() {
        return dataEnc;
    }

    public void setDataEnc(Date dataEnc) {
        this.dataEnc = dataEnc;
    }
    
    


}
