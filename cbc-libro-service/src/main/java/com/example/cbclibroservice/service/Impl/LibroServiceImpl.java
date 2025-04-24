package com.example.cbclibroservice.service.Impl;

import com.example.cbclibroservice.entity.Libro;
import com.example.cbclibroservice.repository.LibroRepository;
import com.example.cbclibroservice.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroServiceImpl implements LibroService {
    @Autowired
    private LibroRepository libroRepository;


    @Override
    public List<Libro> listar() {
        return libroRepository.findAll();
    }


    @Override
    public Libro guardar(Libro libro) {
        return libroRepository.save(libro);
    }


    @Override
    public Libro actualizar(Libro libro) {
        return libroRepository.save(libro);
    }


    @Override
    public Optional<Libro> listarPorId(Integer id) {
        return libroRepository.findById(id);
    }


    @Override
    public void eliminarPorId(Integer id) {
        libroRepository.deleteById(id);
    }

}
