package admin.poo.unah.models;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Embeddable

public class IdRecetaMedica implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int idCita;
	private int idRecetaMedica;
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof IdRecetaMedica) {
			IdRecetaMedica tmpid = (IdRecetaMedica)obj;
			if(this.idCita == tmpid.getIdCita() && this.idRecetaMedica == tmpid.getIdRecetaMedica()) {
				return true;
				}else
					return false;
		}else return false;
	}
	
	public int hashCode() {
		return (int) this.idCita+this.idRecetaMedica;
	}
	
	public IdRecetaMedica() {}
	public IdRecetaMedica(int idCita, int idRecetaMedica) {
		super();
		this.idCita = idCita;
		this.idRecetaMedica = idRecetaMedica;
	}
	public int getIdCita() {
		return idCita;
	}
	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}
	public int getIdRecetaMedica() {
		return idRecetaMedica;
	}
	public void setIdRecetaMedica(int idRecetaMedica) {
		this.idRecetaMedica = idRecetaMedica;
	}
	

}
