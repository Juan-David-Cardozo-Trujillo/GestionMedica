package com.gestion_medica.demo.repository;

import com.gestion_medica.demo.model.*;
import com.gestion_medica.demo.model.keys.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public interface CitaDiagnosticaEnfermedadRepository extends JpaRepository<CitaDiagnosticaEnfermedad, CitaDiagnosticaEnfermedadId> {
}
