package cliente;

import com.danjerous.sga.domain.Persona;
import com.danjerous.sga.domain.Usuario;
import com.danjerous.sga.servicio.UsuarioService;
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

public class UsuarioServiceTest {
    private EJBContainer container;
    private Context context;
    private UsuarioService usuarioService;

    @Before
    public void setUp() throws Exception {
        System.out.println("Iniciando EJB Container");

        Map<String, Object> properties = new HashMap<>();
        properties.put(EJBContainer.MODULES, new File("target/classes"));
        container = EJBContainer.createEJBContainer(properties);
        context = container.getContext();
        usuarioService = (UsuarioService) context.lookup("java:global/classes/UsuarioServiceImpl!com.danjerous.sga.servicio.UsuarioService");
    }

    @Test
    public void testListarUsuario() {
        System.out.println("Iniciando Test EJB Usuario Service");

        assertNotNull(usuarioService);

        assertEquals(2, usuarioService.findAll().size());

        desplegarUsuarios(usuarioService.findAll());

        System.out.println("Terminando el Test");
    }

    private void desplegarUsuarios(List<Usuario> usuarios) {
        usuarios.forEach(System.out::println);
    }

    @Test
    public void testAgregarUsuario() {
        System.out.println("Iniciando test agregar persona");

        assertNotNull(usuarioService);

        usuarioService.insert(new Usuario("danij", "jdani", new Persona(4,"danij", "dan", "mar", "dajn", "222")));
        assertEquals(2, usuarioService.findAll().size());

        desplegarUsuarios(usuarioService.findAll());
    }
}
