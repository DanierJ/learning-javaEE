package com.danjerous.sga.servicio;

import com.danjerous.sga.domain.Persona;
import com.danjerous.sga.eis.PersonaDAO;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;
import java.util.List;

@Stateless
@WebService(endpointInterface = "com.danjerous.sga.servicio.PersonaServiceWS")
@DeclareRoles({"ROLE_ADMIN", "ROLE_USER"})
@RolesAllowed({"ROLE_ADMIN", "ROLE_USER"})
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService, PersonaServiceWS {

    @EJB
    private PersonaDAO personaDAO;

    @RolesAllowed("ROLE_ADMIN")
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
