package com.jamerchallenge.Foro_hub_challenge.security;

import com.jamerchallenge.Foro_hub_challenge.dto.LoginRequest;
import com.jamerchallenge.Foro_hub_challenge.dto.LoginResponse;
import com.jamerchallenge.Foro_hub_challenge.model.Usuario;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacionController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity<LoginResponse> autenticar(@RequestBody @Valid LoginRequest request) {
        var authToken = new UsernamePasswordAuthenticationToken(request.getEmail(), request.getContrasena());
        var authentication = authenticationManager.authenticate(authToken);
        var tokenJWT = tokenService.generarToken((Usuario) authentication.getPrincipal());
        return ResponseEntity.ok(new LoginResponse(tokenJWT));
    }
}

