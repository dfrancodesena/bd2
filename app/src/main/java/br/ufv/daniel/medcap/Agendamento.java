package br.ufv.daniel.medcap;

import java.sql.Date;
import java.sql.Time;

public class Agendamento {
    private Atendimento atendimento;
    private Cliente cliente;
    private Medico medico;
    private Pessoa atendido;
    private Endereco localizaEm;
    private Time horaMarcada;
    private boolean eEmenergencia;
    private int estado;
    private Date dataMarcada;
    private Double valor_esperado;

}
