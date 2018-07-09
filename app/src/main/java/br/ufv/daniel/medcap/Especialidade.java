package br.ufv.daniel.medcap;

import java.util.Date;

public class Especialidade {
    private int id;
    private String nome;
    private Date data_Obtencao;
    private String instituicao;
    private String certificadoPath;
    private double preco;
    private TipoEspecialidade tipoEspecialidade;
    private boolean ePrincipal;

    public Especialidade(int id, String nome, Date data_Obtencao, String instituicao, String certificadoPath, double preco, TipoEspecialidade tipoEspecialidade, boolean ePrincipal) {
        this.id = id;
        this.nome = nome;
        this.data_Obtencao = data_Obtencao;
        this.instituicao = instituicao;
        this.certificadoPath = certificadoPath;
        this.preco = preco;
        this.tipoEspecialidade = tipoEspecialidade;
        this.ePrincipal = ePrincipal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData_Obtencao() {
        return data_Obtencao;
    }

    public void setData_Obtencao(Date data_Obtencao) {
        this.data_Obtencao = data_Obtencao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getCertificadoPath() {
        return certificadoPath;
    }

    public void setCertificadoPath(String certificadoPath) {
        this.certificadoPath = certificadoPath;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public TipoEspecialidade getTipoEspecialidade() {
        return tipoEspecialidade;
    }

    public void setTipoEspecialidade(TipoEspecialidade tipoEspecialidade) {
        this.tipoEspecialidade = tipoEspecialidade;
    }

    public boolean isePrincipal() {
        return ePrincipal;
    }
    public boolean getEPrincipal(){
        return ePrincipal;
    }
    public void setePrincipal(boolean ePrincipal) {
        this.ePrincipal = ePrincipal;
    }

    public Especialidade() {
    }
}
