/**
 * 
 */
package Sword.Of.Michael.service;

import Sword.Of.Michael.model.dto.GenericRequest;
import Sword.Of.Michael.model.dto.GenericResponse;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:39:26 - 06/10/2022
 *
 */
public interface CrudService<R extends GenericResponse, P extends GenericRequest> {
	public default R insertar(P peticion)  {
		throw new UnsupportedOperationException();
	};
	public default R obtener(P peticion) {
		throw new UnsupportedOperationException();
	};
	public default R eliminar(P peticion) {
		throw new UnsupportedOperationException();
	}
	public default R modificar(P peticion) {
		throw new UnsupportedOperationException();
	}
}
