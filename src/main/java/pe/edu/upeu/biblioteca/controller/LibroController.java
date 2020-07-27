package pe.edu.upeu.biblioteca.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.biblioteca.service.LibroService;

@RestController
public class LibroController {
	@Autowired
	private LibroService libroservice;
	@GetMapping("/Libro")
	
	public List<Map<String, Object>> listar(){
		return libroservice.readall();
	}

}
