package com.camavilca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camavilca.model.Cliente;
import com.camavilca.repositorio.ClienteRepositorio;

@Service("cliente")
public class ClienteService{
	
	@Autowired
	private ClienteRepositorio iCliente;
	
	public void guardar(Cliente cliente) {
		iCliente.save(cliente);
	}
	
	public List<Cliente> listar (){
		 return iCliente.findAll();
	}
	
}
