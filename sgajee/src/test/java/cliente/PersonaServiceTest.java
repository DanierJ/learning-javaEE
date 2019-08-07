package cliente;

import com.danjerous.sga.domain.Persona;
import com.danjerous.sga.servicio.PersonaService;
import org.junit.Before;
import org.junit.Test;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PersonaServiceTest {
    private static EJBContainer container;
    private static Context context;
    private static PersonaService personaService;

    @Before
    public void setUp() throws Exception {
        System.out.println("Iniciando EJB Container");
        /**My personal experience with running such test in eclipse as a standalone JUnit (not via maven test) is
         * is to use overloaded version of createEJBContainer, in which developer has to specify where to find the compiled bean classes.
         */
        Map<String, Object> properties = new HashMap<>();
         properties.put(EJBContainer.MODULES, new File("target/classes"));
         container = EJBContainer.createEJBContainer(properties);
         context =  container.getContext();
         personaService = (PersonaService) context.lookup("java:global/classes/PersonaServiceImpl!com.danjerous.sga.servicio.PersonaService");
    }


    @Test
    public void testEJBPersonaService() {
        System.out.println("Iniciando test EJB PersonaService");

        assertNotNull(personaService);

        assertEquals(5, personaService.listarPersonas().size());

        System.out.println("El no. de personas es igual a: " + personaService.listarPersonas().size());

        this.desplegarPersonas(personaService.listarPersonas());


        System.out.println("Fin test EJB PersonaService");

    }

    private void desplegarPersonas(List<Persona> listarPersonas) {

        listarPersonas.forEach(System.out::println);
    }

}
