package com.danjerous.sga.servicio;

import com.danjerous.sga.domain.Persona;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote {
    @Override
    public List<Persona> listarPersonas() {
        return null;
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return null;
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return null;
    }

    @Override
    public void registrarPersona(Persona persona) {

    }

    @Override
    public void modificarPersona(Persona persona) {

    }

    @Override
    public void eliminarPersona(Persona persona) {

    }
}
