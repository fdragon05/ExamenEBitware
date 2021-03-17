package com.ebitware.util;

public class CalculosPersona {
	
	static final int BAJO_PESO = -1;
	static final int PESO_IDEAL = 0;
	static final int SOBRE_PESO = 1;
	
	public int calcularIMC(Persona persona) {
		double imc = 0.0;
		imc = persona.getPeso()/(persona.getAltura()*persona.getAltura());
		int resultadoPeso = 0;
	
		if(persona.getSexo() == 'H') {
			if (imc<20.0) {
				System.out.println("BAJO PESO");
				resultadoPeso = BAJO_PESO;
			} else if (imc>=20.0 && imc<=25.0) {				
				System.out.println("NORMAL");
				resultadoPeso =  PESO_IDEAL;
			} else if (imc>=25.0) {
				System.out.println("SOBREPESO");
				resultadoPeso =  SOBRE_PESO;
			}
		}
		
		if(persona.getSexo() == 'M') {
			if (imc<19.0) {
				System.out.println("BAJO PESO");
				resultadoPeso =  BAJO_PESO;
			} else if (imc>=19.0 && imc<=24.0) {				
				System.out.println("NORMAL");
				resultadoPeso =  PESO_IDEAL;
			} else if (imc>=24.0) {
				System.out.println("SOBREPESO");
				resultadoPeso =  SOBRE_PESO;
			}
		}
		
		return resultadoPeso;
		
	}
	
	public boolean esMayorDeEdad(Persona persona) {
		
		if(persona.getEdad() >= 18) {
			return true;
		}
		
		return false;
		
	}
	
	public boolean comprobarSexo(Persona persona) {
		
		if(persona.getSexo() == 'H' || persona.getSexo() == 'M' ) {
			return true;
		}
		
		return false;
		
		
	}
	
	public String personaToString(Persona persona) {
		return persona.toString();
	}
	
	
	
}
