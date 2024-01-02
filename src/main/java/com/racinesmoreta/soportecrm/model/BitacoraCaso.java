package com.racinesmoreta.soportecrm.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Data
public class BitacoraCaso {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Hidden
    private Long id;

    @ManyToOne
    @JoinColumn(name = "caso_id")
    @ReferenceView("Simple") // Use a simple view for referencing cases
    private Caso caso;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Column
    private String descripcion;

    // Add more attributes as needed

    // No need to manually write getters and setters, Lombok generates them
}
