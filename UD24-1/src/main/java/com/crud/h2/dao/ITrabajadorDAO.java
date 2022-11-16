package com.crud.h2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.h2.dto.Trabajador;

public interface ITrabajadorDAO extends JpaRepository<Trabajador, Long> {

	public List<Trabajador> findByNombre(String nombre);
}
