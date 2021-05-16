package com.integracion.matricula.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Alumno {
	
	private String nombre;
	private String apellido;
	private String codigoAlumno;
	private Integer edad;
	private String direccion;


}
