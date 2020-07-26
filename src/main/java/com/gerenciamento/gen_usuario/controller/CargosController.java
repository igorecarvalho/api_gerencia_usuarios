package com.gerenciamento.gen_usuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gerenciamento.gen_usuario.models.Cargos;
import com.gerenciamento.gen_usuario.repository.CargosRepository;

@Validated
@Controller
public class CargosController {
	
	@Autowired
	private CargosRepository cargosRepository;

	@RequestMapping(value="/inserirCargo", method=RequestMethod.GET)
	public String formularioCargos() {
		return "cargos/formCargos";
	}
	
	@RequestMapping(value="/inserirCargo", method=RequestMethod.POST)
	public String formularioCargos(Cargos cargo) {
		
		cargosRepository.save(cargo);
		return "redirect:/inserirCargo";
	}
	
	@RequestMapping("/cargos")
	public ModelAndView listaCargos() {
		
		ModelAndView mv = new ModelAndView("index");
		Iterable<Cargos> cargos = cargosRepository.findAll();
		mv.addObject("cargos", cargos);
		return mv;
	}
	
	@RequestMapping("/cargo/{id}")
	public ModelAndView editarCargo(long id) {
		Cargos cargos = cargosRepository.findById(id);
		ModelAndView mv = new ModelAndView("cargos/editarCargo");
		mv.addObject("cargos", cargos);
		
		return mv;
		
	}
	@RequestMapping("/delCargo/{id}")
	public String deletarCargo(long id) {
		Cargos cargos = cargosRepository.findById(id);
		cargosRepository.delete(cargos);
		
		return "redirect:/";
		
	}
}
