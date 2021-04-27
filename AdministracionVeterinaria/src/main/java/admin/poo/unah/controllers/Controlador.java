package admin.poo.unah.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import admin.poo.unah.models.*;
import admin.poo.unah.services.*;

@Controller
public class Controlador {
	@Autowired
	ServiceDuenio serviceDuenio;
	@Autowired
	ServiceMascota serviceMascota;
	@Autowired
	ServicesVeterinario serviceVeterinario;
//	@Autowired
//	@Autowired
	//-------------------------------------------
	//------Duenio-------------------------------
	//-------------------------------------------
	
	@RequestMapping(value = "/duenio/crearDuenio", method = RequestMethod.GET)
	public Duenio crearDuenio(@RequestParam(name = "id")int idDuenio,
							@RequestParam(name = "nombre")String nombre,
							@RequestParam(name = "telefono")String telefono,
							@RequestParam(name = "direccion")String direccion,
							@RequestParam(name = "correoElectronico")String correoElectronico) {
		Duenio duenio = new Duenio(idDuenio, nombre, telefono, direccion,correoElectronico);
		this.serviceDuenio.crearDuenios(duenio);
		return duenio;
		
	}
	
	@RequestMapping(value = "/duenio/listaDuenio", method = RequestMethod.GET)
	public List<Duenio> listaDuenio(){
		return this.serviceDuenio.obtenerTodosDuenios();
	}
	
	@RequestMapping(value = "/duenio/buscarDuenio", method = RequestMethod.GET)
	public Duenio buscarDuenio(@RequestParam(name = "id")int idDuenio){
		return this.serviceDuenio.buscarDuenio(idDuenio);
	}
	
	@RequestMapping(value = "/duenio/eliminarDuenio", method = RequestMethod.GET)
	public Duenio eliminarDuenio(@RequestParam(name = "id")int idDuenio){
		return this.serviceDuenio.eliminarDuenio(idDuenio);
	}
	//-------------------------------------------
	//------Mascota-------------------------------
	//-------------------------------------------
		
	@RequestMapping(value = "/mascota/crearMascota", method = RequestMethod.GET)
	public Mascota crearMascota(@RequestParam(name = "id")int idMascota,
							@RequestParam(name = "nombre")String nombre,
							@RequestParam(name = "foto")String foto,
							@RequestParam(name = "fechaNacimiento")LocalDate fechaNacimiento,
							@RequestParam(name = "idDuenio")int idDuenio) {
		Mascota mascota = new Mascota(idMascota, nombre, foto, fechaNacimiento, idDuenio);
		this.serviceMascota.crearMascota(mascota);
		return mascota;
			
	}
	
	@RequestMapping(value = "/mascota/listaMascota", method = RequestMethod.GET)
	public List<Mascota> listaMascota(){
		return this.serviceMascota.obtenerTodasMascotas();
	}
	
	@RequestMapping(value = "/mascota/buscarMascota", method = RequestMethod.GET)
	public Mascota buscarMascota(@RequestParam(name = "id")int idMascota){
		return this.serviceMascota.buscarMascota(idMascota);
	}
		
	@RequestMapping(value = "/mascota/eliminarMascota", method = RequestMethod.GET)
	public Mascota eliminarMascota(@RequestParam(name = "id")int idMascota){
		return this.serviceMascota.eliminarMascota(idMascota);
	}
	
	//-------------------------------------------
	//------Veterinario-------------------------------
	//-------------------------------------------
		
	@RequestMapping(value = "/Veterinario/crearVeterinario", method = RequestMethod.GET)
	public Veterinario crearVeterinario(@RequestParam(name = "id")int idVeterinario,
							@RequestParam(name = "nombre")String nombre,
							@RequestParam(name = "telefono")String telefono,
							@RequestParam(name = "especialidad")String especialidad) {
		Veterinario veterinario = new Veterinario(idVeterinario, nombre, telefono, especialidad);
		this.serviceVeterinario.crearVeterinario(veterinario);
		return veterinario;
			
	}
		
	@RequestMapping(value = "/veterinario/listaVeterinario", method = RequestMethod.GET)
	public List<Veterinario> listaVeterinario(){
		return this.serviceVeterinario.obtenerTodosVeterinarios();
	}
		
	@RequestMapping(value = "/veterinario/buscarVeterinario", method = RequestMethod.GET)
	public Veterinario buscarVeterinario(@RequestParam(name = "id")int idVeterinario){
		return this.serviceVeterinario.buscarVeterinario(idVeterinario);
	}
		
	@RequestMapping(value = "/veterinario/eliminarVeterinario", method = RequestMethod.GET)
	public Veterinario eliminarVeterinario(@RequestParam(name = "id")int idVeterinario){
		return this.serviceVeterinario.eliminarVeterinario(idVeterinario);
	}
	
	
}
