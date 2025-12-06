package com.gestion_medica.demo.model;

import com.gestion_medica.demo.model.keys.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "historias_clinicas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HistoriaClinica {

    @Id
    @Column(name = "codhistoria")
    private Integer codHistoria;

    @Column(name = "codpaciente")
    private Integer codPaciente;

    @Column(name = "numdocumento")
    private Integer numDocumento;
}
