package admin.poo.unah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import admin.poo.unah.models.Duenio;

public interface RepositoryDuenio extends JpaRepository<Duenio, Integer>{
	public Duenio findById(int id);
	public Duenio deleteById(int id);
}
