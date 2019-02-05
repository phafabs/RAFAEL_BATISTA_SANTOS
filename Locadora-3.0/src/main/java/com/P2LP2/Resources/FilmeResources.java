package com.P2LP2.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.P2LP2.Dominio.Filme;
import com.P2LP2.Repositorio.FilmeRepositorio;

@RestController
public class FilmeResources {
	
	@Autowired
	private FilmeRepositorio repositorio;
	
	@GetMapping("Fil")
	public List<Filme> getAllFilme(){
		List<Filme> Fil = repositorio.findAll();
		return Fil;	
	}
}
