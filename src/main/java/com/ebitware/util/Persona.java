package com.ebitware.util;

public class Persona {

	private String nombre;
	private Integer edad;
	private Integer nss;
	private char sexo;
	private Double peso;
	private Double altura;
	
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.nss = 0;
		this.peso = 0.0;
		this.altura = 0.0;
		this.sexo = 'H';
		this.nss = this.generarNSS();
		
	}
	
	public Persona(String nombre, Integer edad, Integer nss, char sexo, Double peso, Double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nss = nss;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", nss=" + nss + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getNss() {
		return nss;
	}

	public void setNss(Integer nss) {
		this.nss = nss;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	
private int generarNSS() {
		
		int numero;
		String finalNumero = "";
		 
		numero = (int)(100000000 * Math.random());
		 
		finalNumero = "" + numero;
		 
		for(int i = finalNumero.length(); i < 8; i++){
			finalNumero = "0" + finalNumero;
		}
		
		System.out.print(finalNumero);
		return Integer.parseInt(finalNumero) ;
		
	}
	
}
