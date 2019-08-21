package com.danjerous.sga.servicio;

import com.danjerous.sga.domain.Usuario;
import com.danjerous.sga.eis.UsuarioDAO;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class UsuarioServiceImpl implements UsuarioService, UsuarioServiceRemote {

    @EJB
    private UsuarioDAO usuarioDAO;

    @Override
    public List<Usuario> findAll() {
        return usuarioDAO.findAll();
    }

    @Override
    public Usuario findById(Usuario usuario) {
        return usuarioDAO.findById(usuario);
    }

    @Override
    public void insert(Usuario usuario) {
        usuarioDAO.insert(usuario);
    }

    @Override
    public void update(Usuario usuario) {
        usuarioDAO.update(usuario);
    }

    @Override
    public void delete(Usuario usuario) {
        usuarioDAO.delete(usuario);
    }
}
