package com.rpg.FireEmblem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.rpg.FireEmblem.dto.RequisicaoNovoPersonagem;
import com.rpg.FireEmblem.model.Personagem;
import com.rpg.FireEmblem.repositories.PersonagemRepository;
import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/personagem")
public class PersonagemController {

	@Autowired
	private PersonagemRepository repository;
	
	@GetMapping("/formulario")
	public ModelAndView formulario() {
		ModelAndView mv = new ModelAndView("/personagem/formulario");
		return mv;
	}
	
	@PostMapping("/novo")
	@Transactional
	public ModelAndView formulario(RequisicaoNovoPersonagem requisicao) {
		Personagem personagem = new Personagem(requisicao);
		repository.save(personagem);
		ModelAndView mv = new ModelAndView("redirect:/home");
		return mv;
	}
	

}
