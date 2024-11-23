package br.com.rafaelmainieri.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
public class MeuPrimeiroController {
    /**
     * Métodos de acesso HTTP
     * GET - Buscar uma informação
     * POST - Adicionar um dado/informação
     * PUT - Alterar um dado/informação
     * DELETE - Remover um dados
     * PATCH - Alterar somente uma parte do dado/informação
     */

    @GetMapping
    public String primeiraMensagem() {
        return "Funcionou";
    }
}
