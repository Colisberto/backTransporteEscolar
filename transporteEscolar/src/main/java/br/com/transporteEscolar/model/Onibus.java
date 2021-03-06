package br.com.transporteEscolar.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Entity
public class Onibus implements Serializable { // Metodo da classe como Serializable,
                                            // transforma em cadeia de caractere e gravar no banco !!

    @Id // define ID autoIncremto
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long onibus_id;

    @NotNull // campo não pode ser nulo
    @NotBlank // campo não pode ser branco
    private String modelo;

    @NotNull // campo não pode ser nulo
    @NotBlank // campo não pode ser branco
    private String qtdAcentos;

    @NotNull // campo não pode ser nulo
    @NotBlank // campo não pode ser branco
    private String anoFabricacao;

// Definição específico no BANCO para atributo Placa como :
    @NotNull // campo não pode ser nulo
    @NotBlank // campo não pode ser branco
    @Column(unique = true) // não pode se repetir
    private String placa; // Para o atributo específico Placa

    @ManyToMany// Anotação para fazer relacionamento de Muitos para Muitos entre Onibus e aluno
    private List<Aluno> alunos;


    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    // Para listar Alunos relacionados ao Onibus
    public List<Aluno> getAlunos() {
        return alunos;
    }

    // Para Cadastrar Alunos vinculando ao aluno ao Onibus
    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public long getOnibus_id() { return onibus_id; }

    public void setOnibus_id(long id) {
        this.onibus_id = onibus_id;
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