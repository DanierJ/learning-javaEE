package test;

import beans.HolaMundoEJB;
import org.junit.Before;
import org.junit.Test;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;

import static org.junit.Assert.assertEquals;

public class HolaMundoEJBTest {
    //  Podrían estar dentro del método que inicia el contenedor embebido de glassfish
    private static EJBContainer contenedor;
    private static Context contexto;
    private static HolaMundoEJB ejb;


    @Before
    public void iniciarContenedor() throws Exception {
        System.out.println("Iniciando EJB Container");
        contenedor = EJBContainer.createEJBContainer(); // Iniciamos el contenedor embebido de glassfish
        contexto = contenedor.getContext(); // Recuperamos el contexto para ejecutar el EJB
        ejb = (HolaMundoEJB) contexto.lookup("java:global/classes/HolaMundoEJB!beans.HolaMundoEJB"); // Via jndi solicitamos una referencia del EJB. 
    }

    @Test
    public void testAddNumbers() throws Exception {
        int dato1 = 3;
        int dato2 = 5;
        int resultado = ejb.sumar(dato1, dato2);
        assertEquals((dato1 + dato2), resultado);
        System.out.println("Operación terminada, resultado: " + resultado);

    }


}
