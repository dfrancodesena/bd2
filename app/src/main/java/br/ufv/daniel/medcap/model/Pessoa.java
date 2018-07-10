package br.ufv.daniel.medcap.model;

import java.util.Date;

public class Pessoa {
   private String nome;
   private String CPF;
   private String apelido;
   private Date dataNasc;
   private String sexo;

    public Pessoa(String nome, String CPF, String apelido, Date dataNasc, String sexo) {
        this.nome = nome;
        this.CPF = CPF;
        this.apelido = apelido;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
