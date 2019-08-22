package beans;

import com.danjerous.sga.domain.Persona;
import com.danjerous.sga.servicio.PersonaService;
import org.primefaces.event.RowEditEvent;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@RequestScoped
public class PersonaBean implements Serializable {

        @EJB
        private PersonaService personaService;
        private List<Persona> personas;

        public PersonaBean() {
        }

        @PostConstruct
        public void inicializar() {
            personas = personaService.listarPersonas();
        }

        public void editListener(RowEditEvent event) {
            Persona persona = (Persona) event.getObject();
            personaService.modificarPersona(persona);
        }

        public List<Persona> getPersonas() {
            return personas;
        }

        public void setPersonas(List<Persona> personas) {
            this.personas = personas;
        }
}

