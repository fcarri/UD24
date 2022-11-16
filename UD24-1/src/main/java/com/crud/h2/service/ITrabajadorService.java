package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Trabajador;

public interface ITrabajadorService {

	//Metodos del CRUD
	public List<Trabajador> listarTrabajadores(); //Listar All 
	
	public Trabajador guardarTrabajador(Trabajador trabajador);	
	
	public Trabajador trabajadorXID(long id); 
	
	public List<Trabajador> listarTrabajadorNomnbre(String nombre);
	
	public Trabajador actualizarTrabajador(Trabajador trabajador); 
	
	public void eliminarTrabajador(long id);// Elimina el cliente DELETE
}
