package com.App.service;

import com.App.Entity.Usuario;

public interface UsuarioService {

	
	public abstract Usuario addUsuario(Usuario usuario);

	public abstract void addObject(String string, Usuario usuario);
}
