package com.example.cbcprestamoservice.controller;

import com.example.cbcprestamoservice.entity.Prestamo;
import com.example.cbcprestamoservice.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Prestamos")
public class PrestamoController {
    @Autowired
    private PrestamoService prestamoService;


    @GetMapping()
    public ResponseEntity<List<Prestamo>> list() {
        return ResponseEntity.ok().body(prestamoService.listar());
    }
    @PostMapping()
    public ResponseEntity<Prestamo> save(@RequestBody Prestamo prestamo){
        return ResponseEntity.ok(prestamoService.guardar(prestamo));
    }
    @PutMapping()
    public ResponseEntity<Prestamo> update(@RequestBody Prestamo prestamo){
        return ResponseEntity.ok(prestamoService.actualizar(prestamo));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Prestamo> listById(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok().body(prestamoService.listarPorId(id).get());
    }
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id){
        prestamoService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
