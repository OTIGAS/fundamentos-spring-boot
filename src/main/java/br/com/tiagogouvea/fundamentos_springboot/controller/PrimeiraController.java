package br.com.tiagogouvea.fundamentos_springboot.controller;

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
}
