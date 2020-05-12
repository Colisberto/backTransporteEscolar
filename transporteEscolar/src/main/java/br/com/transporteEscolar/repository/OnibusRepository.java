package br.com.transporteEscolar.repository;

import br.com.transporteEscolar.model.Onibus;
import org.springframework.data.repository.CrudRepository;

// interface responsável pelo crud (salva, alterar, listar, deletar)
public interface OnibusRepository extends CrudRepository<Onibus, Long> {

}
