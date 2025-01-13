package com.jamerchallenge.Foro_hub_challenge.service;

import com.jamerchallenge.Foro_hub_challenge.dto.*;
import com.jamerchallenge.Foro_hub_challenge.model.Topico;
import com.jamerchallenge.Foro_hub_challenge.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository repository;

    public List<Topico> listarTopicos() {
        return repository.findAll();
    }

    public Optional<Topico> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Topico guardarTopico(Topico topico) {
        return repository.save(topico);
    }

    public void eliminarTopico(Long id) {
        repository.deleteById(id);
    }
}

