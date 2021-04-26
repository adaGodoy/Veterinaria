package admin.poo.unah.models;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Entity
@Table(name = "cita")
@IdClass(IdCita.class)
public class Cita implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int idCita;
	@Id
	private int idMascota;
	@Id
	private int idVeterinario;
	@Id
	private LocalDate fechaCita;
	@Id
	private String propositoDiagnstico;
	@Id
	private int valor;
	
	@ManyToOne
	@JoinColumn(name = "idMascota", referencedColumnName = "idMascota", insertable = false, updatable = false)
	@JsonBackReference
	private Mascota mascota;
	
	@ManyToOne
	@JoinColumn(name = "idVeterinario", referencedColumnName = "idVeterinario", insertable = false, updatable = false)
	@JsonBackReference
	private Veterinario veternario;
	public Cita() {}

	public Cita(int idCita, String propositoDiagnstico, LocalDate fechaCita,int valor, int idMascota, int idVeterinario) {
		this.idCita = idCita;
		this.fechaCita = fechaCita;
		this.propositoDiagnstico = propositoDiagnstico;
		this.valor = valor;
		this.idMascota = idMascota;
		this.idVeterinario = idVeterinario;
	}

	public int getIdCita() {
		return idCita;
	}

	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}

	public LocalDate getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDate fechaCita) {
		this.fechaCita = fechaCita;
	}
	
	public String getPropositoDiagnstico() {
		return propositoDiagnstico;
	}

	public void setPropositoDiagnstico(String propositoDiagnstico) {
		this.propositoDiagnstico = propositoDiagnstico;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}

	public int getIdVeterinario() {
		return idVeterinario;
	}

	public void setIdVeterinario(int idVeterinario) {
		this.idVeterinario = idVeterinario;
	}
	

}
