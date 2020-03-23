package com.api.codigos.postales.core.model;


import com.api.codigos.postales.core.entity.CodigoPostal;

public class ModeloCodigoPostal {
	public ModeloCodigoPostal() {
		
	}
	
	public ModeloCodigoPostal(CodigoPostal CodigoPostal) {
		this.zipCode = CodigoPostal.getZipCode();
		this.locality = CodigoPostal.getLocality();
		this.municipaly = CodigoPostal.getMunicipality();
		this.federal_entity = CodigoPostal.getFederal_entity();
	}
	
	public Long getZipCode() {
		return zipCode;
	}

	public void setZipCode(Long zipCode) {
		this.zipCode = zipCode;
	}

	public ModeloCodigoPostal(Long zipCode, String locality, String municipaly, String federal_entity) {
		this.zipCode = zipCode;
		this.locality = locality;
		this.municipaly = municipaly;
		this.federal_entity = federal_entity;
	}
	
	private Long zipCode;
	
	private String locality;
	
	private String municipaly;
	
	private String federal_entity;

	public long getzipCode() {
		return zipCode;
	}

	public void setzipCode(long zipCode) {
		this.zipCode = zipCode;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getMunicipaly() {
		return municipaly;
	}

	public void setMunicipaly(String municipaly) {
		this.municipaly = municipaly;
	}

	public String getFederal_entity() {
		return federal_entity;
	}

	public void setFederal_entity(String federal_entity) {
		this.federal_entity = federal_entity;
	}

}
