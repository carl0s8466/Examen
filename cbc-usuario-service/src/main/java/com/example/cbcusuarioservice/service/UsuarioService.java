package com.example.cbcusuarioservice.service;

import com.example.cbcusuarioservice.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    List<Usuario> Listar();

    public List<Usuario> listar();
    public Usuario guardar(Usuario usuario);
    public Usuario actualizar(Usuario usuario);
    public Optional<Usuario> listarPorId(Integer id);
    public void eliminarPorId(Integer id);
}
