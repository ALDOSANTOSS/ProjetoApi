package com.api.aldo.projeto.repository;

import com.api.aldo.projeto.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
}
