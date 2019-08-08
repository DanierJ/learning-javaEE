package com.danjerous.sga.servicio;

import com.danjerous.sga.domain.Persona;
import com.danjerous.sga.eis.PersonaDAO;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService {

    @EJB
    private PersonaDAO personaDAO;

    @Override
    public List<Persona> listarPersonas() {
        return personaDAO.findAllPersonas();

    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return personaDAO.findPersonaById(persona);
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return personaDAO.findPersonaByEmail(persona);
    }

    @Override
    public void registrarPersona(Persona persona) {
        personaDAO.insertPersona(persona);
    }

    @Override
    public void modificarPersona(Persona persona) {
        personaDAO.updatePersona(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        personaDAO.deletePersona(persona);
    }
}
