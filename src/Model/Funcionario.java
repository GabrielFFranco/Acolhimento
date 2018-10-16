/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author gabri
 */
public class Funcionario {

    private String cpfFunc;
    private String nomeFunc;
    private String rgFunc;
    private Date dataNascFunc;
    private String telefoneFunc;
    private String emailFunc;
    private String tipoFunc;
    private String statusFunc;
    private int idEndereco_FK;

    public Funcionario(String cpfFunc, String nomeFunc, String rgFunc, Date dataNascFunc, String telefoneFunc, String emailFunc, String tipoFunc, String statusFunc, int idEndereco_FK) {
        this.cpfFunc = cpfFunc;
        this.nomeFunc = nomeFunc;
        this.rgFunc = rgFunc;
        this.dataNascFunc = dataNascFunc;
        this.telefoneFunc = telefoneFunc;
        this.emailFunc = emailFunc;
        this.tipoFunc = tipoFunc;
        this.statusFunc = statusFunc;
        this.idEndereco_FK = idEndereco_FK;
    }

    public Funcionario() {
    }

    public String getCpfFunc() {
        return cpfFunc;
    }

    public void setCpfFunc(String cpfFunc) {
        this.cpfFunc = cpfFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getRgFunc() {
        return rgFunc;
    }

    public void setRgFunc(String rgFunc) {
        this.rgFunc = rgFunc;
    }

    public Date getDataNascFunc() {
        return dataNascFunc;
    }

    public void setDataNascFunc(Date dataNascFunc) {
        this.dataNascFunc = dataNascFunc;
    }

    public String getTelefoneFunc() {
        return telefoneFunc;
    }

    public void setTelefoneFunc(String telefoneFunc) {
        this.telefoneFunc = telefoneFunc;
    }

    public String getEmailFunc() {
        return emailFunc;
    }

    public void setEmailFunc(String emailFunc) {
        this.emailFunc = emailFunc;
    }

    public String getTipoFunc() {
        return tipoFunc;
    }

    public void setTipoFunc(String tipoFunc) {
        this.tipoFunc = tipoFunc;
    }

    public String getStatusFunc() {
        return statusFunc;
    }

    public void setStatusFunc(String statusFunc) {
        this.statusFunc = statusFunc;
    }

    public int getIdEndereco_FK() {
        return idEndereco_FK;
    }

    public void setIdEndereco_FK(int idEndereco_FK) {
        this.idEndereco_FK = idEndereco_FK;
    }

}
