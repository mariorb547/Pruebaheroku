package com.api.codigos.postales.core.service;


import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.api.codigos.postales.core.entity.CodigoPostal;
import com.api.codigos.postales.core.model.ModeloCodigoPostal;
import com.api.codigos.postales.core.repository.CodigoPostalRepositorio;


@Service("servicio")
public class CodigoPostalService {
	@Autowired
	@Qualifier("repositorio")
	private CodigoPostalRepositorio repositorio;
	
	@Autowired
	@Qualifier("convertidor")
	private com.api.codigos.postales.core.converter.Convertidor convertidor;
	
	
	
	
	
	public ModeloCodigoPostal obtenerPorZipCode(Long zip_code) {
		return new ModeloCodigoPostal(repositorio.findByZipCode(zip_code));
	}
	public ModeloCodigoPostal obtenerPoLocalidad(String locality) {
		return new ModeloCodigoPostal(repositorio.findByLocality(locality));
		
	}
	
	public List<ModeloCodigoPostal> obtener(){
	
	return convertidor.convertirListaCodigoPostal(repositorio.findAll());
	}

	
	
}
