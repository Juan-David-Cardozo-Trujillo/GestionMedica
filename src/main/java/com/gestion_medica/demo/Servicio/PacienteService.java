package com.gestion_medica.demo.Servicio;

import com.gestion_medica.demo.model.*;
import com.gestion_medica.demo.model.keys.*;
import com.gestion_medica.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PacienteService {

    @Autowired
    private PacienteRepository repository;

    public List<Paciente> findAll() {
        return repository.findAll();
    }

    public Optional<Paciente> findById(PacienteId id) {
        return repository.findById(id);
    }

    public Paciente save(Paciente paciente) {
        return repository.save(paciente);
    }

    public void deleteById(PacienteId id) {
        repository.deleteById(id);
    }
}
