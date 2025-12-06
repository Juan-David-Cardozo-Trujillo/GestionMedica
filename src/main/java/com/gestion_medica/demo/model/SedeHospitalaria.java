package com.gestion_medica.demo.model;

import com.gestion_medica.demo.model.keys.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "sedes_hospitalarias")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SedeHospitalaria {

    @Id
    @Column(name = "idsede")
    private Integer idSede;

    @Column(name = "nombresede", nullable = false, length = 50)
    private String nombreSede;
}
