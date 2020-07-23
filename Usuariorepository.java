package com.App.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.App.Entity.Usuario;



@Repository("UsuarioRepository")
public interface UsuarioRepository extends JpaRepository<Usuario, Serializable> {

}
