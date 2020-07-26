package com.gerenciamento.gen_usuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gerenciamento.gen_usuario.models.Perfis;
import com.gerenciamento.gen_usuario.repository.PerfisRepository;

@Controller
public class PerfisController {
	
	@Autowired
	private PerfisRepository perfisRepository;
	
	@RequestMapping(value="/inserirPerfil", method=RequestMethod.GET)
	public String formularioPerfis() {
		return "perfis/formPerfis";
	}
	
	@RequestMapping(value="/inserirPerfil", method=RequestMethod.POST)
	public String formularioPerfis(Perfis perfil) {
		
		perfisRepository.save(perfil);
		return "redirect:/inserirPerfil";
	}
	
	@RequestMapping("/perfis")
	public ModelAndView listaPerfis() {
		
		ModelAndView mv = new ModelAndView("index");
		Iterable<Perfis> perfis = perfisRepository.findAll();
		mv.addObject("perfis", perfis);
		return mv;
	}
	
	@RequestMapping("/perfil/{id}")
	public ModelAndView editarPerfil(long id) {
		
		Perfis perfil = perfisRepository.findById(id);
		ModelAndView mv = new ModelAndView("perfis/editarPerfil");
		mv.addObject("perfis", perfil);
		
		return mv;
		
	}
	
	@RequestMapping("/delPerfil/{id}")
	public String deletarPerfil(long id) {
		Perfis perfis = perfisRepository.findById(id);
		perfisRepository.delete(perfis);
		
		return "redirect:/";
		
	}
}
