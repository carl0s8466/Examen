package com.example.cbclibroservice.service;

import com.example.cbclibroservice.entity.Libro;

import java.util.List;
import java.util.Optional;

public interface LibroService {
    public List<Libro> listar();
    public Libro guardar(Libro libro);
    public Libro actualizar(Libro libro);
    public Optional<Libro> listarPorId(Integer id);
    public void eliminarPorId(Integer id);
}
