package com.integracion.matricula.controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.integracion.matricula.bean.Alumno;
import com.integracion.matricula.bean.ResponseJson;
import com.integracion.matricula.model.AlumnoEntity;
import com.integracion.matricula.repository.AlumnoRepository;
import com.integracion.matricula.service.AlumnoService;

import lombok.extern.slf4j.Slf4j;
import sun.rmi.runtime.Log;


@RestController
@Slf4j
public class AlumnoController {
	
	@Autowired
	private AlumnoService alumnoService;
	
	
	@ResponseBody
    @RequestMapping(value = {"/registrar-alumnno"}, method = RequestMethod.POST)
    public ResponseJson registrarPaymentVoucher(
    		@RequestBody Alumno alumno) {
		
	  ResponseJson responseJson=null;
	  AlumnoEntity alumnoEntity = null;
	 
		try {

			if (alumno != null) {
				responseJson = new ResponseJson();
				alumnoEntity = new AlumnoEntity();
				alumnoEntity.setNombre(alumno.getNombre());
				alumnoEntity.setApellido(alumno.getApellido());
				alumnoEntity.setCodigoAlumno(alumno.getCodigoAlumno());
				alumnoEntity.setEdad(alumno.getEdad());
				alumnoEntity.setDireccion(alumno.getDireccion());

				alumnoService.registrarAlumno(alumnoEntity);
				
			

				responseJson.setMsjRespuesta("Se registro correctamente");
				responseJson.setCodigoRespuesta("0");
			} else {

				responseJson.setMsjRespuesta("No se registro el Alumno");
				responseJson.setCodigoRespuesta("1");
			}
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			responseJson.setMsjRespuesta("Error en los Datos de Entrada");
			responseJson.setCodigoRespuesta("3");
		}

		return responseJson;
	}

}
