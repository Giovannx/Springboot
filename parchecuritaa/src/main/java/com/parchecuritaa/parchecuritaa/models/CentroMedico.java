package com.parchecuritaa.parchecuritaa.models;

import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "centro_medico")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CentroMedico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long centroMedicoId;


    @Column(name = "nombre")
    @NotNull
    private String nombreCentrosMedicos;


    @NotNull
    private String comuna;

    @Column(name = "direccion")
    @NotNull
    private String direccionCentroMedico;

    @Min(value = 12)
    @Max(value = 12)
    @Column(name = "telefono")
    private Integer telefonoCentroMedico;


    @Column(name = "Horario")
    @NotNull
    private LocalTime hora;

    




    


}
