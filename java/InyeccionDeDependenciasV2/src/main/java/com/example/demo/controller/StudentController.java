package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{
	// No se puede instanciar una interface.  
	// Todas las clases que implementen "StudentService" podrán ser inyectadas aquí. 
    private final StudentService studentService;

    // Constructor, inyección de dependencia
    public StudentController( @Autowired StudentService studentService )
    {
        this.studentService = studentService;
    }

    @GetMapping( "/student/{id}" )
    Student findById( @PathVariable( "id" ) String id )
    {	
    	Student student1 = new Student ("1", 1, "Carlos Eduardo", "Jesus", 8);
		Student student2 = new Student("2", 3, "Raul", "Sanchez", 3);
		Student student3 = new Student("3", 34, "Rodrigo", "Leyva", 4);
		
		studentService.add(student1);
		studentService.add(student2);
		studentService.add(student3);
        return studentService.findById( id );
    }

}
