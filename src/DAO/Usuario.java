package DAO;

import java.util.Date;


public class Usuario {
    
    private Integer numProntuario; 
    private String nome; 
    private String tipoUsuario; 
    private Date dataCadastro;
    private String statusUsuario; 
    private String sexo; 
    private String dataNascimento; 
    private String tipoDoc;
    private String documento; 
    private String cidadeOrigem; 
    private Integer responsavel; 
    private String parecerTec; 
    private String drogas; 
    private String atendidoPor; 
    private String estadoCidOrigem;
    private String estadoCidade;
    private int endereco; 
    private String cidade;


    public Usuario() {
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public Integer getNumProntuario() {
        return numProntuario;
    }

    public void setNumProntuario(Integer numProntuario) {
        this.numProntuario = numProntuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getStatusUsuario() {
        return statusUsuario;
    }

    public void setStatusUsuario(String statusUsuario) {
        this.statusUsuario = statusUsuario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public Integer getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Integer responsavel) {
        this.responsavel = responsavel;
    }

    public String getParecerTec() {
        return parecerTec;
    }

    public void setParecerTec(String parecerTec) {
        this.parecerTec = parecerTec;
    }

    public String getDrogas() {
        return drogas;
    }

    public void setDrogas(String drogas) {
        this.drogas = drogas;
    }

    public int getEndereco() {
        return endereco;
    }

    public void setEndereco(int endereco) {
        this.endereco = endereco;
    }

    public String getAtendidoPor() {
        return atendidoPor;
    }

    public void setAtendidoPor(String atendidoPor) {
        this.atendidoPor = atendidoPor;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getEstadoCidOrigem() {
        return estadoCidOrigem;
    }

    public void setEstadoCidOrigem(String estadoCidOrigem) {
        this.estadoCidOrigem = estadoCidOrigem;
    }

    public String getEstadoCidade() {
        return estadoCidade;
    }

    public void setEstadoCidade(String estadoCidade) {
        this.estadoCidade = estadoCidade;
    }
    
    
}
