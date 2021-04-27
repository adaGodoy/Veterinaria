package admin.poo.unah.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import admin.poo.unah.models.Cita;
import admin.poo.unah.repository.RepositoryCita;

@Service
public class ServicesCita {
	@Autowired
	RepositoryCita repositoryCita;
	
	public void crearCita(Cita cita) {
		this.repositoryCita.save(cita);
	}
	
	public List<Cita> obtenerTodasCitas(){
		return this.repositoryCita.findAll();
	}
	
	public Cita buscarCita(int id) {
		return this.repositoryCita.findById(id);
	}
	public Cita eliminarCita(int id) {
		return this.repositoryCita.deleteById(id);
	}
}
