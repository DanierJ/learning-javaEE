package com.danjerous.sga.eis;

import com.danjerous.sga.domain.Persona;

public interface PersonaDAO extends CRUD<Persona> {
    Persona findPersonaByEmail(Persona persona);
}
