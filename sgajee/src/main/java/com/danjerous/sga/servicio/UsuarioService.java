package com.danjerous.sga.servicio;

import com.danjerous.sga.domain.Usuario;
import com.danjerous.sga.eis.CRUD;

import javax.ejb.Local;

@Local
public interface UsuarioService extends CRUD<Usuario> {
}
