package com.utez.edu.mx.BuenaPractica.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.utez.edu.mx.BuenaPractica.Model.Usuarios;

@Service
public class UsuarioServiceImpl implements IUsuarioService{
	
	private List<Usuarios> lista = null;
	
	public UsuarioServiceImpl() {
		lista = new LinkedList<>();
		lista.add(new Usuarios("Diego","1234",20,"DiegoMed@gmail.com","Jiutepec"));
		lista.add(new Usuarios("Emmanuel","1234",20,"Emma@gmail.com","Jiutepec"));
	}

	@Override
	public List<Usuarios> listartodo() {
		return lista;
	}
	
	public void guardad(Usuarios usuario) {
		lista.add(usuario);
	}
}
