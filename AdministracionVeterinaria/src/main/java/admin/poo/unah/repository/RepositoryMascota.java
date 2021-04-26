package admin.poo.unah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import admin.poo.unah.models.Mascota;

public interface RepositoryMascota extends JpaRepository<Mascota, Integer>{
	public Mascota findById(int id);
	public Mascota deleteById(int id);
}
