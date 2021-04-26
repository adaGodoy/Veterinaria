package admin.poo.unah.models;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Embeddable

public class IdCita implements Serializable {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
 private int idMascota;
 private int idVeterinario;
 @Override
 public boolean equals(Object obj) {
	 if(obj instanceof IdCita) {
		 IdCita tmpid = (IdCita)obj;
		 if(this.idMascota == tmpid.getIdMascota() && this.idVeterinario == tmpid.getIdVeterinario()) {
			 return true;
		 }else
			 return false;
	 }else
		 return false;
 }
 public int hashCode() {
	 return (int) this.idMascota + this.idVeterinario;
 }
	public IdCita() {}
	public IdCita(int idMascota, int idVeterinario) {
		this.idMascota = idMascota;
		this.idVeterinario = idVeterinario;
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
