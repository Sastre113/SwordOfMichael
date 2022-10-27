/**
 * 
 */
package Sword.Of.Michael.model.dto;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:49:30 - 06/10/2022
 *
 */
public abstract class PeticionDTO<ID,T> {

	private ID id;
	private T datosAdicionales;

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

	public T getDatosAdicionales() {
		return datosAdicionales;
	}

	public void setDatosAdicionales(T datosAdicionales) {
		this.datosAdicionales = datosAdicionales;
	}
}
