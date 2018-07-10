package br.ufv.daniel.medcap.model;

public class Endereco {
    private int id;
    private String logradouro;
    private String Bairro;
    private int numero;
    private String complemento;
    private String cidade;
    private String Estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public Endereco(int id, String logradouro, String bairro, int numero, String complemento, String cidade, String estado) {
        this.id = id;
        this.logradouro = logradouro;
        Bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        Estado = estado;
    }
    public Endereco(){}
}
