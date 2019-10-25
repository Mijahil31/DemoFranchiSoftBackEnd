package com.franchisoft.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.franchisoft.dao.IClienteDAO;
import com.franchisoft.dto.ClienteModel;
import com.franchisoft.services.IClienteServices;

@Service
public class ClienteServicesImpl implements IClienteServices {
	
	@Autowired
	IClienteDAO iClienteDAO;
	
	@Override
	public List<ClienteModel> listarClientes() {
		// TODO Auto-generated method stub
		return iClienteDAO.findAll();
	}

	@Override
	public ClienteModel guardarCliente(ClienteModel cliente) {
		// TODO Auto-generated method stub
		return iClienteDAO.save(cliente);
	}

	@Override
	public ClienteModel obtenerCliente(Long id) {
		// TODO Auto-generated method stub
		return iClienteDAO.findById(id).get();
	}

	@Override
	public ClienteModel actualizarCliente(ClienteModel cliente) {
		// TODO Auto-generated method stub
		return iClienteDAO.save(cliente);
	}

	@Override
	public void eliminarCliente(Long id) {
		// TODO Auto-generated method stub
		iClienteDAO.deleteById(id);
	}

}
