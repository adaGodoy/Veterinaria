package admin.poo.unah.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import admin.poo.unah.models.Duenio;
import admin.poo.unah.repository.RepositoryDuenio;

@Service
public class ServiceDuenio {
	@Autowired
	RepositoryDuenio repositoryDuenio;
	public void crearDuenios(Duenio duenio) {
		this.repositoryDuenio.save(duenio);
	}
	public List<Duenio> obtenerTodosDuenios(){
		return this.repositoryDuenio.findAll();
	}
	public Duenio buscarDuenio(int id) {
		return this.repositoryDuenio.findById(id);
	}
	public Duenio eliminarDuenio(int id) {
		return this.repositoryDuenio.deleteById(id);
	}
}
