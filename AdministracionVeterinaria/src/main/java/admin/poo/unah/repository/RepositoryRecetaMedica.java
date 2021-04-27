package admin.poo.unah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import admin.poo.unah.models.RecetaMedica;

public interface RepositoryRecetaMedica extends JpaRepository<RecetaMedica, Integer>{
	public RecetaMedica findById(int id);
	public RecetaMedica deleteById(int id);
	
	
	
}
