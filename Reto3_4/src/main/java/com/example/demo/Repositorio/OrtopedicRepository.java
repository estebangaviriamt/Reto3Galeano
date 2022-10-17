package com.example.demo.Repositorio;

import org.springframework.stereotype.Repository;
import com.example.demo.Modelo.Ortopedic;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.Interface.OrtopedicInterface;

@Repository

public class OrtopedicRepository {

    @Autowired
    private OrtopedicInterface extencionesCrud;

    public List<Ortopedic> getAll() {
        return (List<Ortopedic>) extencionesCrud.findAll();
    }

    public Optional<Ortopedic> getOrtopedic(int id) {
        return extencionesCrud.findById(id);
    }

    public Ortopedic save(Ortopedic ortopedic) {
        return extencionesCrud.save(ortopedic);
    }
    
    public void delete(Ortopedic ortopedic){
        extencionesCrud.delete(ortopedic);
    }
}
