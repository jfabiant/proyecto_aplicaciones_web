package com.camavilca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camavilca.model.Destino;
import com.camavilca.repositorio.DestinoRepositorio;

@Service("destino")
public class DestinoService{
	
	@Autowired
	private DestinoRepositorio iDestino;
	
	public void guardar(Destino destino) {
		iDestino.save(destino);
	}
	
	public List<Destino> listar (){
		 return iDestino.findAll();
	}
	
}
