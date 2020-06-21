package br.com.transporteEscolar.controller;

import br.com.transporteEscolar.model.Usuario;
import br.com.transporteEscolar.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.Base64;


@CrossOrigin
@RestController // This means that this class is a Controller
@RequestMapping(path="/api/login")
public class LoginController {

    @Autowired
    private LoginRepository loginRepository;

//    @RequestMapping(value="/auth", method=RequestMethod.GET)
//    protected Boolean editAluno(@Valid @RequestBody Usuario usuario) {
//        List<Usuario> list = new ArrayList<>();
//        boolean valido = false;
//        for (Usuario u: list
//             ) {
//                if(u.getUsuario() == usuario.getUsuario()
//                ){
//                    if(u.getSenha() == usuario.getSenha()){
//                        valido = true;
//                    }
//
//                }
//        }
//        return valido;
//    }

//    @GetMapping(path="/all", produces= MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody Iterable<Usuario> getAllAlunos() {
//        // This returns a JSON or XML with the users
//        return loginRepository.findAll();
//    }

//    @RequestMapping(value="/auth/{user}/{pass}", method=RequestMethod.GET)
//    public @ResponseBody boolean login(@PathVariable("user") String user, @PathVariable("pass") String pass ) {
//        Usuario usuario =  new Usuario();
//        usuario.setUsuario(user);
//        usuario.setSenha(pass);
//
//        Iterable<Usuario> list = loginRepository.findAll();
//        boolean valido = false;
//        for (Usuario u: list
//             ) {
//                if(u.getUsuario().equals(usuario.getUsuario())){
//
//                    if(u.getSenha().equals(usuario.getSenha())){
//                        valido = true;
//                    }
//
//                }
//        }
//        return valido;
//
//    }

    @RequestMapping("/login")
    public boolean login(@RequestBody Usuario user) {
        return
                user.getUsuario().equals("user") && user.getSenha().equals("password");
    }

    @RequestMapping("/user")
    public Principal user(HttpServletRequest request) {
        String authToken = request.getHeader("Authorization")
                .substring("Basic".length()).trim();
        return () ->  new String(Base64.getDecoder()
                .decode(authToken)).split(":")[0];
    }
}

