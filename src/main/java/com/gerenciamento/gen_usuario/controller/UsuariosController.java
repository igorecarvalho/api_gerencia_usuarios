package com.gerenciamento.gen_usuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gerenciamento.gen_usuario.models.Cargos;
import com.gerenciamento.gen_usuario.models.Perfis;
import com.gerenciamento.gen_usuario.models.Usuario;
import com.gerenciamento.gen_usuario.repository.CargosRepository;
import com.gerenciamento.gen_usuario.repository.PerfisRepository;
import com.gerenciamento.gen_usuario.repository.UsuarioRepository;

@Validated
@Controller
public class UsuariosController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private CargosRepository cargosRepository;
	
	@Autowired
	private PerfisRepository perfisRepository;
	
	@RequestMapping(value="/inserirUsuario", method=RequestMethod.GET)
	public String formularioUsuario() {
		return "usuario/formUsuario";
	}
	
	@RequestMapping(value="/inserirUsuario", method=RequestMethod.POST)
	public String formularioUsuario(Usuario usuario) {
		
		usuarioRepository.save(usuario);
		return "redirect:/formUsuario";
	}

	@RequestMapping("/usuarios")
	public ModelAndView listaUsuarios() {
		
		ModelAndView mv = new ModelAndView("index");
		Iterable<Usuario> usuarios = usuarioRepository.findAll();
		mv.addObject("usuarios", usuarios);
		return mv;
	}

	@RequestMapping(value="/usuario/{id}", method=RequestMethod.GET)
	public ModelAndView editarUsuario(long id) {
		Usuario usuario = usuarioRepository.findById(id);
		ModelAndView mv = new ModelAndView("usuario/editarUsuario");
		mv.addObject("usuarios", usuario);
		
		Iterable<Cargos> cargos = cargosRepository.findAll();
		mv.addObject("cargos", cargos);
		
		Iterable<Perfis> perfis = perfisRepository.findAll();
		mv.addObject("perfis", perfis);
		
		return mv;
	}
	
	@RequestMapping(value="/usuario-cargo/{id}",  method=RequestMethod.POST)
	public String usuarioCargo(@PathVariable("id") long id, Cargos cargo) {
		Usuario usuario = usuarioRepository.findById(id);
		cargo.setUsuarios(usuario);
		cargosRepository.save(cargo);
		
		return "redirect:/usuario/{id}";
	}
	
	@RequestMapping(value="/usuario-perfis/{id}",  method=RequestMethod.POST)
	public String usuarioPerfis(@PathVariable("id") long id, Perfis perfis) {
		Usuario usuario = usuarioRepository.findById(id);
		perfis.setUsuarios(usuario);
		perfisRepository.save(perfis);
		
		return "redirect:/usuario/{id}";
	}
	
	@RequestMapping("/delUsuario/{id}")
	public String deletarUsuario(long id) {
		Usuario usuario = usuarioRepository.findById(id);
		usuarioRepository.delete(usuario);
		
		return "redirect:/";
		
	}
	

}
