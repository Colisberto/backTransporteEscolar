package br.com.transporteEscolar.repository;

import br.com.transporteEscolar.model.Onibus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
/* classe criada para desenvolver join/sql específicos para aluno*/
public interface AlunoRepositoryJPA extends JpaRepository<Onibus, Long> {

    @Query(value = "select t.id, t.nome, from onibus o " +
            "inner join onibus_alunos ta on t.id = ta.onibus_id " +
            "inner join aluno a on ta.alunos_id = a.id " +
            "where a.id = ?1",
            nativeQuery = true)
    public List<Onibus> listaOnibusByIdAluno(@Param("id") long id);

}