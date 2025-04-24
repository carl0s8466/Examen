package com.example.cbclibroservice.controller;

import com.example.cbclibroservice.entity.Libro;
import com.example.cbclibroservice.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {
    @Autowired
    private LibroService libroService;


    @GetMapping()
    public ResponseEntity<List<Libro>> list() {
        return ResponseEntity.ok().body(libroService.listar());
    }
    @PostMapping()
    public ResponseEntity<Libro> save(@RequestBody Libro libro){
        return ResponseEntity.ok(libroService.guardar(libro));
    }
    @PutMapping()
    public ResponseEntity<Libro> update(@RequestBody Libro libro){
        return ResponseEntity.ok(libroService.actualizar(libro));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Libro> listById(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok().body(libroService.listarPorId(id).get());
    }
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id){
        libroService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }

}
