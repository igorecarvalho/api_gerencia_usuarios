package com.gerenciamento.gen_usuario.repository;

import org.springframework.data.repository.CrudRepository;

import com.gerenciamento.gen_usuario.models.Cargos;
import com.gerenciamento.gen_usuario.models.Usuario;

public interface CargosRepository extends CrudRepository<Cargos, Long>{
	
	Cargos findById(long id);
	
	/*Iterable<Usuario> findByCargo(long id);*/
}
