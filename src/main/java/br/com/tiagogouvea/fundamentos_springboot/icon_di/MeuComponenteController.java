package br.com.tiagogouvea.fundamentos_springboot.icon_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/componente")
public class MeuComponenteController {

    @Autowired
    MeuComponente meuComponente;

    @GetMapping("/")
    public String chamandoComponente() {
        var resultado = meuComponente.meuComponente();
        return resultado;
    }
}
