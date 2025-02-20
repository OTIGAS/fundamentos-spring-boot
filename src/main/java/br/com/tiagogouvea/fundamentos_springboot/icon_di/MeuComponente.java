package br.com.tiagogouvea.fundamentos_springboot.icon_di;

import org.springframework.stereotype.Component;

@Component
public class MeuComponente {
    public String meuComponente() {
        return "Chamando meu componente";
    }
}
