/**
 * 
 */
package Sword.Of.Michael.model.dto;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:49:30 - 06/10/2022
 *
 */
public abstract class PeticionDTO<ID,OBJECT> {

	private ID id;
	private OBJECT datosAdicionales;

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

	public OBJECT getDatosAdicionales() {
		return datosAdicionales;
	}

	public void setDatosAdicionales(OBJECT datosAdicionales) {
		this.datosAdicionales = datosAdicionales;
	}
}
