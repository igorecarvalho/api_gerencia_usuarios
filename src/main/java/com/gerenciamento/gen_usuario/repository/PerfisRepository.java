package com.gerenciamento.gen_usuario.repository;

import org.springframework.data.repository.CrudRepository;

import com.gerenciamento.gen_usuario.models.Perfis;
import com.gerenciamento.gen_usuario.models.Usuario;

public interface PerfisRepository extends CrudRepository<Perfis, Long>{
	
	Perfis findById(long id);
	
	/*Iterable<Usuario> findByPerfil(long id);*/
}
