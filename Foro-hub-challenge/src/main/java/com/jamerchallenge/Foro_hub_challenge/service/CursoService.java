package com.jamerchallenge.Foro_hub_challenge.service;

import com.jamerchallenge.Foro_hub_challenge.model.Curso;
import com.jamerchallenge.Foro_hub_challenge.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository repository;

    public List<Curso> listarCursos() {
        return repository.findAll();
    }
}

