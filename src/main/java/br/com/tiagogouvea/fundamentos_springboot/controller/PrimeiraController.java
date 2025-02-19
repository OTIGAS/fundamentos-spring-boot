package br.com.tiagogouvea.fundamentos_springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {
    @GetMapping("/primeiroMetodo/{id}")
    public String primeiroMetodo(@PathVariable String id) {
        return "Parametro é " + id;
    }

    @GetMapping("/meuMetodoComQueryParam")
    public String metodoComQueryParam(String id) {
        return "Parametro com metodoComQueryParam é: " + id;
    }

    @GetMapping("/meuMetodoComQueryParams")
    public String metodoComQueryParams(@RequestParam Map<String, String> allParams) {
        return "Parametros com metodoComQueryParams é: " + allParams.entrySet();
    }

    @PostMapping("/metodoComBodyParams")
    public String metodoComBodyParams(@RequestBody Usuario usuario) {
        return "Parametros com metodoComBodyParams é: " + usuario.username;
    }

    record Usuario(String username) {}

    @PostMapping("/metodoComHeaders")
    public String metodoComHeaders(@RequestHeader Map<String, String> headers) {
        return "metodoComHeaders " + headers.entrySet();
    }

    @GetMapping("/metodoResponseEntity/{id}")
    public ResponseEntity<Object> metodoResponseEntity(@PathVariable int id) {
        var usuario = new Usuario("OTIGAS");

        if (id > 5)
            return ResponseEntity.status(HttpStatus.CREATED).body(usuario.username);
        else
            return ResponseEntity.badRequest().body("Numero menor que 5");
    }
}
