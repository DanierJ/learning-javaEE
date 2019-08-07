package com.danjerous.sga.servicio;

import com.danjerous.sga.domain.Persona;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService {
    @Override
    public List<Persona> listarPersonas() {


        List<Persona> listadoPersona = new ArrayList<>();

        listadoPersona.add(new Persona(1, "Danier", "Martinez", "Camacho", "dan@j.com", "222555"));
        listadoPersona.add(new Persona(2, "Julian", "Cuestas", "Mora", "julian@j.com", "222555"));
        listadoPersona.add(new Persona(3, "Mario", "Vasquez", "joderSeMeOlvido", "mar@v.com", "222555"));
        listadoPersona.add(new Persona(4, "Poncho", "??", "???", "ponchis", "222555"));
        listadoPersona.add(new Persona(5, "Isaac", "Amortegui", "Cuervo", "isaac.com", "222555"));

        return listadoPersona;

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
