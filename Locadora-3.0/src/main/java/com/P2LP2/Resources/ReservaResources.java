package com.P2LP2.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.P2LP2.Dominio.Reserva;
import com.P2LP2.Repositorio.ReservaRepositorio;

@RestController
public class ReservaResources {
	
	@Autowired
	private ReservaRepositorio repositorio;
	
	@GetMapping("Reserv")
	public List<Reserva> getAllReserva(){
		List<Reserva> Reserv = repositorio.findAll();
		return Reserv;	
	}
}