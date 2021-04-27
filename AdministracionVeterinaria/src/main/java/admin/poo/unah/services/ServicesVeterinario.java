package admin.poo.unah.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import admin.poo.unah.models.Veterinario;
import admin.poo.unah.repository.RepositoryVeterinario;

@Service
public class ServicesVeterinario {
	@Autowired
	RepositoryVeterinario repositoryVeterinario;
	
	public void crearVeterinario(Veterinario veterinario) {
		this.repositoryVeterinario.save(veterinario);
	}

	public List<Veterinario> obtenerTodosVeterinarios(){
		return this.repositoryVeterinario.findAll();
	}
	
	public Veterinario buscarVeterinario(int id) {
		return this.repositoryVeterinario.findById(id);
	}
	
	public Veterinario eliminarVeterinario(int id) {
		return this.repositoryVeterinario.deleteById(id);
	}
}
