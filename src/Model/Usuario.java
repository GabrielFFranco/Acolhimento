package Model;

import java.sql.Date;


public class Usuario {
    
    private int nProntuarioUsu; 
    private String tipoUsu;
    private Date dataCadastroUsu;
    private String nomeUsu;
    private String statusUsu;
    private String sexoUsu;
    private Date dataNascUsu;
    private String tipoDoc;
    private String documentoUsu;
    private String cidadeOrigemUsu;
    private String atendidoPeloFunc_FK;
    private String parecerTecnicoUsu;
    private String drogasUsadasUsu;
    private String situacao;
    private String ultimaCidade;
    private String cidadeDestino;
    private Date dataDeEntrada;
    private Date dataDeSaida;
    private String responsavel_FK;
    private int idEndereco_FK;

    public void Usuario(){
        
    }
    
    public int getnProntuarioUsu() {
        return nProntuarioUsu;
    }

    public void setnProntuarioUsu(int nProntuarioUsu) {
        this.nProntuarioUsu = nProntuarioUsu;
    }

    public String getTipoUsu() {
        return tipoUsu;
    }

    public void setTipoUsu(String tipoUsu) {
        this.tipoUsu = tipoUsu;
    }

    public Date getDataCadastroUsu() {
        return dataCadastroUsu;
    }

    public void setDataCadastroUsu(Date dataCadastroUsu) {
        this.dataCadastroUsu = dataCadastroUsu;
    }

    public String getNomeUsu() {
        return nomeUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }

    public String getStatusUsu() {
        return statusUsu;
    }

    public void setStatusUsu(String statusUsu) {
        this.statusUsu = statusUsu;
    }

    public String getSexoUsu() {
        return sexoUsu;
    }

    public void setSexoUsu(String sexoUsu) {
        this.sexoUsu = sexoUsu;
    }

    public Date getDataNascUsu() {
        return dataNascUsu;
    }

    public void setDataNascUsu(Date dataNascUsu) {
        this.dataNascUsu = dataNascUsu;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getDocumentoUsu() {
        return documentoUsu;
    }

    public void setDocumentoUsu(String documentoUsu) {
        this.documentoUsu = documentoUsu;
    }

    public String getCidadeOrigemUsu() {
        return cidadeOrigemUsu;
    }

    public void setCidadeOrigemUsu(String cidadeOrigemUsu) {
        this.cidadeOrigemUsu = cidadeOrigemUsu;
    }

    public String getAtendidoPeloFunc_FK() {
        return atendidoPeloFunc_FK;
    }

    public void setAtendidoPeloFunc_FK(String atendidoPeloFunc_FK) {
        this.atendidoPeloFunc_FK = atendidoPeloFunc_FK;
    }

    public String getParecerTecnicoUsu() {
        return parecerTecnicoUsu;
    }

    public void setParecerTecnicoUsu(String parecerTecnicoUsu) {
        this.parecerTecnicoUsu = parecerTecnicoUsu;
    }

    public String getDrogasUsadasUsu() {
        return drogasUsadasUsu;
    }

    public void setDrogasUsadasUsu(String drogasUsadasUsu) {
        this.drogasUsadasUsu = drogasUsadasUsu;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getUltimaCidade() {
        return ultimaCidade;
    }

    public void setUltimaCidade(String ultimaCidade) {
        this.ultimaCidade = ultimaCidade;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public Date getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(Date dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public Date getDataDeSaida() {
        return dataDeSaida;
    }

    public void setDataDeSaida(Date dataDeSaida) {
        this.dataDeSaida = dataDeSaida;
    }

    public String getResponsavel_FK() {
        return responsavel_FK;
    }

    public void setResponsavel_FK(String responsavel_FK) {
        this.responsavel_FK = responsavel_FK;
    }

    public int getIdEndereco_FK() {
        return idEndereco_FK;
    }

    public void setIdEndereco_FK(int idEndereco_FK) {
        this.idEndereco_FK = idEndereco_FK;
    }

    
}