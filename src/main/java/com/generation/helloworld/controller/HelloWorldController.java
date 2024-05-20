package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola-mundo")
public class HelloWorldController {
	
	
	@GetMapping
	public String ola() {
		return "Olá Mundo! Bom dia!";
		
	}
	@GetMapping("comidas")
	public String comidasFavoritas() {
		return "sushi \nHamburguer";
	}

	@GetMapping("livros")
	public String livrosFavoritas() {
		return "Eragon \nSenhor dos aneis";
		
	}
	
	@GetMapping("BSM")
	public String BSMDaGen() {
		return "Persistência\r\n"
				+ "Mentalidade de Crescimento\r\n"
				+ "Responsabilidade Pessoal\r\n"
				+ "Orientação ao Futuro\r\n"
				+ "Pro atividade\r\n"
				+ "Comunicação\r\n"
				+ "Trabalho em Equipe\r\n"
				+ "Orientação ao Detalhe\r\n"
				+ "Utilizar boas Praticas de Programação";
}
	
	@GetMapping("Objetivos")
	public String Objetivos() {
		return "Aprofundar em Banco de dados \nResumo em dia das aulas \nRealizar todos os exercicios das duas listas anteriores";
		
	}
}
