package br.com.transporteEscolar.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Aluno implements Serializable {

    @Id // define ID autoIncremto
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    //@NotNull // campo não pode ser nulo
    //@NotBlank // campo não pode ser branco
    private String nome;

   // @NotNull // campo não pode ser nulo
    //@NotBlank // campo não pode ser branco
    @Column(unique = true) // não pode se repetir
    private String cpf;

   // @NotNull // campo não pode ser nulo
    //@NotBlank // campo não pode ser branco
    //@Column(unique = true) // não pode se repetir
    private String telefone;

   // @NotNull // campo não pode ser nulo
    //@NotBlank // campo não pode ser branco
    private String endereco;

    //@NotNull // campo não pode ser nulo
    //@NotBlank // campo não pode ser branco
    private LocalDate dataNascimento;

    public Aluno() {
    }

// Definição específico no BANCO para atributo E-mail como :
    @NotNull // campo não pode ser nulo
    @NotBlank // campo não pode ser branco
    @Column(unique = true) // não pode se repetir
    private String email; // Para o atributo específico E-mail


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}