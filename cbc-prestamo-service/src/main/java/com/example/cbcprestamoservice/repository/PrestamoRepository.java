package com.example.cbcprestamoservice.repository;

import com.example.cbcprestamoservice.entity.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamoRepository extends JpaRepository<Prestamo, Integer> {
}
