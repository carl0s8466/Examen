package com.example.cbcusuarioservice.service.Impl;

import com.example.cbcusuarioservice.entity.Usuario;
import com.example.cbcusuarioservice.repository.UsuarioRepository;
import com.example.cbcusuarioservice.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> Listar(){
        return usuarioRepository.findAll();
    }

    @Override
    public List<Usuario> listar() {
        return List.of();
    }

    @Override
    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }


    @Override
    public Usuario actualizar(Usuario categoria) {
        return usuarioRepository.save(categoria);
    }


    @Override
    public Optional<Usuario> listarPorId(Integer id) {
        return usuarioRepository.findById(id);
    }


    @Override
    public void eliminarPorId(Integer id) {
        usuarioRepository.deleteById(id);
    }

}
