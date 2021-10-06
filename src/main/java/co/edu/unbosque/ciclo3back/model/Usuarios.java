package co.edu.unbosque.ciclo3back.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity //Es una anotación JPA que denota toda la clase para su almacenamiento en una tabla relacional
@Table (name="usuarios")

public class Usuarios {
	@Id //son anotaciones JPA para anotar la clave principal y que se genera automáticamente cuando es necesario.
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotBlank
    @NotNull
	private long cedula_usuario;
	@NotBlank//Estas dos anotaciones verifican y validan los campos donde se asignan para garantizar que los valores no estén en blanco ni sean nulos
    @NotNull
	private String nombre_usuario;
	@Email
	private String email_usuario;
	@NotBlank
    @NotNull
	private String usuario;
	@NotBlank
    @NotNull
	private String password;
	
	
	public Usuarios() {
		
	}

	public Usuarios(long cedula_usuario, String nombre_usuario, String email_usuario, String usuario, String password) {
		super();
		this.cedula_usuario = cedula_usuario;
		this.nombre_usuario = nombre_usuario;
		this.email_usuario = email_usuario;
		this.usuario = usuario;
		this.password = password;
	}

	public long getCedula_usuario() {
		return cedula_usuario;
	}

	public void setCedula_usuario(long cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getEmail_usuario() {
		return email_usuario;
	}

	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this) 
			return true;
		if (!(o instanceof Usuarios)) 
			return false;
		Usuarios usuarios = (Usuarios) o;
		return Objects.equals(cedula_usuario, usuarios.cedula_usuario) && 
				Objects.equals(nombre_usuario, usuarios.nombre_usuario) && 
				Objects.equals(email_usuario, usuarios.email_usuario) && 
				Objects.equals(usuario, usuarios.usuario) &&
				Objects.equals(password, usuarios.password);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(cedula_usuario,nombre_usuario,email_usuario,usuario,password);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Usuarios{"+
				"cedula_usuario ='" + getCedula_usuario() + "'" +
				"nombre_usuario ='" + getNombre_usuario() + "'" +
				"email_usuario ='" + getEmail_usuario() + "'" +
				"usuario ='" + getUsuario() + "'" +
				"password ='" + getPassword() + "'" +
				"}";
	}
	
	
}
