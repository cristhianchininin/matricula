package com.integracion.matricula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.integracion.matricula.model.AlumnoEntity;

@Repository
public interface AlumnoRepository extends JpaRepository<AlumnoEntity,Long>  {

}
