import com.danjerous.sga.servicio.Persona;
import com.danjerous.sga.servicio.PersonaServiceImplService;
import com.danjerous.sga.servicio.PersonaServiceWS;

import java.util.List;

public class ClienteTest {
    public static void main(String[] args) {
        PersonaServiceWS personaService = new PersonaServiceImplService().getPersonaServiceImplPort();

        List<Persona> personas = personaService.listarPersonas();

        personas.forEach(persona -> System.out.println(persona.getNombre()));


    }
}
