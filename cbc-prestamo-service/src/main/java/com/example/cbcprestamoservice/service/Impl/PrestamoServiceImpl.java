package com.example.cbcprestamoservice.service.Impl;

import com.example.cbcprestamoservice.entity.Prestamo;
import com.example.cbcprestamoservice.repository.PrestamoRepository;
import com.example.cbcprestamoservice.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrestamoServiceImpl implements PrestamoService {
    @Autowired
    private PrestamoRepository prestamoRepository;

    @Override
    public List<Prestamo> Listar(){
        return prestamoRepository.findAll();
    }

    @Override
    public List<Prestamo> listar() {
        return List.of();
    }

    @Override
    public Prestamo guardar(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }


    @Override
    public Prestamo actualizar(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }


    @Override
    public Optional<Prestamo> listarPorId(Integer id) {
        return prestamoRepository.findById(id);
    }


    @Override
    public void eliminarPorId(Integer id) {
        prestamoRepository.deleteById(id);
    }

}
