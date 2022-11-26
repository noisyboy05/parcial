package com.backend.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table (name = "persona")
public class Persona {
	//Variables del formulario
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nombre;
	private String apellido;
	private String sexo;
	private String fnacimiento;
	private long telefono;
	private String direccion;
	private String correo;
	private String ciudad;
	private long cedula;
	
	@ManyToOne
	@JoinColumn (name = "id_dni")
	private Dni dni;
	
	@ManyToOne
	@JoinColumn (name = "id_estado")
	private Estado estado;
	
	
	public Persona() {
	}
	
	public Persona(String nombre, String apellido, String sexo, String fnacimiento, Dni dni, long telefono,
			String direccion, String correo, String ciudad, Estado estado, long cedula) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.fnacimiento = fnacimiento;
		this.dni = dni;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
		this.ciudad = ciudad;
		this.estado = estado;
		this.cedula = cedula;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getFnacimiento() {
		return fnacimiento;
	}
	public void setFnacimiento(String fnacimiento) {
		this.fnacimiento = fnacimiento;
	}
	public Dni getDni() {
		return dni;
	}
	public void setDni(Dni dni) {
		this.dni = dni;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public long getCedula() {
		return cedula;
	}

	public void setCedula(long cedula) {
		this.cedula = cedula;
	}
	
	

}
