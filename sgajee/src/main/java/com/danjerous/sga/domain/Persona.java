package com.danjerous.sga.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;


@Entity
@NamedQueries({@NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p ORDER BY p.idPersona")})
@Table(name = "persona")
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private int idPersona;

    @Column(nullable = false, length = 30)
    private String nombre;

    @Column(nullable = false, length = 30, name = "apellido_paterno")
    private String apePaterno;

    @Column(nullable = false, length = 30, name = "apellido_materno")
    private String apeMaterno;

    @Column(nullable = false, length = 60)
    private String email;

    @Column(nullable = false, length = 30)
    private String telefono;

    @OneToMany(mappedBy = "persona")
    private Collection<Usuario> usuarios;

    public Persona() {
    }

    public Persona(int idPersona) {
        this.idPersona = idPersona;
    }

    public Persona(int idPersona, String nombre, String apePaterno, String apeMaterno, String email, String telefono) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apePaterno = apePaterno;
        this.apeMaterno = apeMaterno;
        this.email = email;
        this.telefono = telefono;
    }


    public Persona(String nombre, String apePaterno, String apeMaterno, String email, String telefono) {
        this.nombre = nombre;
        this.apePaterno = apePaterno;
        this.apeMaterno = apeMaterno;
        this.email = email;
        this.telefono = telefono;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                ", apePaterno='" + apePaterno + '\'' +
                ", apeMaterno='" + apeMaterno + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }


    public Collection<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Collection<Usuario> usuariosByIdPersona) {
        this.usuarios = usuariosByIdPersona;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return idPersona == persona.idPersona &&
                nombre.equals(persona.nombre) &&
                apePaterno.equals(persona.apePaterno) &&
                apeMaterno.equals(persona.apeMaterno) &&
                email.equals(persona.email) &&
                telefono.equals(persona.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPersona, nombre, apePaterno, apeMaterno, email, telefono);
    }
}
