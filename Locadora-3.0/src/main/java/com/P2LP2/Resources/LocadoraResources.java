package com.P2LP2.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.P2LP2.Dominio.Locadora;
import com.P2LP2.Repositorio.LocadoraRepositorio;

@RestController
public class LocadoraResources {
	
	@Autowired
	private LocadoraRepositorio repositorio;
	
	@GetMapping("Loca")
	public List<Locadora> getAllLocadora(){
		List<Locadora> Loca = repositorio.findAll();
		return Loca;	
	}
}