package com.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table (name = "empresa")
public class Empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	private String nit;
	private String razon_So;
	private String direccion;
	private long telefono;
	private String repre_legal;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public String getRazon_So() {
		return razon_So;
	}
	public void setRazon_So(String razon_So) {
		this.razon_So = razon_So;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public String getRepre_legal() {
		return repre_legal;
	}
	public void setRepre_legal(String repre_legal) {
		this.repre_legal = repre_legal;
	}
	
	public Empresa() {
	}
	
	public Empresa(String nit, String razon_So, String direccion, long telefono, String repre_legal) {
		super();
		this.nit = nit;
		this.razon_So = razon_So;
		this.direccion = direccion;
		this.telefono = telefono;
		this.repre_legal = repre_legal;
	}
	
	
	
	
}
