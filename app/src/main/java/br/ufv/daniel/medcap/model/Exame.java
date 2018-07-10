package br.ufv.daniel.medcap.model;

public class Exame {
    private String nome;
    private String descricao;
    private String resultado_PATH;

    public Exame(String nome, String descricao, String resultado_PATH) {
        this.nome = nome;
        this.descricao = descricao;
        this.resultado_PATH = resultado_PATH;
    }

    public Exame(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getResultado_PATH() {
        return resultado_PATH;
    }

    public void setResultado_PATH(String resultado_PATH) {
        this.resultado_PATH = resultado_PATH;
    }
}
