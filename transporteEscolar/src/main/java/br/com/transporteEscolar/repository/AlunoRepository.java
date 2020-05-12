package br.com.transporteEscolar.repository;

import br.com.transporteEscolar.model.Aluno;
import org.springframework.data.repository.CrudRepository;

// interface responsável pelo crud (salva, alterar, listar, deletar)
public interface AlunoRepository extends CrudRepository<Aluno, Long> {

}
