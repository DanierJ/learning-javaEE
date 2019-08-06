package com.danjerous.sga.servicio;

import com.danjerous.sga.domain.Persona;

import javax.ejb.Remote;
import java.util.List;

/**
 * Nos permitirá mandar a llamar los métodos del ejb
 */
@Remote // Para convertirla en una interface remota
public interface PersonaServiceRemote {

    List<Persona> listarPersonas();
    Persona encontrarPersonaPorId(Persona persona);
    Persona encontrarPersonaPorEmail(Persona persona);

    void registrarPersona(Persona persona);
    void modificarPersona(Persona persona);
    void eliminarPersona(Persona persona);
}
