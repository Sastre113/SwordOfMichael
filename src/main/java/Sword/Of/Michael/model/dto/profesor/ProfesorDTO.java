/**
 * 
 */
package Sword.Of.Michael.model.dto.profesor;

import java.util.Date;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 1:46:36 - 23/01/2023
 *
 */
public class ProfesorDTO {

	private String idProfesor;
	private String nif;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private Date fechaNacimiento;
	private Date fechaAlta;
	private Date fechaBaja;

	public String getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
}
