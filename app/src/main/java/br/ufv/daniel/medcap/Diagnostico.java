package br.ufv.daniel.medcap;

import java.util.ArrayList;

public class Diagnostico {
    private String diagnostico;
    private ArrayList<Exame> exames;
    private ArrayList<Medicamento> medicamentos;
    private Pessoa paciente;

    public Diagnostico(String diagnostico, ArrayList<Exame> exames, ArrayList<Medicamento> medicamentos, Pessoa paciente) {
        this.diagnostico = diagnostico;
        this.exames = exames;
        this.medicamentos = medicamentos;
        this.paciente = paciente;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public ArrayList<Exame> getExames() {
        return exames;
    }

    public void setExames(ArrayList<Exame> exames) {
        this.exames = exames;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Pessoa getPaciente() {
        return paciente;
    }

    public void setPaciente(Pessoa paciente) {
        this.paciente = paciente;
    }
}
