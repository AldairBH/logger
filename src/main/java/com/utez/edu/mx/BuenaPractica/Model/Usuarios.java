package com.utez.edu.mx.BuenaPractica.Model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Usuarios {
	
	private Integer id;
	
	@NotEmpty(message="El nombre es obligatorio")
	@Size(min=2, max=120, message="El nombre debe de tener entre 2 y 120")
	@Pattern(regexp="^[A-Za-z0-9_.]+$", message="Solo puede contener letras")
	private String nombre;
	
	@NotEmpty(message="La contraseña es Obligatoria")
	@Size(min=4, max=15, message="Debe tener entre 4 y 15 caracteres")
	@Pattern(regexp="^[A-Za-z0-9_.]+$", message="Solo puede contener letras y numeros")
	private String contraseña;
	
	@NotNull(message="La edad es obligatoria")
	@Min(value = 0, message="Debe ser mayor a 0")
	@Max(value = 130, message="Debe ser menor a 130")
	private Integer edad;
	
	@NotEmpty(message="El correo es obligatorio")
	@Email(message="Debe tener una estructura de correo valida")
	private String correo;
	
	@NotEmpty(message="El lugar donde vive es Obligatorio")
	@Pattern(regexp="^[A-Za-z0-9_.]+$", message="Solo puede contener letras y numeros")
	private String vivienda;

	public Usuarios(Integer id,
			@NotEmpty(message = "El nombre es obligatorio") @Size(min = 2, max = 120, message = "El nombre debe de tener entre 2 y 120") @Pattern(regexp = "[A-Z]", message = "Solo puede contener letras") String nombre,
			@NotEmpty(message = "La contraseña es Obligatoria") @Size(min = 4, max = 15, message = "Debe tener entre 4 y 15 caracteres") @Pattern(regexp = "[A-Z0-9]", message = "Solo puede contener letras y numeros") String contraseña,
			@NotNull(message = "La edad es obligatoria") @Min(value = 0, message = "Debe ser mayor a 0") @Max(value = 130, message = "Debe ser menor a 130") Integer edad,
			@NotEmpty(message = "El correo es obligatorio") @Email(message = "Debe tener una estructura de correo valida") String correo,
			@NotEmpty(message = "El lugar donde vive es Obligatorio") @Pattern(regexp="[A-Z0-9]", message="Solo puede contener letras y numeros") String vivienda) {
		this.id = id;
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.edad = edad;
		this.correo = correo;
		this.vivienda = vivienda;
	}

	
	public Usuarios(
			@NotEmpty(message = "El nombre es obligatorio") @Size(min = 2, max = 120, message = "El nombre debe de tener entre 2 y 120") @Pattern(regexp = "[A-Z]", message = "Solo puede contener letras") String nombre,
			@NotEmpty(message = "La contraseña es Obligatoria") @Size(min = 4, max = 15, message = "Debe tener entre 4 y 15 caracteres") @Pattern(regexp = "[A-Z0-9]", message = "Solo puede contener letras y numeros") String contraseña,
			@NotNull(message = "La edad es obligatoria") @Min(value = 0, message = "Debe ser mayor a 0") @Max(value = 130, message = "Debe ser menor a 130") Integer edad,
			@NotEmpty(message = "El correo es obligatorio") @Email(message = "Debe tener una estructura de correo valida") String correo,
			@NotEmpty(message = "El lugar donde vive es Obligatorio") @Pattern(regexp="[A-Z0-9]", message="Solo puede contener letras y numeros") String vivienda) {
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.edad = edad;
		this.correo = correo;
		this.vivienda = vivienda;
	}

	
	public Usuarios() {
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}


	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getVivienda() {
		return vivienda;
	}


	public void setVivienda(String vivienda) {
		this.vivienda = vivienda;
	}
	
}
