package br.ufv.daniel.medcap;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Atendimento {
    private Cartao metodPagamento;
    private Date dataAtendimento;
    private Time horarioAtendimento;
    private int avaliacaoCliente;
    private int avaliacaoMedico;
    double valor;
    private ArrayList<Diagnostico> diagnosticos;


    public Atendimento(Cartao metodPagamento, Date dataAtendimento, Time horarioAtendimento, int avaliacaoCliente, int avaliacaoMedico, double valor, ArrayList<Diagnostico> diagnosticos) {
        this.metodPagamento = metodPagamento;
        this.dataAtendimento = dataAtendimento;
        this.horarioAtendimento = horarioAtendimento;
        this.avaliacaoCliente = avaliacaoCliente;
        this.avaliacaoMedico = avaliacaoMedico;
        this.valor = valor;
        this.diagnosticos = diagnosticos;
    }

    public Cartao getMetodPagamento() {
        return metodPagamento;
    }

    public void setMetodPagamento(Cartao metodPagamento) {
        this.metodPagamento = metodPagamento;
    }

    public Date getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(Date dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public Time getHorarioAtendimento() {
        return horarioAtendimento;
    }

    public void setHorarioAtendimento(Time horarioAtendimento) {
        this.horarioAtendimento = horarioAtendimento;
    }

    public int getAvaliacaoCliente() {
        return avaliacaoCliente;
    }

    public void setAvaliacaoCliente(int avaliacaoCliente) {
        this.avaliacaoCliente = avaliacaoCliente;
    }

    public int getAvaliacaoMedico() {
        return avaliacaoMedico;
    }

    public void setAvaliacaoMedico(int avaliacaoMedico) {
        this.avaliacaoMedico = avaliacaoMedico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ArrayList<Diagnostico> getDiagnosticos() {
        return diagnosticos;
    }

    public void setDiagnosticos(ArrayList<Diagnostico> diagnosticos) {
        this.diagnosticos = diagnosticos;
    }
}
