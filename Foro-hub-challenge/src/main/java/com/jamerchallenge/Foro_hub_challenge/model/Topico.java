package com.jamerchallenge.Foro_hub_challenge.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDate fecha = LocalDate.now();

    @Enumerated(EnumType.STRING)
    private EstadoTopico estado = EstadoTopico.ACTIVO;

    @ManyToOne
    private Autor autor;

    @ManyToOne
    private Curso curso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public EstadoTopico getEstado() {
        return estado;
    }

    public void setEstado(EstadoTopico estado) {
        this.estado = estado;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}

