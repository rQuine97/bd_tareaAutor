package com.app.web;

import com.app.web.entidad.Autor;
import com.app.web.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudBibliotecaApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(CrudBibliotecaApplication.class, args);
    }
    
    @Autowired
    private AutorRepository repository;
    
    @Override
    public void run(String... args) throws Exception {
//        Autor autor1 = new Autor("Mario", "VargasLlosa", "mvll22@gmail.com");
//        repository.save(autor1);
//        
//        Autor autor2 = new Autor("Ernest", "Hemingway", "e.h22@gmail.com");
//        repository.save(autor2);
    }


}
