package com.ebitware.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.ebitware.util.CalculosPersona;
import com.ebitware.util.Persona;


@Controller
public class CalcularIMCController {


    private String resultadoIMC;
    private String informacion;
    private String mayorMenorEdad;

    
    @GetMapping("/calcular")
	public String calcularForm(Model model) {
		model.addAttribute("persona", new Persona());
		return "calcular";
	}
    
    @PostMapping("/calcular")
	public String calcularSubmit(@ModelAttribute Persona persona, Model model) {
    	CalculosPersona calculosPersona = new CalculosPersona();
		
    	informacion = calculosPersona.personaToString(persona);
    	int imc = calculosPersona.calcularIMC(persona);
    	
    	if(imc == -1) {
    		resultadoIMC = "-1 = Falta de Peso";
    	}
    	
    	if(imc == 0) {
    		resultadoIMC = "0 = Peso Normal";
    	}
    	
    	if(imc == 1) {
    		resultadoIMC = "1 = Sobre Peso";
    	}
    	
    	boolean edad = calculosPersona.esMayorDeEdad(persona);
    	
    	if(edad) {
    		mayorMenorEdad = "True = Mayor de Edad";
    	}else {
    		mayorMenorEdad = "False = menor de Edad";
		}
    	
    	model.addAttribute("informacion", informacion);
    	model.addAttribute("resultadoIMC", resultadoIMC);
    	model.addAttribute("mayorMenorEdad", mayorMenorEdad);
    	
		return "ver";
	}

}
