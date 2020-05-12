package br.com.transporteEscolar.repository;

import br.com.transporteEscolar.model.Motorista;
import org.springframework.data.repository.CrudRepository;

// interface responsável pelo crud (salva, alterar, listar, deletar)
public interface MotoristaRepository extends CrudRepository<Motorista, Long> {

}
