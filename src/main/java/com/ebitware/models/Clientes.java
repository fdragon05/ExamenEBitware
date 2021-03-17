package com.ebitware.models;



import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "clientes")
public class Clientes {

	@Id
	private String cliente_Id;
	private String nombre_Usuario;
	private String contrasena;
	private String nombre;
	private String apellidos;
	private String correo_Electronico;
	private Integer edad;
	private Double estatura;
	private Double peso;
	private Double imc;
	private Double geb;
	private Double eta;
	private Date fecha_Creacion;
	private Date fecha_Actualizacion;
	
	
	public String getCliente_Id() {
		return cliente_Id;
	}
	public void setCliente_Id(String cliente_Id) {
		this.cliente_Id = cliente_Id;
	}
	public String getNombre_Usuario() {
		return nombre_Usuario;
	}
	public void setNombre_Usuario(String nombre_Usuario) {
		this.nombre_Usuario = nombre_Usuario;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCorreo_Electronico() {
		return correo_Electronico;
	}
	public void setCorreo_Electronico(String correo_Electronico) {
		this.correo_Electronico = correo_Electronico;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Double getEstatura() {
		return estatura;
	}
	public void setEstatura(Double estatura) {
		this.estatura = estatura;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getImc() {
		return imc;
	}
	public void setImc(Double imc) {
		this.imc = imc;
	}
	public Double getGeb() {
		return geb;
	}
	public void setGeb(Double geb) {
		this.geb = geb;
	}
	public Double getEta() {
		return eta;
	}
	public void setEta(Double eta) {
		this.eta = eta;
	}
	public Date getFecha_Creacion() {
		return fecha_Creacion;
	}
	public void setFecha_Creacion(Date fecha_Creacion) {
		this.fecha_Creacion = fecha_Creacion;
	}
	public Date getFecha_Actualizacion() {
		return fecha_Actualizacion;
	}
	public void setFecha_Actualizacion(Date fecha_Actualizacion) {
		this.fecha_Actualizacion = fecha_Actualizacion;
	}
	
	
}
