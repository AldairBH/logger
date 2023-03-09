package com.utez.edu.mx.BuenaPractica.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.utez.edu.mx.BuenaPractica.Model.Usuarios;
import com.utez.edu.mx.BuenaPractica.service.UsuarioServiceImpl;
import jakarta.validation.Valid;

@Controller
@RequestMapping(value = "/compras")
public class UsuarioController {
	
	Logger logger = LoggerFactory.getLogger(UsuarioController.class);
	
	@Autowired
	private UsuarioServiceImpl serviceUsuario;
	
	public String index() {
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
        return "Howdy! Check out the Logs to see the output...";
    }
	
	@GetMapping("/inicio")
	public String mostrarMenu(Model modelo) {
		
		List<Usuarios> lista = serviceUsuario.listartodo();
		logger.trace(null, modelo.addAttribute("listaUsuario",lista));
		return "index";
	}
	
	@GetMapping("/inicio/registro")
	public String registro(@Valid @ModelAttribute("usuario") Usuarios usuario, BindingResult result, 
			Model modelo) {
		if(result.hasErrors()) {
			for(ObjectError error : result.getAllErrors()) {
				System.out.print("El error" + error.getDefaultMessage());
			}
			
			return "register";
		}
		
		serviceUsuario.guardad(usuario);
		List<Usuarios> lista = serviceUsuario.listartodo();
		modelo.addAttribute(lista);
		return "register";
	}
	
	@PostMapping("/inicio/registro")
	public String registroUsuario(@Valid @ModelAttribute("usuario") Usuarios usuario, BindingResult result, 
			Model modelo) {
		
		if(result.hasErrors()) {
			for(ObjectError error : result.getAllErrors()) {
				System.out.print("El error: " + error.getDefaultMessage());
			}
			
			return "register";
		}
		
		serviceUsuario.guardad(usuario);
		List<Usuarios> lista = serviceUsuario.listartodo();
		logger.trace(null, modelo.addAttribute(lista));
		
		System.out.print(usuario.toString());

		return "redirect:/compras/inicio";
	}

}
