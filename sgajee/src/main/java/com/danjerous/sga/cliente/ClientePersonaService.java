package com.danjerous.sga.cliente;

import com.danjerous.sga.domain.Persona;
import com.danjerous.sga.servicio.PersonaServiceRemote;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.List;

/**
 * El ejb se encuentra en el server de glassfish
 * Por lo que necesitamos primero desplegar el EJB en el servidor y luego hacer la llamada en el cliente.
 */
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

        /**
         * Para desplegar el fucking ejb en el servidor de glassfish: Generas el jar del ejb. Abres el admin console de glassfish y te metes en aplicaciones, luegos le das en deploy a esa vaina y en la segunda opción especificas la ruta del jar.
         */

    }
}
