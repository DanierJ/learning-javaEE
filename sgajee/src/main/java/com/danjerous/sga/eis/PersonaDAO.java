package com.danjerous.sga.eis;

import com.danjerous.sga.domain.Persona;

import java.util.List;

public interface PersonaDAO {
    List<Persona> findAllPersonas();

    Persona findPersonaById(Persona persona);

    Persona findPersonaByEmail(Persona persona);

    void insertPersona(Persona persona);

    void updatePersona(Persona persona);

    void deletePersona(Persona persona);
}
