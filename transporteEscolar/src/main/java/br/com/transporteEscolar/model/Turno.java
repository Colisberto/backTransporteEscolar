package br.com.transporteEscolar.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Turno implements Serializable {

    public Turno() {
    }

    @Id // define ID autoIncremto
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String turno;
    private String horarioEmbarque;
    private String horarioDesembarque;
    private LocalDate dtInicTurno;
    private LocalDate dtFinalTurno;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getHorarioEmbarque() {
        return horarioEmbarque;
    }

    public void setHorarioEmbarque(String horarioDesembarque) {
        this.horarioEmbarque= horarioEmbarque;
    }

    public String getHorarioDesembarque() {
        return horarioDesembarque;
    }

    public void setHorarioDesembarque(String horarioDesembarque)
    {
        this.horarioDesembarque = horarioDesembarque;
    }

    public LocalDate getDtInicTurno() {
        return dtInicTurno;
    }

    public void setDtInicTurno(LocalDate dtFinalTurno) {
        this.dtFinalTurno = dtFinalTurno;
    }

    public LocalDate getDtFinalTurno() {
        return dtFinalTurno;
    }

    public void setDtFinalTurno(LocalDate dtFinalTurno) {
        this.dtFinalTurno = dtFinalTurno;
    }


}