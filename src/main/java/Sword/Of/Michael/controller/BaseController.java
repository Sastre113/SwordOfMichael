/**
 * 
 */
package Sword.Of.Michael.controller;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import Sword.Of.Michael.model.dto.RespuestaDTO;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 20:03:13 - 22/01/2023
 *
 */
public abstract class BaseController {

	public <T> ResponseEntity<RespuestaDTO<Object>> generarRespuestaService(){
		return this.generarRespuestaService(null);
	}
	
	public <T> RespuestaDTO<T> generarRespuestaService(T respuesta) {
		// TODO Auto-generated method stub
		RespuestaDTO<T> respuestaDTO = new RespuestaDTO();
		if(respuesta != null) {
			respuestaDTO.setResultado(respuesta);
		}
		
		return respuestaDTO;
	}
	
	public <T> ResponseEntity<RespuestaDTO<T>> generarRespuestaService(Exception e) {
		HttpStatus httpStatus;
		RespuestaDTO respuestaDTO = new RespuestaDTO<>();
		respuestaDTO.setCodigo("KO");
		respuestaDTO.setDescripcion(e.getMessage());
		
		if(e instanceof NoSuchElementException) {
			httpStatus = HttpStatus.NOT_FOUND;
		} else {
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		
		return ResponseEntity.status(httpStatus).body(respuestaDTO);
	}
}
