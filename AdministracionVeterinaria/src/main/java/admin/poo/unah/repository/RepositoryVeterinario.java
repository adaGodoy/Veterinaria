package admin.poo.unah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import admin.poo.unah.models.Veterinario;

public interface RepositoryVeterinario extends JpaRepository<Veterinario, Integer> {
	public Veterinario findById(int id);
	public Veterinario deleteById(int id);
}
