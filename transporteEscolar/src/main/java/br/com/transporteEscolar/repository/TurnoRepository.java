package br.com.transporteEscolar.repository;

import br.com.transporteEscolar.model.Turno;
import org.springframework.data.repository.CrudRepository;

// interface responsável pelo crud (salva, alterar, listar, deletar)
public interface TurnoRepository extends CrudRepository<Turno, Long> {

}
