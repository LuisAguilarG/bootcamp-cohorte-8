package com.generation.restcontroller.controller;

import com.generation.restcontroller.model.User;
import com.generation.restcontroller.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }

    // Recibe la informaci�n en el cuerpo de la petici�n
    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userService.save(user);
    }

    // Informaci�n dentro de la URL
    // Ruta: /api/user/id
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

 // No es necesario mandar informaci�n
    @GetMapping("/all")
    public ArrayList<User> getUsers() {
        return (ArrayList<User>) userService.getUsers();
    }
    
    @GetMapping("/search")
	public ArrayList<User> findByName(@RequestParam(name = "name") String name) {
    	return (ArrayList<User>) userService.findByName(name);
    }
	
}

	