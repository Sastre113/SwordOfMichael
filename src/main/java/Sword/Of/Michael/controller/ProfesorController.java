/**
 * 
 */
package Sword.Of.Michael.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Sword.Of.Michael.model.dto.PeticionDTO;
import Sword.Of.Michael.model.dto.RespuestaDTO;
import Sword.Of.Michael.service.profesor.IProfesorService;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:35:39 - 06/10/2022
 */

@RestController
@RequestMapping("/profesor")
public class ProfesorController {

	private IProfesorService profesorService;

	public ProfesorController(IProfesorService profesorService) {
		super();
		this.profesorService = profesorService;
	}
	
	@PostMapping(path = "/insertar")
	public ResponseEntity<RespuestaDTO> insertarProfesor(PeticionDTO peticionDTO){
		return ResponseEntity.ok(this.profesorService.insertar(peticionDTO));
	}
	
	@GetMapping(path = "/obtener")
	public ResponseEntity<RespuestaDTO> obtenerProfesor(PeticionDTO peticionDTO){
		return ResponseEntity.ok(this.profesorService.obtener(peticionDTO));
	}
	
}
