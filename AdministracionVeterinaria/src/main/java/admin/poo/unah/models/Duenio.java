package admin.poo.unah.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Duenio")

public class Duenio {
	@Id
	private int idDuenio;
	private String nombre;
	private String telefono;
	private String direccion;
	private String correoElectronico;
	
	public Duenio() {}
	public Duenio(int idDuenio, String nombre,String telefono, String direccion, String correoElectronico) {
		this.idDuenio = idDuenio;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correoElectronico = correoElectronico;
	}
	
	public int getIdDuenio() {
		return idDuenio;
	}
	public void setDuenio(int idDuenio) {
		this.idDuenio = idDuenio;
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
}
