package admin.poo.unah.models;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recetaMedica")

public class RecetaMedica {
	@Id
	private int idRecetaMedica;
	private String nombreMedicamento;
	private int precio;
	private String dosis;
	private int idCita;
	
	public RecetaMedica() {}

	public RecetaMedica(int idRecetaMedica, String nombreMedicamento, int precio, String dosis, int idCita) {
		this.idRecetaMedica = idRecetaMedica;
		this.nombreMedicamento = nombreMedicamento;
		this.precio = precio;
		this.dosis = dosis;
		this.idCita = idCita;
	}

	public int getIdRecetaMedica() {
		return idRecetaMedica;
	}

	public void setIdRecetaMedica(int idRecetaMedica) {
		this.idRecetaMedica = idRecetaMedica;
	}

	public String getNombreMedicamento() {
		return nombreMedicamento;
	}

	public void setNombreMedicamento(String nombreMedicamento) {
		this.nombreMedicamento = nombreMedicamento;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getDosis() {
		return dosis;
	}

	public void setDosis(String dosis) {
		this.dosis = dosis;
	}

	public int getIdCita() {
		return idCita;
	}

	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}

}
