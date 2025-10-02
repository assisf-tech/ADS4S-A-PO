package com.trb.ads.service;

import com.trb.ads.model.Estudante;
import com.trb.ads.repository.EstudanteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudanteService {
    private final EstudanteRepository estudanteRepository;

    public EstudanteService(EstudanteRepository estudanteRepository) {
        this.estudanteRepository = estudanteRepository;
    }

    public List<Estudante> getAll(){
        return estudanteRepository.findAll();
    }

    public Estudante getById(Long id){
        return estudanteRepository.findById(id).orElseThrow();
    }

    public Estudante save(Estudante estudante){
        return estudanteRepository.save(estudante);
    }

    public void delete(Long id){
        estudanteRepository.deleteById(id);
    }
}
