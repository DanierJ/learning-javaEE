package com.danjerous.sga.cliente;

import com.danjerous.sga.domain.Persona;
import com.danjerous.sga.servicio.PersonaServiceRemote;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.List;


public class ClientePersonaService {
    public static void main(String[] args) {

        System.out.println("Iniciando llamada al EJB desde el cliente\n");

        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService =  (PersonaServiceRemote) jndi.lookup("java:global/sga-jee/PersonaServiceImpl!com.danjerous.sga.servicio.PersonaServiceRemote");

            List<Persona> listadoPersona = personaService.listarPersonas();

            listadoPersona.forEach(System.out::println);


            System.out.println("\nFin llamada al EJB desde el cliente.");


        } catch (NamingException e) {
            e.printStackTrace();
        }

    }
}
