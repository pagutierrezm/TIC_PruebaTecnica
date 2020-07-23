package com.App.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Usuario")
public class Usuario {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int ID;
	
	@Column(name="NOMBRES")
	private String NOMBRES;
	
	@Column(name="APELLIDOS")
	private String APELLIDOS;
	
	@Column(name="TIPO DE DOCUMENTO")
	private String TIPO_DOCUMENTO;
	
	@Column(name="NUMERO DE DOCUMENTO")
	private String NUMERO_DOCUMENTO;
	
	@Column(name="FECHA DE NACIMIENTO")
	private date FECHA_NACIMIENTO;

	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		ID = ID;
	}
	public String getNOMBRES() {
		return NOMBRES;
	}
	public void setNOMBRES(String NOMBRES) {
		NOMBRES = NOMBRES;
	}
	public String getAPELLIDOS() {
		return APELLIDOS;
	}
	public void setAPELLIDOS(String APELLIDOS) {
		APELLIDOS = APELLIDOS;
	}
	public String getTIPO_DOCUMENTO() {
		return TIPO_DOCUMENTO;
	}
	public void setEMAIL(String TIPO_DOCUMENTO) {
		TIPO_DOCUMENTO = TIPO_DOCUMENTO;
	}
	public String getNUMERO_DOCUMENTO() {
		return NUMERO_DOCUMENTO;
	}
	public void setNUMERO_DOCUMENTO(String NUMERO_DOCUMENTO) {
		NUMERO_DOCUMENTO = NUMERO_DOCUMENTO;
	}
	public String getFECHA_NACIMIENTO() {
		return FECHA_NACIMIENTO;
	}
	public void setFECHA_NACIMIENTO(String FECHA_NACIMIENTO) {
		FECHA_NACIMIENTO = FECHA_NACIMIENTO;
	}
	public Usuario(int ID, String NOMBRES, String APELLIDOS, String TIPO_DOCUMENTO, String NUMERO_DOCUMENTO, String FECHA_NACIMIENTO) {
		super();
		ID = ID;
		NOMBRES = NOMBRES;
		APELLIDOS = APELLIDOS;
		TIPO_DOCUMENTO = TIPO_DOCUMENTO;
		NUMERO_DOCUMENTO = NUMERO_DOCUMENTO;
		FECHA_NACIMIENTO = FECHA_NACIMIENTO;
	}
	
	public Usuario() {}
	
	}

