package com.P2LP2.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.P2LP2.Dominio.Funcionario;
import com.P2LP2.Repositorio.FuncionarioRepositorio;

@RestController
public class FuncionarioResources {
	
	@Autowired
	private FuncionarioRepositorio repositorio;
	
	@GetMapping("Fun")
	public List<Funcionario> getAllFuncionario(){
		List<Funcionario> Fun = repositorio.findAll();
		return Fun;	
	}
}
