package com.backend.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table (name = "empleado")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String empresa;
	private String area;
	private String cargo;
	private String Fcha_Contratacion;
	private String fcha_inicio;
    private String fcha_fin;
    private float salario;
    private String correo_corp;
    
    @ManyToOne
	@JoinColumn (name = "id_horario")
	private Horario horario;
	
    @ManyToOne
	@JoinColumn (name = "id_tipo_cont")
	private Tipo_Contrato tipo_contrato ;
    public Empleado() {
	}
    
    
    public Empleado(String empresa, String area, String cargo, Tipo_Contrato tipo_contrato, String fcha_Contratacion,
			String fcha_inicio, String fcha_fin, float salario, String correo_corp, Horario horario) {
		super();
		this.empresa = empresa;
		this.area = area;
		this.cargo = cargo;
		this.tipo_contrato = tipo_contrato;
		Fcha_Contratacion = fcha_Contratacion;
		this.fcha_inicio = fcha_inicio;
		this.fcha_fin = fcha_fin;
		this.salario = salario;
		this.correo_corp = correo_corp;
		this.horario = horario;
	}

	public long getId() {
		return id;
	}

	public long getId_Empresa() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Tipo_Contrato getTipo_Contrato() {
		return tipo_contrato;
	}
	public void setTipo_Contrato(Tipo_Contrato tipo_contrato) {
		this.tipo_contrato = tipo_contrato;
	}
	public String getFcha_Contratacion() {
		return Fcha_Contratacion;
	}
	public void setFcha_Contratacion(String fcha_Contratacion) {
		Fcha_Contratacion = fcha_Contratacion;
	}
	public String getFcha_inicio() {
		return fcha_inicio;
	}
	public void setFcha_inicio(String fcha_inicio) {
		this.fcha_inicio = fcha_inicio;
	}
	public String getFcha_fin() {
		return fcha_fin;
	}
	public void setFcha_fin(String fcha_fin) {
		this.fcha_fin = fcha_fin;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getCorreo_corp() {
		return correo_corp;
	}
	public void setCorreo_corp(String correo_corp) {
		this.correo_corp = correo_corp;
	}
	public Horario getHorario() {
		return horario;
	}
	public void setHorario(Horario horario) {
		this.horario = horario;
	}

}
