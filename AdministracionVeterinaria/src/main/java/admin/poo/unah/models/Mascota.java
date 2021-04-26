package admin.poo.unah.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "mascota")
public class Mascota {
	@Id
	private int idMascota;
	private String nombre;
	private String foto;
	private LocalDate fechaNacimiento;
	private int idDuenio;
	public Mascota() {}
	public Mascota(int idMascota, String nombre, String foto, LocalDate fechaNacimiento, int idDuenio) {
		this.idMascota = idMascota;
		this.nombre = nombre;
		this.foto = foto;
		this.fechaNacimiento = fechaNacimiento;
		this.idDuenio = idDuenio;
	}
	public int getIdMascota() {
		return idMascota;
	}
	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getIdDuenio() {
		return idDuenio;
	}
	public void setIdDuenio(int idDuenio) {
		this.idDuenio = idDuenio;
	}
}
