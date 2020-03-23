package com.api.codigos.postales.core.converter;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.api.codigos.postales.core.entity.CodigoPostal;
import com.api.codigos.postales.core.model.ModeloCodigoPostal;


@Component("convertidor")
public class Convertidor{
	public List<ModeloCodigoPostal> convertirListaCodigoPostal(List<CodigoPostal> codigosPostales){
		List<ModeloCodigoPostal> modeloCodigoPostal = new ArrayList<>();
		
		for(CodigoPostal codigoPostal : codigosPostales) {
			modeloCodigoPostal.add(new ModeloCodigoPostal(codigoPostal));
		}
		return modeloCodigoPostal;
	}
	
	
}
