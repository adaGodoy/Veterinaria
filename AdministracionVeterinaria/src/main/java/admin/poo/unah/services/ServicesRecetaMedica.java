package admin.poo.unah.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import admin.poo.unah.models.RecetaMedica;
import admin.poo.unah.repository.RepositoryRecetaMedica;

@Service
public class ServicesRecetaMedica {
	@Autowired
	RepositoryRecetaMedica repositoryRecetaMedica;
	
	public void crearRecetaMedica(RecetaMedica recetaMedica) {
		this.repositoryRecetaMedica.save(recetaMedica);
	}
	
	public List<RecetaMedica> obtenerTodasRecetasMedicas(){
		return this.repositoryRecetaMedica.findAll();
	}
	
	public RecetaMedica buscarRecetaMedica(int id) {
		return this.repositoryRecetaMedica.findById(id);
	}
	
	public RecetaMedica eliminarRecetaMedica(int id) {
		return this.repositoryRecetaMedica.deleteById(id);
	}
}
