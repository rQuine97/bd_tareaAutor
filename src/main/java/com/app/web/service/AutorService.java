/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.app.web.service;

import com.app.web.entidad.Autor;
import java.util.List;

/**
 *
 * @author rquin
 */
public interface AutorService {

    public List<Autor> listarTodosLosAutores();

    public Autor guardarAutor(Autor autor);

    public Autor obtenerAutorPorId(Integer idautor);

    public Autor actualizarAutor(Autor autor);

    public void eliminarAutor(Integer idautor);
}
