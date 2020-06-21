package br.com.transporteEscolar.repository;

import br.com.transporteEscolar.model.Aluno;
import br.com.transporteEscolar.model.Usuario;
import org.springframework.data.repository.CrudRepository;


public interface LoginRepository extends CrudRepository<Usuario, Long> {

}
