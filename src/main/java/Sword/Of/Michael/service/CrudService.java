/**
 * 
 */
package Sword.Of.Michael.service;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:39:26 - 06/10/2022
 *
 */
public interface CrudService<T,R> {
	public default R insertar(T peticion)  {
		throw new UnsupportedOperationException();
	};
	public default R obtener(T peticion) {
		throw new UnsupportedOperationException();
	};
	public default R eliminar(T peticion) {
		throw new UnsupportedOperationException();
	}
	public default R modificar(T peticion) {
		throw new UnsupportedOperationException();
	}
}
