package com.franchisoft.services;

import java.util.List;

import com.franchisoft.dto.ClienteModel;

public interface IClienteServices {
	
	public List<ClienteModel> listarClientes(); 
	
	public ClienteModel guardarCliente(ClienteModel cliente);
	
	public ClienteModel obtenerCliente(Long id);
	
	public ClienteModel actualizarCliente(ClienteModel cliente);
	
	public void eliminarCliente(Long id);
	
}
