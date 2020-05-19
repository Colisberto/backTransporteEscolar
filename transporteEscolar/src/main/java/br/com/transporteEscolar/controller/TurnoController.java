package br.com.transporteEscolar.controller;

import br.com.transporteEscolar.model.Turno;
import br.com.transporteEscolar.repository.TurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

//import br.com.transporteEscolar.repository.OnibusRepositoryJPA;

@CrossOrigin // anotação para que a api receber chamadas de aplicações externas
@RestController // anotação que determina que é um REST This means that this class is a Controller
@RequestMapping(path="/api/turno") // This means URL's start with /demo (after Application path)
public class TurnoController {

    @Autowired // Cria e abre uma conexão com banco pra quando for,
                // necessario chamar alguma funcionalidade do repositorio
    // Which is auto-generated by Spring, we will use it to handle the data
    private TurnoRepository turnoRepository;

    /*produces= MediaType.APPLICATION_JSON_VALUE) responsavel por cria Jason
    Automaticamente aos metodos PUT/GET/DELETE/UPDATE/POST, para enviar para o Front-end */
    @GetMapping(path="/all", produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Iterable<Turno> getAllTurno()
    {
        return turnoRepository.findAll();
    }

    @RequestMapping(value="/get/{id}", method=RequestMethod.GET)
    public @ResponseBody
    Optional<Turno> getTurnoByI(@PathVariable(name = "id") long id) {

        return turnoRepository.findById(id);
    }

    // -------------------Criar Turno-------------------------------------------

    @PostMapping("/add")
    protected @Valid Turno addTurno(@Valid @RequestBody Turno turno) {

        return turnoRepository.save(turno);

    }

    // ------------------- Update Turno ------------------------------------------------

    @PutMapping(value = "/edit")
    protected @Valid Turno editTurno(@Valid @RequestBody Turno turno) {

        return turnoRepository.save(turno);
    }

    /* // ------------------- Delete Onibus ----------------------------------------

    @DeleteMapping(value="/delete/{id}")
    public @ResponseBody void deleteOnibus(@PathVariable(name = "id") long id){
        Turno turno = new Turno();
        turno.setId(id);
        turnoRepository.deleteById(turno.getId());
    }*/

}