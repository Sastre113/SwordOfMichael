/**
 * 
 */
package Sword.Of.Michael.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import Sword.Of.Michael.model.dto.RespuestaDTO;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:13:51 - 03/02/2023
 *
 */

@RestControllerAdvice
public class HandleExceptionController {

	@ExceptionHandler()
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public <E extends Exception> ResponseEntity<RespuestaDTO<E>> handleGenericException(E e){
		String descripcion = String.format("Se ha producido un error inesperado del tipo '%s'"
				, e.getClass().getSimpleName());
		RespuestaDTO<E> respuestaErronea = new RespuestaDTO<>("ERROR", descripcion, e);
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(respuestaErronea);
	}
}
