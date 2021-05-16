package com.integracion.matricula.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.integracion.matricula.model.AlumnoEntity;
import com.integracion.matricula.repository.AlumnoRepository;
import com.integracion.matricula.service.AlumnoService;

@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Transactional
	public void registrarAlumno(AlumnoEntity alumnoEntity) {
		
		alumnoRepository.save(alumnoEntity);
  }		
	
}
