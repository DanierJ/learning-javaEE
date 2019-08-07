package test;

import beans.dominio.Persona;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import static org.junit.Assert.assertNotNull;


public class TestEntidadPersona {
    private static EntityManager entityManager = null;
    private static EntityTransaction entityTransaction = null;
    private static EntityManagerFactory entityManagerFactory = null;
    private Logger log = Logger.getLogger("TestEntidadPersona");

    @BeforeClass
    public static void init() throws Exception{
        entityManagerFactory = Persistence.createEntityManagerFactory("PersonaPU");
    }

    @Before
    public void setup() {

        try {
            entityManager = entityManagerFactory.createEntityManager();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testPersonaEntity() {
        log.debug("Iniciando test Persona Entity con JPA");

        assertNotNull(entityManager);

        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

        // No debemos especificar el ID, se genera en automático

        Persona persona = new Persona("Juan", "Alarcon", "Padilla", "juan@com", "221144");

        log.debug("Objeto a persistir: " + persona);

        entityManager.persist(persona);

        entityTransaction.commit();

        log.debug("Objeto persistido: " + persona);
    }
}
