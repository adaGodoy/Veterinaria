package admin.poo.unah.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "veterinario")

public class Veterinario {
	@Id
	private int idVeterinario;
	private String nombre;
	private String telefono;
	private String especialidad;
	
	public Veterinario() {}
	public Veterinario(int idVeterinario, String nombre, String telefono, String especialidad) {
		this.idVeterinario = idVeterinario;
		this.nombre = nombre;
		this.telefono = telefono;
		this.especialidad = especialidad;
	}
	public int getIdVeterinario() {
		return idVeterinario;
	}
	public void setIdVeterinario(int idVeterinario) {
		this.idVeterinario = idVeterinario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	

}
