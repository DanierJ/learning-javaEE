package com.danjerous.sga.eis;

import com.danjerous.sga.domain.Persona;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class PersonaDAOImpl implements PersonaDAO {

    @PersistenceContext(unitName = "PersonaPU")
    EntityManager entityManager;

    @SuppressWarnings("unchecked")
    @Override
    public List<Persona> findAllPersonas() {
        return entityManager.createNamedQuery("Persona.findAll").getResultList();
    }

    @Override
    public Persona findPersonaById(Persona persona) {
       return entityManager.find(Persona.class, persona.getIdPersona());
    }

    @Override
    public Persona findPersonaByEmail(Persona persona) {
        Query query = entityManager.createQuery("FROM Persona p WHERE p.email = :email");
        query.setParameter("email", persona.getEmail());

        return (Persona) query.getSingleResult();
    }

    @Override
    public void insertPersona(Persona persona) {
        entityManager.persist(persona);
    }

    @Override
    public void updatePersona(Persona persona) {
        entityManager.merge(persona);
    }

    @Override
    public void deletePersona(Persona persona) {
        entityManager.merge(persona);
        entityManager.remove(persona);
    }
}
