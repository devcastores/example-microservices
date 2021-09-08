package com.example.microservicios.app.usuarios.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.microservicios.app.usuarios.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {

}
