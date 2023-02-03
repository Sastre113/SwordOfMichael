/**
 * 
 */
package Sword.Of.Michael.model.dto.profesor.peticion;

import java.util.Date;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:36:56 - 20/01/2023
 *
 */
public class PeticionInsertarProfesorDTO {

	private String nif;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private Date fechaNacimiento;

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
}
