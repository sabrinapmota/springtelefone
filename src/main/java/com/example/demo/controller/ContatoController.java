package com.example.demo.controller;

import com.example.demo.model.ContatoModel;
import com.example.demo.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContatoController {
    @Autowired
    private ContatoService contatoService;

    @PostMapping(path = "/telefone")
    @ResponseStatus(HttpStatus.CREATED)

    public ContatoModel cadastrar(@RequestBody ContatoModel contatoModel) {
        return contatoService.cadastrar(contatoModel);
    }

    @GetMapping(path = "/telefone")
    public List<ContatoModel> buscarTodosContatos() {
        return contatoService.listarContatos();
    }

    @GetMapping("/telefone/{id}")
    public Optional<ContatoModel> buscaUmContato(@PathVariable Long id) {
        return contatoService.buscaContato(id);
    }

    @DeleteMapping("/telefone/{id}")
    public void deletarContato(@PathVariable Long id) {
        contatoService.deletarContato(id);
    }
    @PutMapping("/telefone/{id}")
    public ContatoModel atualizarContato(@RequestBody ContatoModel contatoModel, @PathVariable Long id) {
        return contatoService.atualizarContato(contatoModel);
    }
}
