package com.danjerous.sga.servicio;

import com.danjerous.sga.domain.Usuario;
import com.danjerous.sga.eis.CRUD;

import javax.ejb.Remote;

@Remote
public interface UsuarioServiceRemote extends CRUD<Usuario> {
}
