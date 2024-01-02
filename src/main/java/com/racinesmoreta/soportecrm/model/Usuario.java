package com.racinesmoreta.soportecrm.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import com.racinesmoreta.soportecrm.run.*;

import lombok.*;

@Entity
@Data // Lombok annotation for generating getters, setters, toString, and more
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Hidden
    private Long id;

    @Column(length = 50, unique = true)
    @Required
    private String nombre;

    @Column(length = 50)
    @Required
    private String apellido;

    @Column(length = 100, unique = true)
    @Required
    private String correoElectronico;

    @Column(length = 20)
    @Required
    @Stereotype("ROLES_LIST") // Use the ROLES_LIST predefined stereotype
    private RolEnum rol;

    // Add more attributes as needed

    // No need to manually write getters and setters, Lombok generates them

    // You can add additional annotations and constraints based on your requirements
}
