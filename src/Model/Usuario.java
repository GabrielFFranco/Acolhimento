
package acolhimento;

import java.util.Date;


public class Usuario {
    
    private Integer numProntuario;
    private String nome;
    private String tipoUsuario;
    private Date dataCadastro;
    private String statusUsuario;
    private String sexo;
    private Date dataNascimento;
    private String documento;
    private String cidadeOrigem;
    private Integer responsavel;
    private String parecerTec;
    private String drogas;
    private String atendidoPor;
    private int endereco;

    public Usuario(String nome, String tipoUsuario, Date dataCadastro, String statusUsuario,
            String sexo, Date dataNascimento, String documento, String cidadeOrigem,
            Integer responsavel, String parecerTec, String drogas, int endereco, String atendidoPor) {
        this.nome = nome;
        this.tipoUsuario = tipoUsuario;
        this.dataCadastro = dataCadastro;
        this.statusUsuario = statusUsuario;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.documento = documento;
        this.cidadeOrigem = cidadeOrigem;
        this.responsavel = responsavel;
        this.parecerTec = parecerTec;
        this.drogas = drogas;
        this.endereco = endereco;
        this.atendidoPor = atendidoPor;
    }

    public Usuario() {
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
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
    
    
}
