/**
 * 
 */
package Sword.Of.Michael.model.dto;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:49:30 - 06/10/2022
 *
 */
public class PeticionServiceDTO {

	private String id;
	private String nif;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
}
