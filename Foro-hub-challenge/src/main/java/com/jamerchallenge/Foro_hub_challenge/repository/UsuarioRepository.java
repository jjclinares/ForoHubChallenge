package com.jamerchallenge.Foro_hub_challenge.repository;

import com.jamerchallenge.Foro_hub_challenge.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
}


