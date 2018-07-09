package br.ufv.daniel.medcap;

public class TipoEspecialidade {
    private String Descricao;
    private double precoMedio;
    private String nome;

    public TipoEspecialidade(String descricao, double precoMedio, String nome) {
        Descricao = descricao;
        this.precoMedio = precoMedio;
        this.nome = nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public double getPrecoMedio() {
        return precoMedio;
    }

    public void setPrecoMedio(double precoMedio) {
        this.precoMedio = precoMedio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
