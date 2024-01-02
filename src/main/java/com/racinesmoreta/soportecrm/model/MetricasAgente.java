package com.racinesmoreta.soportecrm.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Data
public class MetricasAgente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Hidden
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Column
    private int casosAsignados;

    @Column
    private int casosCerrados;

    @Column
    private int tiempoRespuestaPromedio;

    // Add more attributes as needed

    // No need to manually write getters and setters, Lombok generates them
}
