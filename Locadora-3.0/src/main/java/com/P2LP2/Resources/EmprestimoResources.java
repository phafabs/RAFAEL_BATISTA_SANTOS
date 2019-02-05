package com.P2LP2.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.P2LP2.Dominio.Emprestimo;

import com.P2LP2.Repositorio.EmprestimoRepositorio;


@RestController
public class EmprestimoResources {
	
	@Autowired
	private EmprestimoRepositorio repositorio;
	
	@GetMapping("Empre")
	public List<Emprestimo> getAllEmprestimo(){
		List<Emprestimo> Empre = repositorio.findAll();
		return Empre;	
	}
}