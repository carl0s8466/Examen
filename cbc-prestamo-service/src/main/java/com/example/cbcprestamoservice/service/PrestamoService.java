package com.example.cbcprestamoservice.service;

import com.example.cbcprestamoservice.entity.Prestamo;

import java.util.List;
import java.util.Optional;

public interface PrestamoService {

    List<Prestamo> Listar();

    public List<Prestamo> listar();
    public Prestamo guardar(Prestamo prestamo);
    public Prestamo actualizar(Prestamo prestamo);
    public Optional<Prestamo> listarPorId(Integer id);
    public void eliminarPorId(Integer id);
}
