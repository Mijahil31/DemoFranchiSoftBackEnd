package com.franchisoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.franchisoft.dto.ClienteModel;
import com.franchisoft.impl.ClienteServicesImpl;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.DELETE, RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
@RequestMapping("/api")
public class ClienteController {
	
	@Autowired
	ClienteServicesImpl clienteServicesImpl;
	
	@GetMapping("/clientes")
	public List<ClienteModel> listarClientes(){
		
		return clienteServicesImpl.listarClientes();
		
	}
	
	@PostMapping("/cliente")
	public ClienteModel guardarCliente(@RequestBody ClienteModel cliente) {
		
		return clienteServicesImpl.guardarCliente(cliente);
		
	}
	
	@GetMapping("/cliente/{id}")
	public ClienteModel obtenerCliente(@PathVariable(name = "id") Long id) {
		
		ClienteModel cliente = new ClienteModel();
		cliente = clienteServicesImpl.obtenerCliente(id);
		return cliente;
		
	}
	
	@PutMapping("/cliente/{id}")
	public ClienteModel actualizarCliente(@PathVariable(name = "id") Long id, @RequestBody ClienteModel cliente) {
		
		//
		ClienteModel clienteSelecionado = new ClienteModel();
		ClienteModel clienteActualizado = new ClienteModel();
		
		// Ingreso los valores obtenidos desde el objeto enviado 
		clienteSelecionado = clienteServicesImpl.obtenerCliente(id);
		clienteSelecionado.setNombre(cliente.getNombre());
		clienteSelecionado.setApellido(cliente.getApellido());
		clienteSelecionado.setDireccion(cliente.getDireccion());
		clienteSelecionado.setDni(cliente.getDni());
		clienteSelecionado.setFecha(cliente.getFecha());
		
		// Actualizo y obtengo el cliente actualizado 
		clienteActualizado = clienteServicesImpl.actualizarCliente(clienteSelecionado);
		
		return clienteActualizado;
	}
	
	@DeleteMapping("/cliente/{id}")
	public void eliminarCliente(@PathVariable(name = "id") Long id) {
		clienteServicesImpl.eliminarCliente(id);	
	}
	
	@GetMapping("/")
	public String home() {
		return "Hola Mundo desde mi Servicio";
	}
}
