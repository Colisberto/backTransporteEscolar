package br.com.transporteEscolar.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Onibus implements Serializable { // Metodo da classe como Serializable,
                                            // transforma em cadeia de caractere e gravar no banco !!


    @Id // define ID autoIncremto
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String modelo;
    private String qtdAcentos;
    private String anoFabricacao;

// Definição específico no BANCO para atributo E-mail como :
    @NotNull // campo não pode ser nulo
    @NotBlank // campo não pode ser branco
    @Column(unique = true) // não pode se repetir
    private String placa; // Para o atributo específico E-mail

    @ManyToMany// Anotação para fazer relacionamento de Muitos para Muitos entre Onibus e aluno
    private List<Aluno> alunos;

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getQtdAcentos() {
        return qtdAcentos;
    }

    public void setQtdAcentos(String qtdAcentos) {
        this.qtdAcentos = qtdAcentos;
    }


}