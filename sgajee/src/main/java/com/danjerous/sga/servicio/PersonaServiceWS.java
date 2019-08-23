package com.danjerous.sga.servicio;

import com.danjerous.sga.domain.Persona;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface PersonaServiceWS  {
    @WebMethod
    public List<Persona> listarPersonas();
}
