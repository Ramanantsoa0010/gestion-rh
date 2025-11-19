package com.example.gestionRh.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table(name = "employees")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Le prénom est obligatoire")
    private String firstName;

    @NotBlank(message = "Le nom est obligatoire")
    private String lastName;

    @Email(message = "Email invalide")
    @Column(unique = true)
    private String email;

    private String position;

    // Constructeurs
    public Employee() {}

    public Employee(String firstName, String lastName, String email, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.position = position;
    }

    // Getters & setters
    public Long getId() { 
    	return id;
    	}
    public void setId(Long id) {
    	this.id = id; 
    	}
    public String getFirstName() {
    	return firstName; 
    	}
    public void setFirstName(String firstName) {
    	this.firstName = firstName; 
    	}
    public String getLastName() {
    	return lastName; 
    	}
    public void setLastName(String lastName) {
    	this.lastName = lastName; 
    	}
    public String getEmail() {
    	return email; 
    	}
    public void setEmail(String email) {
    	this.email = email; 
    	}
    public String getPosition() {
    	return position;
    	}
    public void setPosition(String position) {
    	this.position = position; 
    	}
}
