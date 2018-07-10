package br.ufv.daniel.medcap.model;

public class Usuario {
    private String login;
    private String senha;
    private double av_media;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getAv_media() {
        return av_media;
    }

    public void setAv_media(double av_media) {
        this.av_media = av_media;
    }

    public Usuario(String login, String senha, double av_media) {
        this.login = login;
        this.senha = senha;
        this.av_media = av_media;
    }
}

