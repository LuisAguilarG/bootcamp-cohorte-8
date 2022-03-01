package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.SalonModel;
import com.example.demo.services.SalonService;

// Notación que convierte en controlador esta clase para procesar las peticiones HTTP
@RestController
public class EscuelaController {
	
	private final SalonService salonService; 
	
	public EscuelaController(@Autowired SalonService salonService) {
		this.salonService = salonService;
	}
	
	// mostrar datos de salón
	@GetMapping("/salon")
	public ArrayList<SalonModel> obtenerDatos() {
		return salonService.obtenerDatos();
	}
	
	// Guardar y modificar datos en la tabla salon
	@PostMapping("/salon")
	public SalonModel guardarDatos(@RequestBody SalonModel salonModel) {
		return salonService.guardarDatos(salonModel);
	}
	
	// Eliminar dato
	@DeleteMapping(path = "salon/{id}") // localhost:8080/salon/{id}
	public boolean eliminarDatos(@PathVariable("id") Integer id) {
		return salonService.eliminarDatos(id);
	}
}
