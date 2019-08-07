package com.danjerous.sga.servicio;

import com.danjerous.sga.domain.Persona;

import javax.ejb.Local;
import java.util.List;

@Local
public interface PersonaService {
    List<Persona> listarPersonas();
    Persona encontrarPersonaPorId(Persona persona);
    Persona encontrarPersonaPorEmail(Persona persona);

    void registrarPersona(Persona persona);
    void modificarPersona(Persona persona);
    void eliminarPersona(Persona persona);
}
