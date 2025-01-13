package com.jamerchallenge.Foro_hub_challenge.service;

import com.jamerchallenge.Foro_hub_challenge.model.Autor;
import com.jamerchallenge.Foro_hub_challenge.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorRepository repository;

    public List<Autor> listarAutores() {
        return repository.findAll();
    }
}
