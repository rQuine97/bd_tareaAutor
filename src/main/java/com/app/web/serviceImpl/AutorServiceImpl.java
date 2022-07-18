/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.web.serviceImpl;

import com.app.web.entidad.Autor;
import com.app.web.repository.AutorRepository;
import com.app.web.service.AutorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AutorServiceImpl implements AutorService{

    @Autowired
    private AutorRepository repository;
    
    @Override
    public List<Autor> listarTodosLosAutores() {
        return repository.findAll();
    }

    @Override
    public Autor guardarAutor(Autor autor) {
        return repository.save(autor);
    }

    @Override
    public Autor obtenerAutorPorId(Integer idautor) {
        return repository.findById(idautor).get();
    }

    @Override
    public Autor actualizarAutor(Autor autor) {
        return repository.save(autor);
    }

    @Override
    public void eliminarAutor(Integer idautor) {
        repository.deleteById(idautor);
    }
    
}
