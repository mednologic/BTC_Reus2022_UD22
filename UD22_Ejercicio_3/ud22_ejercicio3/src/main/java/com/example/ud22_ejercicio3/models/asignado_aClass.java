package com.example.ud22_ejercicio3.models;

public class asignado_aClass {
	/* Atributos de clase ClienteClass */
	private String cientifico;
	private String proyecto;
	
	public asignado_aClass() {
		
	}
	
	public asignado_aClass(String cientifico, String proyecto) {
		this.cientifico = cientifico;
		this.proyecto = proyecto;
		
	}

	public String getCientifico() {
		return cientifico;
	}

	public void setCientifico(String cientifico) {
		this.cientifico = cientifico;
	}

	public String getProyecto() {
		return proyecto;
	}

	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}	
}
