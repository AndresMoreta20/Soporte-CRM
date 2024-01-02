package com.racinesmoreta.soportecrm.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Views({
    @View(name = "Simple", members = "nombre, direccion, telefono, correoElectronico"),
    // Add more views if needed
})
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Hidden
    private Long id;

    @Column(length = 100)
    @Required
    private String nombre;

    @Column(length = 100)
    private String direccion;

    @Column(length = 20)
    private String telefono;

    @Column(length = 100)
    @Required
    private String correoElectronico;

    // Add more attributes as needed

    @Views({
        @View(name = "Simple", members = "nombre, direccion, telefono, correoElectronico"),
        // Add more views if needed
    })
    public static class SimpleView {
        // Empty class used only for the view declaration
    }

    // No need to manually write getters and setters, Lombok generates them
}
