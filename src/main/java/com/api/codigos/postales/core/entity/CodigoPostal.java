package com.api.codigos.postales.core.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Table(name="CODIGOS_POSTALES")
@Entity
public class CodigoPostal implements Serializable{
	
	public CodigoPostal(){
		
	}
	
	public CodigoPostal(long zipCode, String locality, String federal_entity, String municipality) {
		this.zipCode = zipCode;
		this.locality = locality;
		this.federal_entity = federal_entity;
		this.municipality = municipality;
	}

	@Id
	@Column(name="zipCode")
	private long zipCode;
	
	@Column(name="LOCALITY")
	private String locality;
	
	@Column(name="FEDERAL_ENTITY")
	private String federal_entity;
	
	@Column(name="MUNICIPALITY")
	private String municipality;

	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getFederal_entity() {
		return federal_entity;
	}

	public void setFederal_entity(String federal_entity) {
		this.federal_entity = federal_entity;
	}

	public String getMunicipality() {
		return municipality;
	}

	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

	
}

