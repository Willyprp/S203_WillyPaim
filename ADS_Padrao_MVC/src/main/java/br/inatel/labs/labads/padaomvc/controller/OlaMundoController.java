
package br.inatel.labs.labads.padaomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OlaMundoController {
	
	@GetMapping("/ola")
	public String getOla(Model model) {
		
		model.addAttribute("usuario", "Vitor Alexandre");
		return "ola-mundo";
	}
	


}