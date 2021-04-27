package admin.poo.unah.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import admin.poo.unah.models.Mascota;
import admin.poo.unah.repository.RepositoryMascota;

@Service
public class ServiceMascota {
	@Autowired
	RepositoryMascota repositoryMascota;
	
	public void crearMascota(Mascota mascota) {
		this.repositoryMascota.save(mascota);
	}
	
	public List<Mascota> obtenerTodasMascotas(){
		return this.repositoryMascota.findAll();
	}
	
	public Mascota buscarMascota(int id) {
		return this.repositoryMascota.findById(id);
	}
	
	public Mascota eliminarMascota(int id) {
		return this.repositoryMascota.deleteById(id);
	}
}
