package com.rpg.FireEmblem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.rpg.FireEmblem.model.Personagem;
import com.rpg.FireEmblem.repositories.PersonagemRepository;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private PersonagemRepository repository;
	
	@GetMapping
	public ModelAndView listarPersonagens() {
		List<Personagem> personagens = repository.findAll();
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("personagens", personagens);
		return mv;
	}
	
}
