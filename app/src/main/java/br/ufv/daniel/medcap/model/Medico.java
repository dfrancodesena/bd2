package br.ufv.daniel.medcap.model;

import java.util.ArrayList;

public class Medico {
    private String Nome;
    private Especialidade especialidade;
    private ArrayList<Especialidade> especialidades;
    private int avalicao;
    int id;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Medico(String nome, Especialidade especialidade, ArrayList<Especialidade> especialidades) {
        Nome = nome;
        this.especialidade = especialidade;
    }

    public ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }

    public int getAvalicao() {
        return avalicao;
    }

    public void setAvalicao(int avalicao) {
        this.avalicao = avalicao;
    }
}
