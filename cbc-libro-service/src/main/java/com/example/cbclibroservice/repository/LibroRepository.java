package com.example.cbclibroservice.repository;

import com.example.cbclibroservice.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Integer> {
}
