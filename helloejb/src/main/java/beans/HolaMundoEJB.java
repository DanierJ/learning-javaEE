package beans;

import javax.ejb.Stateless;

@Stateless // Tan sólo poniendo esta anotación la clase se convierte en un EJB
public class HolaMundoEJB {

    /**
     * Definiendo nuestro método de negocio. Este método ya posee todas las características empresariales de los ejb. EJB de tipo local sin interface
     * @param a
     * @param b
     * @return suma de a y b
     */
    public int sumar(int a, int b) {
        return a + b;
    }
}
