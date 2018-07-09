package br.ufv.daniel.medcap;

import java.util.ArrayList;

public class Cliente extends Usuario {
    private ArrayList<Endereco> enderecos;
    private ArrayList<Pessoa> Dependentes;
    private ArrayList<Cartao> Cartoes;

    public Cliente(String login, String senha, double av_media, ArrayList<Endereco> enderecos, ArrayList<Pessoa> dependentes, ArrayList<Cartao> cartoes) {
        super(login, senha, av_media);
        this.enderecos = enderecos;
        Dependentes = dependentes;
        Cartoes = cartoes;
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public ArrayList<Pessoa> getDependentes() {
        return Dependentes;
    }

    public void setDependentes(ArrayList<Pessoa> dependentes) {
        Dependentes = dependentes;
    }

    public ArrayList<Cartao> getCartoes() {
        return Cartoes;
    }

    public void setCartoes(ArrayList<Cartao> cartoes) {
        Cartoes = cartoes;
    }
}
