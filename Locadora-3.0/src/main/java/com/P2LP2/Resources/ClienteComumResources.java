package com.P2LP2.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.P2LP2.Dominio.ClienteComum;

import com.P2LP2.Repositorio.ClienteComumRepositorio;


@RestController
public class ClienteComumResources {
	
	@Autowired
	private ClienteComumRepositorio repositorio;
	
	@GetMapping("Reser")
	public List<ClienteComum> getAllClienteComum(){
		List<ClienteComum> Reser = repositorio.findAll();
		return Reser;	
	}
}