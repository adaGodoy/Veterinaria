DROP DATABASE AdministracionVeterinaria;

CREATE DATABASE AdministracionVeterinaria;

USE AdministracionVeterinaria;

CREATE TABLE IF NOT EXISTS Propietario(
	idPropietario INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(45) NOT NULL,
    telefono VARCHAR(15) NOT NULL,
    direccion VARCHAR(60) NOT NULL,
    correoElectronico VARCHAR(45) NOT NULL
);

CREATE TABLE IF NOT EXISTS Mascota(
	idMascota INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(45) NOT NULL,
    foto VARCHAR(45) NOT NULL,
    tipo VARCHAR(15) NOT NULL,
    fechaNacimiento DATE NOT NULL,
    idDuenio INT NOT NULL,
    FOREIGN KEY(idPropietario) REFERENCES Propietario(idPropietario)
);

CREATE TABLE IF NOT EXISTS Veterinario(
	idVeterinario INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(45) NOT NULL,
    telefono VARCHAR(15) NOT NULL,
    especialidad VARCHAR(60) NOT NULL
);

CREATE TABLE IF NOT EXISTS Cita(
	idCita INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    PropositoDiagnostico VARCHAR(100) NOT NULL,
    valor INT NOT NULL,
    fechaCita DATE NOT NULL,
    idMascota INT NOT NULL,
    idVeterinario INT NOT NULL,
    FOREIGN KEY(idMascota) REFERENCES Mascota(idMascota),
    FOREIGN KEY(idVeterinario) REFERENCES Veterinario(idVeterinario)
);

CREATE TABLE IF NOT EXISTS RecetaMedica(
	idRecetaMedica INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombreMedicamento VARCHAR(60) NOT NULL,
    valor INT NOT NULL,
    dosis VARCHAR(60) NOT NULL,
    idCita INT NOT NULL,
    FOREIGN KEY(idCita) REFERENCES Cita(idCita)
);