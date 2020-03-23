package com.api.codigos.postales.core.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.codigos.postales.core.entity.CodigoPostal;


@Repository("repositorio")
public interface CodigoPostalRepositorio extends JpaRepository<CodigoPostal, Serializable>{
	
	public abstract CodigoPostal findByZipCode(Long zipCode);
	
	public abstract CodigoPostal findByLocality(String locality);
	
	
	
}
