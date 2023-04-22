package com.msvusuarios.msvusuarios.repository;

import com.msvusuarios.msvusuarios.models.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsuarioRepository extends CrudRepository<Usuario,Long> {
    Optional<Usuario> findByEmail (String email);
}
