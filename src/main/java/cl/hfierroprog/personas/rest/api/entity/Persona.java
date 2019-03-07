package cl.hfierroprog.personas.rest.api.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PERSONA")
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "persona_id")
    private Integer id;

    @Column(name = "persona_nombre")
    private String nombrePersona;

    @Column(name = "persona_apellido")
    private String apellidoPersona;

    public Persona() {
    }

    public Persona(String nombrePersona, String apellidoPersona) {
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombrePersona='" + nombrePersona + '\'' +
                ", apellidoPersona='" + apellidoPersona + '\'' +
                '}';
    }
}
