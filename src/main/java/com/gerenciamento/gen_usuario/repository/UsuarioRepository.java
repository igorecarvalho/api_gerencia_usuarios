package com.gerenciamento.gen_usuario.repository;

import org.springframework.data.repository.CrudRepository;

import com.gerenciamento.gen_usuario.models.Perfis;
import com.gerenciamento.gen_usuario.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
	
	Usuario findById(long id);
	
	/*Iterable<Perfis> findByPerfil(long id);*/
}
