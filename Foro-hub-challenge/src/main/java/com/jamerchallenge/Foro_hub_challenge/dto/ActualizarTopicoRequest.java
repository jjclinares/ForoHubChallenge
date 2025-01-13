// ActualizarTopicoRequest.java
package com.jamerchallenge.Foro_hub_challenge.dto;

import jakarta.validation.constraints.NotBlank;

public record ActualizarTopicoRequest(
        @NotBlank String titulo,
        @NotBlank String mensaje
) {}
