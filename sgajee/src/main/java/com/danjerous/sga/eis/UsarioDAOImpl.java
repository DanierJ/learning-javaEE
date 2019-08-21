package com.danjerous.sga.eis;

import com.danjerous.sga.domain.Usuario;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class UsarioDAOImpl implements UsuarioDAO{


    @PersistenceContext(unitName = "PersonaPU")
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    @Override
    public List<Usuario> findAll() {
        return entityManager.createNamedQuery("Usuario.findAll").getResultList();
    }

    @Override
    public Usuario findById(Usuario usuario) {
        return entityManager.find(Usuario.class, usuario.getIdUsuario());
    }

    @Override
    public void insert(Usuario usuario) {
         entityManager.persist(usuario);
    }

    @Override
    public void update(Usuario usuario) {
        entityManager.merge(usuario);
    }

    @Override
    public void delete(Usuario usuario) {
        entityManager.merge(usuario);
        entityManager.remove(usuario);
    }
}
