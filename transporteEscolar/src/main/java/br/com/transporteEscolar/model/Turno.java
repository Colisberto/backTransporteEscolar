package br.com.transporteEscolar.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Turno implements Serializable {

    public Turno() {
    }

    @Id // define ID autoIncremto
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long turno_id;

   // @NotNull // campo não pode ser nulo
    //@NotBlank // campo não pode ser branco
    @Column(unique = true) // não pode se repetir
    private String turno;

   // @NotNull // campo não pode ser nulo
    //@NotBlank // campo não pode ser branco
    //@Column(unique = true) // não pode se repetir
    private String horarioEmbarque;

    //@NotNull // campo não pode ser nulo
    //@NotBlank // campo não pode ser branco
    //@Column(unique = true) // não pode se repetir
    private String horarioDesembarque;

    //@NotNull // campo não pode ser nulo
   // @NotBlank // campo não pode ser branco
    //@Column(unique = true) // não pode se repetir
    private LocalDate dtInicTurno;

    //@NotNull // campo não pode ser nulo
    //@NotBlank // campo não pode ser branco
    //@Column(unique = true) // não pode se repetir
    private LocalDate dtFinalTurno;

    @ManyToMany// Anotação para fazer relacionamento de Muitos para Muitos entre Onibus e aluno
    private List<Aluno> alunos;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public long getId() {
        return turno_id;
    }

    public void setId(long id) {
        this.turno_id = turno_id;
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

    public void setHorarioEmbarque(String horarioEmbarque) {
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

    public void setDtInicTurno(LocalDate dtInicTurno) {
        this.dtInicTurno = dtInicTurno;
    }

    public LocalDate getDtFinalTurno() {
        return dtFinalTurno;
    }

    public void setDtFinalTurno(LocalDate dtFinalTurno) {
        this.dtFinalTurno = dtFinalTurno;
    }


}