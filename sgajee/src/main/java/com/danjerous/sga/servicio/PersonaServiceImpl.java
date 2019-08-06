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
    public void encontrarPersonaPorId(Persona persona) {

    }

    @Override
    public void encontrarPersonaPorEmail(Persona persona) {

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
