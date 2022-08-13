package com.example.demo.service;

import com.example.demo.model.ContatoModel;
import com.example.demo.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service

public class ContatoService {
    @Autowired
    private ContatoRepository contatoRepository;

    public List<ContatoModel> listarContatos() {
        return contatoRepository.findAll();

    }

    public ContatoModel cadastrar(ContatoModel contatoModel) {
        contatoModel.getId();
        contatoModel.getNome();
        contatoModel.getTelefone();
        return contatoRepository.save(contatoModel);

    }

    public void deletarContato(Long id) {
        contatoRepository.deleteById(id);
    }

    public Optional<ContatoModel> buscaContato(@PathVariable Long id) {
        return contatoRepository.findById(id);
    }

    public ContatoModel atualizarContato(ContatoModel contatoModel) {
        contatoModel.getId();
        contatoModel.getNome();
        contatoModel.getTelefone();
        return contatoRepository.save(contatoModel);
    }
}
