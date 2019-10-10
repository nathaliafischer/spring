package br.edu.ifsp.lp2a4.hellospring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class UsuariosController {
	
	@GetMapping("/usuarios")
	public String index () {
		System.out.println("Hey");
		return "usuarios/index";
	}
}
