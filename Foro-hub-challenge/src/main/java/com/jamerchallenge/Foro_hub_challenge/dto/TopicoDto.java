package com.jamerchallenge.Foro_hub_challenge.dto;

import java.time.LocalDate;
import com.jamerchallenge.Foro_hub_challenge.model.EstadoTopico;


public record TopicoDto(Long id,
                        String titulo,
                        String mensaje,
                        LocalDate fecha,
                        EstadoTopico estado,
                        String autor,
                        String curso) {}
