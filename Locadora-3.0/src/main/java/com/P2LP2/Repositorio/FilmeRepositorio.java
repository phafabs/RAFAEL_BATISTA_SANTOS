package com.P2LP2.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.P2LP2.Dominio.Filme;

public interface FilmeRepositorio extends JpaRepository<Filme, Integer> {

}