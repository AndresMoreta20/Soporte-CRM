package com.racinesmoreta.soportecrm.model;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Views({
    @View(name = "Simple", members = "asunto, descripcion, cliente, agenteAsignado, fechaApertura, estado, prioridad"),
    // Add more views if needed
})
@Data
public class Caso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Hidden
    private Long id;

    @Column(length = 100)
    @Required
    private String asunto;

    @Column(length = 500)
    @Required
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    @ReferenceView("Simple")
    private Cliente cliente;  // Include cliente as an attribute

    @ManyToOne
    @JoinColumn(name = "agente_asignado_id")
    private Usuario agenteAsignado;  // Include agenteAsignado as an attribute

    @Column
    @Required
    private LocalDate fechaApertura;

    @Column
    @Required
    private String estado;

    @Column
    @Required
    private String prioridad;

    // Add more attributes as needed

    // No need to manually write getters and setters, Lombok generates them
}
