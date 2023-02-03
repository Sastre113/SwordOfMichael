/**
 * 
 */
package Sword.Of.Michael.model.dto.asignatura;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:11:26 - 03/02/2023
 *
 */
public class AsignaturaDTO {

	private String id;
	private String descripcion;
	private String nombre;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
