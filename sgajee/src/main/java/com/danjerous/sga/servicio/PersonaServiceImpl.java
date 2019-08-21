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
        return personaDAO.findAll();

    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return personaDAO.findById(persona);
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return personaDAO.findPersonaByEmail(persona);
    }

    @Override
    public void registrarPersona(Persona persona) {
        personaDAO.insert(persona);
    }

    @Override
    public void modificarPersona(Persona persona) {
        personaDAO.update(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        personaDAO.delete(persona);
    }
}
