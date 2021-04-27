package admin.poo.unah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import admin.poo.unah.models.Cita;

public interface RepositoryCita extends JpaRepository<Cita, Integer>{
	public Cita findById(int id);
	public Cita deleteById(int id);
}
