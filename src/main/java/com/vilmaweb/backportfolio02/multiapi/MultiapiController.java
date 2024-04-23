package com.vilmaweb.backportfolio02.multiapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vilmaweb.backportfolio02.servicio.IntPersonaService;

@Controller
public class MultiapiController {

	@Autowired
	private IntPersonaService servicioPersona;
	
	@GetMapping("/mostrar_index")
	public String mostrarIndex() {
		
		return "index";
	}
	
	@GetMapping("/mostrar_texto_01")
	public String mostrarTexto_01(Model mymodel) {
		
		String texto_01 = "Este texto es para probar enviar string en Thymeleaf";
		
		mymodel.addAttribute("texto_prueba", texto_01);
		
		return "index";
	}
	
	@GetMapping("/mostrar_personas")
	public String mostrarPersonas(Model myModel) {
		
		myModel.addAttribute("lista_personas", servicioPersona.getPersonas());
		
		return "lista_personas";
	}
	
	
}
