package com.jamerchallenge.Foro_hub_challenge.controller;

import com.jamerchallenge.Foro_hub_challenge.dto.*;
import com.jamerchallenge.Foro_hub_challenge.model.Topico;
import com.jamerchallenge.Foro_hub_challenge.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoService service;

    @GetMapping
    public List<Topico> listarTopicos() {
        return service.listarTopicos();
    }

    @PostMapping
    public ResponseEntity<Topico> crearTopico(@RequestBody NuevoTopicoRequest request) {
        Topico topico = new Topico();
        topico.setTitulo(request.titulo());
        topico.setMensaje(request.mensaje());
        // Set autor y curso usando servicios correspondientes
        return ResponseEntity.ok(service.guardarTopico(topico));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Topico> obtenerTopico(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Topico> actualizarTopico(@PathVariable Long id, @RequestBody ActualizarTopicoRequest request) {
        return service.buscarPorId(id).map(topico -> {
            topico.setTitulo(request.titulo());
            topico.setMensaje(request.mensaje());
            return ResponseEntity.ok(service.guardarTopico(topico));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarTopico(@PathVariable Long id) {
        if (service.buscarPorId(id).isPresent()) {
            service.eliminarTopico(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
