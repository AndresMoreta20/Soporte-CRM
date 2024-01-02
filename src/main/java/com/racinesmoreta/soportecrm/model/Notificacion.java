package com.racinesmoreta.soportecrm.model;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.jpa.*;

import lombok.*;

@Entity
@Data
public class Notificacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Hidden
    private Long id;

    @ManyToOne
    @JoinColumn(name = "caso_id")
    @ReferenceView("Simple")
    private Caso caso;

    @ManyToOne
    @JoinColumn(name = "usuario_destino_id")
    private Usuario usuarioDestino;

    @Column
    private String mensaje;
    
    public static List<Notificacion> findAll() {
        try {
            return XPersistence.getManager().createQuery(
                "FROM " + Notificacion.class.getSimpleName(), Notificacion.class
            ).getResultList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Add more attributes as needed

    // No need to manually write getters and setters, Lombok generates them
}
