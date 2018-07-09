package br.ufv.daniel.medcap;

public class Medicamento {
    private String nome;
    private String tipoReceita;
    private String descricao;

    public Medicamento(String nome, String tipoReceita, String descricao) {
        this.nome = nome;
        this.tipoReceita = tipoReceita;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoReceita() {
        return tipoReceita;
    }

    public void setTipoReceita(String tipoReceita) {
        this.tipoReceita = tipoReceita;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
