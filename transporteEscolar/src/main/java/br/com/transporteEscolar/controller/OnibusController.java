package br.com.transporteEscolar.controller;

import br.com.transporteEscolar.model.Onibus;
import br.com.transporteEscolar.repository.OnibusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

//import br.com.transporteEscolar.repository.OnibusRepositoryJPA;

@CrossOrigin // anotação para que a api receber chamadas de aplicações externas
@RestController // anotação que determina que é um REST This means that this class is a Controller
@RequestMapping(path="/api/onibus") // This means URL's start with /demo (after Application path)
public class OnibusController {

    @Autowired // Cria e abre uma conexão com banco pra quando for,
                // necessario chamar alguma funcionalidade do repositorio
    // Which is auto-generated by Spring, we will use it to handle the data
    private OnibusRepository onibusRepository;

    /*produces= MediaType.APPLICATION_JSON_VALUE) responsavel por cria Jason
    Automaticamente aos metodos PUT/GET/DELETE/UPDATE/POST, para enviar para o Front-end */
    @GetMapping(path="/all", produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Iterable<Onibus> getAllOnibus()
    {
        return onibusRepository.findAll();
    }

    @RequestMapping(value="/get/{onibus_id}", method=RequestMethod.GET)
    public @ResponseBody
    Optional<Onibus> getOnibusByI(@PathVariable(name = "onibus_id") long id) {

        return onibusRepository.findById(id);
    }

    // -------------------Criar Onibus-------------------------------------------

    @PostMapping("/add")
    protected @Valid Onibus addOnibus(@Valid @RequestBody Onibus onibus) {

        return onibusRepository.save(onibus);

    }

    // ------------------- Update Onibus ------------------------------------------------

    @PutMapping(value = "/edit")
    protected @Valid Onibus editOnibus(@Valid @RequestBody Onibus onibus) {

        return onibusRepository.save(onibus);
    }

    /* // ------------------- Delete Onibus ----------------------------------------*/

    @DeleteMapping(value="/delete/{onibus_id}")
    public @ResponseBody void deleteOnibus(@PathVariable(name = "onibus_id") long onibus_id){
        Onibus onibus = new Onibus();
        onibus.setOnibus_id(onibus_id);
        onibusRepository.deleteById(onibus.getOnibus_id());
    }

}