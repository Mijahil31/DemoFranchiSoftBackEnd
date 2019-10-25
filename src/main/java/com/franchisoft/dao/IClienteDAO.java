package com.franchisoft.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.franchisoft.dto.ClienteModel;

public interface IClienteDAO extends JpaRepository<ClienteModel, Long> {
	
	
	
}
